package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.cerrarpestana.CloseCurrentWindow;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.ReviosarAnexosLiquidacionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class RevisarAnexosLiquidacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUMERO_RECUPERACION,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUMERO_RECUPERACION),
                Enter.theValue("QRUO72").into(CAMPO_NUMERO_RECUPERACION),
                Click.on(BOTON_CARGAR_NUMERO_RECUPERACION),
                WaitUntil.the(BOTON_LIBRO_VER_PDF,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_LIBRO_VER_PDF),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)
        );
    }

    public static RevisarAnexosLiquidacion revisarAnexos(){
        return new RevisarAnexosLiquidacion();
    }
}
