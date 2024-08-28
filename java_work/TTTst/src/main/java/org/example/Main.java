package org.example;

import java.util.Scanner;

interface supotter {
    int num(int a, int b);

    supotter bb = (a,b)->a+b;
    supotter cc = (a,b)->a-b;
    supotter dd = (a,b)->a*b;
    supotter ee = (a,b)->a/b;
}

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print(""" 
                실행할 숫자입력
                1. 더하기
                2. 빼기
                3. 곱하기
                4. 나누기
                5. 종류 
                """);

        int num = scan.nextInt();

        System.out.println("첫번째 숫자를 입력");
        int n1 = scan.nextInt();
        System.out.println("두번째 숫자를 입력");
        int n2 = scan.nextInt();

        switch (num) {

            case 1:
                System.out.println(" 두값의 합은 = "+ supotter.bb.num(n1, n2));
            return;

            case 2:
                System.out.println(" 두값의 차는 = "+ supotter.cc.num(n1, n2));
                return;

            case 3:
                System.out.println(" 두값의 곱은 = "+ supotter.dd.num(n1, n2));
                return;

            case 4:
                System.out.println(" 두값을 나누면 = "+ supotter.ee.num(n1, n2));
                return;

            default:
                System.out.println("아직 만드는중");
                break;
        }
    }
}