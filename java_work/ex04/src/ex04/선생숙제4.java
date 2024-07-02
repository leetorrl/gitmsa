package ex04;

//아래는 화씨(F)를 섭씨(C)로 변환하는 코드이다 변화공식이 'C=5/9*(F-32)'라고 할때 (1)에 알맞은 코드를 넣으시오.
//단, 변환 결과값은 소수점 셋째자리에서 반올림해야 한다.(형변환이용)

public class 선생숙제4 {
	
	public static void main(String[] args) {
		
int F = 100;


int a = (int)((float)5/9*(F-32)*1000)%10; //결과값 7은 구함


 






float C =     (int)((float)5/9*(F-32)*100)*10 ;     // 37770.0 값이 나옴        //(1)
     










//System.out.println(a);




System.out.println("F="+F);
		System.out.println("C="+C);
		
		
	}
}
