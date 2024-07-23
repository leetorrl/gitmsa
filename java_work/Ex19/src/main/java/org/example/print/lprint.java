package org.example.print;

import org.example.inter.Printable;

public class lprint implements Printable {

    public void print(String mydoc) {
        System.out.println("엘지프린터 출력");
        System.out.println(mydoc);
    }

    public void printtCMYK(String mydoc) {
        System.out.println("엘지프린터 출력");
        System.out.println(mydoc);
    }

}