package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.MENSAJE_ARCHIVAR_PROCESO_FINALIZADO;
import static com.co.confecamaras.utils.estudio_general.constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

public class IngresarArchivar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_ARCHIVAR_TRAMITE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ARCHIVAR_TRAMITE)
        );

        actor.should(
                seeThat("Mensaje advertencia archivar",
                        of(MENSAJE_ADVERTENCIA_ARCHIVAR_PROCESO), containsString(ADVERTENCIA_ARCHIVAR_REVISION_DESISTIMIENTOS))
        );

        actor.attemptsTo(
                WaitUntil.the(BOTON_CONFIRMAR_, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONFIRMAR_),
                WaitUntil.the(MENSAJE_ARCHIVAR_PROCESO_FINALIZADO, isVisible()).forNoMoreThan(10).seconds()
        );

        actor.should(
                seeThat("Mensaje archivado correctamente",
                        of(MENSAJE_ARCHIVAR_PROCESO_FINALIZADO), containsString(EXITO_ARCHIVAR))
        );
    }
    public static IngresarArchivar archivarRevision(){
        return new IngresarArchivar();
    }
}
