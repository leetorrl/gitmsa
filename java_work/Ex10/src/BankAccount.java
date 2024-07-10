package Ex10.src;

public class BankAccount {
    int num = 0;
    String name = "";
    String accNumber = "";
    String ssNumber = "";


    //    BankAccount(){}//생략 가능한 생성자
    BankAccount(String na,String acc,String ss, int n) {
        name = na;
        accNumber = acc;
        ssNumber = ss;
        num = n;
    }//생략 불가능한 생상자...

    public void initAccount(String acc,String ss,int n){
        accNumber = acc;
        ssNumber = ss;
        num = n;
    }//초기화 메소드를 위한 생성자메소드

    public int cmb() {
        System.out.println("==============");
        System.out.println("계좌번호=" + accNumber);
        System.out.println("주민번호=" + ssNumber);

        System.out.println("이름 " + name + " 잔액 " + num);
        System.out.println("==============");

return num;
    }

    public void deposit(int a) {
        num += a;
    }

    public void withdraw(int a){
        num -= a;
    }

}