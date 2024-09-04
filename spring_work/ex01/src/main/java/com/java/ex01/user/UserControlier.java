package com.java.ex01.user;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

@RestController
@CrossOrigin
public class UserControlier {

    @GetMapping("aa/insert")
    public String aa(@RequestParam(name = "B_name", defaultValue = "내이름") String B_name,
                     @RequestParam(name = "B_type", defaultValue = "아무타입") String B_type ) {
//        @RequestParam(name = "age", defaultValue = "30") int age
//
        System.out.println("B_name = " + B_name);
        System.out.println("B_type = " + B_type);

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insert(B_name, B_type);

        return "memberTable 저장했습니다.";
    }
    @GetMapping("bb")
    public String bb(){
        return "bb";
    }

}


