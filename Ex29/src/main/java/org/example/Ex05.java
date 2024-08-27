package org.example;

import java.util.*;

public class Ex05 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("AA","CCCC","BBB","EEEEE");

        // reduce("" , (a,b) )-> 앞의 ""는 AA와 비교할 아무값 EEEEEE넣고 비교해도됨
        
        String result = list.stream().reduce(""  , (a,b)-> {
            if(a.length() > b.length()){
                return a;
            }
            else {
                return b;
            }
        });

        System.out.println(result);

        String result1 = list.stream().sorted().reduce("" , (a,b)-> a+b );
        System.out.println(result1);

        String result2 = list.stream().sorted().reduce("" , (a,b)-> a+b );
        System.out.println(result2);
    }
}
