package Ex12.src;

public class 기출문제2 {
//1. 배열 [10,20,30,40,50] 알맞은 코드를 넣어 총합과 평균을 구하세요
    public static void main(String[] args) {

        int ar[]= {10,20,30,40,50};

        int a = ar.length;
        int sum = 0;

        for (int i=0; i<ar.length; i++){

            sum+=ar[i];

            if(a==i+1){
                System.out.println(" i 값 = "+i);
                System.out.println(" 배열 합 = "+sum);
                System.out.println(" 배열합 평균 = " + sum/a);
            }
        }
    }
}
