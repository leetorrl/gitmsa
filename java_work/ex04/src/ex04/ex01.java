package ex04;

public class ex01 {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
             //    10/3 나머지1 false   그리고   a+10 = > 0 true
		boolean 결과 = 10 % 3 == 0     &&    (a += 10) > 0;

		System.out.println("작동확인");

		System.out.println(결과);
		System.out.println(a);
	}

}
