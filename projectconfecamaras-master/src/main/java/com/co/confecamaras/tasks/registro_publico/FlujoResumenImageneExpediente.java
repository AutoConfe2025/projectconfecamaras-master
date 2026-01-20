package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.NoticiasRegistrosPublicosPage.BOTON_CONSULTAR_LIBROS;
import static com.co.confecamaras.userinterfaces.registros_publicos.ResumenImagenesExpedientesPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoResumenImageneExpediente implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CONSULTAR_LIBROS),
                AceptAlert.aceptar(),
                WaitUntil.the(BOTON_RELACION_MATRICULA,isPresent()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_RELACION_MATRICULA),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA),
                Click.on(BOTON_RELACION_MATRICULA_SISTEMA),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA),
                Click.on(BOTON_RELACION_PROPONENTE),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)

        );
    }

    public static FlujoResumenImageneExpediente ExpedienteImagenes(){
        return new FlujoResumenImageneExpediente();
    }
}
