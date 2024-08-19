package org.example;

public class DBox<A,B> {

    private A a;
    private A aa;
    private B b;
    private B bb;

    public A getA(int AA) {

        return a;
    }

    public void setA(A a1) {
        this.a = a1;
    }

    public B getB() {
        return bb;
    }

    public void setB(B b2) {
        this.b = b2;
    }

    public String toString(){

        return "아 = "+(a) + (b);
    }
}
