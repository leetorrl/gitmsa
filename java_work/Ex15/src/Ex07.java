package Ex15.src;

public class Ex07 {
    public static void main(String[] args) {
// 빌더는 속도가 빠르지만 장문용...복잡하다
        StringBuilder sb = new StringBuilder();

        sb.append("asdf");
        sb.append("asdf");

        System.out.println(sb);

        sb.delete(0,2); //0~2까지 자르기
        System.out.println(sb);

        sb.replace(0,5,"kkk"); //0~5까지 kkk로 변경
        System.out.println(sb);

        sb.append("asdf"); //asdf를 추가
        sb.reverse(); // 역순으로 바꾸기
        System.out.println(sb);
    }
}
