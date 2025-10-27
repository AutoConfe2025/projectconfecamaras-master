package com.co.confecamaras.database.Bandeja;

import com.co.confecamaras.tasks.RunDataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.co.confecamaras.models.DataBase.getCon;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class QueryConfecamarasCambiarEstadoCodBarras implements Task {
    public static QueryConfecamarasCambiarEstadoCodBarras CambiarEstado() {
        return new QueryConfecamarasCambiarEstadoCodBarras();
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        try {
            actor.attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
            Connection con = getCon();
            Statement smtDoc = con.createStatement();
            String queryDoc = "UPDATE sii_manizales.mreg_est_codigosbarras\n" +
                    "SET estadofinal='01'\n" +
                    "WHERE codigobarras IN ('13241131','13241857','698079')";
            smtDoc.execute(queryDoc);
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
