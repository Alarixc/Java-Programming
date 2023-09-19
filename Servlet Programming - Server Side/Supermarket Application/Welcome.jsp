<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%
    response.setContentType("text/html");
    String item = (String)session.getAttribute("item");
    response.getWriter().println("<h1>Welcome Mr." + session.getAttribute("userName"));

%>
<br>
<p>You have ordered item <%= session.getAttribute("item") %> </p>
<p>Your membership type is <%= session.getAttribute("mem") %> </p>
<p>Quantity of your item is <%= session.getAttribute("quan") %></p>

</body>
</html>
