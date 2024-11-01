package com.green.userservice.user;

import com.green.userservice.user.vo.UserResponse;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {


    @PostMapping("join")
    public ResponseEntity<UserResponse> joinUser(){

        return ResponseEntity.ok(null);
    }


    @GetMapping("login")
    public ResponseEntity<String > getUser(){

        return ResponseEntity.ok(null);
    }

    @GetMapping("Kakaologin")
    public ResponseEntity<String > KakaoLogin(){

        return ResponseEntity.ok(null);
    }

}
