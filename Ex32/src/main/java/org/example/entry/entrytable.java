package org.example.entry;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class entrytable {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;


    public void insert() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

//            "jdbc:mysql://192.168.0.29:3307/SKLL_library"
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");

            System.out.println("연결성공");

            pstmt = conn.prepareStatement("INSERT INTO Book ( B_name, B_type,publisher,B_date) VALUES ('동현일기','일상','황금나무',20240804)");
//            "INSERT INTO Book (B_id ,B_name, B_type,publisher,B_state,B_date) VALUES (?,?,?,?,?)"
//            "INSERT INTO Book (B_id, B_name, B_type,publisher,B_state,B_date) VALUES ('2' ,'동현일기','일상','황금나무',20240804)"
//                        pstmt.setInt(1,3);
//                        pstmt.setString(2,"동현일기");
//                        pstmt.setString(3,"일상");
//                        pstmt.setString(4,"황금나무");
//      //                pstmt.setObject(5,mydate);

            pstmt.executeUpdate();
        } catch (
                Exception e) {
            e.printStackTrace();
            System.out.println("오류");
        }

    }

    public void select(){

    }

    public void delete(){

    }

    public void update(){
        Scanner scan = new Scanner(System.in);

        System.out.print(" 입력일 연도 ->");
        System.out.println();
        int year1 = scan.nextInt();

        System.out.print(" 입력일 월 ->");
        System.out.println();
        int month1 = scan.nextInt();

        System.out.print(" 입력일 일 ->");
        System.out.println();
        int day1 = scan.nextInt();


        LocalDate insert_date = LocalDate.of(year1,month1,day1);

        System.out.print(" 수정 연도 ->");
        System.out.println();
        int year2 = scan.nextInt();

        System.out.print(" 수정 월 ->");
        System.out.println();
        int month2 = scan.nextInt();

        System.out.print(" 수정 일 ->");
        System.out.println();

        int day2 = scan.nextInt();

        LocalDate updatedate_date = LocalDate.of(year2,month2,day2);

        System.out.print(" 삭제 연도 ->");
        System.out.println();
        int year3 = scan.nextInt();

        System.out.print(" 삭제 월 ->");
        System.out.println();
        int month3 = scan.nextInt();

        System.out.print(" 삭제 일 ->");
        System.out.println();
        int day3 = scan.nextInt();


        LocalDate delete_date = LocalDate.of(year3,month3,day3);

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            // DB 연결
            conn =  DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.85:3306/SKLL_Library",
                    "root",
                    "1234");
            //sql 생성
            pstmt = conn.prepareStatement("UPDATE entry SET insertdate=?, updatedate=?,deletedate=?, etc=?, WHERE e_id=?");

            String insertdate = JOptionPane.showInputDialog("입력날짜");

            pstmt.setDate(1, Date.valueOf(insert_date));

            int updatedate = Integer.parseInt(JOptionPane.showInputDialog("수정날짜"));
            pstmt.setObject(2,updatedate_date);

            String deletedate = JOptionPane.showInputDialog("삭제날짜");
            pstmt.setObject(3,delete_date);

            String etc = JOptionPane.showInputDialog("기타/사유");
            pstmt.setString(4,etc);

//            int s_id = Integer.parseInt(JOptionPane.showInputDialog("직원id"));
//            pstmt.setInt(6,s_id);
//
//            int b_id = Integer.parseInt(JOptionPane.showInputDialog("북id"));
//            pstmt.setInt(7,b_id);

            // sql구문 실행
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }

    }
}
