<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Registration form </h1>
<%--<div>--%>
<%--    <c:if test="${user != null}">--%>
<%--    <form action="use" method="put">--%>
<%--        </c:if>--%>
<%--        <c:if test="${user == null}">--%>
<%--        <form action="use" method="post">--%>
<%--            </c:if>--%>
<%--            <table border="1" cellpadding="5">--%>
<%--                <caption>--%>
<%--                    <h2>--%>
<%--                        <c:if test="${user != null}">--%>
<%--                            Edit User--%>
<%--                        </c:if>--%>
<%--                        <c:if test="${user == null}">--%>
<%--                            Add New User--%>
<%--                        </c:if>--%>
<%--                    </h2>--%>
<%--                </caption>--%>
<%--                <c:if test="${user != null}">--%>
<%--                    <input type="hidden" name="id" value="<c:out value='${user.id}' />"/>--%>
<%--                </c:if>--%>
<%--                <th>User login:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="login" size="45"--%>
<%--                           value="<c:out value='${user.login}' />"--%>
<%--                    />--%>
<%--                </td>--%>
<%--                </tr>--%>
<%--                <tr>--%>
<%--                    <th>User Password:</th>--%>
<%--                    <td>--%>
<%--                        <input type="text" name="password" size="45"--%>
<%--                               value="<c:out value='${user.password}' />"--%>
<%--                        />--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr>--%>
<%--                    <th>User Age:</th>--%>
<%--                    <td>--%>
<%--                        <input type="text" name="age" size="45"--%>
<%--                               value="<c:out value='${user.age}' />"--%>
<%--                        />--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr>--%>
<%--                    <th>User Name:</th>--%>
<%--                    <td>--%>
<%--                        <input type="text" name="name" size="45"--%>
<%--                               value="<c:out value='${user.ename}' />"--%>
<%--                        />--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr>--%>
<%--                    <th>Description:</th>--%>
<%--                    <td>--%>
<%--                        <input type="text" name="description" size="15"--%>
<%--                               value="<c:out value='${user.description}' />"--%>
<%--                        />--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr>--%>
<%--                    <th>Town:</th>--%>
<%--                    <td>--%>
<%--                        <input type="text" name="description" size="15"--%>
<%--                               value="<c:out value='${adress.town}' />"--%>
<%--                        />--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr>--%>
<%--                    <th>Street:</th>--%>
<%--                    <td>--%>
<%--                        <input type="text" name="street" size="15"--%>
<%--                               value="<c:out value='${adress.street}' />"--%>
<%--                        />--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr>--%>
<%--                    <th>House:</th>--%>
<%--                    <td>--%>
<%--                        <input type="text" name="house" size="15"--%>
<%--                               value="<c:out value='${adress.house}' />"--%>
<%--                        />--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr>--%>
<%--                    <td colspan="2">--%>
<%--                        <input type="submit" value="Сохраить" onclick="alert('Пользователь добавлен!') " />--%>


<%--                    </td>--%>
<%--                </tr>--%>
<%--            </table>--%>
<%--        </form>--%>

<%--</div>--%>
<div align="center">
            <div>
                <form action="use" method="post">
                    Login :<br> <input required type="text"  name = "login"/><br>
                    <br>
                    Password :<br><input required type="text"  name = "password"/><br>
                    <br>
                    Age: <br><input required type="text" name="age"/><br>
                    <br>
                    Name :<br><input  required type="text" name = "name"/><br>
                    <br>
                    Description :<br><input  required type="text"  name= "description"/><br>
                    <br>
                    Town :<br><input required type="text"  name = "town"/><br>
                    <br>
                    Street :<br><input required type="text"  name = "street"/><br>
                    <br>
                    House :<br><input required type="text"  name = "house"/><br>
                    <br>
                    <input required type="radio" name="role" value="user" checked placeholder="User"> User
                    <br>
<%--                    <input required type="radio" name="role" value="user" placeholder="Title"> Admin--%>
<%--                    <button onclick="location.href='OK'"> OK </button>--%>
                    <br>
                    <input type="submit" value="Сохранить" onclick="alert('Пользователь добавлен!') "/>
                    <br><br>
                </form>
            </div>

</div>
</body>
</html>
