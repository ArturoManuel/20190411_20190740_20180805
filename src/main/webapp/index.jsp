<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
        <li><img src="images/fondo4.jpg" alt=""></li>
        <li><img src="images/fondo5.jpg" alt=""></li>
        <li><img src="images/fondo4.jpg" alt=""></li>
        <li><img src="images/fondo5.jpg" alt=""></li>
    </ul>
</div>
<!---->
</body>
</html>
