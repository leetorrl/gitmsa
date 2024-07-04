package ex06;

import java.util.Scanner;

public class 구구단만드는중 {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		System.out.print("자연수를 기입후 엔터>>");

		int num = n.nextInt();

		switch (num) {
		
		
		
		case 2:
			System.out.println(num+"X2="+num*2);
			
		case 3:
			System.out.println(num+"X3="+num*3);
			
		case 4:
			System.out.println(num+"X4="+num*4);

			// break 분문을 만나게 되면 스위치 코드에 탈출후 다음출력으로 이행
			// break 없을시 밑에 케이스도 읽음

			System.out.println(num+"X5="+num*5);

		case 5:
			System.out.println(num+"X6="+num*6);
			
		case 6:
			System.out.println(num+"X7="+num*7);
			
			
		case 7:
			System.out.println(num+"X8="+num*8);
			
		case 8:
			System.out.println(num+"X9="+num*9);
			
		break;

		}

	}

}
