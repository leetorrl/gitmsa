//class person{
//
//    private String name;  //1. 클래스에 은닉 문장변수 선언
//
//    private  int age;
//
//    public  person(){} //클래스에서 불러올 참조변수 생성
//
//    public person(String name){ //클래스에서 불러올 참조변수 생성
//        this.name = name;
//    }
//
//    public void greeting(){ // 3. 메인에서 호출후 출력될 문장 지정
//        System.out.println(name+" hello"); //보이드라서 요기서 반환안되고 요기서 해결함
//    }
//
//    public void setName(String name) { //4. setName 메서드 생성후 은닉변수에 간섭하기
//        this.name = name; // 클래스의 name을 지정하기 위해선 this. 을 붙여야함 안그럼 다른name이 지정됨
//    }
//
//    //alt+insert로 toString 자동생성
//        public String toString() {
//        return "person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
////다른 생성자 선언시에 기본생성자 생략 불가...
////constructor로 private 변수를 바꿀 수 있따.
////setter 로 private 변수를 바꿀 수 있따.
//public class Ex01 {
//    public static void main(String[] args) {
//         //기본생성자 선언 후에 setter로 변후 name 변경
//        person p1 = new person();  //2. 클래스에 뉴 생성함수 생성 출력시
//                                     // 그냥 출력시 null hello로 출력됨
//
//        //name을 바꾸는 다른 생성자로 선언해서...
//        person p2 = new person("박길동");
//
//        p1.setName("홍길동"); //4. setName(String)에 홍길동은 선언함으로 null값에서 홍길동이 출력됨
//
//        p1.greeting(); //5. greeting 호출시 홍길동 hello로 출력
//        p2.greeting();
//
//        System.out.println(p1); //6. 메인에서 출력시 주소값만 나오므로 alt+insert로 toString 생성후 출력될 문장 생성하기
//        System.out.println(p2);
//    }
//}
