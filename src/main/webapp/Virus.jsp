<%--
  Created by IntelliJ IDEA.
  User: Niurka
  Date: 21/06/2022
  Time: 17:15
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
    <h2><b><font color="white"><mark >LISTA DE VIRUS</mark></font> </b></h2>
</center>
<div id="main-container" align="left">
    <table>
        <thead>
        <tr>
            <th>ID Virus</th><th>Virus</th><th>ID Variante </th><th>Variante</th><th>Casos Encontrados</th>
        </tr>
        </thead>
        <tr>
            <td>12345</td><td>xdd</td><td>idk</td><td>idk</td><td>idk</td>
        </tr>
        <tr>
            <td>12346</td><td>xdd</td><td>idk</td><td>idk</td><td>idk</td>
        </tr>
        <tr>
            <td>12347</td><td>xdd</td><td>idk</td><td>idk</td><td>idk</td>
        </tr>
    </table>
</div>

</body>
</html>