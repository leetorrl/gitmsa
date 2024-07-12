package Ex12.src;

public class Ex03 {

    public static void main(String[] args) {

String a = "abcd";  //1. 문장형 String a b c 값 지정
        String b = "java";
        String c = "system";

        System.out.println(a.length());  //2. 문장형 a b c 출력해보기
                                           // length는 배열 길이를 출력한다  a는 abcd이므로 4로 표시됨
        System.out.println(b.length());
        System.out.println(c.length());

        System.out.println("모든 문장열 길이 = "+a.length()+b.length()+c.length());

        char[] chars = new  char[3]; //3. 문자배열 char 3칸짜리 생성

        String[] str = new String[3]; //3. 문자열배열 str 3칸짜리 생성

        str[0] = "abcd"; //4. 생성한 문자열배열 str 각 칸마다 문장 집어넣기
        str[1] = "java";
        str[2] = "system";

        System.out.println(str[0].length()+str[1].length()+str[2].length()); //4. 만든 문자열배열 출력해보기
                                                                              // 모든 문자열배열 길이를 더하므로 4+4+6= 인 14로 출력됨
             int count = 0; //5. int count 만들기
        for(int i =0; i< str.length; i++){ //5. 반복문 for 만들어서 i값 지정후 str배열과 연결
            System.out.println(i);
            System.out.println(str[i]);   // str
            System.out.println(str[i].length()); // system 배열 길이 6출력
            count= count+str[i].length();
            System.out.println(count);
        }
        System.out.println("모든 문자열 길이는 =");
    }
}
