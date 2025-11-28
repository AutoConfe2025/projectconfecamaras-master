package com.co.confecamaras.tasks.Bandeja.solicitudes_nits;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
import com.co.confecamaras.interactions.cerrarpestana.CloseEmbeddedPdf;
import com.co.confecamaras.interactions.closepage.ClosePage;
import com.co.confecamaras.tasks.Bandeja.general.IngresarFormalizar;
import com.co.confecamaras.tasks.Bandeja.general.IngresarVerRespuestaRadicacion;
import com.co.confecamaras.tasks.Bandeja.general.IngresarVerXML;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.solicitud_nits.page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class ValidaPendientes implements Task {

    private final String fecha;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA),
                Enter.theValue(fecha).into(CAMPO_FECHA),
                WaitUntil.the(BOTON_PENDIENTES, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_PENDIENTES),
                IngresarVerXML.ValidaXML(),
                CloseEmbeddedPdf.now(),
                IngresarVerRespuestaRadicacion.validaRadicacion(),
                CloseEmbeddedPdf.now(),
                SwitchToNewWindow.switchToNewTab()
        );
    }

    public static ValidaPendientes ValidaPendientes(String fecha) {
        return new ValidaPendientes(fecha);
    }
}
