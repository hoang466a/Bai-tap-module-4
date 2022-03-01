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
    <title>Convert USD-VND</title>
</head>
<body>
<form action="/convert">
    <div>
    <h3>USD</h3>
        <input type="text" placeholder="Enter USD" name="usd">
    </div>
    <div>
     <h3>VND</h3>
        <input type="text" value="23000" placeholder="Enter rate" name="rate">
    </div>
    <input type="submit" value="Convert">
</form>
<h3>Value of convert</h3>
<input type="text" name="value" value="${valueOfConvert}">


</body>
</html>
