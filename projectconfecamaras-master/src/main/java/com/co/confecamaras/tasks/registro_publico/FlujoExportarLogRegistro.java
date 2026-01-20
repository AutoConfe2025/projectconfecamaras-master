package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoExportarLogRegistro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INICIAL_DATA_PICKER,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INICIAL_DATA_PICKER),
                Enter.theValue("2026-01-01").into(CAMPO_FECHA_INICIAL_DATA_PICKER),
                Click.on(CAMPO_FECHA_INICIAL_DATA_PICKER),
                Click.on(BOTON_EXTRAER_AREF),
                AceptAlert.aceptar(),
                WaitUntil.the(BOTON_DESCARGAR_ARCHIVO_AREF,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_DESCARGAR_ARCHIVO_AREF),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)

        );
    }

    public static FlujoExportarLogRegistro ExportarLog(){
        return new FlujoExportarLogRegistro();
    }
}
