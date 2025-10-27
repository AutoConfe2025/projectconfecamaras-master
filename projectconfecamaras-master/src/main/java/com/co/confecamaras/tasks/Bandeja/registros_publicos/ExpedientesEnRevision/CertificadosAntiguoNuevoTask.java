package com.co.confecamaras.tasks.Bandeja.registros_publicos.ExpedientesEnRevision;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CertificadosAntiguoNuevoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AccionesPage.LINK_ACCION.of("Certificado antiguo formato")),
                LogEvent.recordevent(Reportes.PASSED,"Certificado antiguo"),
                AcceptAlert.aceptar(),
                GuardarArchivo.guardar(),
                Click.on(AccionesPage.LINK_ACCION.of("Certificado nuevo formato")),
                LogEvent.recordevent(Reportes.PASSED,"Certificado nuevo"),
                AcceptAlert.aceptar(),
                GuardarArchivo.guardar()
        );
    }

    public static CertificadosAntiguoNuevoTask certificados(){
        return new CertificadosAntiguoNuevoTask();
    }
}
