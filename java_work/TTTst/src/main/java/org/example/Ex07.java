package org.example;


import java.util.Scanner;

class A{

    int a ;

    void AA(int a){

        this.a = a;

        System.out.println(a);


    }

}

public class Ex07 {

    public static void main(String[] args) {

  A aa = new A();

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();


        switch (a){
            case 1: aa.AA(a);

        }



    }

}
