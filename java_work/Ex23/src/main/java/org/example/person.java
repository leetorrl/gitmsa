package org.example;

public class person implements Comparable<person>{

    private  String name;
    private  int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(person o) {
        return o.name.length()- this.name.length();
    }

    public String toString(){
        return "print = " + name + age ;
    }
}
