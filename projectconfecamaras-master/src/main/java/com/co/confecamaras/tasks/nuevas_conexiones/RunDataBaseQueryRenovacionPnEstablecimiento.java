package com.co.confecamaras.tasks.nuevas_conexiones;

import com.co.confecamaras.database.NuevasConexiones.QueryConfecamarasRenovacionPnEstablecimiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryRenovacionPnEstablecimiento implements Task {

    private final String sql;

    public RunDataBaseQueryRenovacionPnEstablecimiento(String sql) {
        this.sql = sql;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasRenovacionPnEstablecimiento query =
                new QueryConfecamarasRenovacionPnEstablecimiento();

        String matricula = query.buscarMatricula(sql);

        actor.remember("matriculaPnEstablecimiento", matricula);

        System.out.println("Matrícula obtenida desde BD: " + matricula);
    }

    public static RunDataBaseQueryRenovacionPnEstablecimiento query(String sql) {
        return instrumented(
                RunDataBaseQueryRenovacionPnEstablecimiento.class,
                sql
        );
    }
}

