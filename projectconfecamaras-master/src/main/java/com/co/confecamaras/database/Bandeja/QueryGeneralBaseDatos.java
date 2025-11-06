package com.co.confecamaras.database.Bandeja;

import com.co.confecamaras.tasks.RunDataBase;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.co.confecamaras.models.DataBase.getCon;

@AllArgsConstructor
public class QueryGeneralBaseDatos implements Task {

    private final String codigoBarras;
    private final String estadoFinal;
    private final String base;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
            Connection con = getCon();

            String query = "UPDATE " + base + ".mreg_est_codigosbarras " +
                    "SET estadofinal = ? " +
                    "WHERE codigobarras = ?";

            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, estadoFinal);
            stmt.setString(2, codigoBarras);

            stmt.executeUpdate();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ✅ Método para usarlo como quieres: cambiarEstado(codigo, estado)
    public static QueryGeneralBaseDatos cambiarEstado(String codigoBarras, String estadoFinal) {
        String basePorDefecto = "sii_manizales";
        return new QueryGeneralBaseDatos(codigoBarras, estadoFinal, basePorDefecto);
    }

    // ✅ Método opcional para pasar también la base
    public static QueryGeneralBaseDatos cambiarEstado(String codigoBarras, String estadoFinal, String base) {
        return new QueryGeneralBaseDatos(codigoBarras, estadoFinal, base);
    }
}
