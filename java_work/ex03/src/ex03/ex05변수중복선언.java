package ex03;

public class ex05변수중복선언 {

	public static void main(String[] args) {
		
		
		double a =10.345;
		int b = (int) a;
		
		System.out.println(a);
		System.out.println(b); //결과값이 정수로 나옴
		
		a = 11.39;
		b = (int) a;
		
		System.out.println(a);
		System.out.println(b);
	}

}
