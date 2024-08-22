package org.example;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.IntFunction;

public class test {

    public interface B{

        public int AA(int AAA, int BBB, int CCC);

    }

    @FunctionalInterface
    interface Math{
        public int A(int first, int second);
    }
    public static void main(String []args){

        B bb = (AAA, BBB , CCC)-> (AAA+1) +(BBB+2)+(CCC+3);


        System.out.println(bb.AA(2,2,2));

        Math a = (first , second) -> first * second;

        System.out.println(a.A(4,4));

        Math b = ( first , second) -> first + second;

        System.out.println(b.A(5,2));

        IntFunction Sum1 = (x) -> x+1;
        System.out.println(Sum1.apply(5));

    }
}
