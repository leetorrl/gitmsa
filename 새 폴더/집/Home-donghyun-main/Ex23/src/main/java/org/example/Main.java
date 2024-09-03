package org.example;

public class Main {

    public static void main(String[] args) {



        Boxfactory.<Integer>peekBox(new Box<>(10));
        Boxfactory.peekBox2(new Box<>(20.30));
//        Boxfactory.peekBox2(new Box<>("문자안댐"));

    }
}