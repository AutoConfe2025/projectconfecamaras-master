package com.co.confecamaras.database.Bandeja;

import com.co.confecamaras.tasks.RunDataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.co.confecamaras.models.DataBase.getCon;

public class QueryDigitacionRegEsadlCambiarEstadoCodBarras implements Task {
    private final String codigo_barras;

    public QueryDigitacionRegEsadlCambiarEstadoCodBarras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
            Connection con = getCon();
            Statement smtDoc = con.createStatement();
            // Digitación de trámites del registro mercantil
            String queryDoc = "UPDATE sii_manizales.mreg_est_codigosbarras\n" +
                    "SET estadofinal='23'\n" +
                    "WHERE codigobarras = '" + codigo_barras + "';";
            smtDoc.execute(queryDoc);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static QueryDigitacionRegEsadlCambiarEstadoCodBarras cambiarEstado(String codigo_barras) {
        return new QueryDigitacionRegEsadlCambiarEstadoCodBarras(codigo_barras);
    }
}
