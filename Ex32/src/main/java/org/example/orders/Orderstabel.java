package org.example.orders;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Scanner;

public class Orderstabel {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    Scanner scan1 = new Scanner(System.in);

    Scanner scan2 = new Scanner(System.in);
    public void insert(){

    }

    public void select(){

        

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");

            System.out.println("연결성공");

//            pstmt = conn.prepareStatement("SELECT b_name FROM entry, Book where entry.b_id = Book.b_id and end_date is null");
            pstmt = conn.prepareStatement("SELECT b_name FROM entry, Book where entry.b_id = Book.b_id and state = 0");

            rs = pstmt.executeQuery();


            while (rs.next()){

                System.out.println("""
                                  b_name = %s
                                """.formatted(
                        rs.getString("b_name")
                 ));
            }
        }catch (Exception e){

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
            pstmt = conn.prepareStatement("UPDATE Orders SET return_date=? WHERE o_id =?");
//            update Book
//            set b_type = "일상물"
//            where b_id = 62;
            System.out.println("o_id값");
            int o_id = scan1.nextInt();

            pstmt.setInt(2,o_id);


//                    Integer.parseInt(JOptionPane.showInputDialog("o_id(키)"));
//            pstmt.setInt(1,o_id);

            System.out.println("연장일자8자 입력");
            String return_date = scan2.nextLine();

//                    JOptionPane.showInputDialog("연장일자입력(8자)");
//            pstmt.setObject(2,return_date);

            pstmt.setObject(1,return_date);




            // sql구문 실행
            pstmt.executeUpdate();

        }catch (Exception e){

            System.out.println("오류발생");
        }


        System.out.println("♡반납기한이 연장되었습니다♡");
    }
    public void update2(){

        try{
            // DB 연결
            conn =  DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");
            //sql 생성
            pstmt = conn.prepareStatement("UPDATE Orders SET end_date=? WHERE o_id=?");

            String end_date = JOptionPane.showInputDialog("반납일자입력(8자)");
            pstmt.setObject(1,end_date);

            int o_id = Integer.parseInt(JOptionPane.showInputDialog("o_id(키)"));
            pstmt.setInt(2,o_id);

            // sql구문 실행
            pstmt.executeUpdate();

        }catch (Exception e){

            System.out.println("오류발생");
        }
    }
}
