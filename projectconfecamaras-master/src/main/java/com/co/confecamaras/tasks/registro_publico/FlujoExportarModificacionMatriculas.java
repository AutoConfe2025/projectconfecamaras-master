package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.ExportarMatriculasPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoExportarModificacionMatriculas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INI,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INI),
                Enter.theValue("20251201").into(CAMPO_FECHA_INI),
                Click.on(CAMPO_FECHA_FIN),
                Enter.theValue("20251201").into(CAMPO_FECHA_FIN),
                Click.on(CAMPO_DETALLADO_RESUMIDO),
                Enter.theValue("R").into(CAMPO_DETALLADO_RESUMIDO),
                Click.on(CAMPO_TASA_AFILIADOS),
                Enter.theValue("A").into(CAMPO_TASA_AFILIADOS),
                Click.on(BTN_EXTRAER),
                AceptAlert.aceptar(),
                WaitUntil.the(BTN_DESCARGAR_CSV,isPresent()).forNoMoreThan(240).seconds(),
                Click.on(BTN_DESCARGAR_CSV),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA)
        );
    }

    public static FlujoExportarModificacionMatriculas flujoExportarMatriculas(){
        return new FlujoExportarModificacionMatriculas();
    }
}
