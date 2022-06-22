package com.example.zombies.Dao;


import com.example.zombies.Bean.BHumanos;
import com.example.zombies.Bean.BSupervivientes;
import com.example.zombies.Bean.BZombies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class SupervivientesDao extends BaseDao {

    private String sql_select = "SELECT h.numeroId as `ID` , h.nombre as `Nombre`, h.apellido as `Apellido`, h.sexo as `Sexo`," +
            "s.peso as `Peso`, s.fuerza as `Fuerza`, " +
            "(select nombre from humanos where numeroId=s.idPareja) as `Nombre de Pareja`, " +
            "(select apellido from humanos where numeroId=s.idPareja) as `Apellido de Pareja`, " +
            "(sum(o.peso * o.cantidad)) as `Peso Cargado`" +
            "FROM humanos h inner join supervivientes s on (h.numeroId=s.numeroId)" +
            "left join objetos o on (o.numeroId=s.numeroId) group by h.numeroId;";

    private String sql_añadir_superviviente= "INSERT into supervivientes (peso, fuerza, idPareja, numeroId) VALUES (?,?,?,?)";

    private String sql_filtro=" SELECT h.numeroId as `ID` , h.nombre as `Nombre`, h.apellido as `Apellido`, h.sexo as `Sexo`,\n" +
            " s.peso as `Peso`, s.fuerza as `Fuerza`, \n" +
            " (select nombre from humanos where numeroId=s.idPareja) as `Nombre de Pareja`,\n" +
            " (select apellido from humanos where numeroId=s.idPareja) as `Apellido de Pareja`,\n" +
            " (sum(o.peso * o.cantidad)) as `Peso Cargado`\n" +
            " FROM humanos h inner join supervivientes s on (h.numeroId=s.numeroId)\n" +
            " left join objetos o on (o.numeroId=s.numeroId)\n" +
            "  where h.sexo = ? \n" +
            " group by h.numeroId;\n" +
            " ;";
    private String sql_delete="DELETE from supervivientes where numeroId = ?;";

    private String sql_update="Update objetos set numeroId=null where numeroId = ?;";

    private String sql_update2="Update supervivientes set idPareja = null\n" +
            "\twhere idPareja = ?;";


    public boolean update2(long id2){
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_update2);) {
            pstmt.setDouble(1, id2);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update(long id2){
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_update);) {
            pstmt.setDouble(1, id2);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public ArrayList<BSupervivientes> listaSupervivientes() {
        ArrayList<BSupervivientes> litasupervivientes = new ArrayList<>();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_select);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println(rs);
                while (rs.next()) {
                    long numeroid = rs.getLong(1);
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    String sexo = rs.getString(4);
                    double peso = rs.getDouble(5);
                    int fuerza = rs.getInt(6);
                    String nombre_pareja = rs.getString(7);
                    String apellido_pareja = rs.getString(8);
                    double pesocargado = rs.getDouble(9);
                    System.out.println(pesocargado);

                    BHumanos humano = new BHumanos(numeroid, nombre, apellido, sexo);
                    BHumanos pareja = new BHumanos(nombre_pareja, apellido_pareja);

                    BSupervivientes supervivientes = new BSupervivientes(peso, fuerza, humano, pareja, pesocargado);

                    litasupervivientes.add(supervivientes);
                    System.out.println(supervivientes.getPeso_cargado());
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return litasupervivientes;
    }


    public boolean añadirSuperviviente(double peso, int fuerza , long id,long id2){
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_añadir_superviviente);) {

            pstmt.setDouble(1, peso);
            pstmt.setInt(2, fuerza);
            pstmt.setLong(3, id);
            System.out.println(id);
            pstmt.setLong(4,id2);
            System.out.println(id2);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean delete(long id2){
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_delete);) {
            pstmt.setDouble(1, id2);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }



    public ArrayList<BSupervivientes> listaFiltrada(String genero) {
        ArrayList<BSupervivientes> listafiltro= new ArrayList<>();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_filtro);) {
            pstmt.setString(1,genero);
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println(rs);
                while (rs.next()) {
                    long numeroid = rs.getLong(1);
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    String sexo = rs.getString(4);
                    double peso = rs.getDouble(5);
                    int fuerza = rs.getInt(6);
                    String nombre_pareja = rs.getString(7);
                    String apellido_pareja = rs.getString(8);
                    double pesocargado = rs.getDouble(9);
                    System.out.println(pesocargado);

                    BHumanos humano = new BHumanos(numeroid, nombre, apellido, sexo);
                    BHumanos pareja = new BHumanos(nombre_pareja, apellido_pareja);

                    BSupervivientes supervivientes = new BSupervivientes(peso, fuerza, humano, pareja, pesocargado);
                    listafiltro.add(supervivientes);
                    System.out.println(supervivientes.getPeso_cargado());
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listafiltro;
    }






    public ArrayList<String> listaGeneros (){
        ArrayList<String> listaGeneros = new ArrayList<>();
        listaGeneros.add("M");
        listaGeneros.add("F");

        return  listaGeneros;
    }

}
