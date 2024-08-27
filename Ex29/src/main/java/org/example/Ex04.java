//package org.example;
//
//import java.lang.reflect.Member;
//import java.lang.reflect.Method;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class Ex04 {
//
//    public static void main(String[] args) {
//
//        Stream.of(1,2,3,4,5,6)
//                .filter(n->n%2==1)
//                .forEach(aa-> System.out.println("내용 = "+aa));
//
//        List<Member> list = Arrays.asList(
//                new Member(1,"홍길동",20,"aaa@naver.com","password"),
//                new Member(2,"이길동",30,"aaa@naver.com","password"),
//                new Member(3,"김길동",40,"aaa@naver.com","password")
//        );
//
//        int result = 0;
//
//        for(Member ji : list){
//            result += ji.getAge();
//            System.out.println(ji);
//        }
//        System.out.println("나이 최종합 = "+result);
//
//        list.stream().filter(ji->ji.getAge()>=30).forEach(aa->{
//            System.out.println("내용");
//            System.out.println(aa);
//        });
//    }
//}
