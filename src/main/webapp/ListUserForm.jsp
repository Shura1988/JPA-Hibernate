<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>

<body>

<h1>User Management</h1>

<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>id</th>
            <th>login</th>
            <th>password</th>
            <th>age</th>
            <th>name</th>
            <th>description</th>
            <th>town</th>
            <th>street</th>
            <th>house</th>
            <th>role</th>
        </tr>
        <c:forEach var="user" items="${user}">
            <tr>
                <td> ${user.id}</td>
                <td> ${user.login} </td>
                <td> ${user.password} </td>
                <td> ${user.age}</td>
                <td> ${user.name} </td>
                <td> ${user.description}</td>
                <td> ${user.adress.getTown()} </td>
                <td> ${user.adress.getStreet()}</td>
                <td> ${user.adress.getHouse()} </td>
                <td> ${user.role.getTitle()}</td>
                <td>
                    <form action="/update.jsp" method="post">
                        <input type="hidden" name="id" value="${user.getId()}">
                        <input type="hidden" name="login" value="${user.getLogin()}">
                        <input type="hidden" name="password" value="${user.getPassword()}">
                        <input type="hidden" name="age" value="${user.getAge()}">
                        <input type="hidden" name="name" value="${user.getName()}">
                        <input type="hidden" name="description" value="${user.getDescription()}">
                        <input type="hidden" name="town" value="${user.adress.getTown()}">
                        <input type="hidden" name="street" value="${user.adress.getStreet()}">
                        <input type="hidden" name="house" value="${user.adress.getStreet()}">
                        <input type="hidden" name="title" value="${user.role.getTitle()}">
                        <input type="submit" value="update" style="float:left">
                    </form>
                    <form action="deleteUser.jsp" method="post">
                        <input type="hidden" name="id" value="${user.getId()}">
                        <input type="submit" value="delete" style="float:left">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>

