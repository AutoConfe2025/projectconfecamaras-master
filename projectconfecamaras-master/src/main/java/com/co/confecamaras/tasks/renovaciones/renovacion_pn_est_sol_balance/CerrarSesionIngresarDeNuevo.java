package com.co.confecamaras.tasks.renovaciones.renovacion_pn_est_sol_balance;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstSolBalancePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class CerrarSesionIngresarDeNuevo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_CERRAR_DATOS_USUARIO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_DATOS_USUARIO),
                WaitUntil.the(BOTON_CERRAR_SESION_SALIR,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_SESION_SALIR)
        );
    }

    public static CerrarSesionIngresarDeNuevo cierraSesion(){
        return instrumented(CerrarSesionIngresarDeNuevo.class);
    }
}
