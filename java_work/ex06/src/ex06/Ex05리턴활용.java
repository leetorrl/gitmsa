package ex06;

public class Ex05리턴활용 {

	
	public static int aa() {
		System.out.println("aa");
		return 10; //돌아갈시 a는 10으로 지정하는 함수
	}
	
	
	public static void main(String[] args) {
		aa();
		int a = (int) aa();
		System.out.println(a);
		
		
	}
	
	
}
