package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasRenovacionComercialComercialDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryRenovacionComercialComercialDos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasRenovacionComercialComercialDos queryDatabase = new QueryConfecamarasRenovacionComercialComercialDos();

        try {
            queryDatabase.buscarData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataBaseQueryRenovacionComercialComercialDos query() {
        return instrumented(RunDataBaseQueryRenovacionComercialComercialDos.class);
    }
}