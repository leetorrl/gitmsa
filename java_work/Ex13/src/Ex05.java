//public class Ex05 {
//
//    class Circle{
//
//       //private 변수는 setter getter로 참조 가능하다
////
//       private int rad;
////개인적인 - 접근제어 지시자
//                 private String name;
//
//                 //alt+insert키를 누르면 getter setter constuctor 생성가능.
////
//        public Circle(int rad) {
//            this.rad = rad;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            if(name.equals("")){
//            this.name = "홍길동"; return;
//        }
///////
//        public void setRad(int r){
//
//            if(r<0){
//                rad = 0;
//                return;
//            }
//            rad = r;
//
//        }
//
//        public int getRad(){
//            return rad;
//        }
//    }
//
//    //정보은닉
//
//    public static void main(String[] args) {
//
//        Circle circle1 = new Circle();
//        Circle circle2 = new Circle();
//
////        circle1.rad = -10;
//        circle2.rad = 20;
//
//        circle1.setRad(-10);
//        System.out.println(circle1.rad);
//        System.out.println();
//    }
//
//        public double getArea(){
//
//            return 3.14*rad*rad;
//        }
//    }
//}