package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.Bandejas.Administracion.AdminPage.*;


public class TYCTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Click.on(ENLACE_EDITAR_TRANSACCION),
                WaitSeconds.seconds(2),
                Scroll.to(CAMPO_ENLACE),
                Enter.theValue("QA").into(CAMPO_ENLACE),
                Scroll.to(BOTON_CONTINUAR_TRANSACCION),
                Click.on(BOTON_CONTINUAR_TRANSACCION),
                WaitSeconds.seconds(2),

                Click.on(BOTON_OK_MODAL_PRINCIPAL),
                WaitInteractions.untilDisappears(BOTON_OK_MODAL_PRINCIPAL),
                Scroll.to(CAMPO_ENLACE),
                Enter.theValue("").into(CAMPO_ENLACE),
                Click.on(BOTON_CONTINUAR_TRANSACCION)



        );
        actor.attemptsTo(
                Click.on(PRIMER_ENLACE_BORRAR),
                WaitSeconds.seconds(2),
                Click.on(BOTON_CANCELAR_MODAL),
                WaitSeconds.seconds(2)

        );

    }

    public static TYCTask administracion() {
        return new TYCTask();
    }
}