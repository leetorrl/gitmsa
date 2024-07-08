package Ex08.src;

import java.util.Scanner;

//1. 2의 n승을 구하는 함수를 재귀적으로 구현해 보자.
//        그리고 그에 따른 적절한 함수를 구현해 보자.
public class 기출1번 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("제곱할 숫자 기입>>");
        int num1 = scan.nextInt();

        Scanner 제곱 = new Scanner(System.in);
        System.out.print("제곱수 기입>>");
        int num2 = 제곱.nextInt();


        int result = fact(num1);


        System.out.println("제곱계산="+result);

    }

public static int fact(int num1){

        return 2;


}

}












