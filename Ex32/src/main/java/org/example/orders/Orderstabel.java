package org.example.orders;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Orderstabel {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;


    public void insert(){


    }

    public void select(){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("SELECT b_name FROM entry, Book where entry.b_id = Book.b_id and state =0 ");

            rs = pstmt.executeQuery();

            while (rs.next()){
                System.out.println("""
                                  b_name = %s
                                """.formatted(
                        rs.getString("b_name")
                ));
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }

    }


    public void delete(){}

    public void update1(){

        try{

            // DB 연결
            conn =  DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");
            //sql 생성
            pstmt = conn.prepareStatement("UPDATE Orders SET extension_date=? WHERE o_id=?");


            int o_id = Integer.parseInt(JOptionPane.showInputDialog("o_id(키)"));
            pstmt.setInt(1,o_id);


            String extension_date = JOptionPane.showInputDialog("연장일자입력(8자)");
            pstmt.setObject(2,extension_date);


            // sql구문 실행
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }


        System.out.println("입장");
    }
    public void update2(){


        System.out.println("입장");
    }

}
