package org.example;

import java.util.Scanner;

public class DBMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DBRepository dbRepository = new DBRepository();
        while (true){
            System.out.println("""
                    헠!
                    1. 입력
                    2. 조회
                    3. 수정
                    4. 삭제
                    5. 종류
                    """);
            int cho = scanner.nextInt();

            if(cho==1){
                      dbRepository.insert();

            }
            else if(cho==2){
                dbRepository.select();

            }
            else if(cho==3){
                dbRepository.Update();

            }

            else if(cho==4){
                dbRepository.delete();

            }

            else{
                System.out.println("종류합니다.");
                break;
            }


        }

    }
}
