package org.example;

public class Box <T>{


    private T t;

    public Box(T t){
        this.t=t;
    }

    public T getT() {
        System.out.println("get ="+t);
        return t;
    }

    public void setT(T t) {
        System.out.println("set ="+t);
        this.t = t;
    }

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }
}
