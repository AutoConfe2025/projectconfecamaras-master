package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasGestionUsuariosExternos;
import com.co.confecamaras.database.QueryConfecamarasRadicarActualizacionDatosMutacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryGestionUsuariosExternos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasGestionUsuariosExternos queryDatabase = new QueryConfecamarasGestionUsuariosExternos();

        try {
            queryDatabase.buscarData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataBaseQueryGestionUsuariosExternos query() {
        return instrumented(RunDataBaseQueryGestionUsuariosExternos.class);
    }
}