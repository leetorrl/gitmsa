//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1+(1+2)+(1+2+3)+(.....)+9+10)=구현

//                i = 0 일때 j가 0 에서 0 + 0 까지 반복
//                i = 1 일때 j가 0 에서 1 + i까지 반복
//                i = 2 일때 j가 0 에서 2 + i까지 반복
//                i = 3 일때 j가 0 에서 3 + i까지 반복
//                i = 4 일때 j가 0 에서 4 + i까지 반복
//                ....
//                i=10일때 j가 0에서 10+i까지 반복
        int sum = 0;

        for (int i = 0; i < 11; i++) {//i는 10이 될때까지 +1 루프 반복..0 1 2 3...10
            for (int j = 0; j < i + 1; j++) {//for내에서 돌기 때문에 j는 루프마다 1로 초기화됨
                System.out.println("j="+j);

                sum = sum+j;
            }
            System.out.println("sum="+sum);
        }
        System.out.println("sum="+sum);



    }

}