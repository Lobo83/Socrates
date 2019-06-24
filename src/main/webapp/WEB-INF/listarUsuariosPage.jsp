<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
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
            <th scope="col">Nombre</th>
            <th scope="col">Primer Apellido</th>
            <th scope="col">Segundo Apellido</th>
            <th scope="col">Email</th>
            <th scope="col">Usuario</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="usuario" items="${usersList}">
            <tr>
                <td scope="row">
                    <c:out value="${usuario.nombre}"/>
                </td>
                <td>
                    <c:out value="${usuario.apellido1}"/>
                </td>
                <td>
                    <c:out value="${usuario.apellido2}"/>
                </td>
                <td>
                    <c:out value="${usuario.email}"/>
                </td>
                <td>
                    <c:out value="${usuario.userDTO.username}"/>
                </td>
                

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<jsp:include page="/WEB-INF/template/footer.jsp"/>
</body>
</html>
