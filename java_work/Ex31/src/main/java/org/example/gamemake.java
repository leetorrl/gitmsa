package org.example;

import java.util.*;

public class gamemake {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        try {


            int countt = 0;
            int count = 0;
            int dcount = 0;
            int dscount =0;

            for (int i = 0; i < 100; i++) {

                System.out.println("첫번째");
                int a1 = scan.nextInt();
                if (a1 > 3 || a1 == 0) {
                    System.out.println(" ===== 1 ~ 3 까지만 ===== ");
                    return;
                }

                System.out.println("두번째");
                int a2 = scan.nextInt();
                if (a2 > 3 || a2 == 0) {
                    System.out.println(" ===== 1 ~ 3 까지만 ===== ");
                    return;
                }

                System.out.println("세번째");
                int a3 = scan.nextInt();
                if (a3 > 3 || a3 == 0) {
                    System.out.println(" ===== 1 ~ 3 까지만 ===== ");
                    return;
                }

                System.out.println("네번째");
                int a4 = scan.nextInt();
                if (a4 > 3 || a4 == 0) {
                    System.out.println(" ===== 1 ~ 3 까지만 ===== ");
                    return;
                }

                System.out.println("다섯번째");
                int a5 = scan.nextInt();
                if (a5 > 3 || a5 == 0) {
                    System.out.println(" ===== 1 ~ 3 까지만 ===== ");
                    return;
                }

                List<Integer> list1 = Arrays.asList(a1, a2, a3, a4, a5);

                List<String> list2 = new ArrayList<>();

                for (int j = 0; j < list1.size(); j++) {

                    if (list1.get(j) == 1) {
                        list2.add("가위");
                    } else if (list1.get(j) == 2) {
                        list2.add("바위");
                    } else if (list1.get(j) == 3) {
                        list2.add(" 보");
                    } else {
                        System.out.println("이게 나올 상황이 오나");
                    }
                }

                System.out.println("유저 = " + list2);

                List<Integer> list3 = new ArrayList<>();
                List<String> list4 = new ArrayList<>();

                for (int j = 0; j < list1.size(); j++) {

                    list3.add((int) (Math.random() * 3) + 1);

                    if (list3.get(j) == 1) {

                        list4.add("가위");
                    } else if (list3.get(j) == 2) {
                        list4.add("바위");
                    } else {
                        list4.add(" 보");
                    }
                }
                System.out.println("컴퓨터 = " + list4);

                for (int j = 0; j < 5; j++) {
                    if (list1.get(j) == 1 && list3.get(j) == 2) {
                        System.out.print(" 패 ");
                        dscount++;
                    } else if (list1.get(j) == 1 && list3.get(j) == 3) {
                        System.out.print(" 승 ");
                        countt++;
                    } else if (list1.get(j) == 2 && list3.get(j) == 1) {
                        System.out.print(" 승 ");
                        countt++;
                    } else if (list1.get(j) == 2 && list3.get(j) == 3) {
                        System.out.print(" 패 ");
                        dscount++;
                    } else if (list1.get(j) == 3 && list3.get(j) == 1) {
                        System.out.print(" 패 ");
                        dscount++;
                    } else if (list1.get(j) == 3 && list3.get(j) == 2) {
                        System.out.print(" 승 ");
                        countt++;
                    } else if (list1.get(j) == list3.get(j)) {
                        System.out.print(" 비김 ");
                        dcount++;
                    }
                }

                    if (countt > 2 ||dcount > 0 && dscount<countt) {
                        count++;
                        System.out.println("|승리수 = " + countt);
                        countt = 0;
                        dscount = 0;
                        dcount = 0;
                    } else if (countt < 3 || dcount >0 && dscount>countt){
                        System.out.println("|승리수 = " + countt);
                        countt = 0;
                        dscount = 0;
                        dcount = 0;
                    }

                    System.out.println();
                    System.out.println("현재 = " + count + "승");
                    System.out.println();
                    if (count == 3) {
                        System.out.println();
                        System.out.println("3승 달성!");
                        break;
                    }

            }
            }catch(Exception e){
                System.out.println(" 에러발생");

            }


//
//        int[] arr = new int[5];
//        String[] arrr = new String[5];
//
//        int[] aee = new int[5];
//        String[] aeee = new String[5];
//
//        int count = 0;
//        int countt = 0;
//
//        for(int j =0; j<100; j++) {
//
//            for(int w= 0; w<arr.length; w++) {
//                System.out.println(w+1+"번째 숫자( 0 = 가위 | 1 = 바위 = | 2 = 보 )");
//                arr[w]= scan.nextInt();
//
//                if(arr[w]>2){
//                    System.out.println("2까지만 입력바람");
//                    w--;
//
//                }
//            }
//                //컴퓨터 랜덤매스
//                for(int k = 0; k<arr.length; k++){
//
//                    if(arr[k]==0){
//                        arrr[k]="가위";
//                    }
//                    else if(arr[k]==1){
//                        arrr[k]="바위";
//                    }
//                    else {
//                        arrr[k]=" 보";
//                    }
//                }
//                System.out.println("유저1"+Arrays.toString(arr));
//                System.out.println("유저1"+Arrays.toString(arrr));
//
//                Arrays.setAll(aee, p-> (int)(Math.random()*3));
//
//                for(int k = 0; k<aee.length; k++){
//
//                    if(aee[k]==0){
//                        aeee[k]="가위";
//                    }
//                    else if(aee[k]==1){
//                        aeee[k]="바위";
//                    }
//                    else {
//                        aeee[k]=" 보";
//                    }
//                }
//                System.out.println("유저2"+Arrays.toString(aee));
//                System.out.println("유저2"+Arrays.toString(aeee));
//
//                System.out.println("판정");
//
//            for (int i = 0; i < 5; i++) {
//
//                if (arr[i] == 0 && aee[i] == 1) {
//                    System.out.print(" 패 ");
//                } else if (arr[i] == 0 && aee[i] == 2) {
//                    System.out.print(" 승 ");
//                    countt++;
//                } else if (arr[i] == 1 && aee[i] == 0) {
//                    System.out.print(" 승 ");
//                    countt++;
//                } else if (arr[i] == 1 && aee[i] == 2) {
//                    System.out.print(" 패 ");
//                } else if (arr[i] == 2 && aee[i] == 0) {
//                    System.out.print(" 패 ");
//                } else if (arr[i] == 2 && aee[i] == 1) {
//                    System.out.print(" 승 ");
//                    countt++;
//                } else if (arr[i] == aee[i]) {
//                    System.out.print(" 비김 ");
//                }
//            }
//            if (countt > 2) {
//                count++;
//                System.out.println("|승리수 = " + countt);
//                countt = 0;
//            }
//            else if(countt<3){
//                System.out.println("|승리수 = " + countt);
//                countt = 0;
//            }
//
//            System.out.println();
//            System.out.println("현재 = " + count + "승");
//            System.out.println();
//            if (count == 3) {
//                System.out.println();
//                System.out.println("3승 달성!");
//                break;
//            }
//        }
    }
}
