package com.pmh.ex08;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

//@SpringBootTest
class Ex08ApplicationTests {

    @Test
    void contextLoads(){

        String []str = {"10임","20임","30임"};

        Arrays.stream(str).forEach(System.out::println);

       String result = Arrays.stream(str).reduce("",(s, s2) -> {return s+s2;});
        System.out.println(result);

    }



//	@Autowired
//	public AA aa;
//
//	@Test
//	void contextLoads() {
//		aa.doA();
//	}

}
