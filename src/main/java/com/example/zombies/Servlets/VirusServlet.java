package com.example.zombies.Servlets;

import com.example.zombies.Bean.BSupervivientes;
import com.example.zombies.Bean.BVirus;
import com.example.zombies.Dao.VirusDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "VirusServlet", value = "/Virus")
public class VirusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        VirusDao virusDao = new VirusDao();
        ArrayList<BVirus> listasvirus= virusDao.listaVirus();
        request.setAttribute("listasvirus",listasvirus);
        RequestDispatcher view= request.getRequestDispatcher("Virus.jsp");
        view.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
