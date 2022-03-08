<%--
  Created by IntelliJ IDEA.
  User: ADTOBIAS
  Date: 08-Mar-22
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/action" method="post">
<h3>Sandwich Condiments</h3>
    <div>
        <input type="checkbox" value="lettuce" name="condiment">
        <label>Lettuce</label>
    </div>
    <div>
        <input type="checkbox" value="tomato" name="condiment">
        <label>Tomato</label>
    </div>
    <div>
        <input type="checkbox" value="sprout" name="condiment">
        <label>Sprouts</label>
    </div>
    <div><input type="submit" value="action"></div>
</form>
</body>
</html>
