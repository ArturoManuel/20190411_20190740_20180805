package com.example.zombies.Servlets;

import com.example.zombies.Bean.BHumanos;
import com.example.zombies.Bean.BSupervivientes;
import com.example.zombies.Dao.HumanoDao;
import com.example.zombies.Dao.SupervivientesDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

@WebServlet(name = "SupervivienteServlet", value = "/Supervivientes")
public class SupervivienteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action") == null ? "listar" : request.getParameter("action");
        SupervivientesDao supervivientesDao = new SupervivientesDao();
        RequestDispatcher view;
        switch (action){
            case "listar":
                ArrayList<BSupervivientes> listasupervivientes= supervivientesDao.listaSupervivientes();
                ArrayList<String> listaGeneros = supervivientesDao.listaGeneros();
                request.setAttribute("listasupervivientes",listasupervivientes);
                request.setAttribute("listaGeneros",listaGeneros);
                view =request.getRequestDispatcher("Supervivientes.jsp");
                view.forward(request,response);
                break;

            case "mostrar":
                view =request.getRequestDispatcher("Supervivientes.jsp");
                view.forward(request,response);
                break;

            case "borrar":
                long id = Long.parseLong(request.getParameter("id"));
                System.out.println("aqui llegamos");
                supervivientesDao.delete(id);
                response.sendRedirect(request.getContextPath() + "/Supervivientes");

                break;
            case "filtrar":
                String genero = request.getParameter("filtrado");
                ArrayList<BSupervivientes> listasupervivientes2=supervivientesDao.listaFiltrada(genero);
                request.setAttribute("listasupervivientes",listasupervivientes2);
                view =request.getRequestDispatcher("Supervivientes.jsp");
                view.forward(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action") == null ? "listar" : request.getParameter("action");
        SupervivientesDao supervivientesDao = new SupervivientesDao();
        HumanoDao humanos = new HumanoDao();
        RequestDispatcher view;

        switch (action) {
            case "filtrar":
                String genero = request.getParameter("filtrado");
                ArrayList<BSupervivientes> listasupervivientes2=supervivientesDao.listaFiltrada(genero);
                request.setAttribute("listasupervivientes",listasupervivientes2);
                view =request.getRequestDispatcher("Supervivientes.jsp");
                view.forward(request,response);
                break;

            case "borrar":
                long id = Long.parseLong(request.getParameter("id"));
                System.out.println("aqui llegamos");
                supervivientesDao.delete(id);
                response.sendRedirect(request.getContextPath() + "/Supervivientes");

                break;
            case "listar":
                ArrayList<BSupervivientes> listasupervivientes= supervivientesDao.listaSupervivientes();
                ArrayList<String> listaGeneros = supervivientesDao.listaGeneros();
                request.setAttribute("listasupervivientes",listasupervivientes);
                request.setAttribute("listaGeneros",listaGeneros);
                view =request.getRequestDispatcher("Supervivientes.jsp");
                view.forward(request,response);
                break;

            case "añadir":
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String sexo = request.getParameter("sexo");
                String estado= "superviviente";
                String nombre2 = request.getParameter("nombre2");
                String apellido2 = request.getParameter("apellido2");
                String sexo2 = request.getParameter("sexo2");
                System.out.println(nombre2);
                double peso = Double.parseDouble(request.getParameter("peso"));
                int fuerza = Integer.parseInt(request.getParameter("fuerza"));
                BHumanos humano = new BHumanos(nombre,apellido, sexo, estado);
                BHumanos humano2 = new BHumanos(nombre2,apellido2, sexo2, estado);
                long id_numero1=humanos.crearHumano( humano);
                long id_numero2=humanos.crearHumano(humano2);
                double peso2 =0;
                int fuerza2 = 0;
                if(id_numero1!=0 && id_numero2!=0){
                    System.out.println("se creo");
                    boolean valor3=supervivientesDao.añadirSuperviviente(peso,fuerza, id_numero1, id_numero2);
                    boolean valor4=supervivientesDao.añadirSuperviviente(peso2,fuerza2,id_numero2,id_numero1);
                    if (valor3==true && valor4==true){
                        System.out.println("se creo");
                    }else{
                        System.out.println("no se creo");
                    }
                }else{
                    System.out.println("error");
                }

                response.sendRedirect(request.getContextPath() + "/Supervivientes");

                break;
            case "editar":
                try {
                    view = request.getRequestDispatcher("Supervivientes.jsp");
                    view.forward(request, response);
                } catch (Exception e) {
                    response.sendRedirect(request.getContextPath() + "/supervivientes?action=listar&resultado=exito1");
                }
                break;


        }
    }



}
