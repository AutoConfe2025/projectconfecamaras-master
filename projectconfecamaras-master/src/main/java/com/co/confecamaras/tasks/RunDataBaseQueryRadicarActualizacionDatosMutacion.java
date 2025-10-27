package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasRadicarActualizacionDatosMutacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryRadicarActualizacionDatosMutacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasRadicarActualizacionDatosMutacion queryDatabase = new QueryConfecamarasRadicarActualizacionDatosMutacion();

        try {
            queryDatabase.buscarData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataBaseQueryRadicarActualizacionDatosMutacion query() {
        return instrumented(RunDataBaseQueryRadicarActualizacionDatosMutacion.class);
    }
}