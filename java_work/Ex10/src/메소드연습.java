package Ex10.src;

public class 메소드연습 {

    public static void main(String[] args) {//메소드 불러오기 기본편

String 문장 = "happy";

        메소드연습2 연습1 = new 메소드연습2();//메소드2에서 생성자 bb를 만든후
                                         // 메인에서 연습변수를 생성하여 불러와보기
        메소드연습2 연습2= new 메소드연습2();

        int z = 연습2.aa()*2;

       int a = 연습1.aa();
       int b = 연습1.bb();

        System.out.println(a+b);
        System.out.println(z+a);

//                연습.bb();//출력되나가 출력됨

        System.out.println();

        System.out.println();
    }
}
