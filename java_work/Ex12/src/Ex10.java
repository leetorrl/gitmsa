package Ex12.src;

import java.util.Arrays; //Arrays.toString 작성시 자동생성
//또 다른 배열 출력방법
public class Ex10 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args)); // 디버깅 아이콘 오른쪽에 ...누른후 에디터 클릭후
                                                   //문장형 배열 지정하여 출력가능

        String arr[] = {"aa","bb","cc"}; //문장형 배열 3칸 생성
        System.out.println(Arrays.toString(arr));

    }
}
