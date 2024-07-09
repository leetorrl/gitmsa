package Ex09.src;

import java.util.Scanner;
import Ex09.src.aa.bb.fact;

//1. 재귀함수 이용하여 2n승 구현하기
public class Ex01 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력>>");
    int result = scanner.nextInt();

fact fact1 = new fact();
int retValue = fact1.aa(result);

result = fact1.aa(5);
//fact1.aa(result)를 통해 fact메서드로 입력한 숫자를 보낼수 있다
        System.out.println("result ="+result);
        System.out.println("retValue ="+retValue);
  }
 }