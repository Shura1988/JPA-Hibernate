
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Вход в Account</title>
</head>
<body>
<div align="center">
<h1>Login</h1>
<form action="/use" method="get">
    Login:<br>
    <input type="text" name="login">
    <br><br>
    Password:<br>
    <input type="text" name="password">
    <br><br>
    <form action="listOne.jsp">
    <input type="submit" value="Войти"/>
    </form>
    <form action="addUser.jsp">
        <input type="submit" value="Добавить нового пользователя">
    </form>
</form>
</div>
</body>
</html>
