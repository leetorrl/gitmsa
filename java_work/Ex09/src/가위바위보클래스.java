package Ex09.src;

public class 가위바위보클래스 {

    public String game;

    public void setGame(String n){

        game = n;

        while (true){
            double j = Math.random()*3;
            System.out.println("j결과값="+(int)j);

            if(j==0){//a설정 해야댐

               String a = n;

                System.out.println("가위");
            }
            else if(j>1){
                String a = n;

                System.out.println("바위");

            }
            else {
                String a = n;

                System.out.println("보");
            }
            return ;

        }


    }

    public String toString(){
        return "텍스트"+game;
    }

}
