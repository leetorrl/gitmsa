package Ex09.src;

import java.util.Scanner;



public class 기출문제{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        가위바위보클래스 결과 = new 가위바위보클래스();

//        String result2 = 결과.game;
          int a = 0;
          while (true) {

              System.out.println();
              System.out.print("1=가위, 2=바위, 3=보 중 입력후 엔터>>");


              int result1 = scan.nextInt();


              for (int i = 1; i < 2; i++) {//1=가위 2=바위 3=보

                  a = (int) (Math.random() * 3) + 1;

                  System.out.println();


                  switch (a){
                      case 1 :
                          System.out.println("컴퓨터는 가위");

                          if(result1==1){

                              System.out.println("비겼습니다");
                              break;

                          } else if (result1==2) {

                              System.out.println("이겼습니다");
                              break;

                          }else {

                              System.out.println("졌습니다");
                              break;
                          }



                      case 2 :
                          System.out.println("컴퓨터는 바위");

                          if(result1==1){

                              System.out.println("졌습니다");
                              break;

                          } else if (result1==2) {

                              System.out.println("비겼습니다");
                              break;

                          }else {

                              System.out.println("이겼습니다");
                              break;
                          }

                      case 3 :
                          System.out.println("컴퓨터는 보");

                          if(result1==1){

                              System.out.println("이겼습니다");
                              break;

                          } else if (result1==2) {

                              System.out.println("졌습니다");
                              break;

                          }else {

                              System.out.println("비겼습니다");
                              break;
                          }
                  }
              }
          }
    }
    }




//1. 가위 바위 보 게임을 만들어 보자.
//
//사용자로부터 가위 바위 보 중에서 하나를 입력 받는다. 스캔
//그리고 컴퓨터는 난수 생성을 통해서 가위 바위 보 중에서 하나를 선택하게 한다. 랜덤
//이 둘을 비교해서 승자와 패자를 가려주는 프로그램을 작성해 보자.  for부문 활용?
//단 프로그램의 진행은 사용자가 질 때까지 계속되어야 하고, 반복 브레이크
//마지막에 가서는 게임의 결과(예: 4승 3무)까지 출력해 주도록 하자. if

