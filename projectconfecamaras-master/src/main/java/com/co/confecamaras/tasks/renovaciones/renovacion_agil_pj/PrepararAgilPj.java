package com.co.confecamaras.tasks.renovaciones.renovacion_agil_pj;

import com.co.confecamaras.database.NuevasConexiones.ScriptRenovacionAgilEsadlDB;
import com.co.confecamaras.database.NuevasConexiones.ScriptRenovacionAgilPj;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PrepararAgilPj implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ScriptRenovacionAgilPj script =
                new ScriptRenovacionAgilPj();

        String numid = script.ejecutarFlujoCompleto();

        actor.remember("numid", numid);

        System.out.println("🆔 NUMID GUARDADO EN ACTOR: " + numid);

    }

    public static PrepararAgilPj prepararBD(){
        return instrumented(PrepararAgilPj.class);
    }
}
