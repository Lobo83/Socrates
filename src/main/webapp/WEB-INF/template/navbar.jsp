<%--
  Created by IntelliJ IDEA.
  User: chala
  Date: 24/06/2019
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">Inicio</a>
        </div>
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav">
                <li><a href="#">Materias</a></li>
                <li><a href="#">Clases</a></li>
                <li><a href="#">Profesores</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/loginPage">Iniciar Sesión</a></li>
            </ul>
            <sec:authorize access="hasRole('ADMIN')">
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Admin</a>
                        <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/createUserPage">Crear Usuario</a></li>
                            <li><a href="/user/findAll">Listar Usuarios</a></li>
                        </ul>
                    </li>
                </ul>
            </sec:authorize>
        </div>
    </div>
</nav>
