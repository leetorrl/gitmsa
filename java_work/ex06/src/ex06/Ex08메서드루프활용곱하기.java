package ex06;

import java.util.Scanner;

public class Ex08메서드루프활용곱하기 {

	public static int doA(int num) {
		return num * num;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {// 무한루프
			System.out.println("곱하고 싶은 값 입력 : ");
			int input = scan.nextInt();
			System.out.println(doA(input));

			
		}

	}

}
