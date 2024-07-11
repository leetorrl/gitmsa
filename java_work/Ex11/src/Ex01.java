package Ex11.src;
//2의 n승 제작해보자
import java.util.Scanner;

class Fact{
    public void fact(int num){//밑에 작성한 fact.fact(num);을 전수받고 이쪾에서 출력...
        //메소드는 반환값을 적게 되면 반환값이 무조건 있어야 한다.
        System.out.println("여기오나"+num);

//        if(num>0){
//                    return 2 * fact(num-1);
//                    //2*fact(2)
//                   //2*2*fact(1)
//                    //2*2*2*1 = 8
//        }
//        else {
//            return 1;
//        }

    }
}

public class Ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//String -> int Integer.parseInt();

        System.out.println("몇승 구할래?");

        String a = scanner.nextLine(); //문자열 입력
        int num = Integer.parseInt(a); //문자열을 숫자로 바꾸는 함수

//        System.out.println(a);
//        System.out.println(num);

        Fact fact = new Fact();
//        int result = fact.fact(num);//숫자 num을 클레스 Fact에 보내기 위해서 받기위한 장치가 필요

//        System.out.println("result="+result);
    }
}
