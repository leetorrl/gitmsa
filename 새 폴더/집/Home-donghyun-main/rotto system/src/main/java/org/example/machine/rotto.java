package org.example.machine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class rotto extends storage{

public void S(){

    System.out.println();

    Scanner Arrays = new Scanner(System.in);

    try {
        System.out.println();
        System.out.print(M);
        int A = Arrays.nextInt();
        System.out.println();
        System.out.println();

        seleck ss = new seleck();

        switch (A){

            case 0 :
                System.out.println();
                System.out.println();
                System.out.println(E);
                System.out.println(m);
                System.out.println(mm);
                System.out.println(mmm);
                System.out.println(mmmm);
                System.out.println(mmmmm);
                break;

            case 1000 :
                System.out.println();
                System.out.println(lain);
                System.out.printf("1000원을 선택하였습니다.");
                System.out.println();
                ss.Seleck(A/1000);
                break;

            case 2000 :
                System.out.println();
                System.out.println(lain);
                System.out.println("2000원을 선택하였습니다.");
                System.out.println();
                ss.Seleck(A/1000);
                break;

            case 3000 :
                System.out.println();
                System.out.println(lain);
                System.out.println("3000원을 선택하였습니다.");
                System.out.println();
                ss.Seleck(A/1000);
                break;

            case 4000 :
                System.out.println();
                System.out.println(lain);
                System.out.println("4000원을 선택하였습니다.");
                System.out.println();
                ss.Seleck(A/1000);
                break;

            case 5000 :
                System.out.println();
                System.out.println(lain);
                System.out.println("5000원을 선택하였습니다.");
                System.out.println();
                System.out.println();
                ss.Seleck(A/1000);
                break;

            default:
                System.out.println();
                System.out.println(lain);
                System.out.println(EE);
                System.out.println(m);
                System.out.println(mm);
                System.out.println(mmm);
                System.out.println(mmmm);
                System.out.println(mmmmm);
                break;
        }
    }
    catch (InputMismatchException ie){
        System.out.println();
        System.out.println(lain);
        System.out.println(EEE);
        System.out.println(m);
        System.out.println(mm);
        System.out.println(mmm);
        System.out.println(mmmm);
        System.out.println(mmmmm);
    }
  }
}
