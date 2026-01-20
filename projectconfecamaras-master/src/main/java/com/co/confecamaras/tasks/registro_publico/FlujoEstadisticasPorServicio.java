package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.EstadisticasPorServicioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoEstadisticasPorServicio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INICIAL, isPresent()).forNoMoreThan(10).milliseconds(),
                Click.on(CAMPO_FECHA_INICIAL),
                Enter.theValue("2025-12-01").into(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_FIN),
                Enter.theValue("2025-12-26").into(CAMPO_FECHA_FIN),
                Click.on(CAMPO_FECHA_FIN),
                Click.on(LISTA_TIPO_SERVICIO),
                Click.on(OPCION_ARTICULO_7_TODOS),
                Click.on(LISTA_TIPO_INFORME),
                Click.on(OPCION_DETALLADO_RECIBO_RECIBO),
                Click.on(BOTON_GENERAR_POR_SERVICIOS),
                WaitUntil.the(DESCARGAR_CSV_POR_SERVICIO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(DESCARGAR_CSV_POR_SERVICIO),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)
        );
    }

    public static FlujoEstadisticasPorServicio flujoPorServicio(){
        return new FlujoEstadisticasPorServicio();
    }
}
