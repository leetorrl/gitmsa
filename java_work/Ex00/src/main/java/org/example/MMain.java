package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MMain {


    public void insert() {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
//
//            Class.forName();
//            conn = DriverManager.getConnection();
//            pstmt = conn.prepareStatement();
//
//            pstmt.setInt();
//            pstmt.setString();
//            pstmt.setInt();
//            pstmt.setString();
//
//            pstmt.executeUpdate();



        }catch (Exception e){

            e.printStackTrace();
            System.out.println("오류발생");


        }

    }


    
    public void select(){


        System.out.println("셀력트 불러오셨슴");

        Connection conn = null;
        PreparedStatement pstmt = null;

        ResultSet rs = null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/hihi2",
                    "root","1234");

            pstmt = conn.prepareStatement("select* from 지우지마여ㅠ");

            rs = pstmt.executeQuery();

//            System.out.println("""
//                    g_id = d%
//                    g_name = %s
//                    g_age = d&
//                    g_addres = %s
//
//                    """.formatted(rs.getInt(g_id),
//                                  rs.getString(g_name),
//                                  rs.getInt(g_id),
//                                   rs.getString(g_addres)));

        }catch (Exception e){

            e.printStackTrace();
            System.out.println("오류발생");
        }

    }

}