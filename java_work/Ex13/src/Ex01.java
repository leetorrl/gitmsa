import java.util.Scanner;

class Exam{

    Scanner scan = new Scanner(System.in);

    public int inputNumber(){

        System.out.println("숫자 입력");
        int inputNumber = scan.nextInt();
        System.out.println(inputNumber);
        return inputNumber;
    }
}

public class Ex01 {
//10진수를 입력받아 2진수로 출력받...
    public static void main(String[] args) {

      Exam exam = new Exam();
  int result =  exam.inputNumber(); //void 메서드 불러오기(반환은 안됨)

        System.out.println("main="+result);

        int 몫,나머지;

        몫 = result/2;
        나머지 = result%2;

        System.out.println("몫="+몫);
        System.out.println("나머지="+나머지);

        String 나머지들 = ""+나머지;

        while (true){

            나머지 = 몫%2;
            몫 = 몫/2;
            나머지들 = 나머지+나머지들;

            System.out.println("몫="+몫);
            System.out.println("나머지="+나머지);
            System.out.println("나머지들="+나머지들);
            
            if(몫<2) {

                if(몫!=0){

                나머지들=몫+나머지들;
                System.out.println("나머지들="+나머지들);
                break;
                }
            }
        }
    }
}
