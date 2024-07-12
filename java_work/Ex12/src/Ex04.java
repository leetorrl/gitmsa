package Ex12.src;

public class Ex04 {

//    인트 배열 생성방법 밑 이해

    public static void main(String[] args) {

        int[] num = {1,2,3};         //1. 인트 배열 num 지정 3칸 짜리를 123 집어넣으면서 생성
        int[] num2 = new int[]{1,2,3};    // 1. 과 입력은 다르지만 동일한 생성임

        int[] num3 = new int[3];       //1. num3 3빈칸 배열 생성

//        num[0]=1; 1. 빈칸일시 다이렉트로 주입 가능
//        num[1]=2;
//        num[2]=3;

        System.out.println(num[2]); //2. 배열 출력해보기

    }

}
