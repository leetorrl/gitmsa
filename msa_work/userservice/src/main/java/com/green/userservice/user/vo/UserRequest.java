package com.green.userservice.user.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequest {
private Long id;

@NotNull(message = "Email cannot be bull")
@Email
private String email;

@Schema(hidden=true)
private String userId;

private String name;

@Size(min = 8, message = "password must be greater than 8")
@NotNull(message = "password cannot be bull")
@Schema(example = "abcd1234")
private String password;



}
