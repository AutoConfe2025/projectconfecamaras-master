package com.co.confecamaras.tasks.Bandeja.control_calidad;

import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.control_calidad.Page.*;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_VER_PDF;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MultiplePDF implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_REGRESAR, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(BOTON_REGRESAR),
                Click.on(BOTON_REGRESAR),
                WaitUntil.the(BOTON_VER_PDF, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(PDF_1),
                Click.on(PDF_1),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA),
                WaitUntil.the(BOTON_VER_PDF, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(PDF_2),
                Click.on(PDF_2),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA));
    }

    public static MultiplePDF multiple(){
        return new MultiplePDF();
    }
}
