package com.green.catalogservice.catalog.vo;

import lombok.Data;

@Data
public class CatalogRespones {

    private String accessToken;
    private String refreshToken;
    private String userId;
    private String email;

}
