package org.example;

import java.util.Scanner;

public class Main{


public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);

    dbmake db = new dbmake();

    while (true){
        System.out.println("""
                1. 입력
                2. 조회
                3. 수정
                4. 삭제
                5. 종류
                """);

        int num = scan.nextInt();

        if(num==1){

            System.out.println("입력");
            db.insert();

        }
        else if(num==2){
            System.out.println("조회");

        }
        else if(num==3){
            System.out.println("수정");
        }
        else if(num==4){
            System.out.println("삭제");
            db.delete();
        }
        else {

            System.out.println("종류합니다.");
            break;
        }
    }




  }
}

