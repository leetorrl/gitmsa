package org.example;

class person1 implements Comparable<person1> {

     int age;
     String name;

     person1(int age, String name){

         this.age = age;
         this.name = name;

     }

    @Override
    public String toString() {
        return "person1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(person1 o) {
        System.out.println("디스네임 = "+this.name);
        System.out.println("오네임 = "+o.name);
        System.out.println("this나이 = "+this.age);
        System.out.println("o나이="+o.age);
        System.out.println(this.name.length() - o.name.length());
        return this.name.length() - o.name.length();

    }


}
