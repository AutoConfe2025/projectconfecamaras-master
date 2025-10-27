package com.co.confecamaras.tasks.Bandeja.registros_publicos.ControlCalidad;

import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ControlCalidadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class RegresarEstudioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Regresar a Estudio")),
                WaitSeconds.seconds(1),
                GetTextOfElement.de(ControlCalidadPage.MSG_POUP),
                Click.on(AccionesPage.BTN_CANCELAR_F)
        );

    }

    public static RegresarEstudioTask estudio() {
        return new RegresarEstudioTask();
    }
}
