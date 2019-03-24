<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>
<%@page import="java.util.List"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("email")%> </h1>
        <h2>You are now logged in as a customer of our wonderful site</h2>
        <form action="FrontController" method="post">
            <input type="hidden" name="email" value="<%=request.getParameter("email")%>">
            <input type="hidden" name="password" value="<%=request.getParameter("password")%>">
            <input type="hidden" name="command" value="orderpage">
            <input type="submit" value="Make an order" />
        </form>
        <br>
        <form action="FrontController" method="post">
            <input type="hidden" name="email" value="<%=request.getParameter("email")%>">
            <input type="hidden" name="password" value="<%=request.getParameter("password")%>">
            <input type="hidden" name="command" value="OrdersPage">
            <input type="submit" value="See order status" />
        </form>
        <form action="FrontController" method="post">
            <input type="hidden" name="command" value="createLegohouse">
            <input type="submit" value="createLegohouse" />
        </form>
    </body>
</html>