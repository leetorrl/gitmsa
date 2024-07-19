package Ex17.src.main.java.org.example.aa;

public class KCar extends Car {

 public KCar(){

}
    public KCar(String name, String dase, String company){

        super.name = name;
        super.dasc = dase;
        super.company = company;
    }

    public void show() {
        System.out.println(
                name + " " +
                        dasc + " " +
                        company);
    }

    @Override
    public String toString() {
        return "KCar{" +
                "company='" + company + '\'' +
                ", dasc='" + dasc + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}