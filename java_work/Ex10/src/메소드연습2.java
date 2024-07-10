package Ex10.src;

public class 메소드연습2 {

    String 한;
    String 글;
    String 화;

    public int bb() { //int 메소드는 리턴을 반드시 시켜야하며 리턴을 여러개
                       // 설정후 마지막에 리턴0을 설정하면됨

        for (int i = 1; i < 2; i++) {//i++왜 필요없지?

            int j = (int) (Math.random() * 3) + 1;

            if (j == 1) {
                System.out.println("메소드1이뜸");
                return 1;
            } else if (j == 2) {
                System.out.println("메소드2가뜸");
                return 2;
            } else {
                System.out.println("메소드3이뜸");
                return 3;
            }
        }return 0;
    }

    public int aa(){

        int a = 10;
return a;
    }

    public void ini(String i,String j,String k){

       한=i;
       글=j;
       화=k;
    }
}



