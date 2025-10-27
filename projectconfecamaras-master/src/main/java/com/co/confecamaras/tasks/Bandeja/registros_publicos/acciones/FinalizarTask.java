package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;

import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.Assert;

public class FinalizarTask implements Task {
    private final String accion;
    private final String confirmacion;
    private final String codigo_barras;

    public FinalizarTask(String accion, String confirmacion, String codigo_barras) {
        this.accion = accion;
        this.confirmacion = confirmacion.toUpperCase();
        this.codigo_barras = codigo_barras.toUpperCase();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(AccionesPage.LINK_ACCION.of(accion)),
                Click.on(AccionesPage.LINK_ACCION.of(accion)),
                WaitInteractions.untilAppears(AccionesPage.MSG_POPUP),
                GetTextOfElement.de(AccionesPage.MSG_POPUP),
                WaitSeconds.seconds(1),
                GetTextOfElement.de(AccionesPage.MSG_POPUP_FINALIZAR.of(codigo_barras))
        );
        if (confirmacion.equals("CONTINUARA")) {
            actor.attemptsTo(Click.on(AccionesPage.BTN_CONTINUAR_F));
            Reportes.reportEvent(Reportes.PASSED, "Se ha continuado la finalizacion del tramite");
        } else if (confirmacion.equals("CANCELARA")) {
            actor.attemptsTo(Click.on(AccionesPage.BTN_CANCELAR_F));
            Reportes.reportEvent(Reportes.PASSED, "Se ha cancelado la finalizacion del tramite");
        } else {
            Reportes.reportEvent(Reportes.FAILED, "No coincide ninguna de las respuestas");
            actor.attemptsTo(Click.on(AccionesPage.BTN_CERRAR_POPUP));
            Assert.fail("No coincide ninguna de las respuestas");
        }
    }

    public static FinalizarTask finalizar(String accion, String confirmacion, String codigo_barras) {
        return new FinalizarTask(accion, confirmacion, codigo_barras);
    }
}
