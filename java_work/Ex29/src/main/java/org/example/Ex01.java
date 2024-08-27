package org.example;

import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {

        String[] arr = {"yoon","park","robot"};

        for(String temp : arr){
            System.out.println(temp);
        }

//        1. Stream 생성방법
//        2. 중간연산 filter, map
//        3. 최종연산 sum foreach 등

        Arrays.stream(arr).forEach( aaa-> System.out.println("내용 = "+aaa));
    }
}
