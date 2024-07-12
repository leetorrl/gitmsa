package Ex12.aa;
//메서드 다시 공부
// (생성자란 객체 생성하면서 내용을 초기화)

public class Box {

    String name; //1. 문장 name 선언

    int count; //7. int count를 생성

    //기본생성자는 생략 가능하지만 다른생성자는
    // 선언할시 기본생성자 생략 불가 생략 안해도됨

//bbox 생성기
  public Box(){//3. 퍼블릭 박스 생성하여 메인에
                // Box abox 뉴박스와 연결

      System.out.println("기본생성자 호출");

  }
 //abox 생성기
public Box(String n){//4. 기본생성자 Box 만들기(문장)
                     //위의 public Box와 Box생성자의 명이 같으면 안되지만 파라메터() 안에 String n을 추가하여
//                   인식 시킬 수 있다


//    ex) public void doA(){}
//        public void doA(String a){}

      name = n; //5. name 값 n 지정

    System.out.println("다른생성자 호출");//2. new Box로 호출시 문장형 n값인 String n만 입력하면
                                          // 이 출력값이 메인으로 넘어감

    }

//          abox생성기              cbox생성기
//  7.  public Box(String n)과 public Box(String n, int c)와는 겹치지 않음 중요!


    public Box(String n,int c) {//7.위의 public Box 복사우 int c를 추가
            //cbox 생성기

        name = n; //5.에 만든거 복사한거임
        count = c; //7. count =c; 를 지정

        System.out.println("n 다른생성자 호출"); //7. int c를 추가
                                             //(2.) 과 마찬가지로 new Box호출시 이 출력이 넘어감

    }

    //생성기 문장 다듬는 역활?
    public String toString(){ //6. String 문장 생성자인 toString을 만들기

      return "Box name = "+ name+"count="+count; //6.문장형 리턴 출력값 작성

        //이 문장형 생성자를 만들지 않으면 메인에서 abox bbox cbox출력값이 깨지게 된다

    }

}
