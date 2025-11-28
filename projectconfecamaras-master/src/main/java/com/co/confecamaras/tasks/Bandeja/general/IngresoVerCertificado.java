package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.control_calidad.Page.BOTON_VER_CERTIFICADO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresoVerCertificado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_VER_CERTIFICADO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_VER_CERTIFICADO),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA)
        );
    }

    public static IngresoVerCertificado Validacertificado(){
        return new IngresoVerCertificado();
    }

}
