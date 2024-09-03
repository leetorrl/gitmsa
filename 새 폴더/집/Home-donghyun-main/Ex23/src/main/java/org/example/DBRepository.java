package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBRepository {
//    insert
//    select
//    update
//    delete
//

    public void insert(){

        Connection conn = null; //db연결객체
        PreparedStatement pstmt = null; //sql 파일 닫는 객체?


        try{
            //1. mysql jar 추가 확인

            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. connection연결
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/hihi2",
                                                          "root","1234");
            System.out.println("연결성공!");
            //3. sql 문작성

            pstmt = conn.prepareStatement("INSERT INTO 지우지마여ㅠ (g_id,g_name,g_age,g_addres) VALUES(?,?,?,?)");

            pstmt.setInt(1,5);
            pstmt.setString(2,"동현동");
            pstmt.setInt(3,150);
            pstmt.setString(4,"으에");

            //4. sql 문실행

            pstmt.executeUpdate(); //이게 있어야 mysql에 저장됨 반드시 마지막에 넣을것

        }
        catch (Exception a){
            a.printStackTrace();
            System.out.println("오류출력");
        }finally {
            try {
                if(pstmt!=null)
                    pstmt.close();
                if(conn != null)
                    conn.close();
            }catch (Exception e){

            }
        }

    }

    public void select(){
        Connection conn = null; //db연결객체
        PreparedStatement pstmt = null; //sql 파일 닫는 객체?

        ResultSet rs = null; //반환되는값 받는 변수

        try {
            //1. mysql jar 추가 확인

            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. connection연결
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/hihi2",
                    "root", "1234");
            System.out.println("연결성공!");
            //3. sql 문작성

            pstmt = conn.prepareStatement("select* from 지우지마여ㅠ");

            rs = pstmt.executeQuery();

            while (rs.next()){
//                System.out.print("g_id = "+rs.getInt("g_id"));
//                System.out.print(" // ");
//                System.out.print("g_name = "+rs.getString("g_name"));
//                System.out.print(" // ");
//                System.out.print("g_age = "+rs.getInt("g_age"));
//                System.out.print(" // ");
//                System.out.print("g_addres = "+rs.getString("g_addres"));
//                System.out.print(" // ");
//                System.out.println();

                System.out.println("""
                        g_id = %d
                        g_name = %s
                        g_age = %d
                        g_addres = %s
                        """.formatted(rs.getInt("g_id"),
                                      rs.getString("g_name"),
                                      rs.getInt("g_age"),
                                      rs.getString("g_addres")));
            }


            //4. sql 문실행

            pstmt.executeQuery(); //반환되는값을 받게 해줌

        } catch (Exception a) {
            a.printStackTrace();
            System.out.println("오류출력");
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {

            }
        }



    }

    public void Update() {

        Connection conn = null; //db연결객체
        PreparedStatement pstmt = null; //sql 파일 닫는 객체?


        try {
            //1. mysql jar 추가 확인

            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. connection연결
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/hihi2",
                    "root", "1234");
            System.out.println("연결성공!");
            //3. sql 문작성

            pstmt = conn.prepareStatement("UPDATE 지우지마여ㅠ set g_name=? , g_age=?  where  g_id=?");

            String name = JOptionPane.showInputDialog("이름");
            pstmt.setString(1,name);

            int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
            pstmt.setInt(2,age);

            int id = Integer.parseInt(JOptionPane.showInputDialog("번호"));
            pstmt.setInt(3,id);
            //4. sql 문실행

            pstmt.executeUpdate(); //이게 있어야 mysql에 저장됨 반드시 마지막에 넣을것

        } catch (Exception a) {
            a.printStackTrace();
            System.out.println("오류출력");
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {

            }
        }
    }

    public void delete(){

        Connection conn = null; //db연결객체
        PreparedStatement pstmt = null; //sql 파일 닫는 객체?


        try{
            //1. mysql jar 추가 확인

            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. connection연결
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/hihi2",
                    "root","1234");
            System.out.println("연결성공!");
            //3. sql 문작성

            pstmt = conn.prepareStatement("DELETE FROM 지우지마여ㅠ WHERE g_id=?");
 int g_id = Integer.parseInt(JOptionPane.showInputDialog("g_id"));
    pstmt.setInt(1,g_id);


            //4. sql 문실행

            pstmt.executeUpdate(); //이게 있어야 mysql에 저장됨 반드시 마지막에 넣을것

        }
        catch (Exception a){
            a.printStackTrace();
            System.out.println("오류출력");
        }finally {
            try {
                if(pstmt!=null)
                    pstmt.close();
                if(conn != null)
                    conn.close();
            }catch (Exception e){

            }
        }

}
}
