package org.example;

import javax.swing.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import java.sql.*;

public class MemberDBRespository {

        /*
            1. Class.forname jar 파일 추가 확인
            2. Connection DB연결
            3. PrepareStatement sql구문작성
            4. sql구문 실행
            executeUpdate(); -> insert,update,delete,create,alter 문 실행할떄
            executeQuery(); -> select 문 실행할떄
         */
        public void insert() {

            System.out.println();
            System.out.println("인설트 진입");
            System.out.println();
            Connection conn = null;
            PreparedStatement pstmt = null;

            try{
                // DB 연결
                conn =  DriverManager.getConnection(
                        "jdbc:mysql://192.168.0.29:3307/hellojava",
                        "root",
                        "1234");
                //sql 생성
                pstmt = conn.prepareStatement("INSERT INTO 하잇하잇 (hi_num,hi_name,hi_age) VALUES (?,?,?)");

                pstmt.setInt(1,1);
                pstmt.setString(2,"동현");
                pstmt.setInt(3,100);

                // sql구문 실행
                pstmt.executeUpdate();
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("인설트 오류발생");
            }finally {
                try {
                    if (pstmt != null)
                        pstmt.close();
                    if (conn != null)
                        conn.close();
                }catch (Exception e){}
            }
        }

        public void delete() {
            System.out.println();
            System.out.println("딜리트 진입");
            System.out.println();
            Connection conn = null;
            PreparedStatement pstmt = null;

            try{
                // DB 연결
                conn =  DriverManager.getConnection(
                        "jdbc:mysql://192.168.0.29:3307/hellojava",
                        "root",
                        "1234");
                //sql 생성
                pstmt = conn.prepareStatement("DELETE FROM 하잇하잇 where hi_num = ?");

                int hi_age = Integer.parseInt( JOptionPane.showInputDialog("hi_num") );
                pstmt.setInt(1,hi_age);

                // sql구문 실행
                pstmt.executeUpdate();
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("딜리트 오류");
            }finally {
                try {
                    if (pstmt != null)
                        pstmt.close();
                    if (conn != null)
                        conn.close();
                }catch (Exception e){}
            }
        }

        public void select() {
            System.out.println();
            System.out.println("셀렉트 진입");
            System.out.println();
            Connection conn = null;
            PreparedStatement pstmt = null;

            // select 해서 반환되는 테이블 받기...
            ResultSet rs = null;

            try{
                // DB 연결
                conn =  DriverManager.getConnection(
                        "jdbc:mysql://192.168.0.29:3307/hellojava",
                        "root",
                        "1234");
                //sql 생성
                pstmt = conn.prepareStatement("SELECT * FROM 하잇하잇");
                // sql구문 실행
                rs = pstmt.executeQuery();
                while(rs.next()){
//                System.out.println("idx = "+rs.getInt("idx"));
//                System.out.println("name =  "+rs.getString("name"));
//                System.out.println("age =  "+rs.getInt("age"));
                    System.out.println("""
                        hi_num = %d
                        hi_name = %s
                        hi_age = %d
                        """.formatted( rs.getInt("hi_num"),
                            rs.getString("hi_name"),
                            rs.getInt("hi_age")
                             ));
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("셀렉트 오류");
            }finally {
                try {
                    if (pstmt != null)
                        pstmt.close();
                    if (conn != null)
                        conn.close();
                }catch (Exception e){}
            }
        }

        public void update() {
            System.out.println();
            System.out.println("수정진입");
            System.out.println();
            Connection conn = null;
            PreparedStatement pstmt = null;
            try{
                // DB 연결
                conn =  DriverManager.getConnection(
                        "jdbc:mysql://192.168.0.29:3307/hellojava",
                        "root",
                        "1234");
                //sql 생성
                pstmt = conn.prepareStatement("UPDATE 하잇하잇 SET hi_name=?, hi_age=? WHERE hi_num=?");

                String hi_name = JOptionPane.showInputDialog("이름");
                pstmt.setString(1,hi_name);

                int hi_age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
                pstmt.setInt(2,hi_age);

                int hi_num = Integer.parseInt(JOptionPane.showInputDialog("hi_num(키)"));
                pstmt.setInt(3,hi_num);

                // sql구문 실행
                pstmt.executeUpdate();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                try {
                    if (pstmt != null)
                        pstmt.close();
                    if (conn != null)
                        conn.close();
                }catch (Exception e){}
            }
        }
    }