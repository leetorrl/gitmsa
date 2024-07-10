package Ex10.src.aa;

import java.util.Scanner;

public class Ex02 {
//초를 입력받는 함수
//    int를 넘겨주면 String을 반환하는 함수
//    toString은 생략되어진 문법이다...
//
//public String toString(){
//    return "내맘대로";
//}
    public int inputNumber(){

        System.out.println("초입력: ");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();

        return result;
    }
//int를 넘겨주면 string을 변환하는 함수
//    21747초-> 1시간-> 3600초 60*60
//    21600초=6시간 2분? 나머지 47 = 47초
//    1분-> 60초

    //함수는 아무대서 지정해도됨
    public String calculate(int second){//문자 함수는 String
        int hour = second/3600;//시간
        int min= (second%3600)/60;//분
        int sec = (second%3600)%60;//초(나머지)
        return hour+"시간"+min+"분"+sec+"초";
    }

}
