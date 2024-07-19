package Ex17.src.main.java.org.example;

import Ex17.src.main.java.org.example.phone.mobilephone;
import Ex17.src.main.java.org.example.phone.smartphone;

public class Ex02 {

    public static void main(String[] args) {

        smartphone Smart = new smartphone(
                "5.0",12345678);
        Smart.show();

        System.out.println();
        mobilephone mobil = new mobilephone(123);

        mobil.show();
    }
}
