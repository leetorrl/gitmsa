package org.example;

import java.util.Arrays;
import java.util.List;

interface myPred<T>{
    boolean mytest(T t);
}
public class Ex04 {

    public static int sum(myPred<Integer> predicate, List<Integer> list){
        int mysum = 0;

        for(int n : list){
            if(  predicate.mytest(n)  )
                mysum+=n;
        }
        return mysum;
    }

    public static void main(String []args){

        List<Integer> list = Arrays.asList(10,5,3,9,1,15,8);

        int result = sum( integer -> integer%2==0 , list);
        System.out.println("짞수 합 = "+result);

        result = sum(integer -> integer%2==1 , list);
        System.out.println("홀수 합 = "+result);

    }
}
