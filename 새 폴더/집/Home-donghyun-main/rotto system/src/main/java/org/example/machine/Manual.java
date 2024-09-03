package org.example.machine;


import java.util.Arrays;

public class Manual extends storage {

    public void Mprint (int C) {

        for (int i = 0; i < num.length; i++) {
            if (i == C - 1) {
                for (int j = 0; j < C; j++) {
                    System.out.println(Arrays.toString(num[j]));
                }
            }
        }
        System.out.println();
        System.out.println(end1);
    }
}
