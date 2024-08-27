package org.example;

import java.util.*;

public class Ex06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MemberDBRespository dbRepository = new MemberDBRespository();

        while (true) {
            System.out.println("""
                    뭐할래?
                    1. 입력
                    2. 조회
                    3. 수정
                    4. 삭제
                    5. 종료
                   ==================
                    """);

            int cho = scanner.nextInt();

            switch (cho){
                
                case 1:
                    System.out.println(cho+"를 입력함");
                    dbRepository.insert();
                    System.out.println("==================");
                    continue;
                case 2:
                    System.out.println(cho+"를 입력함");
                    dbRepository.select();
                    System.out.println("==================");
                    continue;
                case 3:
                    System.out.println(cho+"를 입력함");
                    dbRepository.update();
                    System.out.println("==================");
                    continue;
                case 4:
                    System.out.println(cho+"를 입력함");
                    dbRepository.delete();
                    System.out.println("==================");
                    continue;
                default:
                    System.out.println("종류!");
                    System.out.println("==================");
                    return;
                }
            }
        }
    }