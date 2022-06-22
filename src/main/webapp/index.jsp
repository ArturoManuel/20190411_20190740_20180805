<%@ page import="com.example.zombies.Bean.BHumanos" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="listahumanos" scope="request" type="java.util.ArrayList<com.example.zombies.Bean.BHumanos>"/>
<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title> Apocalipsis Zombie</title>
    <!-- CSS Personales-->
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/carrusel.css">
</head>
<body>

<jsp:include page="/includes/head.jsp">
    <jsp:param name="title" value="index"/>
</jsp:include>

<!--Navbar-->
<jsp:include page="/includes/navbar.jsp">
    <jsp:param name="page" value=""/>
</jsp:include>
<!-- Banner presentación -->
<div class="slider_carr">
    <ul>
        <li><img src="images/fondo6.jpg" alt=""></li>
        <li><img src="images/fondo1.jpg" alt=""></li>
        <li><img src="images/fondo6.jpg" alt=""></li>
        <li><img src="images/fondo1.jpg" alt=""></li>
    </ul>
</div>
<!---->
<STYLE TYPE="text/css">
    body{
        font-family: Arial;
    }
    #main-container{
        margin: 10px ;
        width: 1200px;
    }
    table{
        background-color: white;
        text-align: center;
        border-collapse: collapse;
        width: 100%;
        position: static;
        left: 100%;

        top: 300%;
        margin-top: 1px;
    }
    th, td{
        padding: 20px;
    }
    thead{
        background-color: #1db954;
        border-bottom: solid 5px #0F362D;
        color: white;
    }
    tr:nth-child(even){
        background-color: #ddd;
    }
    tr:hover td{
        background-color: #57f77c;
        color: white;
    }

</STYLE>

<br> <br>
<br> <br>
<center>
    <h1><b><font color="white">LISTA DE HUMANOS</font> </b></h1>

<div id="main-container" >
    <table>
        <thead>
        <tr>
            <th>ID</th><th>Nombre y Apellido</th><th>Sexo</th><th>Estado</th>
        </tr>
        </thead>
        <%for (BHumanos h : listahumanos){%>
        <tr>
            <td><%=h.getNumero_identificación()%></td>
            <td><%=h.getNombre()+" "+h.getApellido()%></td>
            <td><%=h.getSexo()%></td>
            <td><%=h.getEstado()%></td>
        </tr>

        <%}%>


    </table>
</div>
</center>
<br> <br>
</body>
</html>
