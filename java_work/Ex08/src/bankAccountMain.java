package Ex08.src;

class BankAccountMain {

    public static void main(String[] args) {

        BankAccount a = new BankAccount();
//        BankAccount b = new BankAccount();
//        BankAccount c = new BankAccount();
//        BankAccount d = new BankAccount();

//a라는 변수 안에 a mod
//        b라는 변수 안에 b mod 생성

        //클래스 변수 출력할때.. tostring은 생략 가능하다
        // tostring은 내가 다시 정의 할 수 있다.
        System.out.println("a참조변수="+a);
//        System.out.println("b참조변수="+b);
//
        a.mod();//a mod 불러온후 출력시 a값이 10에서 20으로 변함
        System.out.println();//줄바꿈
        System.out.println("a참조변수="+a);
//        System.out.println("b참조변수="+b);

    }
}
