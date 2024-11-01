package com.green.userservice.user.vo;

import lombok.Data;

@Data
public class UserResponse {

    private Long id;

    private String email;

    private String userId;

    private String name;

    private String password;

}
