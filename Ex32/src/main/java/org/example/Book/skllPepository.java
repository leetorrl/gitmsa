package org.example.Book;

import java.sql.*;
import javax.swing.*;

import java.util.Scanner;

public class skllPepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    Scanner scan = new Scanner(System.in);

    public void insert(){

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

//            "jdbc:mysql://192.168.0.29:3307/SKLL_library"
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("INSERT INTO Book (B_name, B_type,publisher,country) VALUES (?,?,?,?)");

                        pstmt.setString(1,"동현일기");
                        pstmt.setString(2,"일상");
                        pstmt.setString(3,"황금나무");
                        pstmt.setString(4,"국내도서");

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

        pstmt = conn.prepareStatement("SELECT* FROM Book");

        rs = pstmt.executeQuery();

        while (rs.next()){

            System.out.println("""
                                
                                B_id = %d
                                B_name = %s
                                B_type = %s
                                publisher = %s
                                country = %s
                                
                                """.formatted(rs.getInt("B_id"),
                    rs.getString("B_name"),
                    rs.getString("B_type"),
                    rs.getString("publisher"),
                    rs.getString("country")

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
    pstmt = conn.prepareStatement("DELETE FROM Book where B_id = ?");

    int B_id = Integer.parseInt(JOptionPane.showInputDialog("B_id") );
    pstmt.setInt(1,B_id);

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
    pstmt = conn.prepareStatement("UPDATE Book SET B_name=?, B_type=?,publisher=?, country=? WHERE B_id=?");


    String B_name = JOptionPane.showInputDialog("이름");
    pstmt.setString(1,B_name);

    String B_type = JOptionPane.showInputDialog("장르");
    pstmt.setString(2,B_type);

    String publisher = JOptionPane.showInputDialog("출판사");
    pstmt.setString(3,publisher);

    String country = JOptionPane.showInputDialog("국내/해외");
    pstmt.setString(4,country);

    int B_id = Integer.parseInt(JOptionPane.showInputDialog("B_id(키)"));
    pstmt.setInt(5,B_id);

    // sql구문 실행
    pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }
    }

    //사용자 존재유무 확인
    public void findByIdx(int c_id){
//
        System.out.println("ㅎㅎ");
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn =  DriverManager.getConnection(
//                    "jdbc:mysql://192.168.0.29:3307/SKLL_library",
//                    "root",
//                    "1234");
//
//            pstmt = conn.prepareStatement("SELECT* from Customer where c_id =?");
//            pstmt.setInt(1,c_id);
//            rs = pstmt.executeQuery();
//
//            if(rs.next()){
//                return c_id.builder()
//                        .c_id(rs.getInt("c_id"))
//                        .c_name(rs.getString("c_name"))
//                        .c_phone(rs.getInt("c_phone"))
//                        .c_state(rs.getInt("c_state"))
//                        .join_date(rs.getObject("join_date"))
//                        .exit_date(rs.getObject("exit_date"))
//                        .build();
//
//
//            }else {
//                return null;
//
//            }
//
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("로그인 오류발생");
//        }
//         return null;
    }
}
