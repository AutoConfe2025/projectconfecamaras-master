package com.co.confecamaras.database.Bandeja;

import com.co.confecamaras.tasks.RunDataBase;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.co.confecamaras.models.DataBase.getCon;

@AllArgsConstructor
public class QueryCambioEstadoArchivar implements Task {

    private final String codigo_barras;
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
            Connection con = getCon();
            Statement smtDoc = con.createStatement();
            String queryDoc = "UPDATE sii_manizales.mreg_est_codigosbarras\n" +
                    "SET estadofinal='11'\n" +
                    "WHERE codigobarras = '" + codigo_barras + "';";
            smtDoc.execute(queryDoc);
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static QueryCambioEstadoArchivar cambioEstado11(String codigo_barras){
        return new QueryCambioEstadoArchivar(codigo_barras);
    }
}
