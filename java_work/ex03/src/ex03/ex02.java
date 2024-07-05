package ex03;

import java.util.Scanner; //스케너 자동완성(컨트롤 스페이스) 입력시 자동 추가됨, 추가 안될시 직접입력

class AA{

}

public class ex02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//스케너는 무엇인가를 입력받아서 사용할때 쓰는 문법		
		
		int a;
		int b;
		

		System.out.println("숫자입력");
		
		
		a = scan.nextInt();
		
		System.out.println("a="+a);
		
		b = scan.nextInt();
System.out.println("b="+b);		
		
	}

}
