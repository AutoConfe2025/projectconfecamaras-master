package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.InscripcionesLibrosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ContoInscripcionesLibros implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INCIAL,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INCIAL),
                Clear.field(CAMPO_FECHA_INCIAL),
                Enter.theValue("2025-12-01").into(CAMPO_FECHA_INCIAL),
                Click.on(CAMPO_FECHA_INCIAL),
                Click.on(CAMPO_FECHA_FINAL),
                Clear.field(CAMPO_FECHA_FINAL),
                Enter.theValue("2025-12-01").into(CAMPO_FECHA_FINAL),
                Click.on(CAMPO_FECHA_FINAL),
                Click.on(BOTON_GENERAR_INFORME_RESUMIDO_LIBROS),
                AceptAlert.aceptar(),
                WaitUntil.the(BOTON_DESCARGAR_CSV,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_DESCARGAR_CSV),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA)
        );
    }

    public static ContoInscripcionesLibros flujoControlLibros(){
        return new  ContoInscripcionesLibros();
    }
}
