package ex06;

public class Ex02자동구구단참고용 {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {

				if(j==4)
					continue;
				
				System.out.println( i + " X " + j + " = " +  i * j );

			}
		}
	}
}
