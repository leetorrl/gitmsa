package Ex07.src;

public class Ex02 {


    public static String doA(){
        int a =10; //doA내에서만 사용가능한 변수
        System.out.println("doA");
        System.out.println("a="+a);

        return "a의 값은="+a;
    }

    public static void main(String[] args) {
        String a = doA();
        System.out.println("main a="+a);
//        public static void doA()로 메서드 지정시 System.out.println(a); a가 출력이 안됨
//        하지만 public static int doA()로 지정후 return 추가시 메인함수로 10을 넘길 수 있음..
//        string 은 문자열을 넘길때 사용..
     }
    }
