package com.example.zombies.Servlets;

import com.example.zombies.Bean.BVirus;
import com.example.zombies.Bean.BZombies;
import com.example.zombies.Dao.VirusDao;
import com.example.zombies.Dao.ZombiesDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ZombiesServlet", value = "/Zombies")
public class ZombiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String action = request.getParameter("action") == null ? "" : request.getParameter("action");
        ZombiesDao zombiesDao = new ZombiesDao();
        RequestDispatcher view;
        switch (action) {
            case "":
                ArrayList<BZombies> listaszombies= zombiesDao.listasZombies();
                ArrayList<BZombies> listapromedios = zombiesDao.promedio_por_tipo();
                ArrayList<BZombies> listagenero = zombiesDao.listasZombiesgenero();

                request.setAttribute("listapromedio",listapromedios);
                request.setAttribute("listaszombies",listaszombies);
                request.setAttribute("listagenero",listagenero);
                view = request.getRequestDispatcher("Zombies.jsp");
                view.forward(request,response);
                break;
            case "listado":
                view = request.getRequestDispatcher("Zombies.jsp");
                view.forward(request,response);
                break;


        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
