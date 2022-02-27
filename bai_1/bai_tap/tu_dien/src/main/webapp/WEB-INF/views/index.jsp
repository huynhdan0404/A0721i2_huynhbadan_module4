<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2/21/2022
  Time: 6:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Từ điển đơn giản</h1>
  <form action="/tudien" method="post">
    <lable>English</lable>
    <input type="text" name="english">
    <button type="submit">Tra</button>
  </form>
  <p>${result}</p>
  </body>
</html>
