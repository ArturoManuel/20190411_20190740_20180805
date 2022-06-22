<%--
  Created by IntelliJ IDEA.
  User: Niurka
  Date: 22/06/2022
  Time: 01:34
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
    <h2><b><font color="white"><mark >OBJETOS DE XDDDD</mark></font> </b></h2>
    <br>
</center>
<div id="main-container" align="left">
    <table>
        <thead>
        <tr>
            <th>Objeto</th><th>Cantidad</th><th>Masa(kg)</th><th>¿Vacuna?</th><th>Eliminar objeto</th>
        </tr>
        </thead>
        <tr>
            <td>idk</td><td>idk</td><td>idk</td> <td>idk</td><td> <a href="javascript:abrirDelete()"><img width="30px" height="30px" src="images/x.png"></a></td>
        </tr>




    </table>
</div>
<div class="delete" id="dele">
    <center>
        <h5>¿Está seguro que desea eliminar este objeto?</h5>
        <br>
    </center>
    <div><a  type="submit"
             role="button"
             class="btn btn-tele border-start-1"
             href="javascript:cerrarDelete()"> Eliminar </a></div>

</div>


<script>

    function abrirDelete() {
        document.getElementById("dele").style.display="block";
    }
    function cerrarDelete() {
        document.getElementById("dele").style.display="none";
    }
</script>

</body>
</html>
