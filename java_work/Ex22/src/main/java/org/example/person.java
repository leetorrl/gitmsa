package org.example;

public class person implements Comparable{

    private String name;
    private int age;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
//        System.out.println("this = "+this);
//        System.out.println("this.age = "+this.age);
//        System.out.println("person(o) = "+(person)o);
//        System.out.println(((person)o).age);

//        if(this.age > ((person) o).age){
//            return 1;
//        }
//        else if(this.age < ((person) o).age){
//            return -1;
//        }
//        else {
//            return 0;
//        }
        return this.age - ((person)o).age;
//        return  this.age - ((person)o).age;
    }
}
