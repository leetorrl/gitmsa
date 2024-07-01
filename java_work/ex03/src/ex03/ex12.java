package ex03;

public class ex12 {

	public static void main(String[] args) {
		
		int a =10;
		int b =10;
		
		boolean result;
		//          false   그리고    true
		result = ((a+=10)<0) && ((b+=10)>0);
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
        //           false    또는     true
		result = ((a+=10)<0) || ((b+=10)>0);
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
