package ex04;

public class ex05비교연산if {
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(a<b) {
			// 중괄호 매우중요!
			System.out.println("true 실행");
			
			int c = 25;
			
			
			System.out.println(c);
			
		}
		
		
		else {
			//if가 아니면 else실행 결과값도 다르게 설정가능
			System.out.println("출력");
			System.out.println("false 실행");
			
			
			int c =30;
			System.out.println(c);
			
		}
		
	}

}
