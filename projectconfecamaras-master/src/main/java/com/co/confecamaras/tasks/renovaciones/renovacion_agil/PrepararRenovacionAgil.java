package com.co.confecamaras.tasks.renovaciones.renovacion_agil;

import com.co.confecamaras.database.NuevasConexiones.ScriptRenovacionAgilDB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PrepararRenovacionAgil implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        ScriptRenovacionAgilDB script = new ScriptRenovacionAgilDB();
        script.ejecutarFlujoCompleto();

        System.out.println("🚀 Flujo completo ejecutado correctamente");
    }

    public static PrepararRenovacionAgil preparar() {
        return instrumented(PrepararRenovacionAgil.class);
    }
}