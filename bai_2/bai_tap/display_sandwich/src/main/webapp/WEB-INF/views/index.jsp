<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2/18/2022
  Time: 6:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Sandwich Condiments</h1>
  <form action="/sandwich" method="post">
      <input type="checkbox" name="lettuce" value="lettuce">
      <label>Lettuce</label>
      <br>
      <input type="checkbox" name="tomato" value="tomato">
      <label>Tomato</label>
      <br>
      <input type="checkbox" name="mustard" value="mustard">
      <label>Mustard</label>
      <br>
      <input type="checkbox" name="sprouts" value="sprouts">
      <label>Sprouts</label>
      <button type="submit">gửi</button>
  </form>
  <p>${result}</p>
  </body>
</html>
