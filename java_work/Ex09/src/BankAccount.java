package Ex09.src;

public class BankAccount {
//같은 클래스 내에서는 메인을 따로 생성할 필요가 없다.
    int num = 0;

    public  int cmb(){
//        int num = 200;//변수 중복시 가장 가까운게 적용

        System.out.println("잔액"+num);
        return num;

     }

     public void deposit(int a){//증가 대입
        num = num + a;
     }

     public void withdraw(int a){//감소 대입연산
        num -= a;
     }

}
