package ex05;

import java.util.Scanner;

public class ex05break와continue의차이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int n =0;  //n은 ++ 누적되어 숫자가 증가하게됨
		
		while(true) {
			n++;
			System.out.println("n="+n);
			
			if(n==3)
			continue; // 조건 충족시 다음걸(int temp) 진행하질 않음, 조건걸고 break건다고 생각하면됨
			
			
			
			int temp = scan.nextInt(); //temp는 진행중 기록이 삭제되고 다시 입력해줘야함..(어려움)
			System.out.println("temp="+temp);
			
			
			
		}
		
		
		
		
	}
	
	
	
}
