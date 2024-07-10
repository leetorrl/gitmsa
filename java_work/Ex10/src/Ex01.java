package Ex10.src;
//2. 피보나치 수열 은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다
//
//예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 된다.
//        1,1,2,3,5,8,13,21,... 이렇게 진행된다
//피보나치수열의 10 번째 수는 무엇인지 계산하는 프로그램을 완성하시오
//
//    3. 구구단의 일부분을 다음과 같이 출력하시오
//    2*1=2       3*1=3       4*1=4
//            2*2=4       3*2=6       4*2=8
//            2*3=6       3*3=9       4*3=12
//
//            5*1=5       6*1=6       7*1=7
//            5*2=10      6*2=12      7*2=14
//            5*3=15      6*3=18      7*3=21
//
//            8*1=8       9*1=9
//            8*2=16      9*2=18
//            8*3=24      9*3=27

//프로그램 사용자로부터 초(second)를 입력받은 후에, 이를[시,분,초]의 형태로 출력하는 프로그램을 작성해보자
import Ex10.src.aa.Ex02;
public class Ex01 {

    public static void main(String[] args) {

        Ex02 calSencond = new Ex02();
//        calSencond.inputNumber();//이상태로는 불러오기는 되지만 출력은 안됨
        int reValve = calSencond.inputNumber();//앞에 int를 지정해주면 출력이 가능
        System.out.println(reValve);


        String resultValue = calSencond.calculate(reValve);
        System.out.println(resultValue);
//        System.out.println(calSencond.inputNumber());

//        Ex02 calSecond2 = calSencond;
//
//        System.out.println(calSencond.toString());
//
//       System.out.println(calSecond2);




    }

}
