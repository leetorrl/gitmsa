<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    System.out.println("test");
    
    out.println("java출력");
  
%>

<!doctype html>
<html>


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css"
        integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script src="https://cdn.tailwindcss.com"></script>

    </head>



    <body>
<form action="signUp.jsp" method="post">
       <div class="bg-blue-500" style="display: inline">
                    <input type="text" name="email" id="" placeholder="아이디" class="focus:outline-none px-2 rounded text-xl">
                    <input type="text" name="password" id="" placeholder="비밀번호" class="focus:outline-none px-2 rounded text-xl">
</div>
 <div class="bg-blue-500 px-5 py-4 rounded text-2xl">
                    <button style="display: inline">회원가입</button>
               </form>


    </body>

    
</html>