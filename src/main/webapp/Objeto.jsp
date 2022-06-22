<%--
  Created by IntelliJ IDEA.
  User: Niurka
  Date: 21/06/2022
  Time: 19:11
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
    <h2><b><font color="white"><mark >LISTA DE OBJETOS</mark></font> </b></h2>
</center>

<div id="main-container" >
    <center>
    <table>
        <thead>
        <tr>
            <th>Nombre del objeto</th><th>Peso</th><th>Tipo de Vacuna</th><th>Editar</th>
        </tr>
        </thead>
        <tr>
            <td>idk</td><td>idk</td><td><a  type="submit" role="button" class="btn btn-tele border-start-1" href="javascript:abrirVacuna()">Vacuna</a></td> </td><td> <a  type="submit" role="button" class="btn btn-tele border-start-1" href="javascript:abrirEditar()">Editar</a></td>
        </tr>
        <tr>
            <td>idk</td><td>idk</td><td>normal</td><td> <a  type="submit" role="button" class="btn btn-tele border-start-1" href="javascript:abrirEditar()">Editar</a></td>
        </tr>
        <tr>
            <td>idk</td><td>idk</td><td><a  type="submit" role="button" class="btn btn-tele border-start-1" href="javascript:abrirVacuna()">Vacuna</a></td><td> <a  type="submit" role="button" class="btn btn-tele border-start-1" href="javascript:abrirEditar()">Editar</a></td>
        </tr>
    </table></center>
</div>
<div class="editar" id="edit">
    <div id="cerrarEditar"><a href="javascript:cerrarEditar()"><img width="20px" height="20px" src="images/x.png"></a></div>
    EDITAR
    <center>
        <form style="width: 70%">
            <input type="text" id="pesoEdit" class="form-control" placeholder="Peso (kg)"/>
            <br>
            <h6>Solo si es vacuna, llenar su efectividad:</h6>
            <input type="text" id="efectividad" class="form-control" placeholder="Efectividad"/>
        </form>

    </center>
    <div><button class="btn btn-tele border-start-1" type="submit" >Editar </button></div>
</div>

<div class="editar" id="vacu">
    <div id="cerrar2"><a href="javascript:cerrarVacuna()" ><img width="20px" height="20px" src="images/x.png"></a></div>
        <form style="width: 40%">
            <center>
            <table>
               <thead>
               <tr><th>Tipo de Zombie</th><th>Efectividad(%)</th></tr>
               </thead>
                <tr><td>Demoledor</td><td>x%</td></tr>
                <tr><td>Rápido</td><td>x%</td></tr>
                <tr><td>Niño</td><td>x%</td></tr>
                <tr><td>Normal</td><td>x%</td></tr>
                <tr><td>otro</td><td>x%</td></tr>
            </table></center>
        </form>
</div>
<br><br><br>
<center>
    <a  type="submit"
        role="button"
        class="btn btn-tele border-start-1"
        href="javascript:abrir()"
    >Añadir Objeto</a>

</center>
<br><br><br>

<div class="Ventana" id="vent">
    <div id="cerrar"><a href="javascript:cerrar()"><img width="20px" height="20px" src="images/x.png"></a></div>
    REGISTRAR
    <br>
    <center>
        <form style="width: 70%" method="post" action="<%=request.getContextPath()%>/Supervivientes?action=añadir">
            <input type="text" name="objeto" id="objeto" class="form-control" placeholder="Objeto"/><br>
            <input type="text" name="pesoObj" id="pesoObj" class="form-control" placeholder="peso(kg)"/><br>
            <select class="form-control" name="obejto" id="obejto"  required>
            <option value="" disabled hidden selected>Tipo de Vacuna</option>
                <option >vacuna</option>
                <option >normal</option>
            </select><br>
            <h6>Solo si es vacuna, llenar su efectividad:</h6>
            <input type="text" id="efect" class="form-control" placeholder="Efectividad"/><br>
            <button class="btn btn-tele border-start-1" type="submit">Añadir </button>
        </form>

    </center>
    <div></div>
















<script>
    function abrir() {
        document.getElementById("vent").style.display="block";
    }
    function cerrar() {
        document.getElementById("vent").style.display="none";
    }
    function abrirEditar() {
        document.getElementById("edit").style.display="block";
    }
    function cerrarEditar() {
        document.getElementById("edit").style.display="none";
    }
    function abrirVacuna() {
        document.getElementById("vacu").style.display="block";
    }
    function cerrarVacuna() {
        document.getElementById("vacu").style.display="none";
    }

</script>


</body>
</html>