<%-- 
    Document   : allDone
    Created on : Mar 24, 2019, 11:58:23 AM
    Author     : rh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Almost Done</title>
    </head>
    <body>
        <h1>You are almost done!</h1>
        
            <form action="FrontController" method="post">
            <input type="hidden" name="email" value="<%=request.getParameter("email")%>">
            <input type="hidden" name="password" value="<%=request.getParameter("password")%>">
            <input type="hidden" name="command" value="order">
            <input type="submit" value="order more ?" />
        </form>
             <form action="FrontController" method="post">
            <input type="hidden" name="email" value="<%=request.getParameter("email")%>">
            <input type="hidden" name="password" value="<%=request.getParameter("password")%>">
            <input type="hidden" name="command" value="login">
            <input type="submit" value="back to your page" />
        </form>
    </body>
</html>
