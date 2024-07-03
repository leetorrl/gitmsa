package ex05;

public class ex06최소공배수구해보기 {

	public static void main(String[] args) {
		
		//3과 배수와 4의 배수를 찾는 반복문
		//최소 공배수(3과 4로 나누었을때 나머지가 0인경우)
		
		int num=1;
		
		for(num=1; num<100; num++) {//조건있는 반복을 할때
			
			
			if(num%3==0 && num%4==0) {
			
			System.out.println("num"+num);
			
			break; //break가 for에 닿지 않고 if에 닿도록 괄호쳐줄 필요가 있음(조건 충족시키기)
			
			}//break를 검으로서 한번 조건 충족시 바로 for부분 탈출
			
			
			
			
		}
		
		
		
	}
	
	
}
