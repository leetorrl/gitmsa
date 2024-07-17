package Ex15.src;

public class Ex06 {

    public static void main(String[] args) {

        String a = "asd";
        String b = "bsd";
//문자열의 내용 비교
        System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println("asd".concat(b));

        System.out.println(a.compareTo("asd")); //같으면 0 무조건
        System.out.println(a.compareTo("ASD")); //대문자면 양수
        System.out.println(a.compareTo("qweqwe")); //소문자면 음수

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ASD")); //문자비교를 하되 대소문자 비교없이
        System.out.println(a.compareToIgnoreCase("Asd"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ASda"));
        System.out.println(a.compareToIgnoreCase("ASdaqwe"));
        System.out.println(a.compareToIgnoreCase("qwerqwerqwe"));


    }
}
