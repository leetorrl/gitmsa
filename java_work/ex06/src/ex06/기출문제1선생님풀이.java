package ex06;

public class 기출문제1선생님풀이 {


  public static void main(String[] args) {
    
    int sum = 0;

        for(int i = 0; i <= 20; i++){


          if(i%2!=0 && i%3!=0){
          System.out.println(i);
        
          sum += i;
        }



        }
        System.out.println("총합="+sum);
  }
  
}
