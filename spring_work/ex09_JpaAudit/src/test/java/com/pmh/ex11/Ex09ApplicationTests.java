package com.pmh.ex11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

//@SpringBootTest
class Ex09ApplicationTests {

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
