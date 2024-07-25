package org.example.AA;

public class point implements Cloneable {

    private int xpos;
    private int ypos;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //??
    }

    public point(int xpos, int ypos){
        this.xpos = xpos;
        this.ypos = ypos;

    }

    public void showPoint(){
        System.out.printf(
                "[%d,%d]\n",xpos,ypos);
    }


    public void getXpos(int xpos){
        this.xpos = xpos;
    }

    public void getYpos(int ypos){
        this.ypos = ypos;
    }



}

