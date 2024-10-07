package com.pmh.org.test;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TestController {


    private final Environment environment;

    @GetMapping("env")
    public String env(){

        String Key = environment.getProperty("spring.jwt.secret");
        System.out.println(Key);

        return "env";
    }


    @GetMapping("maketoken")
    public String maketoken(){

        System.out.println("maketoken");
        return "maketoken";
    }

    @GetMapping("validtoken")
    public String validtoken(){
        System.out.println("validtoken");
        return "validtoken";
    }
}

