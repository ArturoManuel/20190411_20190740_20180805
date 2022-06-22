package com.example.zombies.Dao;

import com.example.zombies.Bean.BHumanos;
import com.example.zombies.Bean.BSupervivientes;
import com.example.zombies.Bean.BVariante;
import com.example.zombies.Bean.BVirus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VirusDao extends BaseDao{


    private String sql_select="SELECT v.idVirus as `Id Virus`, v.nombreVirus as `Virus`, va.idVariante as `Id Variante`, va.nombreVariante as `Variante`,\n" +
            " count(z.idVariante) as `Casos Encontrados`\n" +
            " FROM virus v inner join variantesdevirus va on (v.idVirus=va.idVirus)\n" +
            " left join zombies z on (z.idVariante = va.idVariante) \n" +
            " group by va.idVariante\n" +
            " order by va.idVariante\n" +
            " ;";

    public ArrayList<BVirus> listaVirus() {

        ArrayList<BVirus> litasvirus = new ArrayList<>();
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql_select);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println(rs);
                while (rs.next()) {
                    int id_virus = rs.getInt(1);
                    String nombre = rs.getString(2);
                    int id_variante = rs.getInt(3);
                    String variante_nombre = rs.getString(4);
                    int cantidad = rs.getInt(5);

                    BVariante variante = new BVariante(id_variante,variante_nombre);
                    BVirus virus = new BVirus(id_virus,nombre,variante,cantidad);
                    litasvirus.add(virus);
                    System.out.println("aqui");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return litasvirus;
    }


}
