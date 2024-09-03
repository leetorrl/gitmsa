package org.example;

public class Boxfactory {

    public static <T> void peekBox(Box<T> box){

        System.out.println(box);
    }


    public static  void  peekBox2(Box<? extends Number> box){
        System.out.println(box);
    }
    public static  void  peekBox3(Box<Object> box){
        System.out.println(box);
    }
    public static  void  peekBox4(Box<? extends AA> box){
        System.out.println(box);
    }

    public static  void  peekBox5(Box<? super BB> box){
        System.out.println(box);
    }
    public static  void  peekBox6(Box<? extends AA> box){
        AA getbox = (AA)box.getT();
        System.out.println(getbox);
//        box.setT(new AA());
    }
    public static  void  peekBox7(Box<? super AA> box){
//        AA getbox = box.getT();
//        System.out.println(getbox);
        box.setT(new AA());
    }
    public static <T> T getMyBox(Box<? extends T>box){
        return box.getT();

    }
}
