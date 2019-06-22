<%@ page contentType="text/html; charset=UTF-8" %>
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
<%-- include header --%>

<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">Inicio</a>
        </div>
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav">

                <%--<li class="dropdown" >--%>
                <%--<a class="dropdown-toggle" data-toggle="dropdown" href="#">Materias--%>
                <%--<span class="caret"></span></a>--%>
                <%--<ul class="dropdown-menu">--%>
                <%--<li><a href="#">Page 1-1</a></li>--%>
                <%--<li><a href="#">Page 1-2</a></li>--%>
                <%--<li><a href="#">Page 1-3</a></li>--%>
                <%--</ul>--%>
                <%--</li>--%>
                <li><a href="#">Materias</a></li>
                <li><a href="#">Clases</a></li>
                <li><a href="#">Profesores</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/login">Iniciar Sesión</a></li>
            </ul>
        </div>
    </div>
</nav>
<h1>Login</h1>
<h1>ERROR GARRAFAL</h1>
<form name='f' action="login" method='POST'>
    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password'/></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="submit"/></td>
        </tr>
    </table>
</form>
<jsp:include page="/WEB-INF/template/footer.jsp"/>
</body>
</html>
