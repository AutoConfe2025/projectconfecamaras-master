package com.co.confecamaras.tasks.Bandeja.recursos_reposicion;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.MENSAJE_ARCHIVAR_PROCESO_FINALIZADO;
import static com.co.confecamaras.utils.bandejas.recursos_reposicion.Constants.MENSAJE_ARCHIVAR;
import static com.co.confecamaras.utils.estudio_general.constant.ADVERTENCIA_ARCHIVAR;
import static com.co.confecamaras.utils.estudio_general.constant.EXITO_ARCHIVAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

@AllArgsConstructor
public class ValidarArchivar implements Task {

    private final String codigo_barras;
    private final String estado;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                QueryGeneralBaseDatos.cambiarEstado(codigo_barras,estado),
                WaitUntil.the(BOTON_REFRESCAR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_REFRESCAR),
                Enter.theValue(codigo_barras).into(CAMPO_BUSQUEDA),
                WaitUntil.the(BOTON_ARCHIVAR_TRAMITE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ARCHIVAR_TRAMITE)
        );

        actor.should(
                seeThat("Mensaje advertencia archivar",
                        of(MENSAJE_ADVERTENCIA_ARCHIVAR_PROCESO), containsString(MENSAJE_ARCHIVAR))
        );

        actor.attemptsTo(
                Click.on(BOTON_CONFIRMAR_),
                WaitUntil.the(MENSAJE_ARCHIVAR_PROCESO_FINALIZADO, isVisible()).forNoMoreThan(10).seconds()
        );

        actor.should(
                seeThat("Mensaje archivado correctamente",
                        of(MENSAJE_ARCHIVAR_PROCESO_FINALIZADO), containsString(EXITO_ARCHIVAR))
        );
    }

    public static ValidarArchivar archivarRecursos(String codigo_barras, String estado){
        return new ValidarArchivar(codigo_barras, estado);
    }
}
