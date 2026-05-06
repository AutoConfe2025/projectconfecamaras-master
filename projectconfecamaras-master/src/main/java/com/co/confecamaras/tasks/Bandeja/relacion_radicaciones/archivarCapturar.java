package com.co.confecamaras.tasks.Bandeja.relacion_radicaciones;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.utils.estudio_general.constant.EXITO_ARCHIVAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

@AllArgsConstructor
public class archivarCapturar implements Task {

    private final String estado;
    @Override
    public <T extends Actor> void performAs(T actor) {

        String codigoBarras= actor.recall("codigoBarraCapturado");

        actor.attemptsTo(
                QueryGeneralBaseDatos.cambiarEstado(codigoBarras, estado),
                WaitUntil.the(BOTON_ARCHIVAR_TRAMITE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ARCHIVAR_TRAMITE)
        );

        String mensaje = Text.of(MENSAJE_ADVERTENCIA_ARCHIVAR_PROCESO).answeredBy(actor);

        System.out.println(mensaje + "mensaje de archivar extraido");


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

    public static archivarCapturar archivarConCaptura (String estado){
        return instrumented(archivarCapturar.class,estado);
    }
}
