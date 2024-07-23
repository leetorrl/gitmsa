package org.example.inter;

public interface Printable {

        int HEIGHT = 70;
        int WIDTH =120;

        void print(String mydoc);
        void printtCMYK(String mydoc);

        default void clean() { //디폴트
                System.out.println("청소기능 추가");
        }
                static void printLine(){ //스택틱
                        System.out.println("한줄 출력할때 줄바꿈");
                }
        }


