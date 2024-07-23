package org.example.machine;

import org.example.factory.Automatic;
import org.example.factory.Manual;

import java.util.Scanner;

public class seleck {

    public void Seleck(int S){

        Manual M = new Manual();
        Automatic A = new Automatic();

        Scanner scan2 = new Scanner(System.in);
        System.out.println();
        System.out.println("================================");
        System.out.println();
        System.out.print(" 수동 = 1 , 자동 = 2 , 강제종류 = 0 >>>");
        System.out.println();
        System.out.println();

        int B = scan2.nextInt();

        switch (B){

            case 1 :
                System.out.println();
                System.out.println("================================");
                System.out.println();
                System.out.println(" system :");
                System.out.println(" 미리 입력한 수동값을 출력합니다. ");
                System.out.println();
                M.Mprint(S);
                break;

            case 2 :
                System.out.println();
                System.out.println("================================");
                System.out.println();
                System.out.println(" system : ");
                System.out.println(" 자동으로 출력합니다. ");
                System.out.println();
                A.Aprint(S);
                break;

            default:
                System.out.println();
                System.out.println("<<=====시스템을 종류합니다======>>");
                System.out.println("          　 ∧,,∧");
                System.out.println("         ∩(＾ 0 ＾)∩");
                System.out.println("          ヽ　　　ノ");
                System.out.println("          .|　　|");
                System.out.println("         　 U⌒U.");
                break;
        }
    }
}
