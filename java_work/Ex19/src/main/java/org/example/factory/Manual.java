package org.example.factory;

import org.example.machine.seleck;

import java.util.Arrays;

public class Manual extends seleck {

    public void Mprint(int C) {

        int[][] num = {{18, 19, 20, 28, 40, 41},
                       {18, 21, 36, 37, 38, 40},
                       {9, 11, 37, 39, 40, 44},
                       {14, 21, 29, 35, 44, 45},
                       {4, 7, 25, 33, 41, 43}};

        for (int i = 0; i < num.length; i++) {
            if (i == C - 1) {
                for (int j = 0; j < C; j++) {
                    System.out.println(Arrays.toString(num[j]));
                }
            }
        }
        System.out.println();
        System.out.println("________________🚶🏻‍♂️_________");
    }
}
