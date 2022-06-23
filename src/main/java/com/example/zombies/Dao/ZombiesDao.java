package com.example.zombies.Dao;

import com.example.zombies.Bean.BHumanos;
import com.example.zombies.Bean.BSupervivientes;
import com.example.zombies.Bean.BVariante;
import com.example.zombies.Bean.BZombies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZombiesDao extends BaseDao {

    private String sql_select = "SELECT h.nombre as `Nombre`, h.apellido as `Apellido`, h.sexo as `Sexo`, h.numeroId as `ID` ,  \n" +
            "DATEDIFF(now(),z.tiempoDeInfeccion) as `Tiempo Infectado en horas`, va.nombreVariante as `Variante de Virus`, z.numeroVictimas as `Nro de Victimas`, z.tipo as `Tipo de Zombie`\n" +
            "FROM humanos h inner join zombies z on (h.numeroId=z.numeroId)\n" +
            "inner join variantesdevirus va on (va.idVariante = z.idVariante) \n" +
            "group by h.numeroId;\n" +
            ";";
    private String sqr_select2 = "select tipo, (sum(numeroVictimas)/(select count(*)from zombies where tipo = ?)) from zombies where tipo =?;";

    private String sql_select3="select h.sexo as `Sexo`, (count(z.numeroId)/(select count(*)from zombies)) as " +
            "`Porcentaje del total` \n" +
            "from zombies z inner join humanos h on z.numeroId = h.numeroId group by h.sexo;";

    public ArrayList<BZombies> listasZombies() {
        ArrayList<BZombies> litazombies = new ArrayList<>();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_select);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println(rs);
                while (rs.next()) {
                    String nombre = rs.getString(1);
                    String apellido = rs.getString(2);
                    String sexo = rs.getString(3);
                    long numeroid = rs.getLong(4);
                    int tiempo = rs.getInt(5);
                    String variante_nombre = rs.getString(6);
                    int victimas = rs.getInt(7);
                    String tipo_zombie = rs.getString(8);

                    BVariante variante = new BVariante(variante_nombre);
                    BHumanos humano = new BHumanos(numeroid, nombre, apellido, sexo);
                    BZombies zombies = new BZombies(humano, tiempo, variante, victimas, tipo_zombie);

                    litazombies.add(zombies);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return litazombies;
    }

    public ArrayList<BZombies> promedio_por_tipo() {
        ArrayList<BZombies> litapromedio= new ArrayList<>();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sqr_select2);) {
            for (String tipo : this.listaTipos()){
                pstmt.setString(1, tipo);
                pstmt.setString(2, tipo);
                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()){
                        String tipo2 = rs.getString(1);
                        double promedio = rs.getDouble(2);
                        BZombies bZombies = new BZombies(tipo2,promedio);
                        litapromedio.add(bZombies);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return litapromedio;
    }


    public ArrayList<BZombies> listasZombiesgenero() {
        ArrayList<BZombies> litaszombiesgenero = new ArrayList<>();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_select3);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println(rs);
                while (rs.next()) {
                  String sexo =rs.getString(1);
                  double promedio=rs.getDouble(2);

                  BHumanos bHumanos = new BHumanos(sexo);
                  BZombies bZombies = new BZombies(bHumanos,promedio);
                  litaszombiesgenero.add(bZombies);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return litaszombiesgenero;
    }

    public ArrayList<String> listaTipos (){
        ArrayList<String> listatipos = new ArrayList<>();
        listatipos.add("demoledor");
        listatipos.add("rapido");
        listatipos.add("niño");
        listatipos.add("otro");


        return  listatipos;
    }

}
