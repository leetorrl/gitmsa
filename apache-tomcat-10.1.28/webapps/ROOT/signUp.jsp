<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %>
<%
    
 String email = request.getParameter("email");
 String password = request.getParameter("password");

 out.println("email = " + email);
 out.println("password = " + password);
  
Connection conn = null;
PreparedStatement pstnt = null;

try{

   Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/hihi2",
                "root", "1234");

        pstnt = conn.prepareStatement("INSERT INTO HelloJava (email,password) VALUES(?,?)");


        pstnt.setString(1, email);
        pstnt.setString(2, password);


        pstnt.executeUpdate();
        



}catch(Exception e){
   e.printStackTrace();
   
}finally{

}
//insert 완료후 login.jsp로 가라 지시
// response.sendRedirect("login.jsp?aa==bb"); --%>

<%-- %> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %>
<%
    // 주소줄에 있는 email password 가져오는 방법
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    out.println("email = "+ email);
    out.println("password = "+ password);

    Connection conn = null;
    PreparedStatement pstmt = null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://192.168.0.29:3307/hihi2",
                                            "root",
                                            "1234");
        pstmt = conn.prepareStatement("INSERT INTO HelloJava (email,password) VALUES (?,?)"); //INTO 후 테이블명 틀렸었음
                                                                                              //H_id 프라이멀리키 오토 넘버 안켰었음
        pstmt.setString(1,email);
        pstmt.setString(2,password);
        pstmt.executeUpdate();
    }catch(Exception e){
        e.printStackTrace();
    }
    finally{

    }

// insert 완료 하고 나서 login.jsp 가라...
//     response.sendRedirect("login.jsp?aa=bb");

%>