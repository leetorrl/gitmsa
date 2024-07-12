package Ex12.src;

class A{  //3. 클래스 A를 생성후 int a를 선언
    int a;
}

public class Ex08 {

    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5}; //1. 배열 5칸 12345 순으로 지정
        int br[] = ar;           // br배열은 ar과 같다

        br[0]=10;             // br배열의 0칸은 10으로 지정

        for(int i =0; i<br.length; i++){ //2. 반복문 활용으로 ar과 br출력값의 차이점 확인
                                          //밑의 반복문과 똑같이 출력되는것을 확인가능
            System.out.println(ar[i]);
        }

        System.out.println();

        for(int i = 0; i<br.length; i++){

            System.out.println(br[i]);

        }

        A a = new A();  //4. 클래스 A를 호출하여 참조변수 활용 a와 b의 출력값 비교
        A b = a;
        
        a.a = 10;
        
        System.out.println("a.a="+a.a);  //4. a=b이므로 출력값이 둘다 10이 나오는걸 확인됨
        System.out.println("b.a="+b.a);
     }
    }
