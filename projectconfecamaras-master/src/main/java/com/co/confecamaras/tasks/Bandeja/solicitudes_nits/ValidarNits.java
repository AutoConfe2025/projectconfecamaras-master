package com.co.confecamaras.tasks.Bandeja.solicitudes_nits;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.cerrarpestana.CloseEmbeddedPdf;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.solicitud_nits.page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class ValidarNits implements Task {

    private final String fecha;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA),
                Enter.theValue(fecha).into(CAMPO_FECHA),
                WaitUntil.the(BOTON_SOLICITAR_NIT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SOLICITAR_NIT),
                SwitchToNewWindow.switchToNewTab(),
                Scroll.to(OPCION_REGENRAR_XML),
                Click.on(OPCION_REGENRAR_XML),
                WaitUntil.the(OPCION_VER_XML, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_VER_XML),
                CloseEmbeddedPdf.now(),
                WaitUntil.the(OPCION_EDITAR_XML, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_EDITAR_XML),
                CloseEmbeddedPdf.now(),
                WaitUntil.the(OPCION_CONSULTAR_EXPEDIENTE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_CONSULTAR_EXPEDIENTE),
                CloseEmbeddedPdf.now(),
                WaitUntil.the(OPCION_ACTUALIZAR_MATRICULADOS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_ACTUALIZAR_MATRICULADOS),
                CloseEmbeddedPdf.now(),
                WaitUntil.the(OPCION_VER_ESPECIFICACIONES, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_VER_ESPECIFICACIONES),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA),
                WaitUntil.the(OPCION_VER_VALIDACIONES_MARCASS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_VER_VALIDACIONES_MARCASS),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)
        );
    }

    public static ValidarNits validaNits(String fecha){
        return new  ValidarNits(fecha);
    }
}
