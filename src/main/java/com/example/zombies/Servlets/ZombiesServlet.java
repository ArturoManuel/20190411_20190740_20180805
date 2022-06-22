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

        ZombiesDao zombiesDao = new ZombiesDao();
        ArrayList<BZombies> listaszombies= zombiesDao.listasZombies();
        request.setAttribute("listaszombies",listaszombies);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Zombies.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
