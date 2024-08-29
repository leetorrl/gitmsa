package org.example;

import java.util.*;
import java.util.stream.Stream;

public class Ex07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> list =Stream.of(1,2,3,4,5,6,7,8,9,10)

                .collect(()->new ArrayList<Integer>(),(a,b)->a.add(b)
                        ,((integers, integers2) -> {}));

        System.out.println(list);


            System.out.println(" 1 = 홀수 , 2=짝수 ");
            int sss = scan.nextInt();

            switch (sss){

                case 1:
                    list =Stream.of(1,2,3,4,5,6,7,8,9,10)
                            .filter(s-> s%2==1)
                            .collect(()->new ArrayList<Integer>(),(a,b)->a.add(b)
                                    ,((integers, integers2) -> {}));
                    System.out.println(list);
                    return;

                case 2:
                    list = Stream.of(1,2,3,4,5,6,7,8,9,10)
                            .filter(s -> s % 2 == 0)
                            .collect(() -> new ArrayList<Integer>(), (a, b) -> a.add(b)
                                    , ((integers, integers2) -> {
                                    }));
                    System.out.println(list);
                       return;

                default:
                    System.out.println("종류");
            }







        }



//        System.out.println(list);
//
//        Set<Integer> mset = Stream.of(10,20,30,10,40,30)
//                .collect(
//                        ()-> new HashSet<Integer>()
//                        ,(a,b)-> a.add(b)
//                        ,((integers, integers2) -> {}));
//
//
//        System.out.println(mset);
    }

