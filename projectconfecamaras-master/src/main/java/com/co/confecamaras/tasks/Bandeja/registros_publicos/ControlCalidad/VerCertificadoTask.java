package com.co.confecamaras.tasks.Bandeja.registros_publicos.ControlCalidad;

import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class VerCertificadoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Ver certificado")),
                GuardarArchivo.guardar()
        );
    }

    public static VerCertificadoTask certificado(){
        return new VerCertificadoTask();
    }
}
