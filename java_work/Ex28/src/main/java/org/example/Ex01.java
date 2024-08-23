package org.example;

class outer {
    int num = 0;

    class Member{

        void add(int n){
            num+=n;
        }
        int get(){return num;}

    }
}

public class Ex01 {

    public static void main(String []args){

        outer o1 = new outer();
        outer o2 = new outer();

        outer.Member o1m1 = o1.new Member();
        outer.Member o1m2 = o1.new Member();

        outer.Member o2m1 = o2.new Member();
        outer.Member o2m2 = o2.new Member();

        o1m1.add(5);
        System.out.println(o1m2.get());

        o2m1.add(7);
        System.out.println(o2m2.get());
    }
}
