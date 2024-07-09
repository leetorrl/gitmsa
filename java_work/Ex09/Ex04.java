package Ex09;
class BB{
    int num = 10;
}
class CC{
    public void doA(BB b){
        System.out.println("b.num"+b.num);
        b.num = 30;
    }
}
public class Ex04 {//참조변수 특성 활용 복합
    public static void main(String[] args) {
        BB bb = new BB();
        CC cc = new CC();

        cc.doA(bb);//이렇게 선언시 BB bb 를 따라 가리키게 되면서 doA(BB b)를 호출하게 된다한다.
        System.out.println("bb.num = "+bb.num);

//        bb = null;
    }
}
