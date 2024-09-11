package org.example.Customer;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customertable {

    private String j_year = "1999";
    private String j_month = "01";
    private String j_day = "30";

    private String w_year = "1999";
    private String w_month = "01";
    private String w_day = "31";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void insert(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library",
            "root",
            "1234");

            pstmt = conn.prepareStatement("INSERT INTO Customer (c_name, c_phone,join_date) VALUES (?,?,?)");

        pstmt.setString(1,"동현");
            pstmt.setInt(2,1076759635);
            pstmt.setObject(4,20200114);
//           pstmt.setDate(4, Date.valueOf(this.j_year));
//            pstmt.setDate(5, Date.valueOf(this.w_year+this.w_day+this.w_month));

            pstmt.executeUpdate();

    }catch (Exception e){
        e.printStackTrace();
            System.out.println("오류");
        }
    }

    public void select(){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("SELECT* FROM Customer");

            rs = pstmt.executeQuery();

            while (rs.next()){

                System.out.println("""
                                
                                c_id = %d
                                c_name = %s
                                c_phone = %d
                                join_date = %s
                                withdraw_date = %s
                                
                                """.formatted(
                                        rs.getInt("c_id"),
                        rs.getString("c_name"),
                        rs.getInt("c_phone"),
                        rs.getObject("join_date"),
                        rs.getObject("withdraw_date")
                ));
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }
    }


    public void select2(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library","root","1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("SELECT* FROM Customer where c_id = 2");

            rs = pstmt.executeQuery();

            while (rs.next()){

                System.out.println("""
                                c_id = %d
                                c_name = %s
                                c_phone = %d
                                join_date = %s
                                withdraw_date = %s
                                """.formatted(
                        rs.getInt("c_id"),
                        rs.getString("c_name"),
                        rs.getInt("c_phone"),
                        rs.getObject("join_date"),
                        rs.getObject("withdraw_date")
                ));
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }
    }

    public void delete(){

        try{

            // DB 연결
            conn =  DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");
            //sql 생성
            pstmt = conn.prepareStatement("DELETE FROM Customer where c_id = ?");

            int c_id = Integer.parseInt(JOptionPane.showInputDialog("c_id") );
            pstmt.setInt(1,c_id);

            // sql구문 실행
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }
    }

    public void update(){

        try{

            // DB 연결
            conn =  DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");
            //sql 생성
            pstmt = conn.prepareStatement("UPDATE Customer SET c_name=?, c_phone=?, join_date=?, withdraw_date=? WHERE c_id=?");


            String c_name = JOptionPane.showInputDialog("이름");
            pstmt.setString(1,c_name);

            int c_phone = Integer.parseInt(JOptionPane.showInputDialog("번호(11자)"));
            pstmt.setInt(2,c_phone);

            String join_date = JOptionPane.showInputDialog("가입날");
            pstmt.setObject(3,join_date);

            String withdraw_date = JOptionPane.showInputDialog("탈퇴날");
            pstmt.setObject(4,withdraw_date);

            int c_id = Integer.parseInt(JOptionPane.showInputDialog("c_id(키)"));
            pstmt.setInt(5,c_id);

            // sql구문 실행
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }
    }
}