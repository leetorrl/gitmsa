package org.example;

import java.util.*;

class myComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    } //익명 익스텐스
}
public class Ex01 {
    public static void main(String []args){

        List<String> list= Arrays.asList("robox","box","lamdaa");

        list = new ArrayList<>(list);

        System.out.println(list);

        myComparator MComparator = new myComparator();
        Collections.sort(list, MComparator);   //임시 메서드

//        Collections.sort(list, (String a,String b)->  a.length()-b.length()); 람다식

        System.out.println(list);

    }
}
