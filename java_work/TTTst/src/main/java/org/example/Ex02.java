package org.example;

interface RETCAL{
    int cal(int a, int b);
}

interface Calculate{
    void cal(int a, String b);
}

public class Ex02 {
    public static void main(String[] args) {

        RETCAL re = (a, b)->{
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            return a+b;
        } ;

        int result = re.cal(10,20);
        System.out.println("a+b = "+result);

//        Calculate c = new Calculate() {
//            @Override
//            public void cal(int a , String b) {
//                System.out.println("계산");
//                System.out.println(a);
//                System.out.println(b);
//            }
//        };
//
//        c.cal(10,"문자열");
//
//        Calculate c2 = (a, b) -> {
//            System.out.println("람다계산");
//        };
//
//        c2.cal(10,"람다");
//
//        c2 = (a,b)->{
//            System.out.println("c2 메서드 = 새로운 람다 계산");
//            System.out.println("c2 a = "+a);
//            System.out.println("c2 b = "+b);
//
//        };
//        c2.cal(20,"새로운람다");

    }
}