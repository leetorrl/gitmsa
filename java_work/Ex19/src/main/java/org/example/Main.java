package org.example;


import org.example.inter.Printable;
import org.example.print.lprint;
import org.example.print.printCMYK;


public class Main{

    public static void main(String[] args) {

        System.out.println(Printable.HEIGHT);
        System.out.println(Printable.WIDTH);

//        Printable.HEIGHT = 98;
        Printable prn = new lprint();
        prn.print("내 문서");




    }
}