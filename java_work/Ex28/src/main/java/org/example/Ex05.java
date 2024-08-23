package org.example;

interface AAA{
    String a();
}
interface AAAA{
    int aaaa();
}

public class Ex05 {

    public static void main(String[] args) {

        AAA A = ()->"이게되네";
        AA aa = ()-> 10;

        AAAA aaaa =()->4;

        String F = A.a();


        System.out.println(F);
        System.out.println(aa.doA());
        System.out.println(aaaa.aaaa());
    }
}
