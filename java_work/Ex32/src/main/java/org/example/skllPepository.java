package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import java.time.LocalDateTime;

public class skllPepository {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    LocalDateTime mydate = LocalDateTime.now();

    public void insert(){

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/SKLL_library",
                    "root",
                    "1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("INSERT INTO Book ( B_name, B_type,publisher,B_state,B_date) VALUES ('동현일기','일상','황금나무',2,20240804)");
//            "INSERT INTO Book (B_id ,B_name, B_type,publisher,B_state,B_date) VALUES (?,?,?,?,?,?)"
//            "INSERT INTO Book (B_id, B_name, B_type,publisher,B_state,B_date) VALUES ('2' ,'동현일기','일상','황금나무',2,20240804)"
//                        pstmt.setInt(1,3);
//                        pstmt.setString(2,"동현일기");
//                        pstmt.setString(3,"일상");
//                        pstmt.setString(4,"황금나무");
//                        pstmt.setInt(5,2);
//                        pstmt.setObject(6,mydate);

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류");
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
                                B_state = %d
                                B_date = %s
                                
                                """.formatted(rs.getInt("B_id"),
                    rs.getString("B_name"),
                    rs.getString("B_type"),
                    rs.getString("publisher"),
                    rs.getInt("B_state"),
                    rs.getObject("B_date")

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
            "jdbc:mysql://192.168.0.29:3307/SKLL_library",
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
            "jdbc:mysql://192.168.0.29:3307/SKLL_library",
            "root",
            "1234");
    //sql 생성
    pstmt = conn.prepareStatement("UPDATE Book SET B_id=?, B_name=?, B_type=?,publisher=?,B_state=?, B_date=? WHERE B_id=?");

    int B_id = Integer.parseInt(JOptionPane.showInputDialog("B_id(키)"));
    pstmt.setInt(1,B_id);

    String B_name = JOptionPane.showInputDialog("이름");
    pstmt.setString(2,B_name);

    int B_type = Integer.parseInt(JOptionPane.showInputDialog("장르"));
    pstmt.setInt(3,B_type);

    String publisher = JOptionPane.showInputDialog("출판사");
    pstmt.setString(4,publisher);

    int B_state = Integer.parseInt(JOptionPane.showInputDialog("상태(1 or 2)"));
    pstmt.setInt(5,B_state);

    // sql구문 실행
    pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }
    }
}
