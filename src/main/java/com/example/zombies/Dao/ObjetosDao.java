package com.example.zombies.Dao;

import com.example.zombies.Bean.BHumanos;
import com.example.zombies.Bean.BSupervivientes;
import com.example.zombies.Bean.BObjetos;

import java.sql.*;
import java.util.ArrayList;

public class ObjetosDao extends BaseDao{


    private String sql_select=" SELECT nombre as `Nombre`, cantidad as `Cantidad`, peso as `Peso`, esVacuna as `¿Es Vacuna?`\n" +
            " from objetos;";


    public ArrayList<BObjetos> listaObjetos() {

        ArrayList<BObjetos> litasobjetos = new ArrayList<>();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_select);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println(rs);
                while (rs.next()) {
                    String nombre = rs.getString(1);
                    int cantidad = rs.getInt(2);
                    int peso = rs.getInt(3);
                    String tipo = rs.getString(4);

                    BObjetos objeto = new BObjetos(nombre,cantidad,peso,tipo);
                    litasobjetos.add(objeto);
                    System.out.println("aqui");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return litasobjetos;
    }






}
