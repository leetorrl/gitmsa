package Ex15.src;
//1. Student 클래스를 작성하는 연습을 해보도록하자.
//        Student클래스에 getTotal() getAverage() 과 를 추가하시오
//    1. :  getTotal 메서드
//기 능 국어 영어 수학 의 점수를 모두 더해서 반환한다 :
//        (kor), (eng), (math) .
//반환타입 : int
//매개변수 없음 :
//        2. : getAverage 메서드
//기 능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다 : ( + + ) .
//소수점 둘째자리에서 반올림할 것.
//반환타입 : float
//매개변수 없음

import java.util.Scanner;

class Student{

    int kor;
    int eng;
    int math;

    public int getTotal(int a,int b,int c){

        kor = a;
        eng = b;
        math = c;
        int sum = 0;
        int[] A = {kor,eng,math};

        for(int i=0; i<A.length; i++){

            sum += A[i];

        }
        return sum;
    }

    public  float getAverage(int a,int b,int c){
        kor = a;
        eng = b;
        math = c;
        int sum = 0;
        int[] A = {kor,eng,math};

        for(int i=0; i<A.length; i++){

            sum += A[i];
        }

        return (float) sum/A.length;
    }
}

public class Ex08 {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        System.out.print(" 국어 점tn 입력하시오>>");
        int a = scan1.nextInt();
        System.out.println();
        System.out.print(" 영어 점tn 입력하시오>>");
        int b = scan2.nextInt();
        System.out.println();
        System.out.print(" 수학 점tn 입력하시오>>");
        int c = scan3.nextInt();
        System.out.println();

        Student s = new Student();

        System.out.println(" 국영수 총합 ="+s.getTotal(a,b,c));
        System.out.println(" 국영수 평균 ="+s.getAverage(a,b,c));
    }
}
