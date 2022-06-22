<%--
  Created by IntelliJ IDEA.
  User: Niurka
  Date: 21/06/2022
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title> Apocalipsis Zombie</title>
    <!-- CSS Personales-->
    <link rel="stylesheet" href="css/styles_super.css">

</head>


<jsp:include page="/includes/head2.jsp">
    <jsp:param name="title" value="index"/>
</jsp:include>

<!--Navbar-->
<jsp:include page="/includes/navbar.jsp">
    <jsp:param name="page" value=""/>
</jsp:include>
<body>

<br>
<br> <br>
<br> <br>
<br> <br>

<center>
    <h2><b><font color="white"><mark >LISTA DE ZOMBIES</mark></font> </b></h2>

</center>
<div id="main-container" align="left">
    <table>
        <thead>
        <tr>
            <td>ID</td><td>Nombre y Apellido </td><td>Sexo</td><th>Tiempo Infectado</th><th>Variente de Virus</th><th>Número de Víctimas </th><th>Tipo de Zombie</th>
        </tr>
        </thead>
        <tr>
            <td>idk</td><td>idk</td><td>idk</td> <td>xdd</td><td>idk</td><td>idk</td><td>idk</td>
        </tr>
        <tr>
            <td>idk</td><td>idk</td><td>idk</td><td>xdd</td><td>idk</td><td>idk</td><td>idk</td>
        </tr>
        <tr>
            <td>idk</td><td>idk</td><td>idk</td><td>xdd</td><td>idk</td><td>idk</td><td>idk</td>
        </tr>
    </table>
</div>
<a  type="submit"
    role="button"
    class="btn btn-tele border-start-1"
    href="javascript:abrir()"
>
    Añadir Superviviente</a>

<center>
    <h1><b><font color="white">ESTADÍSTICAS</font> </b></h1>
</center>



</body>
</html>