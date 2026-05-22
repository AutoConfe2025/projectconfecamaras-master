package com.co.confecamaras.tasks.renovaciones.renovacion_pn_est_sol_balance;

import com.co.confecamaras.interactions.CloseSecondTab;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstSolBalancePage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstSolBalancePage.BOTON_CERRAR_GRABAR_PARAMETROS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ActualizarCommoXxNo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PARAMETRO_SOL_BALANCE_CAJEROS_TODAS).andAlignToBottom(),
                SelectFromOptions.byValue("N").from(PARAMETRO_SOL_BALANCE_CAJEROS_TODAS),
                Scroll.to(BOTON_GRABAR_PARAMETROS).andAlignToTop(),
                Click.on(BOTON_GRABAR_PARAMETROS),
                WaitUntil.the(BOTON_CERRAR_GRABAR_PARAMETROS, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_GRABAR_PARAMETROS)
        );
    }

    public static ActualizarCommoXxNo ActualizarNo(){
        return instrumented(ActualizarCommoXxNo.class);
    }
}
