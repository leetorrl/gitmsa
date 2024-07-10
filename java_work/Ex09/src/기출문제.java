package Ex09.src;

import java.util.Scanner;



public class 기출문제{//시스템은 구동되는데 기록이 저장안됨;;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        가위바위보클래스 결과 = new 가위바위보클래스();

//        String result2 = 결과.game;
          int a = 0;
          while (true) {

              System.out.println();
              System.out.print("0=종류, 1=가위, 2=바위, 3=보 중 입력후 엔터>>");

              int sum = 0;
              int result1 = scan.nextInt();



              for (int i = 1; i < 2; i++) {//1=가위 2=바위 3=보

                  a = (int) (Math.random() * 3) + 1;



                  System.out.println();


                  switch (result1){
                      case 0 :
                          System.out.println("종류합니다");
                          return ;

                      case 1 :
                          System.out.println("나는 가위");

                          if(a==1){

                              System.out.println("컴퓨터는 가위! 비겼습니다");
                              System.out.println("현재 승리수="+sum);
                              break;
                          } else if (a==2) {

                              System.out.println("컴퓨터는 바위! 졌습니다");
                              break;

                          }else {
                              System.out.println("컴퓨터는 보! 이겼습니다");
                              sum ++;
                              System.out.println("현재 승리수="+sum);
                              break;

                          }



                      case 2 :
                          System.out.println("나는 바위");

                          if(a==1){

                              System.out.println("컴퓨터는 가위! 이겼습니다");
                              sum ++;
                              System.out.println("현재 승리수="+sum);
                              break;

                          } else if (a==2) {

                              System.out.println("컴퓨터는 바위! 비겼습니다");
                              System.out.println("현재 승리수="+sum);
                              break;
                          }else {
                              System.out.println("컴퓨터는 보! 졌습니다");
                              break;

                          }

                      case 3 :
                          System.out.println("나는 보");

                          if(a==1){
                              System.out.println("컴퓨터는 가위! 졌습니다");
                              break;


                          } else if (a==2) {
                              System.out.println("컴퓨터는 바위! 이겼습니다");
                              sum ++;
                              System.out.println("현재 승리수="+sum);
                              break;


                          }else {

                              System.out.println("컴퓨터는 보! 비겼습니다");
                              System.out.println("현재 승리수="+sum);
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

