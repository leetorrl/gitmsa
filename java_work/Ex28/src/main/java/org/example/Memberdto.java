package org.example;

import java.net.URL;

public class Memberdto {

    private static String URL = "http://kakaologin";

    static class MemberReqDto{
        private String name;
        private int age;

        public MemberReqDto(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "MemberReqDto{" +
                    "url="+URL + '\''+
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class MemberresDto{

        private String name;
        private int age;

        public MemberresDto(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "MemberresDto{" +
                    "url="+URL+ '\''+
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
