<%--
  Created by IntelliJ IDEA.
  User: Niurka
  Date: 22/06/2022
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.zombies.Bean.BZombies" %>
<%@ page import="com.example.zombies.Bean.BSupervivientes" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.lang.String" %>
<jsp:useBean id="listasupervivientes" scope="request" type="java.util.ArrayList<com.example.zombies.Bean.BSupervivientes>"/>
<jsp:useBean id="listaszombies" scope="request" type="java.util.ArrayList<com.example.zombies.Bean.BZombies>"/>
<html>

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
    <h2><b><font color="white"><mark >CACERÍA</mark></font> </b></h2>
    <br>
</center>
<div id="main-container" >
    <center></center>
    <table>
        <thead>
        <tr>
            <th>Suervivientes</th><th>Zombies</th>
        </tr>
            <tr><%for (BZombies s : listaszombies){%>
            <tr>
                <td><%=s.getHumanos().getNombre() +""+ s.getHumanos().getApellido()%></td>
            </tr>
            <%}%>
            <%for (BSupervivientes s : listasupervivientes){%>
            <tr>
                <td><%=s.getHumanos().getNombre()+" "+s.getHumanos().getApellido()%></td>
            </tr>
            <%}%>
        </thead>
        <tr>
            <td>nombres y apellidos</td><td>nombes y apellidos</td>
        </tr>

    </table></center>
</div>

<br> <br><br><br>
<h3><b><font color="white"><mark>Seleccionar que zombie ataca a que humano: </mark></font> </b></h3>
<br>
<center>
<select class="form-control" name="Zombie" id="zombie"Style="width: 50%" required >
    <option value="" disabled hidden selected>Elige un Zombie</option>
    <option value="">Zombie 1</option>
    <option value="">Zombie 2 </option>
</select>

<br>
<select class="form-control" name="Super" id="super" Style="width: 50%" required>
    <option value="" disabled hidden selected>Elige un Superviviente</option>
    <option value="">Superviviente 1</option>
    <option value="">Superviviente 2 </option>
</select>

<br>
<button class="btn btn-tele border-start-1" type="submit">Atacar </button>
</center>
<br><br><br>
</body>
</html>
