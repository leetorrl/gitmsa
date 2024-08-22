package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class DBRepository {

    public List<Member> select() {
        List<Member> list = new ArrayList<>();
        Connection conn = null;  //db연결객체
        PreparedStatement pstmt = null; //sql객체
        ResultSet rs = null; // 반환되는값담는 객체



        try {

         Class.forName("com.mysql.cj.jdbc.Driver");

         conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/hihi2",
        "root", "1234");


         pstmt = conn.prepareStatement("select * from HelloJava");
        rs = pstmt.executeQuery();

while (rs.next()){


    Member M = new Member();

    M.setIdx(rs.getInt("H_id"));
    M.setName(rs.getString("H_name"));
    M.setAge(rs.getInt("H_power"));
    M.setEmail(rs.getString("email"));
    M.setPassword(rs.getString("password"));
    list.add(M);

}
return list;


        } catch (Exception e) {
            e.printStackTrace();

        }finally{


        }
        return list;


    }
}