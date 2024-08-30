package org.example;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex10 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Scanner scan = new Scanner(System.in);
        System.out.println(" 1 : 인설트, 2 : 셀렉트 , 3 : 딜리트" );
        int num = scan.nextInt();

        try {
            switch (num){
                
                case 1:
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection( "jdbc:mysql://192.168.0.29:3307/SKLL_library",
                    "root",
                    "1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("INSERT INTO Book (B_name, B_type,publisher,B_state,B_date) VALUES ('동현일기','일상','황금나무',2,20240804)");
//            pstmt.setInt(1,2);
//            pstmt.setString(2,"동현일기");
//            pstmt.setString(3,"일상");
//            pstmt.setString(4,"황금나무");
//            pstmt.setInt(5,2);

            pstmt.executeUpdate();


return;
                case 2:
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
break;
                case 3:

                    System.out.println();
                    System.out.println("딜리트 진입");
                    System.out.println();

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
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("딜리트 오류");
                    }

                default:
                    System.out.println("시스템 종류");
                    break;
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류");
        }

    }
}
