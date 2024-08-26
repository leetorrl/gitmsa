package org.example;

import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class Ex05 {

    public static void main(String[] args) {

        IntSupplier is = ()-> 10*10;
        System.out.println(is.getAsInt());

        IntSupplier sd = ()-> 12 *12;
        System.out.println(sd.getAsInt());

        Consumer<Integer> 소비자 = integer -> System.out.println(integer*integer);
        소비자.accept(10);



    }
}
