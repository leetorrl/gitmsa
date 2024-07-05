package Ex07.src;

public class ex01 {
//1+(-2)+3(-4)+5.....반복시 총합이 100이 되는 소스를 구하시오
//    홀수와 짝수 구분후 반복이 필요
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; ; i++){ //for을 무한루프로 설정시 for부문 내에
                               // if로 브레이크 추가하여 루프막기

            System.out.println("i="+i);

            if(i%2==0){
            sum = sum - i;
            }

            else{
            sum = sum + i;
            }
            System.out.println("중간sum="+sum);
//            sum = sum+i; //오른쪽걸 계산하고 왼쪾에 주입
            if( sum > 100)
                break;
        }
        System.out.println("sum="+sum);
    }
}
