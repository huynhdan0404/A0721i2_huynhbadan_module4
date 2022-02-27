<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2/20/2022
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/swap" method="post">
    <label>USA</label>
    <input type="number" name="usd">
    <button type="submit">swap</button>
    <p>${vnd}</p>
  </form>
  </body>
</html>
