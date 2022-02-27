<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2/25/2022
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
<tr>
    <td>Languages: </td>
    <td>${setting.languages}</td>
</tr>

<tr>
    <td>Page Size: </td>
    <td>${setting.size}
    </td>
</tr>

<tr>
    <td>Spams filter :</td>
    <td>${setting.spams}</td>
</tr>

<tr>
    <td>Signature : </td>
    <td>${setting.signature}</td>
</tr>
</table>
</body>
</html>
