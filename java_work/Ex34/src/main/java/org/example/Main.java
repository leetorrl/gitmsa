package org.example;

import java.io.*;

class MyObject implements Serializable { //객체 파일 생성할땐 반드시 ser에 상속받아야함
    private String test = "aaa";
    public String getTest(){return test;}
    public void  setTest(String test) {this.test = test;}
}

public class Main {

    public static void main(String[] args) throws Exception {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/a/obj"));

       oos.writeObject(new MyObject());

       oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FilterInputStream("d:/a/obj"));
//
//        Object aaa = ois.readObject();
//        MyObject mo = (MyObject) aaa;
//
//        System.out.println(mo.getTest());
    }
}