<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 01-Mar-22
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="/dictionary">
    <div>
    <h3>English</h3>
        <input type="text" placeholder="Enter english" name="english">
    </div>
    <input type="submit" value="search">
</form>
<h3>Vietnamese</h3>
<input type="text" name="vietnamese" value="${vietnamese}">
</body>
</html>
