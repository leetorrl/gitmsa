package Ex12.src;

import Ex12.aa.Box;//2. 임폴트 지정하여 박스 클래스와 연결

public class Ex01 {

    public static void main(String[] args) {


      Box abox = new Box("사과"); //2. 메인에서 클래스 Box와 연결매체 만들기
                                        //n값 "사과"를 지정 안해주면 abox도 "기본생성자 호출"로 출력됨
                                          //사과를 입력하지 않을경우 toString거치면서 출력시 n값에 null로 표시됨

        Box bbox = new Box(); // 인트 선언하듯이 bbox도 지정
                               // bbox는 지정한게 없어 출력시 null값으로 출력될것임


        Box cbox = new Box("바나나",10); //7. 메인에 cbox생성후 n문장과 c값 지정
                                               // cbox생성기의 지정순으로 입력

        //4. abox 출력 한번 해보기
        System.out.println(abox); // 생성자 public String toString(){}
                                    // 으로 인해 리턴값을 출력시킴
        

          //6. public String toString(){}과 연결된 abox를 출력해보기
        System.out.println(abox.toString());
          //abox에 .toString()을 추가함으로서 생성기 문장 리턴값을 호출


        System.out.println(bbox);
         //bbox는 값을 지정하지 않아 출력은 되나 null이 표시됨

        System.out.println(cbox);
          //문장 name=n 에 바나나를 int c count에 10을 넣입력후 출력함

    }
}
