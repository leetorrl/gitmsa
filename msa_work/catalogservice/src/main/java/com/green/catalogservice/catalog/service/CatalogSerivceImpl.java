package com.green.catalogservice.catalog.service;

import com.green.catalogservice.error.CatalogException;
import com.green.userservice.jwt.JwtUtils;
import com.green.catalogservice.catalog.jpa.CatalogEntity;
import com.green.catalogservice.catalog.jpa.CatalogRepository;
import com.green.catalogservice.catalog.vo.CatalogRespones;
import com.green.catalogservice.catalog.vo.CatalogRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatalogSerivceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;

    private final JwtUtils jwtUtils;

    @Override
    public OrderResponse join(CatalogRequest catalogRequest){

        String reqEmail = catalogRequest.getEmail();

       catalogRepository.findByEmail(reqEmail)
                .ifPresent(user -> {
                    throw new CatalogException(String.format("이미 존재하는 email 메일입니다 \n 회원가입 할 수 없습니다.%s", reqEmail));
                });

        ModelMapper mapper = new ModelMapper();
        CatalogEntity catalogEntity = mapper.map(catalogRequest, CatalogEntity.class);

        catalogEntity.setUserId(UUID.randomUUID().toString());

        catalogRepository.save(catalogEntity);

        OrderResponse orderResponse =  mapper.map(catalogEntity, OrderResponse.class);

        return orderResponse;
    }

    @Override
    public CatalogRespones login(String email, String password) {

       CatalogEntity catalogEntity = catalogRepository.findByEmailAndPassword(email, password)
               .orElseThrow(()-> new CatalogException("Invalid email or password"));

       CatalogRespones catalogRespones = new CatalogRespones();
       catalogRespones.setUserId(catalogEntity.getUserId());
       catalogRespones.setAccessToken(jwtUtils.createAccessToken(catalogEntity.getEmail(), catalogEntity.getUserId()));
       catalogRespones.setRefreshToken(jwtUtils.createRefreshToken(catalogEntity.getEmail()));
       catalogRespones.setEmail(catalogEntity.getEmail());

        return catalogRespones;
    }

}
