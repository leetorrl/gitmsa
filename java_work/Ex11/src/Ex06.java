package Ex11.src;

import java.sql.SQLOutput;
import java.util.Locale;

//배열의 랜스와 문자열으 ㅣ랜스 차이
public class Ex06 {
    public static void main(String[] args) {

        String str = "안녕하세요 박명회 선생님입니다.;";
//        String[] tempstr = str.split("1");
        String[] tempstr = str.split(" ");//뛰어쓰기로도 구분되긴함

        for(int i=0; i<tempstr.length; i++){
            System.out.println(tempstr[i]);
        }

        String a = "abcdefgh";
        System.out.println(a.length());

        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println(a.substring(2));//두번째 부터
        System.out.println(a.substring(2,5)); //두번째에서 5번째까지
        System.out.println(a.toUpperCase()); //대문자로
        System.out.println("cd를 포함하냐="+ a.contains("cd"));

        System.out.println("배열출력시작");
        char[] test = a.toCharArray();
        for(int i = 0; i<test.length; i++){
            System.out.println(test[i]);
        }
        System.out.println("배열출력끝");

        test[2] = 'A';
        String testStr = new String(test);
        System.out.println(testStr);

                int[] b = new int[3];
        System.out.println(b.length);
    }
}
