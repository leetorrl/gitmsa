package org.example;

import java.util.stream.Stream;

public class Ex03 {

    public static void main(String[] args) {

        Stream<String> atream1 = Stream.of("aa","bb");
        Stream<String> atream2 = Stream.of("cc","dd");

        Stream.concat(atream1,atream2)
                .forEach(s -> System.out.println(s));

        Stream<Integer> stream3 = Stream.of(11,22,33);



    }
}
