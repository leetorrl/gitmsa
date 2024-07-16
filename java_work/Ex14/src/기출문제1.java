package Ex14.src;

import java.util.Scanner;


//1. "Hello.java" 문자열에서 파일명은 Hello와 확장자인 java를 분리시켜보자.
//
//입력 >>Hello.java
//        출력
//파일명 Hello
//확장자 java
public class 기출문제1 {

    void hello (String[] front){

        System.out.println("파일명 "+front);
    }
void java(String[] back){


    System.out.println("확장자 "+back);
}

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();



        String [] strr = str.split(".");

        System.out.println(strr[0]);
        System.out.println(strr[1]);

        기출문제1 a = new 기출문제1();
        a.hello(strr);
        a.java(strr);
    }
}
