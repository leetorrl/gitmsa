package Ex17.src.main.java.org.example;

import Ex17.src.main.java.org.example.Car.HybridWaterCar;
import Ex17.src.main.java.org.example.Carr.HybridWaterCarr;

import java.util.Scanner;

public class 기출문제응용 {

    public static void main(String[] args) {

        HybridWaterCarr H = new HybridWaterCarr();

        Scanner scan1 = new Scanner(System.in);
        System.out.println();
        System.out.print(" 시스템 종류 = 0, 용돈주기 = 1 >> ");

       int a = scan1.nextInt();

        switch (a) {

            case 0:
                System.out.println("종류합니다.");
                break;
//
            case 1:
                Scanner scan2 = new Scanner(System.in);

                System.out.print("얼마를 드리겠습니까>>");
                System.out.println();

                int b = scan2.nextInt();

                System.out.println();
                System.out.printf("용돈 d% 줍니다.", b);
                System.out.println();
                H.showwin();
                break;

            default:
                System.out.println("유효한 값이 아닙니다.");

        }
    }
}
