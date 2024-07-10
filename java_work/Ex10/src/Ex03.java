package Ex10.src;

public class Ex03 {

    public static void main(String[] args) {
        //int double float 변수 선언
        //String 클래스 (앞에 대분자 필수) 오로지 String클래스만 문자지정
        String str1 = new String("happy");
        String str2 = "happy";
        String str3 = "happy";

        System.out.println(str1+" "+str2);
        System.out.println(str1.equals(str2));
        System.out.println(str2 == str3);
//문자열 비교는 .equals 로...
    }

}
