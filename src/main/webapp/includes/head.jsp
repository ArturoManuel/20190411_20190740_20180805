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
            background-color: #131212
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
    </style>
</head>
