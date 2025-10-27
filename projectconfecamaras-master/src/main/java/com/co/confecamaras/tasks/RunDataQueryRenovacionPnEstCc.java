package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasRenovacionComercialComercial;
import com.co.confecamaras.database.QueryRenovacionPnEstCc;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataQueryRenovacionPnEstCc implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {

        QueryRenovacionPnEstCc queryDatabase = new QueryRenovacionPnEstCc();

        try {
            queryDatabase.buscarData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataQueryRenovacionPnEstCc query() {
        return instrumented(RunDataQueryRenovacionPnEstCc.class);
    }
}
