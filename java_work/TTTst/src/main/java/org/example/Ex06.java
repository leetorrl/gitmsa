package org.example;

import java.util.*;

public class Ex06 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,22,333,44,55,66,77,88,90);

        list = new ArrayList<>(list);

        List<Integer> indexs = new ArrayList<>();
//        list.removeIf(integer -> integer%2 ==0); //짝수는 삭제하는 removeIf (매개변수, 조건)
//
//        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            int temp = list.get(i);
            System.out.println("temp = "+temp);
            if(temp%2==0){
                list.remove(i);
            }

        }System.out.println(list);

    }
}
