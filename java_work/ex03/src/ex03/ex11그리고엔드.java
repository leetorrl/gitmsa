package ex03;

public class ex11그리고엔드 {

	public static void main(String[] args) {
		
		
		int num1 = 11;
		int num2 = 22;
		
		boolean result;
		
		result = 3 <=num1 && num1 <= 100; //둘다 참이면 true 아니면 false
                                          // &&그리고의 앞에값이 false면 뒤에값은 계산안함		
		                                  // ||(백스페이스밑에 돈표시)엔드의 앞에값이 ture면 뒤에값은 계산안함
		
		System.out.println(result);
		
		result = num1%3==0;

		System.out.println(result);


		result = num1%2==0;

		System.out.println(result);

		result = (num1 % 3 == 0) && (num1 % 2 == 0);
		System.out.println(result);



	}

}
