package Ex07.src;

public class Ex03 {

    public static void main(String[] args) {

//        System.out.println("result="+add()); add를 호출하여 다이렉트로 출력

        System.out.println("result="+add());
        System.out.println("result="+add(5));
    } //메인 종류

    public static int add() {
        System.out.println("기본 add");
        return 10;
    }
    public static int add(int num){
        System.out.println(num + "num add");
        return 10;
    }
}
