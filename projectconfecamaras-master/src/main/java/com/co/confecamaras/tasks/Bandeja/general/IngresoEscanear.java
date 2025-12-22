package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.tramites_reingresados.page.BOTON_ESCANEAR;
import static com.co.confecamaras.userinterfaces.Bandejas.tramites_reingresados.page.BOTON_VER_RECIBO_CAJA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresoEscanear implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ESCANEAR),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BOTON_VER_RECIBO_CAJA, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_VER_RECIBO_CAJA),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)
        );
    }

    public static IngresoEscanear Escanear(){
        return new IngresoEscanear();
    }
}
