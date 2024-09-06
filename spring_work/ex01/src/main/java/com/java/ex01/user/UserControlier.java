package com.java.ex01.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class UserControlier {
    //스르핑 객체 담는 통에서 자동으로 가져오기
//    @Autowired
//   private final MemberRepository memberRepository;

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


