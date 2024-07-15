import java.util.Scanner;

public class 기출문제1 {
    //    1. 문자열을 입력받아 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
//    제한사항 1<= str의 길이 <=10
//    입력 #1

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("문자를 입력하시오>>");
        String a = scan.nextLine(); //문장 입력

        char[] A = a.toCharArray(); //문자를 문자배열로 바꾸기

      for(int i = 0; i<A.length; i++){

          if(A.length>0 && A.length<11){
              System.out.println(A [i]);
          }
          else {
              System.out.println("10자를 넘겨서 안됩니다.");
              break;
          }
      }
    }
}
