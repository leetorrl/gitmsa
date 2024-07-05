package Ex07.src;
import java.util.Scanner;
public class Ex04 {

    //1+2+3+4+5+6~+10까지 더하는 메서드
    public  static void doA(int end){
        int sum =0;
        for(int i =1; i<end+1; i++){
             sum += i; // sum = sum+ i;
        }
        System.out.println("1부터"+end+"까지합="+sum);
    }
    //1*2*3*4*5*6*~*10 까지 곱하는 메서드
    public  static void doB(int end){
        
        int sum =1; //곱이라 sum을 1로 시작
        for(int i =1; i<end+1; i++){
            sum *= i; // sum = sum+ i;
        }
        System.out.println("1부터"+end+"까지곱="+sum);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("몇까지 더하고 곱할까요?");
        int test = scan.nextInt();

        doA(test);
        doB(test);
    }
}
