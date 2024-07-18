package org.example.aa;

public class BizMan extends Man {//상속을 위한 extends 입력후 Man입력

    private String company;
    private String position;

    public BizMan (String name, String company, String position){
//        super(name); //생성자 호출
        super(); //기본생성자 호출
        this.company = company;
        this.position = position;
    }

    public void showInfo(){
        System.out.println("company="+company);
        System.out.println("position="+position);

        tellInfo();
    }
}
