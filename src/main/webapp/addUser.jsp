<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div align="center">
    <h1> Registration form </h1>
    <div>
        <form action="/use" method="post">

            Login :<br> <input required type="text" name="login" placeholder="${message}"/>
            <br>
            <br>
            Password :<br><input required type="text" name="password" placeholder="Введите password"/><br>
            <br>
            Age: <br> <input required type="number" size="3" name="age" min="1" max="120" value="1"
                             placeholder="Введите age"/><br>
            <br>
            Name :<br><input required type="text" name="name" placeholder="Введите name"/><br>
            <br>
            Description :<br><input required type="text" name="description" placeholder="Введите description"/><br>
            <br>
            Town :<br><input required type="text" name="town" placeholder="Введите town"/><br>
            <br>
            Street :<br><input required type="text" name="street" placeholder="Введите street"/><br>
            <br>
            House :<br><input required type="text" name="house" placeholder="Введите house"/><br>
            <br>
            <input required type="radio" name="role" value="user" checked placeholder="User"> User
            <br>
            <%--                    <input required type="radio" name="role" value="user" placeholder="Title"> Admin--%>
            <%--                    <button onclick="location.href='OK'"> OK </button>--%>
            <br>
            <input type="submit" value="Сохранить" onclick="alert('Пользователь добавлен!') "/>
            <br><br>
            <button onclick="location.href='/enterAccount.jsp'" size="45"> Exit</button>
        </form>
    </div>

</div>
</body>
</html>
