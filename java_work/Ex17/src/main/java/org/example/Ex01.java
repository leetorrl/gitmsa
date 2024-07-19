package Ex17.src.main.java.org.example;

import Ex17.src.main.java.org.example.aa.KCar;
import Ex17.src.main.java.org.example.aa.SCar;

public class Ex01 {

    public static void main(String[] args) {

        SCar scar = new SCar("XM3","예쁨","삼성");
        KCar kcar = new KCar("RAY","작음","기아");

        System.out.println(scar);
        System.out.println(kcar);
    }
}
