package ex06;
//1. 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오

//결과값은 출력했지만 총합은 어떻게 구하는지?

public class 기출문제1 {

	public static void main(String[] args) {

		int a = 0;

		

		for (int n = 1; n < 21; n++) {

			if (n % 2 == 0 || n % 3 == 0)
				continue;

			a += n;
			System.out.println(n);
		}
		
			System.out.println("총합"+a);
	
	}
}
