package com.example.ex04.User;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController //url 맵핑하는 클래스
@RequestMapping("user") //주소줄에 user로 시작하는거
@RequiredArgsConstructor
public class UserContromller {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<user> select(){
        return userRepository.findAll();
    }

    @PostMapping("insert")
    public String insert(@RequestBody user u){

        System.out.println("실행");
        //save = insert실행..
//        user u = user.builder()
//                .name("오길동").age(520).email("aaa@gmail.com")
//                .password("1234")
//                .wdate(LocalDateTime.now())
//                .build();

        userRepository.save(u);
        return "ok";
    }

}
