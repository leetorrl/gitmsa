package Ex17.src.main.java.org.example.phone;

public class smartphone extends mobilephone{

    private String androidVer;

    public smartphone(String aver, int number){
        super (number);

        this.androidVer = aver;

    }

    public void show(){

        super.show();

        System.out.println("androidVer="+androidVer);
        System.out.println("number="+number);
    }


}
