package ex03;

import java.util.Scanner;

public class 연습스케너응용 {

	public static void main(String[] args) {

		Scanner 입력 = new Scanner(System.in);

		System.out.println("정상작동 확인");

		
		int a = 입력.nextInt();
		
		double b = a/(double)1000;
		
		System.out.println(a);
		
		System.out.println(b);
	}

}
