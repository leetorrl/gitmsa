package Ex12.src;

import java.util.Arrays;

//향상된 for부분, enhanced for문(fot-each문)이해
public class Ex11 {

    public static void main(String[] args) {

        String str[]={"aa","bb","cc"};

        for(String temp:str){  //문장형 each문 출력법
            System.out.println(temp);
        }

        int ar[]={1,2,3,4,5}; //ar배열 5칸 생성

        //배열 3가지 출력법

        System.out.println(Arrays.toString(ar)); // Arrays.toString()으로 출력법

        for(int i= 0; i<ar.length; i++){ //for반복을 활용한 출력법
            System.out.println(ar[i]);
        }
        System.out.println();

        for(int e:ar ){  //each문 활용 출력법
            System.out.println(e);
        }
    }
}
