package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("","bbb","aa","dddd","z");
        list = new ArrayList<>(list);




        Collections.sort(list, (o1, o2) -> o1.length()-o2.length());
        System.out.println(list);
    }
}
