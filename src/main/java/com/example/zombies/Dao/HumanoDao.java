package com.example.zombies.Dao;

import com.example.zombies.Bean.BHumanos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HumanoDao extends BaseDao{

    private static String sql_inset="insert into humanos (numeroId,nombre,apellido,estado,numeroIdo,sexo) values (?,?,?,?,?);";
    private static String sql_select="select * from humanos;";



    public  ArrayList<BHumanos> listaParticipantes(){
        ArrayList<BHumanos> listaHumanos=new ArrayList<>();
        BHumanos humanos = new BHumanos();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_select);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    humanos.setNumero_identificación(rs.getInt(1));
                    humanos.setNombre(rs.getString(2));
                    humanos.setApellido(rs.getString(3));
                    humanos.setEstado(rs.getString(4));
                    humanos.setSexo(rs.getString(5));
                    listaHumanos.add(humanos);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return listaHumanos;
    }



    public  boolean crearHumano(BHumanos humanos) {

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_inset);) {
            pstmt.setInt(1,humanos.getNumero_identificación());
            pstmt.setString(2,humanos.getNombre());
            pstmt.setString(3,humanos.getApellido());
            pstmt.setString(4,humanos.getEstado());
            pstmt.setString(5,humanos.getSexo());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


}
