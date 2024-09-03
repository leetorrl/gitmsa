package org.example;

public class Ex01 {
    public static void main(String[] args) {

        Boxfactory.peekBox4(new Box<AA>(new AA()));
        Boxfactory.peekBox4(new Box<BB>(new BB()));
        Boxfactory.peekBox4(new Box<CC>(new CC()));

        Boxfactory.peekBox5(new Box<Object>(new Object()));
        Boxfactory.peekBox5(new Box<AA>(new AA()));
        Boxfactory.peekBox5(new Box<BB>(new BB()));

//        Boxfactory.peekBox5(new Box<CC>(new CC()));
    }
}
