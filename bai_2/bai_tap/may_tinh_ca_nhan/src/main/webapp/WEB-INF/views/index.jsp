<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2/21/2022
  Time: 6:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Caculator</h1>
  <form action="caculator" method="post">
    <div>
      <input type="number" name="number1">
      <input type="number" name="number2">
    </div>
    <button type="submit" name="submit" value="addition">addition</button>
    <button type="submit" name="submit" value="subtraction">subtraction</button>
    <button type="submit" name="submit" value="multiplication">multiplication</button>
    <button type="submit" name="submit" value="division">division</button>
  </form>
  <p>${result}</p>
  </body>
</html>
