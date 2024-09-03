package org.example.machine;

import java.util.Scanner;

public class seleck extends storage{

    public void Seleck(int S){

        Manual M = new Manual();
        Automatic A = new Automatic();

        Scanner scan2 = new Scanner(System.in);
        System.out.println();
        System.out.println(lain);
        System.out.println();
        System.out.print(EEEE);
        int B = scan2.nextInt();
        System.out.println();
        System.out.println();

        switch (B){

            case 1 :
                System.out.println();
                System.out.println(lain);
                System.out.println();
                System.out.println(D);
                System.out.println(DD);
                System.out.println();
                M.Mprint(S);
                break;

            case 2 :
                System.out.println();
                System.out.println(lain);
                System.out.println();
                System.out.println(D);
                System.out.println(DDD);
                System.out.println();
                A.Aprint(S);
                break;

            default:
                System.out.println();
                System.out.println(E);
                System.out.println(m);
                System.out.println(mm);
                System.out.println(mmm);
                System.out.println(mmmm);
                System.out.println(mmmmm);
                break;
        }
    }
}
