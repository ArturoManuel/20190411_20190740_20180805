<%--
  Created by IntelliJ IDEA.
  User: Niurka
  Date: 21/06/2022
  Time: 00:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'/>
    <link rel="shortcut icon" href="<%=request.getContextPath()%>/images/logozombie.ico" type="image/x-icon">
    <title><%=request.getParameter("title")%>
    </title>
    <style>
        body {
            background-image: url("images/superviviente.jpg");
            background-size: cover;
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center center;
            background-attachment: fixed;
        }

        .container {
            padding-right: 0 !important;
            padding-left: 0 !important;
        }

        .titlecolor {
            background: linear-gradient(0deg, #1d1d1d 0%, #525252 100%);
        }

        .navbar {
            position: fixed;
            width: 100%;
            padding: 20px 10px;
            background-color: rgb(29 185 84 / 94%) !important;
        }

        .table-transparent {
            background-color: #343a4000 !important
        }

        .tabla {
            background-color: #1d1d1d;
            padding-left: 30px;
            padding-right: 30px;
        }

        thead {
            border-top: hidden;
            font-size: 14px;
        }

        .table td {
            padding: 0.5rem;
            font-weight: 500;
        }

        .table th {
            padding: 0.5rem;
            font-weight: 100;
        }

        .fila-red {
            background-color: #ba49498c;
        }

        .fila-blue {
            background-color: #2441ac8c;
        }

        .fila-purple {
            background-color: #a4219a8c;
        }

        .fila-yellow {
            background-color: #f0e01f91;
        }


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
            margin-left: 75px;
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

        .btn {
            display: inline-block;
            font-weight: 400;
            line-height: 1.5;
            color: #212529;
            text-align: center;
            text-decoration: none;
            vertical-align: middle;
            cursor: pointer;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
            background-color: transparent;
            border: 1px solid transparent;
            padding: .375rem .75rem;
            font-size: 1rem;
            border-radius: .25rem;
            transition: color .15s ease-in-out, background-color .15s ease-in-out, border-color .15s ease-in-out, box-shadow .15s ease-in-out
        }


        .btn-tele {
            border-color: #1db954;
            background-color: #1db954;
            color: white;
        }
        .btn-eliminar {
            border-color: #b91d1d;
            background-color: #b91d1d;
            color: white;
        }


        .btn-tele:hover {
            color: #fff;
            background-color: #131212;
            border-color: #131212;
        }

        .btn-check:focus + .btn-tele,
        .btn-tele:focus {
            color: #fff;
            background-color: #131212;
            border-color: #1db954;
            box-shadow: 0 0 0 0.2rem #57f77c;
        }

        .btn-check:active + .btn-tele,
        .btn-check:checked + .btn-tele,
        .btn-tele.active,
        .btn-tele:active,
        .show > .btn-tele.dropdown-toggle {
            color: #fff;
            background-color: #1db954;
            border-color: #1db954;
        }

        .btn-check:active + .btn-tele:focus,
        .btn-check:checked + .btn-tele:focus,
        .btn-tele.active:focus,
        .btn-tele:active:focus,
        .show > .btn-tele.dropdown-toggle:focus {
            box-shadow: 0 0 0 0.2rem #57f77c;
        }

        .btn-tele.disabled,
        .btn-tele:disabled {
            color: #fff;
            border-color: #1db954;
            background-color: #1db954;
        }

        .btn-tele-inverso {
            background-color: white;
            color: #57f77c;
        }

        .btn-tele-inverso:hover {
            color: #1db954;
        }

        .btn-check:focus + .btn-tele-inverso,
        .btn-tele-inverso:focus {
            color: #1db954;
        }

        .btn-check:active + .btn-tele-inverso,
        .btn-check:checked + .btn-tele-inverso,
        .btn-tele-inverso.active,
        .btn-tele-inverso:active,
        .show > .btn-tele-inverso.dropdown-toggle {
            color:#1db954;
        }

        .btn-check:active + .btn-tele-inverso:focus,
        .btn-check:checked + .btn-tele-inverso:focus,
        .btn-tele-inverso.active:focus,
        .btn-tele-inverso:active:focus,
        .show > .btn-tele-inverso.dropdown-toggle:focus {
            box-shadow: 0 0 0 0.2rem #57f77c;
        }



        /*Desactivar sombra de botones*/

        .btn:focus,
        .btn:active,
        .page-link:focus {
            box-shadow: none !important;
            outline: 0;
        }



         .ventana {

             Background: #525252;
             width:35%;
             color:#dddddd;
             font-family: Arial;
             font-size: 18px;
             text-align:center;
             padding: 33px;
             min-height: 350px;
             border-radius: 10px;
             top:25%;
             position: fixed;
             left:33%;
             display: none;
         }
        .virus {

            Background: #525252;
            width:30%;
            color:#dddddd;
            font-family: Arial;
            font-size: 18px;
            text-align:center;
            padding: 33px;
            min-height: 150px;
            border-radius: 10px;
            top:30%;
            position: fixed;
            left:33%;
            display: none;
        }
        .zombie {

            Background: #525252;
            width:30%;
            color:#dddddd;
            font-family: Arial;
            font-size: 18px;
            text-align:center;
            padding: 33px;
            min-height: 250px;
            border-radius: 10px;
            top:20%;
            position: fixed;
            left:33%;
            display: none;
        }
        .editar {

            Background: #525252;
            width:35%;
            color:#dddddd;
            font-family: Arial;
            font-size: 18px;
            text-align:center;
            padding: 33px;
            min-height: 250px;
            border-radius: 10px;
            top:30%;
            position: fixed;
            left:33%;
            display: none;
        }
        .delete {

            Background: #525252;
            width:35%;
            color:#dddddd;
            font-family: Arial;
            font-size: 18px;
            text-align:center;
            padding: 33px;
            min-height: 100px;
            border-radius: 10px;
            left:33%;
            top:200px;
            position: fixed;
            display: none;
        }

        #cerrar {
            position:absolute;
            right:4px;
            top:2px
        }
        #cerrarEditar{
            position:absolute;
            right:4px;
            top:2px
        }
        #aceptarDelete{
            position:center;
        }



    </style>
</head>
