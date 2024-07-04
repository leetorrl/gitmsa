package ex06;

import java.util.Scanner;

public class Ex09메서드스캐너활용 {

	public static void doA() {//int는 숫자 void는 문자
		System.out.println("doA 함수");
	}
	
	public static void doB() {
		System.out.println("doB 함수");
	}
	
	
	
	
	public static void main(String[] args) {
		
		//제어문 1을 입력시 doA()함수 호출
		//2을 입력시 doB()함수 호출
		
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
		
		if(select==1) {
			doA();
		}
		else if(select==2) {
			doB();
		}
		
		
		
	}
	
	
}
