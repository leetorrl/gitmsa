package org.example;

import java.util.Arrays;

public class Ex01 {

    public static void addOneDArr(int[] arr, int add) {

        for(int i=0; i< arr.length; i++){
            arr[i]+= add;
        }
    }

    public static void addTwoDArr(int[][] arr, int add){

        for(int i=0; i<arr.length; i++){
            addOneDArr(arr[i],add);
        }

    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        addTwoDArr(arr,0);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }

}
