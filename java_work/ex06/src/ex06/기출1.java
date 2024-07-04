package ex06;

public class 기출1 {

	
	public static void main(String[] args) {
		
		
		int a = 0;
		
		for(int i = 1; i<21; i++) {
			
			if(i%2==0 || i%3==0)
				continue;
			
			a += i;
			
			
		}
		System.out.println(a);
		
		
	}
	
	
}
