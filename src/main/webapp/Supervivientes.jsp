<%--
  Created by IntelliJ IDEA.
  User: Niurka
  Date: 20/06/2022
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.zombies.Bean.BSupervivientes" %>
<jsp:useBean id="listasupervivientes" scope="request" type="java.util.ArrayList<com.example.zombies.Bean.BSupervivientes>"/>
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
    <h2><b><font color="white"><mark >LISTA DE SUPERVIVIENTES</mark></font> </b></h2>
    <br>
    <!--FILTRAR-->
    <div class="col-md-10 d-none d-md-block ps-0">
        <div class="input-group" align="center">
            <div style="width: 16%">
                <input
                        type="search"
                        id="buscador_producto"
                        class="form-control"
                        placeholder="Filtrar por sexo"
                />
            </div>
            <a
                    role="button"
                    class="btn btn-tele border-start-1"
                    href="SupervivienteServlet"
            >
                Filtrar</a>
        </div>
    </div>
    <br>
</center>
    <div id="main-container" align="left">
        <table>
            <thead>
            <tr>
                <th>ID</th><th>Nombre y Apellido</th><th>Sexo</th><th>Peso</th><th>Fuerza</th><th>Pareja</th><th>Peso cargado</th><th>Objetos</th><th>Editar</th><th>Eliminar</th>
            </tr>
            </thead>
            <%for (BSupervivientes s : listasupervivientes){%>
            <tr>
                <td><%=s.getHumanos().getNumero_identificación()%></td>
                <td><%=s.getHumanos().getNombre()+" "+s.getHumanos().getApellido()%></td>
                <td><%=s.getHumanos().getSexo()%></td>
                <td><%=s.getPeso()%></td>
                <td><%=s.getFuerza()%></td>
                <td><%=s.getPareja().getNombre()+" "+s.getPareja().getApellido()%></td>
                <td><%=s.getPeso_cargado()%></td>
                <td> <a role="button" class="btn btn-tele border-start-1" href="ObjetosporSuperServlet"> ver objetos</a>  </td>
                <td> <a  type="submit" role="button" class="btn btn-tele border-start-1" href="javascript:abrirEditar()">Editar</a></td>
                <td> <a href="javascript:abrirDelete()"><img width="30px" height="30px" src="images/x.png"></a></td>
            </tr>
            <%}%>
        </table>
    </div>
<center>
    <br>
    <div class="Ventana" id="vent">
        <div id="cerrar"><a href="javascript:cerrar()"><img width="20px" height="20px" src="images/x.png"></a></div>
        REGISTRAR
        <center>
            <form style="width: 70%">
                <input type="text" id="id_super" class="form-control" placeholder="N° de ID"/>
                <input type="text" id="nombres" class="form-control" placeholder="Nombres"/>
                <input type="text" id="apellidos" class="form-control" placeholder="Apellidos"/>
                <input type="text" id="sexo" class="form-control" placeholder="Sexo"/>
                <input type="text" id="peso" class="form-control" placeholder="Peso (kg)"/>
                <input type="text" id="fuerza" class="form-control" placeholder="Fuerza (N)"/>
                <input type="text" id="pareja" class="form-control" placeholder="Pareja(nombre y apellido)"/>
                <input type="text" id="peso cargado" class="form-control" placeholder="Peso cargado(kg)"/>
            </form>

        </center>
        <div><button class="btn btn-tele border-start-1" type="submit">Añadir </button></div>

    </div>
    <a  type="submit"
            role="button"
            class="btn btn-tele border-start-1"
            href="javascript:abrir()"
    >Añadir Superviviente</a>

    <br><br>
    <br>

    <div class="editar" id="edit">
        <div id="cerrarEditar"><a href="javascript:cerrarEditar()"><img width="20px" height="20px" src="images/x.png"></a></div>
        EDITAR
        <center>
            <form style="width: 70%">

                <input type="text" id="nombresEdit" class="form-control" placeholder="Nombres"/>
                <input type="text" id="pesoEdit" class="form-control" placeholder="Peso (kg)"/>
                <input type="text" id="fuerzaEdit" class="form-control" placeholder="Fuerza (N)"/>
                <input type="text" id="parejaEdit" class="form-control" placeholder="Pareja(nombre y apellido)"/>
            </form>

        </center>
        <div><button class="btn btn-tele border-start-1" type="submit">Editar </button></div>

    </div>

    <div class="delete" id="dele">
        <center>
            <h5>¿Está seguro que desea elimina al superviviente?</h5>
                <br>
        </center>
        <div><a  type="submit"
                 role="button"
                 class="btn btn-tele border-start-1"
                 href="javascript:cerrarDelete()"> Eliminar </a></div>

    </div>
</center>


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
    function abrirDelete() {
        document.getElementById("dele").style.display="block";
    }
    function cerrarDelete() {
        document.getElementById("dele").style.display="none";
    }
</script>


</body>
</html>