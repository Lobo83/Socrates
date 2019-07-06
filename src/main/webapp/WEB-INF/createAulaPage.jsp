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
<form id="createAulaForm" name="aula" action="/aula/crear" method="post">
    <input type="hidden" name="id" value="${aula.id}"/>
    <div class="container">
        <div class="row">

            <div class="col-sm-2" style="width: 12%">
                <c:out value="Nombre:"/>
            </div>
            <div class="col-sm-2">
                <input type="text" name="nombre" value="${aula.nombre}"/>
            </div>

        </div>
        <div class="row">

            <div class="col-sm-2" style="width: 12%">
                <c:out value="Descripcion:"/>
            </div>
            <div class="col-sm-2">
                <input type="text" name="descripcion" value="${aula.descripcion}"/>
            </div>

        </div>
        <div class="row">

            <div class="col-sm-2" style="width: 12%">
                <c:out value="Capacidad:"/>
            </div>
            <div class="col-sm-2">
                <input type="number" name="capacidad" value="${aula.capacidad}"/>
            </div>

        </div>
        <div class="row">
            <div class="col-4">
                <input type="submit" value="Salvar"/>
            </div>

        </div>
    </div>
    </div>
</form>
<jsp:include page="/WEB-INF/template/footer.jsp"/>
</body>
</html>

