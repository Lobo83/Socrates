<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <jsp:include page="/WEB-INF/template/header.jsp"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<style>

</style>
<body>
<jsp:include page="/WEB-INF/template/navbar.jsp"/>
<h1>CONSEGUIDO</h1>

<form id="createUserForm" name="user" action="/user/create" method="post">

    <div class="container">
        <div class="row">
            <div class="col-sm-2">
                <c:out value="Nombre Usuario: "/>
            </div>
            <div class="col-sm-2">
                <input type="text" name="username"/>
            </div>

        </div>
        <div class="row">
            <div class="col">
                <c:out value="Contraseña: "/> <input type="password" name="password"/>
            </div>

        </div>
        <div class="row">
            <div class="col">
                <c:out value="Activo: "/><input type="checkbox" name="active" checked/>
            </div>

        </div>
        <div class="row">
            <div class="col-4">
                <c:out value="Rol:"/><br/>
            </div>
            <div class="col">
                <fieldset>
                    <c:forEach items="${['Admin','Alumno','Profesor']}" var="role">
                        <c:out value="${role}: "/><input type="radio" value="${role}"
                                                         name="roles"/><br/>
                    </c:forEach>
                </fieldset>
            </div>

        </div>

        <div class="row">
            <div class="col-4">
                <input type="submit" value="Crear"/>
            </div>

        </div>
    </div>
</form>

<jsp:include page="/WEB-INF/template/footer.jsp"/>
</body>
</html>
