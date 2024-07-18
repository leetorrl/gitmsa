package org.example.aa;

public class AA {

    public static int maxValue(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }return max;
    }

    public static int minValue(int[] arr){

        int min = arr[0];

        for(int i :arr){

            if(i<min){

                min=i;
            }
            }return min;
        }
    }





