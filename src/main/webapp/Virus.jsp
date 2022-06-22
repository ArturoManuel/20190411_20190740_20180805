<%--
  Created by IntelliJ IDEA.
  User: Niurka
  Date: 21/06/2022
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.zombies.Bean.BVariante" language="java" %>
<%@ page import="com.example.zombies.Bean.BVirus" %>
<jsp:useBean id="listasvirus" scope="request" type="java.util.ArrayList<com.example.zombies.Bean.BVirus>"/>
<jsp:useBean id="virus_activos" scope="request" type="java.lang.Integer"/>
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
    <h2><b><font color="white"><mark >LISTA DE VIRUS</mark></font> </b></h2>
    <br>
</center>
<h4><b><font color="white"><mark> Cantidad de virus activo:<%=virus_activos%></mark></font> </b></h4>
<br>
<div id="main-container" align="left">
    <table>
        <thead>
        <tr>
            <th>ID Virus</th><th>Virus</th><th>ID Variante </th><th>Variante</th><th>Casos Encontrados</th><th>Erradicar variante</th>
        </tr>
        </thead>
        <tr>
                <%for (BVirus s : listasvirus){%>
        <tr>
            <td ><%=s.getId_virus()%></td>
            <td><%=s.getNombre_virus()%></td>
            <td><%=s.getVariante().getIdVariante()%></td>
            <td><%=s.getVariante().getNombre()%></td>
            <td><%=s.getCantidad()%></td>
            <td> <a href="javascript:abrirDelete()">
                <img width="30px" height="30px" src="images/x.png"></a></td>
        </tr>
        <%}%>
        </tr>
        </tr>
    </table>
</div>
<center>
    <br>
    <a  type="submit"
        role="button"
        class="btn btn-tele border-start-1"
        href="javascript:abrir()"
    >Añadir Variante</a>
</center>

<br><br>
<br>
<div class="virus" id="virus">
    <div id="cerrar"><a href="javascript:cerrar()"><img width="20px" height="20px" src="images/x.png"></a></div>
    <b>REGISTRAR NUEVA VARIANTE</b>
    <br>
    <center>
        <form style="width: 70%">
            <br>
            <input type="text" id="nombreDelVirus" class="form-control" placeholder="Ingrese la variante"/>
        </form>
   <br>
    </center>
    <div><button class="btn btn-tele border-start-1" type="submit">Añadir </button></div>

</div>




<div class="delete" id="dele">
    <center>
        <h5>¿Está seguro que desea eliminar esta variante?</h5>
        <br>
    </center>
    <div><a  type="submit"
             role="button"
             class="btn btn-tele border-start-1"
             href="javascript:cerrarDelete()"> Eliminar </a></div>

</div>


<script>
    function abrir() {
        document.getElementById("virus").style.display="block";
    }
    function cerrar() {
        document.getElementById("virus").style.display="none";
    }

    function abrirDelete() {
        document.getElementById("dele").style.display="block";
    }
    function cerrarDelete() {
        document.getElementById("dele").style.display="none";
    }
</script>

</body>
</html>