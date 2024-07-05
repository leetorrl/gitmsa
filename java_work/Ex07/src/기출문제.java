package Ex07.src;
//1. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성
//2. math.random을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를
//   완성하여(1)에 알맞은 코드를 넣으시오

public class 기출문제 {

    public static void main(String[] args) {

        int value = 리턴값();

        System.out.println("value=" + value);
    }

    public static int 리턴값() {

        for (int i = 1; i < 2; i++) {//for반복문으로 int i를 1로 지정했을 경우..

            double a = Math.random() * 10;

            if (a > 7) {
                i -= 1;

                continue;
            }

            System.out.println("리턴값="+(int) a);
            return (int)a;//이 리턴은 for에서 벗어날시 증발하여 int 리턴값()에
                          // 도달이 안되므로 한번더 리턴할 필요가 있음
        }
        return 0;//int메서드를 만들었다면 리턴공간 만들어주어 int 리턴값()넣어줄 리턴 공간을
//                  만들어줘서 올려주기
    }
}