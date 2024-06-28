package aa;

public class ex02바이트형변함 {

	public static void main(String[] args) {
		
		byte a= 127; // 바이트는 2진수 특성상 표현 가능한 범위는 -128 ~ 127 8bit = 1byte
		System.out.println(a);
		System.out.println(a+1);
		System.out.println((byte)(a+1)); //비트의 표현범위가 넘어설 경우 문제가 생길수도 있다(오버플로우)

	}

}
