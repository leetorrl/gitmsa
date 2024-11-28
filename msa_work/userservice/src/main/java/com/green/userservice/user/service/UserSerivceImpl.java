package com.green.userservice.user.service;

import com.green.userservice.error.UserException;
import com.green.userservice.feign.OrderClient;
import com.green.userservice.jwt.JwtUtils;
import com.green.userservice.user.jpa.UserEntity;
import com.green.userservice.user.jpa.UserRepository;
import com.green.userservice.user.vo.LoginResponse;
import com.green.userservice.user.vo.OrderResponse;
import com.green.userservice.user.vo.UserRequest;
import com.green.userservice.user.vo.UserResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserSerivceImpl  implements UserService{

    private final UserRepository userRepository;
    private final JwtUtils jwtUtils;
    private final OrderClient orderClient;

    @Override
    public UserResponse join(UserRequest userRequest){

        String reqEmail = userRequest.getEmail();

       userRepository.findByEmail(reqEmail)
                .ifPresent(user -> {
                    throw new UserException(String.format("이미 존재하는 email 메일입니다 \n 회원가입 할 수 없습니다.%s", reqEmail));
                });

        ModelMapper mapper = new ModelMapper();
        UserEntity userEntity = mapper.map(userRequest, UserEntity.class);

        userEntity.setUserId(UUID.randomUUID().toString());

        userRepository.save(userEntity);

        UserResponse userResponse =  mapper.map(userEntity,UserResponse.class);

        return userResponse;
    }

    @Override
    public LoginResponse login(String email, String password) {

       UserEntity userEntity = userRepository.findByEmailAndPassword(email, password)
               .orElseThrow(()-> new UserException("Invalid email or password"));

       LoginResponse loginResponse = new LoginResponse();
       loginResponse.setUserId(userEntity.getUserId());
       loginResponse.setAccessToken(jwtUtils.createAccessToken(userEntity.getEmail(), userEntity.getUserId()));
       loginResponse.setRefreshToken(jwtUtils.createRefreshToken(userEntity.getEmail()));
       loginResponse.setEmail(userEntity.getEmail());

        return loginResponse;
    }

    @Override
    public List<UserResponse> list(){

        List<UserEntity> list = userRepository.findAll();

        List<UserResponse> userResponses = new ArrayList<>();

        list.forEach(userEntity -> userResponses.add( new ModelMapper().map( userEntity , UserResponse.class))
        );

        return userResponses;
    }


    @Override
    public UserResponse getUser(String userId) {
        UserEntity userEntity = userRepository.findByUserId(userId).orElseThrow(
                () -> new UserException(String.format("User with id %s not found", userId))
        );
        UserResponse userResponse = new ModelMapper().map(userEntity, UserResponse.class);
        List<OrderResponse> orderResponses = orderClient.getOrders(userId);
        userResponse.setOrderResponses(orderResponses);
        return userResponse;
    }
}
