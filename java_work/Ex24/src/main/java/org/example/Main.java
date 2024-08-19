package org.example;

import java.util.Scanner;

public class Main {
    Main() {

        Scanner scan = new Scanner(System.in);
        DBRepostory dbRepostory = new DBRepostory();

        while (true) {

            System.out.println("""
                    뭐할래?
                    1. 입력
                    2. 조회
                    3. 수정
                    4. 삭제
                    5. 종류
                    """);

            int cho = scan.nextInt();
            System.out.println(cho);

            if(cho==1){
                dbRepostory.insert();


            } else if (cho==3) {

                dbRepostory.update();

            } else if (cho==4) {

                dbRepostory.delete();

            } else {
                System.out.println("종료됩니다.");
                break;
            }

        }
    }

    public static void main(String[] args) {

        new Main();


    }
}