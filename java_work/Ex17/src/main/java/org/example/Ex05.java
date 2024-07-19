package Ex17.src.main.java.org.example;

public class Ex05 {

    public static int minValve(int[] arr){
        int min = arr[0];
        for(int i =0; i<arr.length; i++){

            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static int maxValve(int[] arr){

        int max = 0;

        for(int temp : arr){
          if(max<temp){
              max = temp;
          }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {20,10,5,7,35,100};

        System.out.println(" min = "+minValve(arr));
        System.out.println(" max = "+maxValve(arr));
    }
}
