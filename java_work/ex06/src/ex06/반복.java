package ex06;

public class 반복 {


 
      public static void main(String[] args) {
        int i = 1;
        int result = 0;

        do {
            result += i;
            i += 1;
        } while (i <= 10);

        System.out.println(result);
    }
}

