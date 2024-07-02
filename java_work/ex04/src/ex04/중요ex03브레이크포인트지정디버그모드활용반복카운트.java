package ex04;

public class 중요ex03브레이크포인트지정디버그모드활용반복카운트 {

	
	public static void main(String[] args) {
		//브레이크포인트...드레그 포인터 더블클릭
		//벌레모양으로 실행
		//f6으로 한줄씩 진행
		//f8 종류
		
		int 숫자1 = 10;
		//++ 기입시 값1 증가
		//  num ++
//			num = num+1
//			num +=1
		System.out.println(숫자1++); // 출력후 1 증가(후에 출력하면 1이 증가된 상태)
		System.out.println(++숫자1); // 1 증가후 출력
		System.out.println(숫자1); 
		
               		
		
		System.out.println(숫자1--); // 출력후 1 감소(후에 출력하면 1이 감소된 상태)
		System.out.println(--숫자1); // 1 감소후 출력
		System.out.println(숫자1); 
		
		//for ~동안 틀안에서 반복되는 4씩증가툴 브레이크 10까지
		for (int i=0; i <10; i=i+4) {
			System.out.println(i);
			System.out.println("발사");
			
			System.out.println(i+i);
			
		}
		
		
		
	}
	
}
