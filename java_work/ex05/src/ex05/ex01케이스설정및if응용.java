package ex05;

public class ex01케이스설정및if응용 {

	
	
	public static void main(String[] args) {
		
		
		
		int n = 3;
				
		switch (n) {
		case 1:
			System.out.println("n은 1입니다.");
			break;
		case 2:
			System.out.println("n은 2입니다.");
			break;
		case 3:
			System.out.println("n은 3입니다.");
			
			//break 분문을 만나게 되면 스위치 코드에 탈출후 다음출력으로 이행
			//break 없을시 밑에 케이스도 읽음
			
			System.out.println("브레이크 삭제됨");
			
		case 4:
			System.out.println("n은 4입니다.");
			break;

		default:
			break;
		}
		
		
		System.out.println("종료됩니다.");
		
		
		if(n ==1) {
			System.out.println("n은 1입니다.");
		}
		
		
		//else if(2<=n && n <=4){system.out.println("n은 2 이상 4 이하 입니다.");}
		else if(n==1 || n==3 || n==4) {
			//n은 현재 3으로 지정
			System.out.println("n은 2입니다.");
			System.out.println("n은 3입니다.");
			System.out.println("n은 4입니다.");
		}
		
		else {System.out.println("기본");}
		
		System.out.println("종류됩니다.");
		
	}
	
	
}
