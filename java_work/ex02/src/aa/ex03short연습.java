package aa;

public class ex03short연습 {

	public static void main(String[] args) {
		
		//int = 4byte=32bit
		//short 2byye=16bit
		
		//0000 0000 0000 0000 16개
		//0000 0000 0000 0000 0000 0000 0000 0000 32개
		
		short a = 11;
		short b = 22;

		//short result = a+b; 인트형으로 계산하여 큰숫자를 작은숫자로 계산이 안되어 프로그램이 진행안됨
		short result =(short)(a+b); //이렇게 숄츠형으로 강제변환 지정을 해줘야 계산식이됨
		System.out.println(a+b);
	}

}
