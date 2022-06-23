<%--
  Created by IntelliJ IDEA.
  User: Niurka
  Date: 21/06/2022
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.zombies.Bean.BZombies" %>
<jsp:useBean id="listaszombies" scope="request" type="java.util.ArrayList<com.example.zombies.Bean.BZombies>"/>
<jsp:useBean id="listapromedio" scope="request" type="java.util.ArrayList<com.example.zombies.Bean.BZombies>"/>
<jsp:useBean id="listagenero" scope="request" type="java.util.ArrayList<com.example.zombies.Bean.BZombies>"/>

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
            <th>ID</th><th>Nombre y Apellido </th><th>Sexo</th><th>Tiempo Infectado (horas)</th><th>Variente de Virus</th><th>Número de Víctimas </th><th>Tipo de Zombie</th>
        </tr>
            <tr>
                    <%for (BZombies s : listaszombies){%>
            <tr>
                <td ><%=s.getHumanos().getNumero_identificación()%></td>
                <td><%=s.getHumanos().getNombre() +""+ s.getHumanos().getApellido()%></td>
                <td><%=s.getHumanos().getSexo()%></td>
                <td><%=s.getTiempo_infectados()%></td>
                <td><%=s.getVariante_virus().getNombre()%></td>
                <td><%=s.getVictimas()%></td>
                <td><%=s.getTipo_zombie()%></td>

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
<div>
<br> <br><br><br>
    <h1><b><font color="white"><mark>ESTADÍSTICAS</mark></font> </b></h1>
<br>
<center>
    <div id="Zombieporcentajeportipo" align="left">
        <table  style="width: 90%">
            <thead>
                <tr>
                    <th>Zombies</th><th>Promedio de Víctimas</th>
                </tr>
            </thead>
            <%for (BZombies s : listapromedio){%>
            <tr>
                <td ><%=s.getTipo_zombie()%></td>
                <td ><%=s.getPromedio()%></td>
            </tr>
            <%}%>

        </table>
    </div>
    <div id="Zombieporcentaje" align="left">
        <table  style="width: 90%">
            <thead>
            <tr>
                <th>Zombies</th><th>Promedio de Víctimas(%)</th>
            </tr>
            </thead>
            <%for (BZombies s : listagenero){%>
            <tr>
                <td ><%=s.getHumanos().getSexo()%></td>
                <td ><%=s.getProcentaje()*100%></td>
            </tr>
            <%}%>

        </table>
    </div>
    <br><br>
    <div id="estadisticasVirus" align="left">
        <table  style="width: 90%">
            <thead>
            <tr>
                <th>Variantes de virus</th><th>Porcentaje (%)</th>
            </tr>
            </thead>
            <tr>
                <td>Variante 1</td><td>x %</td>
            </tr>


        </table>
    </div>
    <br><br><br>

</center>
</div></div>






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