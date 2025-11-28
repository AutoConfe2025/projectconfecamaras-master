package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.Bandejas.espedientes_revision.page.*;

public class IngresoCertificadoAntiguo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CERTIFICADO_ANTIGUO),
                AceptAlert.aceptar(),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA)
        );
    }

    public static IngresoCertificadoAntiguo CertificadoAntiguo(){
        return new IngresoCertificadoAntiguo();
    }
}
