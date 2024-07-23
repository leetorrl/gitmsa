package org.example.factory;

import org.example.machine.seleck;

import java.util.Arrays;

public class Automatic extends seleck {

    public void Aprint(int S) {

        int[][] num = new int[S][6];

        int temp = 0;
        for (int i = 0; i < S; i++) {
            for (int j = 0; j < num[i].length; j++) {

                num[i][j] = (int) (Math.random() * 49) + 1;

            if(num[0][0]==num[i][j]){

                break;
             }
            }
            System.out.println(Arrays.toString(num[i]));

        }
        System.out.println();
        System.out.println("________________🚶🏻‍♂️_________");
    }
}

