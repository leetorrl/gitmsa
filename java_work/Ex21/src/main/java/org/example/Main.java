package org.example;

import java.util.Objects;

class A extends Object {

    private String name;

    public A(String name) {
        this.name = name;
    }

    public void printThis(Object obj){
        System.out.println(" this = "+this);
        System.out.println(" (A) obj = "+(A)obj);
        System.out.println(" this.name = "+this.name);
        System.out.println(" (A)obj.name = "+((A)obj).name);
    }


    public boolean equals(Object o) {

        return this.name.equals(((A) o).name);
    }
}
public class Main{
public static void main(String[] args) {

     A a1 = new A("AA");
     A a2 = new A("AA");
    A a3 = new A("AAA");

    a1.printThis(a2);

    System.out.println(a1.equals(a2));
    System.out.println(a2.equals(a1));
    System.out.println(a3.equals(a1));

    System.out.println(a1==a2);
}
 }