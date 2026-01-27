package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.registros_publicos.SoportesCajaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SoporteCaja implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUMERO_RECUPERACION,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUMERO_RECUPERACION),
                Enter.theValue("Z4OWYN").into(CAMPO_NUMERO_RECUPERACION),
                Click.on(BOTON_CONSULTAR_MY_BOTON),
                Scroll.to(BOTON_DESCARGAR),
                Click.on(BOTON_DESCARGAR),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA),
                Click.on(BOTON_DESCARGAR_2),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)
        );
    }

    public static SoporteCaja soporteCaja(){
        return new SoporteCaja();
    }
}
