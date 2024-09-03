package org.example.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

public class todoRepasitory {

    LocalDateTime mydate = LocalDateTime.now();

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void insert(){

//        if(TodoMain.MEMBER.getIdx()==0){
//            System.out.println("로그인 하셔야 합니다.");
//            return;
//        }

        try{
             Class.forName("com.mysql.cj.jdbc.Driver");

             conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library",
             "root",
             "1234");
               pstmt = conn.prepareStatement("INSERT INTO Book ( B_name, B_type,publisher,B_date) VALUES ('동현일기','일상','황금나무',20240804)");



        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }

    }

    public void select(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/SKLL_library","root","1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("SELECT* FROM Book");

            rs = pstmt.executeQuery();

            while (rs.next()){

                System.out.println("""
                                
                                B_id = %d
                                B_name = %s
                                B_type = %s
                                publisher = %s
                                B_date = %s
                                
                                """.formatted(rs.getInt("B_id"),
                        rs.getString("B_name"),
                        rs.getString("B_type"),
                        rs.getString("publisher"),
                        rs.getObject("B_date")

                ));
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }


    }

    public void delete(){}

    public void update(){}

}
