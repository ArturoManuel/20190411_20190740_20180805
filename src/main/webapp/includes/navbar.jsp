<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--Navbar-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar sticky-top navbar-expand-lg navbar-dark">

    <img src="images/logozombie.png" width="300px" height="80px " align="left"/>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">

           <ul class="navbar-nav">
               <li class="nav-item">
                   <a class="nav-link <%=request.getParameter("page").equals("tours")? "active": "" %>" href="<%=request.getContextPath()%>/Supervivientes"><b>Supervivientes</b></a>
               </li>
               <li class="nav-item">
                   <a class="nav-link <%=request.getParameter("page").equals("bandas")? "active": "" %>" href="<%=request.getContextPath()%>/Zombies"><b>Zombies</b></a>
               </li>
               <li class="nav-item">
                   <a class="nav-link <%=request.getParameter("page").equals("tpc")? "active": "" %>" href="<%=request.getContextPath()%>/Virus"><b>Virus</b></a>
               </li>
           </ul>


    </div>
</nav>

