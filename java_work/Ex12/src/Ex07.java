package Ex12.src;


import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {

        int ar[] = new int[5]; //1. int ar 배열 빈칸 5칸 생성

//        ar = {3,3,3,3,3}; #배열이 같은수 중복으로 이렇게는 자바에서 지정안된다함

        Arrays.fill(ar,3); // 2. Arrays.fill 작성후(임폴트 Arrays 자동완경됨)
                                // 배열 ar과 연결 빈칸을 모두 val 3으로 지정

        Arrays.fill(ar,1,2,3); //??

    for(int i=0; i<ar.length; i++){ //3. for반복 이용하여 출력되는값 확인해보기

        System.out.println(ar[i]); //3. 숫자3 만 5번 출력됨
     }
    }
}
