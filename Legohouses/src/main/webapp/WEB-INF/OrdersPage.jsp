<%-- 
    Document   : OrdersPage
    Created on : Mar 22, 2019, 09:58:23 PM
    Author     : rh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <title>OrdersPage</title>
    </head>
    <body>
        <h1>Here are your orders</h1>
        <%=request.getAttribute("orders")%>
    <td>
        <form name="login" action="FrontController" method="POST">
            <input type="hidden" name="email" value="<%=request.getParameter("email")%>">
            <input type="hidden" name="password" value="<%=request.getParameter("password")%>">
            <input type="hidden" name="command" value="login">
            <input type="submit" value="return to frontpage ">
        </form>
    </td>
</body>
</html>
