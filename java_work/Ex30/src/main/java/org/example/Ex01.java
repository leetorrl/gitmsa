package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort{
    public void sort(List<?> list){
        Collections.reverse(list);
    }
}

public class Ex01 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,30,20,5,8);

        list = new ArrayList<>(list);
        JustSort Js =new JustSort();

        Consumer<List<Integer>> consumer = integers -> Js.sort(integers);

        consumer.accept(list);

        System.out.println(list);
    }
}