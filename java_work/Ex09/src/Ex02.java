package Ex09.src;
//클래스 정의...
//클래스는 선언했다 하여도 메모리에 올라가지 않아 기록이 되지않음, 일방적으론 불러오기도 안됨
class A{
    int num = 15;
    public void doA(){
        System.out.println("아뭇다나 만들기");
    }
}
public class Ex02 {
    public static void main(String[] args) {

        int num = 10;//클래스 int num과 중복은 가능하나 같은것은 아니기에 해깔리면 안됨;;
        System.out.println(num);
        A a1 = new A();// 이 변수를 선언하여 메모리에 클래스 A를 쓸 수 있게된다
        A a2 = new A();
        A a4;
        a4 = new A();

        System.out.println(a1.num);
        a1.doA();
        a1.num = 30;

        System.out.println("a1.num="+a1.num);
        a1.doA();

        System.out.println("a2.num="+a2.num);
        a2.doA();
    }
}
