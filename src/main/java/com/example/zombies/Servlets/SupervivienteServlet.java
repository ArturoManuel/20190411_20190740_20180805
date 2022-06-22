package com.example.zombies.Servlets;

import com.example.zombies.Bean.BHumanos;
import com.example.zombies.Bean.BSupervivientes;
import com.example.zombies.Dao.HumanoDao;
import com.example.zombies.Dao.SupervivientesDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SupervivienteServlet", value = "/Supervivientes")
public class SupervivienteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action") == null ? "listar" : request.getParameter("action");
        SupervivientesDao supervivientesDao = new SupervivientesDao();
        switch (action){
            case "listar" ->{
                ArrayList<BSupervivientes> listasupervivientes= supervivientesDao.listaSupervivientes();
                request.setAttribute("listasupervivientes",listasupervivientes);
                RequestDispatcher view =request.getRequestDispatcher("Supervivientes.jsp");
                view.forward(request,response);

            }
            case "mostrar"->{
                RequestDispatcher view =request.getRequestDispatcher("Supervivientes.jsp");
                view.forward(request,response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
