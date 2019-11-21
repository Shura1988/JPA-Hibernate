<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<div align="center">

    <div>
        <form action="/use/${param.id}" method="post">
            <input type="hidden" name="id" value="${param.id}">
            <br>
            Login : <input type="text" name="login" value="${param.login}" placeholder=${param.login}><br>
            <br>
            Password :<input type="text" name="password" value="${param.password}}" placeholder=${param.password}><br>
            <br>
            Age:<input type="text" name="age" value="${param.age}" placeholder=${param.age}><br>
            <br>
            Name : <input type="text" name="name" value="${param.name}" placeholder=${param.name}><br>
            <br>
            Description :<input type="text" name="description" value="${param.description}"
                   placeholder=${param.description}><br>
            <br>
            Town : <input type="text" name="town" value="${param.town}"
                   placeholder=${param.town}><br>
            <br>
            Street :<input type="text" name="street" value="${param.street}"
                   placeholder=${param.street}><br>
            <br>
            House :<input type="text" name="house" value="${param.house}"
                   placeholder=${param.house}><br>
            <br>
            Role :<input required type="radio" name="role" value="user" checked placeholder="User"> User
            <input type="hidden" name="_method" value="put">
            <input type="submit" value="Обновить">
        </form>
    </div>


</div>
</body>
</html>