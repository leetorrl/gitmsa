package Ex12.src;

import Ex12.aa.Box; //1. alt+엔터로 생성한 임폴트 연결

public class Ex02 {

    //1. Ex12의 aa패키지 Box클래스와 연결활용 배열출력연습

    public static void main(String[] args) {

        Box[] boxes = new Box[3]; //1. Box[] boxes값 지정(배열) 3칸짜리 생성
                                    // 빨간줄 뜰시!
                                    // alt+엔터로 임폴트 자동연결 가능

        boxes[0]=new Box(); //3. 지정한 3칸 배열의 0번순부터 값 지정해주기
        boxes[1]=new Box("사과",50); //Box클래스 생성자와 연결된 상태여서 n값과 c값 생성자로부터 간섭 가능
        boxes[2]=new Box("바나나",30);

        System.out.println(boxes[0]); //2. 지정한 배열 boxes[]들 출력해보기
        System.out.println(boxes[1]); //   지정한 값이 없어 (2.)순으로 할시 null값 출력됨
        System.out.println(boxes[2]);

        Box abox = new Box(); //3. Box abox 참조변수 선언
        Box bbox;
        Box cbox;

    }
}
