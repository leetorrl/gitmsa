package Ex15.src;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        String str = "Hello.java";
        String temp[] = str.split("\\.");

        System.out.println(temp[0]);
        System.out.println(temp[1]);


    }

}