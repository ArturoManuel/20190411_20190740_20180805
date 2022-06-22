package com.example.zombies.Dao;


import com.example.zombies.Bean.BHumanos;
import com.example.zombies.Bean.BSupervivientes;
import com.example.zombies.Bean.BZombies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class SupervivientesDao extends BaseDao{

    private String sql_select="SELECT h.numeroId as `ID` , h.nombre as `Nombre`, h.apellido as `Apellido`, h.sexo as `Sexo`," +
            "s.peso as `Peso`, s.fuerza as `Fuerza`, " +
            "(select nombre from humanos where numeroId=s.idPareja) as `Nombre de Pareja`, " +
            "(select apellido from humanos where numeroId=s.idPareja) as `Apellido de Pareja`, " +
            "(sum(o.peso * o.cantidad)) as `Peso Cargado`" +
            "FROM humanos h inner join supervivientes s on (h.numeroId=s.numeroId)" +
            "inner join objetos o on (o.numeroId=s.numeroId) group by h.numeroId;";

    public ArrayList<BSupervivientes> listaSupervivientes(){
        ArrayList<BSupervivientes> litasupervivientes=new ArrayList<>();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_select);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println(rs);
                while (rs.next()) {
                    long numeroid= rs.getLong(1);
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    String sexo = rs.getString(4);
                    double peso = rs.getDouble(5);
                    int fuerza = rs.getInt(6);
                    String nombre_pareja = rs.getString(7);
                    String apellido_pareja = rs.getString(8);
                    double pesocargado=rs.getDouble(9);
                    System.out.println(pesocargado);

                    BHumanos humano= new BHumanos(numeroid,nombre,apellido,sexo);
                    BHumanos pareja = new BHumanos(nombre_pareja,apellido_pareja);

                    BSupervivientes supervivientes = new BSupervivientes(peso,fuerza,humano,pareja,pesocargado);

                    litasupervivientes.add(supervivientes);
                    System.out.println(supervivientes.getPeso_cargado());
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return litasupervivientes;
    }


}
