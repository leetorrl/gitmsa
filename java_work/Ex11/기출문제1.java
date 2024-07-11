package Ex11;
//1. 길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서,
//홀수와 짝수를 구분 지어 출력하는 프로그램을 작성해 보자.
//일단 홀수부터 출력하고 나서 짝수를 출력하도록 하자.
//        단, 10개의 정수는 main 함수 내에서 입력받도록 하고,
//배열 내에 존재하는 홀수만 출력하는 함수와 배열 내에 존재하는 짝수만 출력하는 함수를 각각 정의해서
//이 두 함수를 호출하는 방식으로 프로그램을 완성하자.

import java.util.Scanner;

public class 기출문제1 {

    public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
        System.out.print("1은 홀수 2는 짝수>>");

        int z = scan.nextInt();
//                 0 1 2 3 4 5 6 7 8 9
        int a[] = {0,1,2,3,4,5,6,7,8,9,10};

        int b[] = {0,1,2,3,4,5,6,7,8,9,10};



        for(int i= 1; i<a.length; i++){

            if(i%2!=0 && z%2!=0){
                System.out.println("홀수 함수 = "+a[i]);

             }
        }

        for (int j= 1; j<b.length; j++){

            if (j%2==0 && z%2==0) {
                System.out.println(" 짝수 함수 = " + b[j]);
            }
        }
    }}
}