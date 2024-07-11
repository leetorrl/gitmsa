package Ex11.src;

public class Ex04 {
    public static void main(String[] args) {
//        int a,b,c,d,e,f,g ??;
        int a[]=new int[10]; //배열 10번째까지 지정
        int b[] = {1,2,3,4};  //배열을 지정
        int c[] = a;

        System.out.println("a.length="+a.length);//a의 길이가 어떤지 알 수 있다

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
//        System.out.println(a[11]);

        a[0]=20;
        System.out.println(a[0]);

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
    }
}
