package Ex08.src;
//for부문 while로 바꾸기 선생님풀이
public class Ex01 {

    public static void main(String[] args){
//            i=0 일때 j가 0~0이하까지 => 1번
//            i=1 일때 j가 0~1이하까지 => 2번
//            i=2 일때 j가 0~2이하까지 => 3번
//                ...
                int i =0;

                while (i < 10) {

                    int j = 0;
                    while (j<=i){
                        j++;
                        System.out.print("*");//줄바꿈 없이 * 출력하여라
                    }
                    System.out.println();//줄바꿈v
                    i++;

            }

        }
    }



