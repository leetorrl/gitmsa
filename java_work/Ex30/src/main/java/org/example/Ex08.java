package org.example;

import java.util.*;

public class Ex08 {

    public static void main(String[] args) {

        Optional<String> ps1 = Optional.of("안녕하세요!");

        String str = ps1.flatMap(s-> Optional.of("그냥 나오지만 다시 Optional로 변환시키고...")).orElse("EMPTY");

        System.out.println(ps1);
        System.out.println(ps1.get());
        System.out.println(str);
    }
}
