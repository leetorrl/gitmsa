package Ex15.src;
//생성자 오버로딩
public class Ex03 {

    public static void main(String[] args) {

        person p1 = new person();
        person p2 = new person("850511");
        person p3 = new person("850511","00001");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.show();
        p2.show();
        p3.show();
    }
}
