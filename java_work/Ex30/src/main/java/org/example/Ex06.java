package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex06 {
    public  static  void main(String[]args){

        List<String> list = Arrays.asList("aaa","bbbb","ccccc","dd");

        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        System.out.println();

list.stream().map(s -> s.replace("aa","AA로 바꿈")).forEach(System.out::println);
        System.out.println();

        list.stream().map(s->s.length()).forEach(System.out::println);
        System.out.println();

        Optional<String> os1 = Optional.of("abCD efg");
        Optional<String> os2 = os1.map(s -> s.toLowerCase()); //소문자 변경

        System.out.println(os2);
        System.out.println(os2.get());

        Optional<String> os3 = os1.map(s->s.replace(" ","_")).map(s->s.toUpperCase());

        System.out.println(os3);
        System.out.println(os3.get());

        os3.ifPresent(System.out::println);

        Optional<Integer> os4 = os1.map(s-> s.length());
        System.out.println(os4);
        System.out.println(os4.get());

    }
}
