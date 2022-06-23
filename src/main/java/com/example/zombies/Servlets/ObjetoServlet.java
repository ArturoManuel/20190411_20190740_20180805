package com.example.zombies.Servlets;

import com.example.zombies.Bean.BObjetos;
import com.example.zombies.Dao.ObjetosDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ObjetoServlet", value = "/Objetos")
public class ObjetoServlet extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ObjetosDao objetosDao = new ObjetosDao();
        ArrayList<BObjetos> listasobjetos= objetosDao.listaObjetos();
        request.setAttribute("listasobjetos",listasobjetos);
        RequestDispatcher view= request.getRequestDispatcher("Objeto.jsp");
        view.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
