package org.example;

public class Main {

    public static void main(String []args){

Memberdto.MemberReqDto memberReqDto =
        new Memberdto.MemberReqDto("홍길동",20);

        System.out.println(memberReqDto);

        Memberdto.MemberresDto memberresDto =
                new Memberdto.MemberresDto("홍길동",20);

        System.out.println(memberresDto);



    }
}