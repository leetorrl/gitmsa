package aa;

public class TV {

    private String name;
    private  int Year;
    private int inch;

    public TV(String name, int year, int inch) {
        this.name = name;
       this.Year = year;
        this.inch = inch;
    } //alt+insert로 자동생성함

    public void show() {

        System.out.println(name+"에서 만든 "+Year+"년형"+inch+"인치 TV");

    }


//
//    public void show(){
//
//    }

    //    public TV(String n,int y,int in){
//
//        name = n;
//        Year = y;
//        inch = in;
//
//    }




}
