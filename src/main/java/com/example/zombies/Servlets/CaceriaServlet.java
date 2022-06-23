package com.example.zombies.Servlets;

import com.example.zombies.Bean.BHumanos;
import com.example.zombies.Bean.BSupervivientes;
import com.example.zombies.Bean.BZombies;
import com.example.zombies.Dao.HumanoDao;
import com.example.zombies.Dao.SupervivientesDao;
import com.example.zombies.Dao.ZombiesDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CaceriaServlet", value = "/Caceria")
public class CaceriaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action") == null ? "" : request.getParameter("action");
        ZombiesDao zombiesDao = new ZombiesDao();
        SupervivientesDao supervivientesDao = new SupervivientesDao();
        RequestDispatcher view;
        switch (action) {
            case "":
                ArrayList<BZombies> listaszombies= zombiesDao.listasZombies();
                ArrayList<BSupervivientes> listasupervivientes= supervivientesDao.listaSupervivientes();
                request.setAttribute("listaszombies",listaszombies);
                request.setAttribute("listasupervivientes",listasupervivientes);
                view = request.getRequestDispatcher("Caceria.jsp");
                view.forward(request,response);
                break;
            case "listado":
                view = request.getRequestDispatcher("Caceria.jsp");
                view.forward(request,response);
                break;


        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
