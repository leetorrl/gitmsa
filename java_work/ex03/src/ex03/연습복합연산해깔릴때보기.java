package ex03;

public class 연습복합연산해깔릴때보기 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		boolean 결과;
		//  true a(10)+=b(20)=a(30)  그리고  false a(30)+=b(20)=b(50)
				결과 = ((a+=b)>0)      &&           ((b+=a)<0);
				
		System.out.println(결과);
		System.out.println(a); //a30
		System.out.println(b); //b50
 		
   //  false a(30)-=b(50)=a(-20)        혹은       false b(50)-=a(-20)=b(70)
		결과 =    ((a-=b)>0)           ||          ((b-=a)<0);
		
		System.out.println(결과);
		System.out.println(a);
		System.out.println(b);
	}

}
