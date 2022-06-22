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

    private String sql_select="SELECT h.nombre as `Nombre`, h.apellido as `Apellido`, h.sexo as `Sexo`, h.numeroId as `ID` ,  \n" +
            "DATEDIFF(now(),z.tiempoDeInfeccion) as `Tiempo Infectado en horas`, va.nombreVariante as `Variante de Virus`, z.numeroVictimas as `Nro de Victimas`, z.tipo as `Tipo de Zombie`\n" +
            "FROM humanos h inner join zombies z on (h.numeroId=z.numeroId)\n" +
            "inner join variantesdevirus va on (va.idVariante = z.idVariante) \n" +
            "group by h.numeroId;\n" +
            ";";

    public ArrayList<BZombies> listasZombies(){
        ArrayList<BZombies> litazombies=new ArrayList<>();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_select);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println(rs);
                while (rs.next()) {
                    String nombre = rs.getString(1);
                    String apellido = rs.getString(2);
                    String sexo = rs.getString(3);
                    long numeroid=rs.getLong(4);
                    int tiempo= rs.getInt(5);
                    String variante_nombre = rs.getString(6);
                    int victimas= rs.getInt(7);
                    String tipo_zombie = rs.getString(8);

                    BVariante variante = new BVariante(variante_nombre);
                    BHumanos humano= new BHumanos(numeroid,nombre,apellido,sexo);
                    BZombies zombies = new  BZombies(humano,tiempo,variante,victimas,tipo_zombie);

                    litazombies.add(zombies);
                    System.out.println(zombies.getTiempo_infectados());
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return litazombies;
    }

}
