package org.example;

import org.example.machine.seleck;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 코드리뷰 {

    public static void main(String[] args) {

        Scanner Arrays = new Scanner(System.in);

        try {
            System.out.println();
            System.out.println();
            System.out.print("비용을 입력 하시오>>");

            int A = Arrays.nextInt();
            seleck ss = new seleck();

        switch (A){

            case 0 :
                System.out.println();
                System.out.println();
                System.out.println("<<=====시스템을 종류합니다======>>");
                System.out.println("          　 ∧,,∧");
                System.out.println("         ∩(＾ 0 ＾)∩");
                System.out.println("          ヽ　　　ノ");
                System.out.println("          .|　　|");
                System.out.println("         　 U⌒U.");
                break;

            case 1000 :
                System.out.println();
                System.out.println("================================");
                System.out.println("1000원을 선택하였습니다.");
                System.out.println();
            ss.Seleck(A/1000);
                 break;

            case 2000 :
                System.out.println();
                System.out.println("================================");
                System.out.println("2000원을 선택하였습니다.");
                System.out.println();
                ss.Seleck(A/1000);
                break;

            case 3000 :
                System.out.println();
                System.out.println("================================");
                System.out.println("3000원을 선택하였습니다.");
                System.out.println();
                ss.Seleck(A/1000);
                break;

            case 4000 :
                System.out.println();
                System.out.println("================================");
                System.out.println("4000원을 선택하였습니다.");
                System.out.println();
                ss.Seleck(A/1000);
                break;

            case 5000 :
                System.out.println();
                System.out.println("================================");
                System.out.println("5000원을 선택하였습니다.");
                System.out.println();
                System.out.println();
                ss.Seleck(A/1000);
                break;

            default:
                System.out.println();
                System.out.println("================================");
                System.out.println("비용이 일치하지 않습니다. ㅎㅎ");
                System.out.println("          　 ∧,,∧");
                System.out.println("         ∩(＾ 0 ＾)∩");
                System.out.println("          ヽ　　　ノ");
                System.out.println("          .|　　|");
                System.out.println("         　 U⌒U.");
                break;
          }
        }
        catch (InputMismatchException ie){
            System.out.println();
            System.out.println("================================");
            System.out.println("문장을 입력하시면 안됩니다. ㅎㅎ");
            System.out.println("          　 ∧,,∧");
            System.out.println("         ∩(＾ 0 ＾)∩");
            System.out.println("          ヽ　　　ノ");
            System.out.println("          .|　　|");
            System.out.println("         　 U⌒U.");
        }
    }
}
