package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbmake {


public void insert() {


    System.out.println("db클래스인설트 메서드 진입");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/hihi2",
                "root", "1234");

        System.out.println("연결성공");

        pstmt = conn.prepareStatement("INSERT INTO HelloJava (H_id,H_name,H_power,email,password) VALUES(?,?,?,?,?)");

        pstmt.setInt(1, 3);
        pstmt.setString(2, "Hello");
        pstmt.setInt(3, 20);
        pstmt.setString(4, "donghyun");
        pstmt.setString(5, "lee");
        pstmt.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("오류발견");

    }

}


    public void delete() {
        System.out.println("db클래스딜리트 메서드 진입");

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/hihi2",
                    "root", "1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("DELETE FROM HelloJava WHERE H_id=?");

           int H_id = Integer.parseInt(JOptionPane.showInputDialog("H_id"));
           pstmt.setInt(1,H_id);

            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("오류발견");

        }

        }


    }

