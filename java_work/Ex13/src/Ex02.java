import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args) {

        int num[][]=new int[4][3];

        System.out.println(num.length);
        System.out.println(num[0].length);
        System.out.println(num[1].length);
        System.out.println(num[2].length);
        System.out.println(num[3].length);

//        num[0][0]=1;
//        num[0][1]=2;
//        num[0][2]=3;
//
        int a=0;
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                num[i][j]=a++;

                System.out.print(num[i][j]+"\t"); //"\t"로 출력시 바둑판 처럼 띄어져서 프린트가됨..(연습해볼것)

            }System.out.println();
                                }
        System.out.println(a);
//2차원 배열은 1차원 배열의 묶음이다.
        //3차원 배월은 2차원 배열의 묶음...
        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println(Arrays.toString(num[3]));
        Arrays.fill(num[0],20); //0행을 20으로 채우기
        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println(Arrays.toString(num[3]));
    }

}
