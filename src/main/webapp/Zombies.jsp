<%--
  Created by IntelliJ IDEA.
  User: Niurka
  Date: 21/06/2022
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.zombies.Bean.BZombies" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.lang.String" %>
<jsp:useBean id="listazombies" scope="request" type="java.util.ArrayList<com.example.zombies.Bean.BZombies>"/>

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
<br>
</center>
<div id="main-container" align="left">
    <table>


        <thead>
        <tr>
            <td>ID</td><td>Nombre y Apellido </td><td>Sexo</td><th>Tiempo Infectado (horas)</th><th>Variante de Virus</th><th>Número de Víctimas </th><th>Tipo de Zombie</th>
        </tr>
        </thead>


        <%for (BZombies z : listazombies){%>
        <tr>
            <td><%=z.getHumanos().getNumero_identificación()%></td>
            <td><%=z.getHumanos().getNombre()+" "+z.getHumanos().getApellido()%></td>
            <td><%=z.getHumanos().getSexo()%></td>
            <td><%=z.getTiempo_infectados()%></td>
            <td><%=z.getVictimas()%></td>
            <td><%=z.getTipo_zombie()%></td>
            <td> <a role="button" class="btn btn-tele border-start-1" href="ObjetosporSuperServlet"> ver objetos</a>  </td>
            <td> <a type="submit" role="button" class="btn btn-tele border-start-1" href="javascript:abrirEditar()">Editar</a></td>
            <td> <a href="javascript:abrirDelete()"><img width="30px" height="30px" src="images/x.png"></a></td>
        </tr>
        <%}%>



    </table>
</div>
<center>
    <br>
    <a  type="submit"
        role="button"
        class="btn btn-tele border-start-1"
        href="javascript:abrir()"
    >
        Añadir Zombie</a>
    <br><br><br>


</center>


<div class="zombie" id="zombie">
    <div id="cerrar"><a href="javascript:cerrar()"><img width="20px" height="20px" src="images/x.png"></a></div>
    <b>AÑADIR ZOMBIE</b>
    <br>
    <center>
        <form style="width: 85%">

            <input type="text" id="nombresZombie" class="form-control" placeholder="Nombres y Apellidos"/><br>
            <input type="text" id="SexoZombie" class="form-control" placeholder="Sexo"/><br>
            <input type="text" id="IDZombie" class="form-control" placeholder="N° de identificación"/><br>
            <select name="tipodeZombie" id="tipodeZombie" class="form-control"><br>
            <option selected="yes">---Tipo de Zombie---</option>
            <option>Demoledor</option>
            <option>Rápido</option>
            <option>Niño</option>
            <option>Normal</option>
            <option>Otro</option>

            </select><br>
            <select name="variante" id="variante" class="form-control">
                <option>variante1</option>
                <option>variante2</option>
                <option>variante2</option>
            </select>
        </form>

    </center>
    <div><button class="btn btn-tele border-start-1" type="submit">Añadir </button></div>

</div>












<center>
    <h1><b><font color="white">ESTADÍSTICAS</font> </b></h1>
</center>

<script>
    function abrir() {
        document.getElementById("zombie").style.display="block";
    }
    function cerrar() {
        document.getElementById("zombie").style.display="none";
    }
</script>

</body>
</html>