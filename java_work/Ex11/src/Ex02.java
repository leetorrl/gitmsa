package Ex11.src;

public class Ex02 {

    public static void main(String[] args) {

        int total = 5000;
        System.out.println("dvd한번 빌려서 3500원");
        total = 3500;

        int cri = 500;
        int sa = 700;
        int coke= 400;

        total = total - (cri+sa+coke);
        System.out.println(total);

        System.out.println("3500원으로는 ");
        for(int i=0; i<10; i++){//중간 횟수는 많이 높여도 큰 의미는 없음
            for(int j=0; j<10; j++){
                for(int k =0; k<10; k++){
                    if(1900==( cri * i + sa * j + coke * k )){//반드시 전품종 하나이상은 사야함
                        System.out.println("i = "+i+" j = "+j+" k = "+k);
                        System.out.print(" 크림빵은 "+(1+i)+" 개 ");
                        System.out.print(" 새우깡 "+(1+j)+" 개 ");
                        System.out.println(" 콜라 "+(1+k)+" 개 살 수 있다. ");
                    }
                }
            }
        }
    }
}
