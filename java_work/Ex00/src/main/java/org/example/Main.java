package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String []args){


        Scanner scan = new Scanner(System.in);

        System.out.println("""
                
                1. 입력
                2. 조회
                3. 수정
                4. 삭제
                5. 종류                           
                """);

        int num = scan.nextInt();

        MMain M = new MMain();




        switch (num){

            case 1 :
                M.insert();


            case 2 :
                M.select();


            case 5 :

                System.out.println("종류합니다.");

                break;



        }







    }
}