package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.CertificadosPendientesPage;
import com.co.confecamaras.utils.News.Acciones.TypeKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class CertificadosPendientesTask implements Task {
    private final String recibo;

    public CertificadosPendientesTask(String recibo) {
        this.recibo = recibo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(CertificadosPendientesPage.INP_RECIBO),
                Enter.theValue(recibo).into(CertificadosPendientesPage.INP_RECIBO),
                PressKey.press(TypeKey.TAB),
                WaitSeconds.seconds(4),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Archivar")),
                AcceptAlert.aceptar(),
                GetTextOfElement.de(CertificadosPendientesPage.TXT_INFORMACION),
                Click.on(CertificadosPendientesPage.LINK_REGRESAR),
                CloseCurrentWindowAndSwitchBackHome.closeAndSwitchBackHome()
        );
    }
    public static CertificadosPendientesTask certificado(String recibo){
        return new CertificadosPendientesTask(recibo);
    }
}
