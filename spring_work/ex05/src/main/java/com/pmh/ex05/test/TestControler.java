package com.pmh.ex05.test;

import com.pmh.ex05.obj.AA;
import com.pmh.ex05.obj.BB;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestControler {

    private final AA aa;

    private final BB bb;

    @GetMapping("aa") //localhost8080/aa로 출력가능
    public String aa(){
        aa.doA();
        return "aaaaaa";
    }

    @PostMapping("bb") //localhost8080/bb로 출력안됨 포스트맨 써야함
    public String bb(){
        bb.doB();
        return "bbbbb";
    }

}
