package org.example;

import org.example.inter.Printable;
import org.example.print.printCMYK;

public class Ex01 {

    public static void main(String[] args) {

        System.out.println(Printable.WIDTH);
        System.out.println(printCMYK.HEIGHT);

        printCMYK prn = new printCMYK();
        prn.print("옛날 프린터기");

        prn.printtCMYK("내문서");

        prn.clean(); //디폴트

        Printable.printLine(); //스택틱

    }
}
