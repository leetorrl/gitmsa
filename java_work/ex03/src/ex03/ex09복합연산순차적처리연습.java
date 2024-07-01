package ex03;

public class ex09복합연산순차적처리연습 {

	public static void main(String[] args) {
		
		
		short num1 = 10;
		num1 = (short) (num1+87L); //int(디폴트)로 컴파일 계산에 의해 short강제변환 필요
		
		System.out.println(num1);
		
		
		
		num1 = 10;
		num1 += 87l;
		System.out.println(num1);
		
		
		
		
		int num2 = 3;

		num2 =  (int) (num2*3.3);

		System.out.println(num2);

		
		

		num2 *= (int) 3.3; // int 넣어도 되고 안넣어도되는데 걍 넣자!
		System.out.println(num2);
		
		
	}

}
