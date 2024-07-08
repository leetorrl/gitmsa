package Ex08.src;

public class Box {

    public String name;

    public  void setName(String n){//문자열 리턴용
        name = n;
    }

    public String toString() {//불러올시 return값으로 출력되게..
        return "Box{ name=" + name + "}";
    }
}
