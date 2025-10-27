package com.co.confecamaras.tasks.Bandeja.registros_publicos.ControlCalidad;

import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ControlCalidadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmarTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AccionesPage.LINK_ACCION.of("Confirmar")),
                WaitSeconds.seconds(1),
                GetTextOfElement.de(ControlCalidadPage.MSG_POUP),
                Click.on(AccionesPage.BTN_CANCELAR_F)
        );
    }

    public static ConfirmarTask confirmar(){
        return new ConfirmarTask();
    }
}
