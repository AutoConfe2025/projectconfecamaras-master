package com.co.confecamaras.tasks.Bandeja.oficios_requerimientos;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_ARCHIVAR_TRAMITE;
import static com.co.confecamaras.utils.bandejas.oficios_requerimientos.constants.MENSAJE_ALERTA_ARCHIVAR;
import static com.co.confecamaras.utils.estudio_general.constant.ADVERTENCIA_ARCHIVAR;
import static com.co.confecamaras.utils.estudio_general.constant.EXITO_ARCHIVAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

@AllArgsConstructor
public class ValidacionArchivar implements Task {
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
                Click.on(BOTON_ARCHIVAR_TRAMITE),
                WaitUntil.the(MENSAJE_ADVERTENCIA_ARCHIVAR_PROCESO, isVisible()).forNoMoreThan(10).seconds()
        );

        actor.should(
                seeThat("Mensaje advertencia archivar",
                        of(MENSAJE_ADVERTENCIA_ARCHIVAR_PROCESO), containsString(MENSAJE_ALERTA_ARCHIVAR))
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

    public static ValidacionArchivar archivarOficio(String codigo_barras, String estado){
        return new ValidacionArchivar(codigo_barras, estado);

    }
}
