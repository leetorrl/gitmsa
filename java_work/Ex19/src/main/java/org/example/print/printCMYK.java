package org.example.print;

import org.example.inter.Printable;

public class printCMYK implements Printable {

    public  void printtCMYK(String doc){
        System.out.println("컬러 프린터기");
        System.out.println(doc);
    }


    public void print(String mydoc){
        System.out.println("흑백 프린터기");
        System.out.println(mydoc);
    }
    }


