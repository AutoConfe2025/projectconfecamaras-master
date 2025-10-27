package com.co.confecamaras.tasks.DataBase;

import com.co.confecamaras.database.QueryCortesRenovacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryCortesRenovacion implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {

        QueryCortesRenovacion queryDatabase = new QueryCortesRenovacion();

        try {
            queryDatabase.buscarData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataBaseQueryCortesRenovacion query() {
        return instrumented(RunDataBaseQueryCortesRenovacion.class);
    }
}
