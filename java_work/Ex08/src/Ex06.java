package Ex08.src;

public class Ex06 {

    public static void main(String[] args) {

        Box a = new Box();
        Box b = new Box();

        System.out.println(a);//null은 아무값도 없다는 의미
        System.out.println(b);

        a.setName("사과");
        System.out.println(a);
        System.out.println(b);

        b.setName("수박");
        System.out.println(a);
        System.out.println(b);
    }

}
