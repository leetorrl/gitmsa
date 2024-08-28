package org.example;

import java.util.*;
import java.util.function.Consumer;

public class Main{

    public static void main(String[] args) {

List<Integer> list = Arrays.asList(1,2,3,5,7,9);

        System.out.println(list);

list = new ArrayList<>(list);

        System.out.println(list);

        Consumer<List<Integer>> consumer = mylist -> Collections.reverse(mylist);
        consumer.accept(list);

        System.out.println(list);

    }
}