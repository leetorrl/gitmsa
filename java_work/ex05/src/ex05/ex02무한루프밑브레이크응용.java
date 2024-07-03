package ex05;

import java.util.Scanner;

public class ex02무한루프밑브레이크응용 {

	public static void main(String[] args) {
		
		//계속 입력받아서 진행.
		
		Scanner scan = new Scanner(System.in);
		
		//단순반복을 할경우 while 조건 반복을 설정할 경우 for
	
		
		while(true) {
			
//			[조건이 맞으면] 무한루프 가능
			
			System.out.println("입력바람");
			
			int num = scan.nextInt();
			
			System.out.println("num="+num);
			
			
			if(num==0) {
				break;
				//while에서 빠져나온다
			}			
		}
		
		System.out.println("종류");
			
	}
		
}
