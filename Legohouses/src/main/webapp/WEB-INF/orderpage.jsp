<%-- 
    Document   : customerpage
    Created on : Mar 21, 2019, 11:58:23 AM
    Author     : rh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order</title>
    </head>
    <body>
        <h1>Make an order</h1>
        <h2>Order bricks</h2>
        <form name="OrderPage" action="FrontController" method="post">
            <input type="hidden" name="email" value="<%=request.getParameter("email")%>">
            <input type="hidden" name="password" value="<%=request.getParameter("password")%>">

            <input type="hidden" name="command" value="allDone">
            Width<br>
            <input type="text" name="width" value="">
            <br>
            length<br>
            <input type="text" name="length" value="">
            <br>
            Height<br>
            <input type="text" name="height" value="">
            <br>
            <br>
            <input type="submit" value="Order">
        </form>
        <br>
        <form action="FrontController" method="post">
            <input type="hidden" name="email" value="<%=request.getParameter("email")%>">
            <input type="hidden" name="password" value="<%=request.getParameter("password")%>">
            <input type="hidden" name="command" value="login">
            <input type="submit" value="Back to main page" />
        </form>
    </body>
</html>