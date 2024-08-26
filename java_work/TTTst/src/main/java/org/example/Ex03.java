package org.example;

import java.util.Random;

interface RAN{
    int ran();

    default int doA(){return 10;}
}

public class Ex03 {

    public static void main(String[]args){

        RAN ran = ()-> new Random().nextInt(50);

        for(int i=0; i<10; i++){
            System.out.println(ran.ran());
        }

        System.out.println("인터페이스ran의 디폴트 doA = "+ran.doA());



    }
}
