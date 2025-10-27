package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasRenovacionComercialComercial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryRenovacionComercialComercial implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasRenovacionComercialComercial queryDatabase = new QueryConfecamarasRenovacionComercialComercial();

        try {
            queryDatabase.buscarData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataBaseQueryRenovacionComercialComercial query() {
        return instrumented(RunDataBaseQueryRenovacionComercialComercial.class);
    }
}