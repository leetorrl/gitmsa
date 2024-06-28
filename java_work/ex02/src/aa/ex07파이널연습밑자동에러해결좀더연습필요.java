package aa;

public class ex07파이널연습밑자동에러해결좀더연습필요 {

	public static void main(String[] args) {
		
		
	final int MAX_SIZE =100; //값의 변경이 불가능한 명령어
	
	//MAX_SIZE=200; -> 에러표시남
	
	System.out.println(MAX_SIZE);
	
	
		final double AA = 200; //실수는 무조건 double형으로 하는걸로 약속되있음
		System.out.println(AA);
		
		final String c = "변경불가";
		System.out.println(c);

		float result = (float) (3.3+4.5) ;   //오류날시 컨트롤+1로 자동 에러해결
		System.out.println(result);
		
		//System.out.printf("정수는 %d 실수는 %f", 10,20.33);  좀 다른 출력방법
		
		//System.out.println(38732157613764327856L);
		
		System.out.println(3.4*10000000); //3.4*10에8승으로 컴파일이 알아서 출력함
		
		
		
		
		
		
	}

}
