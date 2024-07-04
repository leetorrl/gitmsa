package ex06;

//2. 1+(1+2)+(1+2+3)+(1+2+3+4)+......9+10)의 결과를 계산하시오
public class 기출문제2 {

	public static void main(String[] args) {

		int 총합 = 0;
		
		for( int a = 1; a < 11 ; a++) {
			for(int b = 0; b <= a ; b++) {
				
				 총합 = 총합+b;
			
				 
				 
		}
		
			
			
		   }System.out.println(총합);
			
		}
	}
		
