package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.RecibosCaja;

import static com.co.confecamaras.userinterfaces.MenuSistema.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoRecibosCaja implements Task {

    private final String numeroRecibo;

    public DoRecibosCaja(String numeroRecibo){
        this.numeroRecibo = numeroRecibo;
    }

    public static Performable recibosCaja(String numeroRecibo){
        return instrumented(DoRecibosCaja.class, numeroRecibo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                Enter.theValue("Recibos").into(MenuSistema.BUSQUEDA_INPUT),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Click.on(RecibosCaja.NUMERO_RECIBO_INPUT),
                Enter.theValue(numeroRecibo).into(RecibosCaja.NUMERO_RECIBO_INPUT),
                Click.on(RecibosCaja.CONTINUAR_BTN)
        );
    }

}
