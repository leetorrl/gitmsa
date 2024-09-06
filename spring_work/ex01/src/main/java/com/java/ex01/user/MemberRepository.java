package com.java.ex01.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    //    public void select(){
//
//        List<Member> list = new ArrayList<>();
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/SKLL_library", "root", "1234")
//            PreparedStatement pstmt = conn.prepareStatement("SELECT* FROM member");
//            ResultSet rs = pstmt.executeQuery();
//
//            while (rs.next()){
//                Member member = Member.builder()
//                        .name(rs.getString("name"))
//                        .idx(rs.getInt("idx"))
//                        .age(rs.getInt("age"))
//                        .email(rs.getString("email"))
//                        .password(rs.getString("password"))
//                        .regdate(rs.getObject("regdate",LocalDateTime.of(sdf)))
//                        .mydate(rs.getObject("mydate",LocalDateTime.of(asadf)))
//                        .build();
//                list.add(member);
//            }
//            list.stream()
//                    .forEach(System.out::println);
//
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("오류");
//        }
//
//    }

    public void insert(String B_name, String B_type) {

        LocalDateTime B_date = LocalDateTime.now();

        try (Connection conn
                     = DriverManager.getConnection(
                "jdbc:mysql://192.168.0.29:3307/SKLL_library", "root", "1234")) {
            PreparedStatement pstmt
                    = conn.prepareStatement(" INSERT INTO Book (B_name,B_type,publisher,B_date)values(?,?,?,?)");
//            pstmt.setInt(1,16);
            pstmt.setString(1, B_name);
            pstmt.setString(2, B_type);
            pstmt.setString(3, "황금나무");
            pstmt.setObject(4, B_date);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        return "memberTable 저장했습니다.";
    }}