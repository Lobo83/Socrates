<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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

<form id="createSesionForm" name="sesion" action="/sesion/crear" method="post">
    <input type="hidden" value="${sesion.id}">
    <div class="container">
        <div class="row">
            <div class="col-sm-2" style="width: 12%">
                <c:out value="Día:"/>
            </div>
            <div class="col-sm-2">
                <select name="dia">
                    <c:forEach items="${['Lunes','Martes','Miércoles','Jueves','Viernes']}"
                               var="dia">
                        <option value="${dia}" ${dia == sesion.dia  ? 'selected="selected"' : ''}>${dia}</option>
                    </c:forEach>
                </select>
            </div>

        </div>
        <div class="row">
            <div class="col-sm-2" style="width: 12%">
                <c:out value="Hora Inicio:"/>
            </div>
            <div class="col-sm-2">
                <select>
                    <c:set var="horaInicioPartes" value="${fn:split(sesion.horaInicio, ':')}"/>
                    <c:forEach begin="8" end="22" var="valHoraInicio">
                        <option value="${valHoraInicio}" ${valHoraInicio == horaInicioPartes[0]  ? 'selected="selected"' : ''} >${valHoraInicio}</option>
                    </c:forEach>
                </select>:
                <select>
                    <c:forEach items="${['00','15','30','45']}" var="valMinutoInicio">
                        <option value="${valMinutoInicio}" ${valMinutoInicio == horaInicioPartes[1]  ? 'selected="selected"' : ''} >${valMinutoInicio}</option>
                    </c:forEach>
                </select>
                <input type="hidden" value="${valHoraInicio}:${valMinutoInicio}"
                       name="horaInicio"/>
            </div>

        </div>
        <div class="row">
            <div class="col-sm-2" style="width: 12%">
                <c:out value="Hora Fin:"/>
            </div>
            <div class="col-sm-2">
                <select >
                    <c:set var="horaFinPartes" value="${fn:split(sesion.horaFin, ':')}"/>
                    <c:forEach begin="8" end="22" var="valHoraFin">
                        <option value="${valHoraFin}" ${valHoraFin == horaFinPartes[0]  ? 'selected="selected"' : ''} >${valHoraFin}</option>
                    </c:forEach>
                </select>:
                <select>
                    <c:forEach items="${['00','15','30','45']}" var="valMinutoFin">
                        <option value="${valMinutoFin}" ${valMinutoFin == horaFinPartes[1]  ? 'selected="selected"' : ''} >${valMinutoFin}</option>
                    </c:forEach>
                </select>
                <input type="hidden" value="${valHoraFin}:${valMinutoFin}"
                       name="horaFin"/>
            </div>

        </div>
        <div class="row">
            <div class="col-sm-2" style="width: 12%">
                <c:out value="Clase:"/>
            </div>
            <div class="col-sm-2">
                <select name="idClase">
                    <c:forEach var="clase" items="${clases}">
                        <option value="${clase.id}" ${clase.id == sesion.clase.id ? 'selected="selected"' : ''}>${clase.nombre}
                        </option>
                    </c:forEach>
                </select>
            </div>

        </div>
        <div class="row">
            <div class="col-sm-2" style="width: 12%">
                <c:out value="Aula:"/>
            </div>
            <div class="col-sm-2">
                <select name="idAula">
                    <c:forEach var="aula" items="${aulas}">
                        <option value="${aula.id}" ${aula.id == sesion.aula.id ? 'selected="selected"' : ''}>${aula.nombre}
                        </option>
                    </c:forEach>
                </select>
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
