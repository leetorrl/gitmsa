package ex06;

public class Ex01for안에for반복에반복 {

	public static void main(String[] args) {

		//i=0 일때 j는 0~2까지 반복
		//i=1일때 j는 0~2까지 반복...
		//이렇게 하면 j값이 초기화가됨
		//for 내에서만 i값과 j값이 존재하여 중괄호 밖에서 출력하면 i와 j가 인식되지 않음
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.println(" i = " + i + " j = " + j);

			}

		}

	}

}
