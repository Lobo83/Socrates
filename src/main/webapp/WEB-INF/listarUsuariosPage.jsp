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
<div class="table-responsive">

    <table class="table ">
        <thead>
        <tr>
            <th scope="col">Nombre Usuario</th>
            <th scope="col">Contraseña</th>
            <th scope="col">Role</th>
            <th scope="col">Activo</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="usuario" items="${usersList}">
            <tr>
                <td scope="row">
                    <c:out value="${usuario.username}"/>
                </td>
                <td>
                    <c:out value="${usuario.password}"/>
                </td>
                <td>
                    <c:out value=""/>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${usuario.enabled}">
                            <c:out value="Activo"/>
                        </c:when>
                        <c:otherwise>
                            <c:out value="Inactivo"/>
                        </c:otherwise>

                    </c:choose>

                </td>


            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<jsp:include page="/WEB-INF/template/footer.jsp"/>
</body>
</html>
