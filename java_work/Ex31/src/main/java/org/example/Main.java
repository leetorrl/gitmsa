package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.stream().forEach(System.out::println);

        int result = list.stream().reduce(0,((a, b) -> a+b));

        System.out.println("result = "+result);

        result = list.stream().filter( a -> a%2==0)
                .reduce(0,(a,b)->a+b);

        System.out.println(result);

        result = list.stream().filter( a -> a%2==1)
                .reduce(0,(a,b)->a+b);

        System.out.println(result);
    }
}