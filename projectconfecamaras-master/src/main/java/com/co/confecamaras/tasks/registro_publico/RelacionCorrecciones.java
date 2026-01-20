package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.RlacionCorreccionesPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class RelacionCorrecciones implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INICIAL,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INICIAL),
                Enter.theValue("2025-12-01").into(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_FINAL),
                Enter.theValue("2025-12-31").into(CAMPO_FECHA_FINAL),
                Click.on(CAMPO_FECHA_FINAL),
                Click.on(BTN_GENERAR_RELACION_CORRECCION),
                AceptAlert.aceptar(),
                Click.on(BTN_DESCARGAR_ARCHIVO),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)
        );
    }

    public static RelacionCorrecciones relacionCorrecion(){
        return new RelacionCorrecciones();
    }
}
