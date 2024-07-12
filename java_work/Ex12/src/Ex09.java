package Ex12.src;
//배열 부문 for대신 arraycopy 활용
import java.util.Arrays;

public class Ex09 {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5}; //5칸 12345
        int br[]= new int[10]; //빈칸 10개 선언

        System.arraycopy(ar,3,br,2,2); //system.arraycopy를 활용하여
                                                             // for반복 대신 ar배열을 br배열 카피

        System.out.println(Arrays.toString(ar)); //ar출력과 br출력 비교
        System.out.println(Arrays.toString(br));
    }

}
