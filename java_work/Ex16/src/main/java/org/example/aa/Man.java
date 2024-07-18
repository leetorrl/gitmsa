package org.example.aa;
//1.기본생성자는 다른 생성자를 선언하게 되면 생략 불가
// 상속관계에서는 부모 클래스 생성자는 무조건적으로 호출 되어져야한다. 기본 생성자도 다른생성자도
//2.상속관계에서는 부모 클래스의 기본생성자를 호출하는게 있는데 그게 생략되어 있다
//3.만약에 부모클래스에 기본생성자가 선언되어져 있지 않을때에는
//  다른생성자 호출을 통해 부모클래스 생성자 호출할 수 있따.
public class Man {

    private String name;

    public Man(){}

    public Man(String name){
        this.name = name;
    }

    public void tellInfo(){
        System.out.println("name="+name);
    }

}
