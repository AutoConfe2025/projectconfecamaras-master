package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasRevisarCesacionEfectos;
import com.co.confecamaras.database.QueryConfecamarasRevisarCesacionEfectosDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryRevisarCesacionEfectosDos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasRevisarCesacionEfectosDos queryDatabase = new QueryConfecamarasRevisarCesacionEfectosDos();

        try {
            queryDatabase.buscarData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataBaseQueryRevisarCesacionEfectosDos query() {
        return instrumented(RunDataBaseQueryRevisarCesacionEfectosDos.class);
    }
}