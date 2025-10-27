package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted10Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ReversionParcialUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class ReversionParcialDos implements Task {

    private final String idRecibo;
    private final String selectTipoIdentificacion;
    private final String idIdentificacion;
    private final String idServicio;
    private final String idCantidad;
    private final String idValor;
    private final String idJustificacion;

    public ReversionParcialDos(String idRecibo, String selectTipoIdentificacion, String idIdentificacion, String idServicio,
                               String idCantidad, String idValor, String idJustificacion) {
        this.idRecibo = idRecibo;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idIdentificacion = idIdentificacion;
        this.idServicio = idServicio;
        this.idCantidad = idCantidad;
        this.idValor = idValor;
        this.idJustificacion = idJustificacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_REVERSION_PARCIAL),
                Scroll.to(BTN_REVERSION_PARCIAL),
                JavaScriptClick.on(BTN_REVERSION_PARCIAL),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(TXT_RECIBO_RP),
                Enter.theValue(idRecibo).into(TXT_RECIBO_RP),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_RP),
                Click.on(BTN_CONTINUAR_DOS_RP),
                WaitInteractions.untilAppears(BTN_ABANDONAR_RP),
                Scroll.to(BTN_ABANDONAR_RP).andAlignToBottom(),
                Click.on(BTN_ABANDONAR_RP),
                WaitInteractions.untilAppears(TXT_RECIBO_RP),
                Clear.field(TXT_RECIBO_RP),
                WaitInteractions.untilAppears(BTN_ASIGNAR_NUEVO_NUMERO_RP),
                Click.on(BTN_ASIGNAR_NUEVO_NUMERO_RP),
                WaitInteractions.untilAppears(BTN_NUEVA_NOTA_RP),
                Click.on(BTN_NUEVA_NOTA_RP),
                WaitInteractions.untilAppears(SELECT_TIPO_IDENTIFICACION_RP),
                SelectFromOptions.byVisibleText(selectTipoIdentificacion).from(SELECT_TIPO_IDENTIFICACION_RP),
                WaitInteractions.untilAppears(TXT_IDENTIFICACION_RP),
                Enter.theValue(idIdentificacion).into(TXT_IDENTIFICACION_RP).thenHit(Keys.TAB),
                WaitInteractions.untilAppears(TXT_PAIS_RP),
                SelectFromOptions.byVisibleText("Colombia").from(TXT_PAIS_RP),
                WaitInteractions.untilAppears(TXT_SERVICIO_RP),
                Scroll.to(TXT_SERVICIO_RP).andAlignToBottom(),
                Enter.theValue(idServicio).into(TXT_SERVICIO_RP).thenHit(Keys.TAB),
                WaitInteractions.untilAppears(TXT_CANTIDAD_RP),
                Enter.theValue(idCantidad).into(TXT_CANTIDAD_RP),
                WaitInteractions.untilAppears(TXT_VALOR_RP),
                Enter.theValue(idValor).into(TXT_VALOR_RP),
                WaitInteractions.untilAppears(TXT_JUSTIFICACION_DOS_RP),
                Enter.theValue(idJustificacion).into(TXT_JUSTIFICACION_DOS_RP),
                WaitInteractions.untilAppears(BTN_CONTINUAR_RP),
                Scroll.to(BTN_CONTINUAR_RP).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_RP),
                WaitInteractions.untilAppears(BTN_ACTIVAR_NOTA_REVERSION_RP),
                Scroll.to(BTN_ACTIVAR_NOTA_REVERSION_RP).andAlignToBottom(),
                Click.on(BTN_ACTIVAR_NOTA_REVERSION_RP),
                WaitInteractions.untilAppears(BTN_ACTIVAR_RP),
                Click.on(BTN_ACTIVAR_RP),
                WaitInteractions.untilAppears(LBL_MENSAJE_FINAL_REVERSION_PARCIAL_RP),
                Scroll.to(LBL_MENSAJE_FINAL_REVERSION_PARCIAL_RP).andAlignToBottom()
        );
    }

    public static ReversionParcialDos enConfecamarasSII(String idRecibo, String selectTipoIdentificacion, String idIdentificacion, String idServicio,
                                                        String idCantidad, String idValor, String idJustificacion) {
        return instrumented(ReversionParcialDos.class, idRecibo, selectTipoIdentificacion, idIdentificacion, idServicio,
                idCantidad, idValor, idJustificacion);
    }
}