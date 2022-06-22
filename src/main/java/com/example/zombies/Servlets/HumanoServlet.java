package com.example.zombies.Servlets;

import com.example.zombies.Bean.BHumanos;
import com.example.zombies.Dao.HumanoDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "HumanoServlet", urlPatterns ={ "/Humanos",""})
public class HumanoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action") == null ? "listar" : request.getParameter("action");


        HumanoDao humanoDao = new HumanoDao();

        switch (action){
            case "listar" ->{
                ArrayList<BHumanos> listahumanos= humanoDao.listaHumanos();
                request.setAttribute("listahumanos",listahumanos);
                RequestDispatcher view =request.getRequestDispatcher("index.jsp");
                view.forward(request,response);

            }
            case "mostrar"->{
                RequestDispatcher view =request.getRequestDispatcher("index.jsp");
                view.forward(request,response);
            }
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
