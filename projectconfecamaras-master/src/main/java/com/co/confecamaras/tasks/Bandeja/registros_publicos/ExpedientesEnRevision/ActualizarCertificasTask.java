package com.co.confecamaras.tasks.Bandeja.registros_publicos.ExpedientesEnRevision;

import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBack;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ExpedientesEnRevisionPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

public class ActualizarCertificasTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String texto_prueba = "AUTOMATIZACION TEST";
        actor.attemptsTo(
                Click.on(AccionesPage.LINK_ACCION.of("Actualizar certificas")),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.PASSED, "Actualizar certificadas"),
                WaitSeconds.seconds(1),
                Click.on(ExpedientesEnRevisionPage.LINK_EDIT_CERTIFICAS.of("0020")),
                Switch.toFrame(0),
                Enter.theValue(texto_prueba).into(ExpedientesEnRevisionPage.INP_NUEVA_INFORMACION),
                Switch.toDefaultContext(),
                LogEvent.recordevent(Reportes.INFO, "Nuevo texto ingresado: " + texto_prueba),
                Click.on(ExpedientesEnRevisionPage.LINK_GRABAR),
                WaitSeconds.seconds(2),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack()
        );
    }

    public static ActualizarCertificasTask actualizar() {
        return new ActualizarCertificasTask();
    }
}
