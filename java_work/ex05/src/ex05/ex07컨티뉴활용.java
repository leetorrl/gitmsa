package ex05;

public class ex07컨티뉴활용 {

	public static void main(String[] args) {
		
		
		int num = 0;
		
		
		while ((num++)<100) { //num++의 경우 조건을 하고나서 1을 더함
			
			if(num%5!=0 || num%7 !=0)//num을 5로(7)로 나누어서 0이 (!)아닐경우
			continue; //5 나누어서 0이(7) 아니면 ++을 진행하게 반복후...
			
			System.out.println("num="+num);
			
			
		}
		
		
		
		
	}
	
	
	
	
	
}
