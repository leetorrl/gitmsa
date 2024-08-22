package org.example;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

    public static void main(String[] args){

        Set<String> set = new HashSet<>();

        set.add("box");
        set.add("toy");
        set.add("box"); //중복되어 출력되지 않음
        set.add("robot");

        System.out.println(set);
        System.out.println("box".hashCode());
        System.out.println(new String("box").hashCode());

        Set<Member> set1 = new HashSet<>();
        set1.add(new Member());
        set1.add(new Member());

        System.out.println(set1);

        System.out.println(new Member().hashCode());
        System.out.println(new Member().hashCode());




    }

}
