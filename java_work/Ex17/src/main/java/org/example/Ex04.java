package Ex17.src.main.java.org.example;

import Ex17.src.main.java.org.example.box.Box;
import Ex17.src.main.java.org.example.box.GoldBox;
import Ex17.src.main.java.org.example.box.paperBox;

public class Ex04 {

    public static void main(String[] args) {

        Box box1 = new Box();
        paperBox box2 = new paperBox();
        GoldBox box3 = new GoldBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }

    public static void wrapBox(Box box){

        if(box instanceof GoldBox){
            ((GoldBox) box).goldbox();
        }
        else if (box instanceof paperBox) {
            ((paperBox) box).parerbox();

        }
        else {
            box.box();
        }
    }
}
