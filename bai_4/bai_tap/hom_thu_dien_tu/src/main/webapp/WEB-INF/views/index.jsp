<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2/25/2022
  Time: 5:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Settings</h1>
<%--@elvariable id="setting" type="com"--%>
<form:form method="post" action="settings" modelAttribute="setting">
<table>
  <tr>
    <td><form:label path="languages">Languages: </form:label></td>
    <td>
      <form:select path="languages">
        <form:option value="English">English</form:option>
        <form:option value="Vietnamese">Vietnamese</form:option>
        <form:option value="Japanese">Japanese</form:option>
        <form:option value="Chinese">Chinese</form:option>
      </form:select>
    </td>
  </tr>

  <tr>
    <td><form:label path="size">Page Size: </form:label></td>
    <td>
      <form:select path="size">
        <form:option value="5">5</form:option>
        <form:option value="10">10</form:option>
        <form:option value="15">15</form:option>
        <form:option value="25">25</form:option>
      </form:select>|

    </td>
  </tr>

  <tr>
    <td><form:label path="spams">Spams filter : </form:label></td>
    <td><form:checkbox path="spams" value="Enable spams filter"></form:checkbox>Enable spams filter</td>
  </tr>

  <tr>
    <td><form:label path="signature">Signature : </form:label></td>
    <td><form:input path="signature"/></td>
  </tr>

  <tr>
    <td><input type="submit" value="Submit"/></td>
  </tr>
</table>
</form:form>
  </body>
</html>
