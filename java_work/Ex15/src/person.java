package Ex15.src;

public class person {

    private String junin;
    private String passport;

    public person() {//alt+insert로 기본생성자 제작
    }

    public person(String junin) {
        this();
        this.junin = junin;
    }

    public person(String junin, String passport) {
        this(junin);
        this.passport = passport;
    }

        public String toString() {
        return "person{" +
                "junin='" + junin + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

    public void show(){
        System.out.println("junin="+junin);
        System.out.println("passport="+passport);
    }
}
