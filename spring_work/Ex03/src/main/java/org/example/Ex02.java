package org.example;

import org.example.comporents.CC;

public class Ex02 {

    //싱글톤...
    public static void main(String[] args) {

        CC cc1 = CC.getInstance();
        System.out.println(cc1);

        CC cc2 = CC.getInstance();
        System.out.println(cc2);

        System.out.println(cc1==cc2);

        CC cc3 = new CC();
        System.out.println(cc3);
        System.out.println(cc1==cc3); //false뜸

    }
}
