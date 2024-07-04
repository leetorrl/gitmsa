package ex06;

public class Ex03메인과스테틱메서드정의호출 {

	private static void hiveryone(int i) {

		System.out.println("여기온다"+i);
		
		if(i==12) {
			System.out.println("i = 12 입니다");
			
			for(int k=0; k<3; k++) {
				System.out.println("k="+k);
			}
			
		}
		
//스태틱 지정시 위치는 크게 부여받지 않음
		
	}

	public static void main(String[] args) {
		int k = 20;
		System.out.println("프로그램 시작"+k);
		hiveryone(12);
		hiveryone(13);
		System.out.println("프로그램 끝");

	}

}
