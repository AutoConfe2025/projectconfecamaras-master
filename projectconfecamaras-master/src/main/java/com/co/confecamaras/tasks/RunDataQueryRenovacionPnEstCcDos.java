package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasRenovacionComercialComercialDos;
import com.co.confecamaras.database.QueryRenovacionPnEstCcDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataQueryRenovacionPnEstCcDos implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {

        QueryRenovacionPnEstCcDos queryDatabase = new QueryRenovacionPnEstCcDos();

        try {
            queryDatabase.buscarData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataQueryRenovacionPnEstCcDos query() {
        return instrumented(RunDataQueryRenovacionPnEstCcDos.class);
    }
}
