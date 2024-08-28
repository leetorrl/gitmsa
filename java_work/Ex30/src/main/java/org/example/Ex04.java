package org.example;

import java.util.Optional;

public class Ex04 {

    public static void main(String[] args) {

        Optional<String> osl = Optional.of("toy1");

        System.out.println(osl);
        System.out.println(osl.get());

        Optional<String> osl1 = Optional.ofNullable("toy2");

        System.out.println(osl1);
        System.out.println(osl1.get());

        Optional<String> osl2 = Optional.ofNullable(null);

        System.out.println(osl2);


        System.out.println(osl2.get());

        osl2.ifPresent(System.out::println);


    }
}
