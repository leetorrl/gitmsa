package org.example;
//1. int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최댓값,최솟값을 찾아서 반환하는 메소드를
//각각 다음의 형태로 정의하자
//public static int minValue(int[] arr){}
//public static int maxValue(int[] arr){}
//
//단 반복문을 사용할때 minValue의 정의에서는 일반적인 for문을 사용하고 maxValue의 정의에서는
//새로운 for(enhanced for문)을 사용하기로 하자

import org.example.aa.AA;

import java.util.Scanner;

public class 기출문제1 {

    public static void main(String[] args) {

        AA A = new AA();

        Scanner scan1 = new Scanner(System.in);
        System.out.println();
        System.out.print("배열 길이를 입력>>");
        int q = scan1.nextInt();

        System.out.println();

        int [] a = new int[q];

        for(int i=0; i<a.length; i++){

            Scanner scan2 = new Scanner(System.in);

            System.out.print((i+1)+"번째 배열을 순서대로 입력>>");

            int w = scan2.nextInt();

            a[i] = w;

            if(i+1==a.length){
                System.out.println();
                System.out.println(" max값 = "+A.maxValue(a));
                System.out.println(" min값 = "+A.minValue(a));
                break;
            }
        }
    }
}
