package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBRepostory {

    public void insert(){

        Connection conn = null; //db연결객체
        PreparedStatement pstnt = null; //sql 파일 닫는 객체?

        try{
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/pmh",
                                               "root",
                                               "1234");

            pstnt = conn.prepareStatement("INSERT INTO kim (name,age) VALUES (?,?)");
pstnt.setString(1,"김길동");
pstnt.setInt(2,100);

pstnt.executeUpdate();
            System.out.println("됐다.");

        }catch (Exception e){
          e.printStackTrace();

        }finally {
            try {
                if(pstnt!=null)
                    pstnt.close();
                if(conn != null)
                    conn.close();
            }catch (Exception e){


            }
        }
    }
}
