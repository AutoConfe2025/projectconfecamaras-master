package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.LoginSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.co.confecamaras.userinterfaces.CerrarCaja;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.Modals;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.co.confecamaras.userinterfaces.MenuSistema.*;

public class DoCerrarCaja implements Task {

    private final String valor;

    public DoCerrarCaja(String valor){
        this.valor = valor;
    }

    public static Performable cerrarCaja(String valor){
        return instrumented(DoCerrarCaja.class, valor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue("Cerrar Caja").into(MenuSistema.BUSQUEDA_INPUT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(SELECCIONAR_OPT),
                Click.on(CerrarCaja.VALOR_RECAUDADO_INPUT),
                Enter.theValue(valor).into(CerrarCaja.VALOR_RECAUDADO_INPUT),
                Click.on(CerrarCaja.GENERAR_BTN),
                Click.on(Modals.SI_BTN),
                WaitUntil.the(Modals.SI_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(Modals.SI_BTN)
        );
    }
}