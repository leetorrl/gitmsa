import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) {

        int num[][]=new int[3][3];

        Arrays.fill(num[0],10);
        Arrays.fill(num[1],20);
        Arrays.fill(num[2],30);

        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        System.out.println();

        int temp[]=num[2]; //int temp생성후 임시로 num[2]값을 저장
        num[2]=num[0];
        num[0]=temp; //배열 0행과 2행이 바꾸기

        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));

    }

}
