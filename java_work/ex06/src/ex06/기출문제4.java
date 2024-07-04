package ex06;

//4. for문을 while문으로 변경하시오

public class 기출문제4 {

	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {// 0~9까지 출력
//
//			for (int j = 0; j <= i; j++) {// j가 i보다 같거나 작을경우 계속증가
//											// j가 반복하고 i로 줄바꿈
//
//				System.out.print("*");
//
//			}
//
//			System.out.println();
			// 출력된 값은 세로로 표현
//		}
//	}
//}
////		}
//	}
//}
			
		int i = 0;
		while (i < 10) {
			int j = 0;
			
			 while (j <= i) {
				System.out.print("*");
				j++;
				}
			 
				i++;
				System.out.println();
		}
	}
}

