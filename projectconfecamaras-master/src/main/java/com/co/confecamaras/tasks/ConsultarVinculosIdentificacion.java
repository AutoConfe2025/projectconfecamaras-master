package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.VinculosIdentificacion.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarVinculosIdentificacion implements Task {

    private String idTipoIdentificacion;
    private String idNoIdentificacion;

    public ConsultarVinculosIdentificacion(String idTipoIdentificacion, String idNoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.idNoIdentificacion = idNoIdentificacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilAppears(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                Click.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_VINCULOS_IDENTIFICACION),
                Click.on(BTN_VINCULOS_IDENTIFICACION),
                WaitInteractions.untilAppears(BTN_TIPO_DOCUMENTO_VINCULOS),
                SelectFromOptions.byVisibleText(idTipoIdentificacion).from(BTN_TIPO_DOCUMENTO_VINCULOS),
                Enter.theValue(idNoIdentificacion).into(TXT_IDENTIFICACION_VINCULOS),
                Click.on(BTN_BUSCAR_VINCULOS),
                WaitInteractions.untilAppears(BTN_SOLICITUD_CERTIFICADO_VINCULOS),
                Click.on(BTN_SOLICITUD_CERTIFICADO_VINCULOS)
        );
    }

    public static ConsultarVinculosIdentificacion enConfecamaraSII(String idTipoIdentificacion, String idNoIdentificacion) {
        return instrumented(ConsultarVinculosIdentificacion.class, idTipoIdentificacion, idNoIdentificacion);
    }
}