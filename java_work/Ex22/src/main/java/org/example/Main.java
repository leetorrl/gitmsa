//package org.example;
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//
//        try{
//
//          Class.forName("com.mysql.cj.jdbc.Driver");
//          //jar 파일 추가 확인
//
//          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root",
//                            "12341234");
//          //bd연결
//
//
//            PreparedStatement pstmt = conn.prepareStatement("create table test (aa varchar(255), bb varchar(255))");
//            // slp구문 만들기
//
//            pstmt.executeUpdate();
//            //spl 구문 실행
//
//            System.out.println(1/0);
//
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//
//
//        System.out.println("====================");
//        System.out.println("hello, java!");
//        System.out.println("====================");
//    }
//}