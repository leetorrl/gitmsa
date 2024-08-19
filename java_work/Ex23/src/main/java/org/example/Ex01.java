package org.example;

public class Ex01 {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box();
        Box<Orange> box2 = new Box();
        Box<String> box3 = new Box(); //String만 넣을 수 있따.

        box1.setObj(new Apple());
        box2.setObj(new Orange());

        Apple apple = (Apple) box1.getObj();
        Orange orange = (Orange) box2.getObj();

        System.out.println(apple);
        System.out.println(orange);
    }
}
