package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.ResumenIngresoPorFechaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoResumenIngresoPorFecha implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FECHA_INI,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(FECHA_INI),
                Enter.theValue("2025-12-01").into(FECHA_INI),
                Click.on(FECHA_INI),
                Click.on(FECHA_FIN),
                Enter.theValue("2025-12-01").into(FECHA_FIN),
                Click.on(FECHA_FIN),
                Click.on(BOTON_CONSULTAR_POR_SEDE_FECHA),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA)
        );
    }

    public static FlujoResumenIngresoPorFecha FlujoSedeYFecha(){
        return new FlujoResumenIngresoPorFecha();
    }
}
