package org.example.main;

import org.example.Book.skllPepository;
import org.example.Customer.Customertable;
import org.example.entry.entrytable;
import org.example.staff.Stafftable;

import java.util.Scanner;

public class Mainbase {
    
    public static void main(String[] args)  {

        skllPepository skll = new skllPepository();
        Customertable cus = new Customertable();
        entrytable en = new entrytable();
        Stafftable staf = new Stafftable();

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                 테이블 선택
                 0 : 종류
                 1 : book
                 2 : Customer
                 3 : entry
                 4 : order
                 5 : staff
                 """);
        int num1 = scan.nextInt();

        switch (num1) {
            case 1: {
                System.out.println("book 테이블");
                System.out.println("""
                         0 : 로그인(미구현)
                         1 : 인설트
                         2 : 셀렉트
                         3 : 딜리트
                         4 : 수정
                         """);

                int num2 = scan.nextInt();

                switch (num2) {
                    case 0: {
                        System.out.println("로그인 진입");
                      int c_id = scan.nextInt();
                      skll.findByIdx(c_id);
                        break;
                    }

                    case 1: {
                        System.out.println("book 인설트 진입");
                        skll.insert();
                        break;
                    }

                    case 2: {
                        System.out.println("book 셀렉트 진입");

                        skll.select();
                        break;
                    }

                    case 3: {
                        System.out.println();
                        System.out.println("book 딜리트 진입");
                        System.out.println();
                        skll.delete();
                        break;
                    }

                    case 4: {
                        System.out.println("book 업데이트");
                        skll.update();
                        break;
                    }
                    default: {
                        System.out.println("시스템 종류");
                    }
                }

            }
            break;

            case 2: {
                System.out.println("Customer 테이블");
                System.out.println("""
                         0 : 로그인(미구현)
                         1 : 인설트
                         2 : 셀렉트
                         3 : 딜리트
                         4 : 수정
                         """);

                int num2 = scan.nextInt();

                switch (num2) {
                    case 0: {
                        System.out.println("Customer 로그인 진입");
                        int c_id = scan.nextInt();
                        skll.findByIdx(c_id);
                        break;
                    }

                    case 1: {
                        System.out.println("Customer 인설트 진입");
                        cus.insert();
                        break;
                    }

                    case 2: {
                        System.out.println("Customer 셀렉트 진입");
                        cus.select();
                        break;
                    }

                    case 3: {
                        System.out.println();
                        System.out.println("Customer 딜리트 진입");
                        System.out.println();
                        cus.delete();
                        break;
                    }

                    case 4: {
                        System.out.println("Customer 업데이트");
                        cus.update();
                        break;
                    }
                    default: {
                        System.out.println("시스템 종류");
                        break;
                    }
                }break;
            }

            case 3: {

                System.out.println("entry 테이블");

                System.out.println("""
                         0 : 로그인(미구현)
                         1 : 인설트
                         2 : 셀렉트
                         3 : 딜리트
                         4 : 수정
                         """);
                int num2 = scan.nextInt();

                switch (num2) {
                    case 0: {
                        System.out.println("로그인 진입");
                        int c_id = scan.nextInt();
                        skll.findByIdx(c_id);
                        break;
                    }

                    case 1: {
                        System.out.println("인설트 진입");
                        skll.insert();
                        break;
                    }

                    case 2: {
                        System.out.println("셀렉트 진입");

                        skll.select();
                        break;
                    }

                    case 3: {
                        System.out.println();
                        System.out.println("딜리트 진입");
                        System.out.println();
                        skll.delete();
                        break;
                    }

                    case 4: {
                        System.out.println("업데이트");
                        en.update();
                        break;
                    }
                    default: {
                        System.out.println("시스템 종류");
                        break;
                    }
                }

            }

            case 4: {
                System.out.println("order 테이블");
            }
            case 5: {
                System.out.println("staff 테이블");

                System.out.println("""
                        0 : 로그인(미구현)
                        1 : 인설트
                        2 : 셀렉트
                        3 : 딜리트
                        4 : 수정
                        """);

                int num2 = scan.nextInt();

                switch (num2) {
                    case 0: {
                        System.out.println("staff 로그인 진입");
                        int c_id = scan.nextInt();
                        skll.findByIdx(c_id);
                        break;
                    }

                    case 1: {
                        System.out.println("staff 인설트 진입");
                        staf.insert();
                        break;
                    }

                    case 2: {
                        System.out.println("staff 셀렉트 진입");
                        staf.select();
                        break;
                    }

                    case 3: {
                        System.out.println();
                        System.out.println("staff 딜리트 진입");
                        System.out.println();
                        staf.delete();
                        break;
                    }

                    case 4: {
                        System.out.println("staff 업데이트");
                        staf.update();
                        break;
                    }
                    default: {
                        System.out.println("시스템 종류");
                        break;
                    }


                }
            }
            default: {
                System.out.println("시스템 종류");
                break;
            }
        }
    }
}