package com.green.userservice.user;

import com.green.userservice.user.service.UserService;
import com.green.userservice.user.vo.LoginRespones;
import com.green.userservice.user.vo.UserRequest;
import com.green.userservice.user.vo.UserResponse;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserService userService;


    @PostMapping("join")
    public ResponseEntity<UserResponse> joinUser(@RequestBody UserRequest userRequest) {

        userService.join(userRequest);

        UserResponse userResponse = userService.join(userRequest);

        return ResponseEntity.ok(userResponse);
    }


    @GetMapping("login")
    public ResponseEntity<String> getUser(
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password
    ) {

       LoginRespones loginRespones = userService.login(email, password);

        return ResponseEntity.ok(null);
    }


    @GetMapping("Kakaologin")
    public ResponseEntity<String> KakaoLogin() {

        return ResponseEntity.ok(null);
    }

}
