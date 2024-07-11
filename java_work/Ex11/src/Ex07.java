package Ex11.src;

public class Ex07 {
    public static void main(String[] args) {
//
//        주어진과제
//                String -> char[]
//                char[] -> String

        // str 문자열
String str = "우리는 할 수 있따";
char[] chars = str.toCharArray(); //문자를 문자배열로 바꿔주는툴

        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println(chars[3]);//뛰어쓰기도 문자로 취급
        System.out.println(chars[4]);
        System.out.println(chars[5]);
        System.out.println(chars[6]);
        System.out.println();

        chars[4] = 'A';   //4 배열을 A로 변경후 다시 출력시...
        System.out.println(chars[4]); //A로 출력이 된다

        String aa = new String(chars); //문자열을 문자배열로 변환...
        System.out.println(aa); //A로 변경된거 적용됨
    }
}
