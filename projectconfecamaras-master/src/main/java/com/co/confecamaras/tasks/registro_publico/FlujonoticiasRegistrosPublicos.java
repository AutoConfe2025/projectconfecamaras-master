package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.NoticiasRegistrosPublicosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujonoticiasRegistrosPublicos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(CAMPO_FECHA_INICIAL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INICIAL),
                Clear.field(CAMPO_FECHA_INICIAL),
                Enter.theValue("2025-01-12").into(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_INICIAL),
                Click.on(BOTON_CONTINUAR_NOTICIA),
                Click.on(BOTON_REGENERAR_SELLO),
                AceptAlert.aceptar(),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA),
                Click.on(BOTON_CONSULTAR_LIBROS)
        );
    }

    public static FlujonoticiasRegistrosPublicos flujoNoticias(){
        return new FlujonoticiasRegistrosPublicos();
    }
}
