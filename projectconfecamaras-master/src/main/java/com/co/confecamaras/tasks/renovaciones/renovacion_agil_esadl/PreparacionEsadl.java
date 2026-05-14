package com.co.confecamaras.tasks.renovaciones.renovacion_agil_esadl;

import com.co.confecamaras.database.NuevasConexiones.ScriptRenovacionAgilEsadlDB;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PreparacionEsadl implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        ScriptRenovacionAgilEsadlDB script =
                new ScriptRenovacionAgilEsadlDB();

        String numid = script.ejecutarFlujoCompleto();

        actor.remember("numid", numid);

        System.out.println("🆔 NUMID GUARDADO EN ACTOR: " + numid);
    }

    public static PreparacionEsadl preparar() {
        return instrumented(PreparacionEsadl.class);
    }
}