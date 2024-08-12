package org.example;

public class Ex01 {

    public static void main(String[] args) {

int a = 10;
Integer b = Integer.valueOf(20);

        System.out.println("int a = "+a);
        System.out.println("Integer b = "+b);



        //unboxing 래퍼클래스가 기본자료형 타입으로 자동 변환...
        a = b;

    }
}
