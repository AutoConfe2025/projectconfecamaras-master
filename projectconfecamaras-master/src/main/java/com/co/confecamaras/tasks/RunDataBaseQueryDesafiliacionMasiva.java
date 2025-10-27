package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasDesafiliacionMasiva;
import com.co.confecamaras.database.QueryConfecamarasRevisarCesacionEfectos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryDesafiliacionMasiva implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasDesafiliacionMasiva queryDatabase = new QueryConfecamarasDesafiliacionMasiva();

        try {
            queryDatabase.buscarData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataBaseQueryDesafiliacionMasiva query() {
        return instrumented(RunDataBaseQueryDesafiliacionMasiva.class);
    }
}