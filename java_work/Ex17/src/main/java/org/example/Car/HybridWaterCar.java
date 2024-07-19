package Ex17.src.main.java.org.example.Car;

public class HybridWaterCar extends HybridCar{

    int waterGauge;

    public void showCurrentGauge(int a, int b,int c){

        gasolineGauge= a;
     electricGauge = b;
     waterGauge =c;

        System.out.println("잔여 가솔린 = "+ gasolineGauge +" L ");
        System.out.println("잔여 전기량 = "+ electricGauge +" W ");
        System.out.println("잔여 물량 = "+waterGauge+ " L ");
    }

}
