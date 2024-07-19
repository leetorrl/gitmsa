package Ex17.src.main.java.org.example;

import Ex17.src.main.java.org.example.Car.HybridWaterCar;
import Ex17.src.main.java.org.example.Carr.HybridWaterCarr;

import java.util.Scanner;

public class 기출문제응용 {





    public static void main(String[] args) {


        HybridWaterCarr H = new HybridWaterCarr();





        Scanner scan1 = new Scanner(System.in);
        System.out.println();
        System.out.print("시스템 종류 = 0, 충전 = 1 , 달리기 = 2 >>");


       int a = scan1.nextInt();

        switch (a) {

            case 0:
                System.out.println("시스템을 종류합니다.");
                break;
//                return;

            case 1:
                System.out.println();
                System.out.println("연료를 100씩 충전합니다.");
                H.showwin();
                break;
            case 2:
                System.out.println();
                System.out.println("달립니다. 연료가 130씩 소비됩니다.");
                H.showwin();
                break;

            default:
                System.out.println("유효한 값이 아닙니다.");

        }
    }
}
