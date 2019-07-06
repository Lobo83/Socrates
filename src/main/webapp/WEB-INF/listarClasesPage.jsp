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
            <th scope="col">Descripcion</th>
            <th scope="col">Profesor</th>
            <th scope="col">Accion</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="clase" items="${clases}">
            <tr>
                <td scope="row">
                    <c:out value="${clase.nombre}"/>
                </td>
                <td>
                    <c:out value="${clase.descripcion}"/>
                </td>

                <td>
                    <c:out value="${clase.profesor.nombre}"/> <c:out value="${clase.profesor.apellido1}"/> <c:out value="${clase.profesor.apellido2}"/>
                </td>
                <td>
                    <a href="/clase/editar?id=${clase.id}">Editar</a>,
                    <a href="/clase/borrar?id=${clase.id}">Eliminar</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<jsp:include page="/WEB-INF/template/footer.jsp"/>
</body>
</html>
