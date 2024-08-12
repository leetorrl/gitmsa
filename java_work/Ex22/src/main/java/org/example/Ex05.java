package org.example;

import java.util.Arrays;

public class Ex05 {

    public static void main(String[] args) {

        person p1 = new person("홍길동",40);
        person p2 = new person("김길동",20);
        person p3 = new person("박길동",50);

//        p1.compareTo(p2);
        person parr[] = {p1,p2,p3};
        for (person p : parr){
            System.out.println(p);
        }

        Arrays.sort(parr);
        for (person p : parr){
            System.out.println(p);
        }

        int index = Arrays.binarySearch(parr,p1);

        System.out.println(index);
        System.out.println(parr[index]);
    }
}
