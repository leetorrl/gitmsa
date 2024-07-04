package ex06;

public class Ex04메서드변수범위 {

	// 보냈는 구구단 호출 하는 메서드 => 2 3
	public static void aa(int dan) {// 스테틱 인트명 요기서 지정가능, 현 중괄호 안에서만 사용가능 벗어나면 사라짐
		System.out.println("aa");
		for (int i = 3; i < 10; i++) {
			System.out.println(dan * i);
		}
	}

	// 두수를 받아서 최소 공배수 출력하는 메서드
	// num1로 나누었을때 나머지가 0인 상황
	//num2로 나누었을때 나머지가 0인상황
	
	public static void bb(int num1, int num2) {// 현 중괄호 안에서만 사용가능 위에 괄호랑 공유도 안됨
		System.out.println("bb");
		
		int num = 0;
		while(num<50) {
			num++;
			
			if(num%num1==0 && num%num2==0)
			
			System.out.println(num);
			break;
		}
		
		
		
	}

	public static void main(String[] args) {
		System.out.println("프로그램시작");
		aa(7);// 스테틱 인트 숫자 선언
		bb(3, 5);
		System.out.println("프로그램끝");

	}

}
