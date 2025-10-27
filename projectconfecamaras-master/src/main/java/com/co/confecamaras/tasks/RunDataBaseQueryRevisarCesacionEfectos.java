package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasGestionUsuariosExternos;
import com.co.confecamaras.database.QueryConfecamarasRevisarCesacionEfectos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryRevisarCesacionEfectos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasRevisarCesacionEfectos queryDatabase = new QueryConfecamarasRevisarCesacionEfectos();

        try {
            queryDatabase.buscarData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataBaseQueryRevisarCesacionEfectos query() {
        return instrumented(RunDataBaseQueryRevisarCesacionEfectos.class);
    }
}