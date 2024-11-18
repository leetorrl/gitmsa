package com.green.orderservice.order.service;

import com.green.orderservice.error.OrderException;
import com.green.userservice.jwt.JwtUtils;
import com.green.orderservice.order.jpa.OrderEntity;
import com.green.orderservice.order.jpa.OrderRepository;
import com.green.orderservice.order.vo.OrderRespones;
import com.green.orderservice.order.vo.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderSerivceImpl implements OrderService {

    private final OrderRepository orderRepository;

    private final JwtUtils jwtUtils;

    @Override
    public OrderResponse join(OrderRequest orderRequest){

        String reqEmail = orderRequest.getEmail();

       orderRepository.findByEmail(reqEmail)
                .ifPresent(user -> {
                    throw new OrderException(String.format("이미 존재하는 email 메일입니다 \n 회원가입 할 수 없습니다.%s", reqEmail));
                });

        ModelMapper mapper = new ModelMapper();
        OrderEntity orderEntity = mapper.map(orderRequest, OrderEntity.class);

        orderEntity.setUserId(UUID.randomUUID().toString());

        orderRepository.save(orderEntity);

        OrderResponse orderResponse =  mapper.map(orderEntity, OrderResponse.class);

        return orderResponse;
    }

    @Override
    public OrderRespones login(String email, String password) {

       OrderEntity orderEntity = orderRepository.findByEmailAndPassword(email, password)
               .orElseThrow(()-> new OrderException("Invalid email or password"));

       OrderRespones orderRespones = new OrderRespones();
       orderRespones.setUserId(orderEntity.getUserId());
       orderRespones.setAccessToken(jwtUtils.createAccessToken(orderEntity.getEmail(), orderEntity.getUserId()));
       orderRespones.setRefreshToken(jwtUtils.createRefreshToken(orderEntity.getEmail()));
       orderRespones.setEmail(orderEntity.getEmail());

        return orderRespones;
    }

}
