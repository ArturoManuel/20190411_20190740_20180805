package com.example.zombies.Dao;

import com.example.zombies.Bean.BHumanos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HumanoDao extends BaseDao{

    private static String sql_inset="insert into humanos (numeroId,nombre,apellido,estado,sexo) values (?,?,?,?,?);";
    private static String sql_select="select numeroId,nombre,apellido,estado,sexo from humanos;";
    public  ArrayList<BHumanos> listaHumanos(){
        ArrayList<BHumanos> listaHumanos=new ArrayList<>();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_select);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println(rs);
                while (rs.next()) {
                    BHumanos humanos = new BHumanos();
                    humanos.setNumero_identificación(rs.getLong(1));
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



    public  long crearHumano(BHumanos humanos) {

        long numero_id;
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_inset);) {
            numero_id = (long) (1e9 + Math.random() * 9 * 1e9);
            pstmt.setLong(1, numero_id);
            pstmt.setString(2, humanos.getNombre());
            pstmt.setString(3, humanos.getApellido());
            pstmt.setString(4, humanos.getEstado());
            pstmt.setString(5, humanos.getSexo());
            System.out.println("aqui");
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
        return numero_id;
    }




}
