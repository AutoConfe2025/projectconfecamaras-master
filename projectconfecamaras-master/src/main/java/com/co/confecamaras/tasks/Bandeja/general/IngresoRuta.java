package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresoRuta implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BOTON_VER_RUTA, isVisible()).forNoMoreThan(10).seconds()
        );

        if (BOTON_VER_RUTA.resolveFor(actor).isCurrentlyVisible()) {

            actor.attemptsTo(
                    Click.on(BOTON_VER_RUTA)
            );

        } else {

            actor.attemptsTo(
                    Click.on(BOTON_VER_RUTA_1)
            );
        }

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BOTON_VER_PDF, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(BOTON_VER_PDF),
                Click.on(BOTON_VER_PDF)
        );

        // 🔥 IMPORTANTE: controla mejor la descarga
        actor.attemptsTo(
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)
        );
    }

    public static IngresoRuta procesoRuta() {
        return new IngresoRuta();
    }
}
