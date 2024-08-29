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
                        "jdbc:mysql://192.168.0.29:3307/SKLL_library",
                        "root",
                        "1234");
                //sql 생성
                pstmt = conn.prepareStatement("INSERT INTO Book (B_id, B_name, B_type,publisher,B_state) VALUES (?,?,?,?,?)");

                pstmt.setInt(1,1);
                pstmt.setString(2,"책");
                pstmt.setString(2,"헐");
                pstmt.setString(2,"갔냐");
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
                        "jdbc:mysql://192.168.0.29:3307/SKLL_library",
                        "root",
                        "1234");
                //sql 생성
                pstmt = conn.prepareStatement("DELETE FROM Book where B_id = ?");

                int B_id = Integer.parseInt( JOptionPane.showInputDialog("B_id") );
                pstmt.setInt(1,B_id);

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
                        "jdbc:mysql://192.168.0.29:3307/SKLL_library",
                        "root",
                        "1234");
                //sql 생성
                pstmt = conn.prepareStatement("SELECT * FROM Book");
                // sql구문 실행
                rs = pstmt.executeQuery();
                while(rs.next()){
//                System.out.println("idx = "+rs.getInt("idx"));
//                System.out.println("name =  "+rs.getString("name"));
//                System.out.println("age =  "+rs.getInt("age"));
                    System.out.println("""
                        B_id = %d
                        B_name = %s
                        B_type = %d
                        """.formatted( rs.getInt("B_id"),
                            rs.getString("B_name"),
                            rs.getInt("B_type")
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
                        "jdbc:mysql://192.168.0.29:3307/SKLL_library",
                        "root",
                        "1234");
                //sql 생성
                pstmt = conn.prepareStatement("UPDATE Book SET B_id=?, B_name=?, B_type=?,publisher=?,B_state=? WHERE B_id=?");

                String B_name = JOptionPane.showInputDialog("이름");
                pstmt.setString(1,B_name);

                int B_type = Integer.parseInt(JOptionPane.showInputDialog("상태"));
                pstmt.setInt(2,B_type);

                int B_id = Integer.parseInt(JOptionPane.showInputDialog("B_id(키)"));
                pstmt.setInt(3,B_id);

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