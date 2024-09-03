package org.example;

public class steelBox <T> extends Box<T>{

    private T t;

    public steelBox(T t, T t1) {
        super(t);
        this.t = t1;
    }

    public T getT() {
        System.out.println("sget ="+t);
        return t;
    }

    public void setT(T t) {
        System.out.println("sset ="+t);
        this.t = t;
    }
}
