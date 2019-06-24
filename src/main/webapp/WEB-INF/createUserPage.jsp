<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<%--<c:out value="Saludos <%= session.getAttribute("username") %>"/>--%>
<h1>CONSEGUIDO</h1>
<form:form id="createUserForm" modelAttribute="user" action="/user/createUser" method="post">
    <form:input path="username"/>
    <form:password path="password"/>
    <form:checkboxes items="Activo" path="active"/>
    <form:radiobuttons path="roles" items="${['Admin','Alumno','Profesor']}"/>
    <input type="submit" value="Crear"/>
    <form:form/>
    <jsp:include page="/WEB-INF/template/footer.jsp"/>
</form:form>
</body>
</html>
