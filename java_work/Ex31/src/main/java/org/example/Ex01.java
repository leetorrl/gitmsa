package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {

    public static void main(String[] args) {

        System.out.println();
        Arrays.asList(11,22,33).forEach(System.out::print);

        List<Integer> list3 = Arrays.asList(11,22);

        System.out.println(list3);


        System.out.println();
        Stream.of(11,22,33,44,55).forEach(s-> System.out.print(s));
        System.out.println();

        Stream.of("dd?","so so","11","22","33").forEach(s-> System.out.print(s));
        System.out.println();

        List<String> list1 = Arrays.asList("11","22","33","44");
        List<String> list2 = Arrays.asList("11","22","33","44");

        Stream.of(list1,list2)
                .forEach(System.out::print);
        System.out.println();

        Stream.of(list1,list2)
                .flatMapToInt(strings -> strings.stream().mapToInt(s ->Integer.parseInt(s) ))
                .forEach(System.out::print);
        System.out.println();
    }
}
