package Ex07.src;

public class Ex06 {

    public static void main(String[] args) {

        System.out.println();
        for(int i= 0; i<10; i++) { //10번 반복
            double result = Math.random() * 100+3; // 랜덤숫자, 3~100까지 int로 선언하고 써도됨

//            중복숫자 안뜨게 할려면 어떻게 해야하는지?

            System.out.println((int) result);//int로 강제변환,



        }
    }
}
