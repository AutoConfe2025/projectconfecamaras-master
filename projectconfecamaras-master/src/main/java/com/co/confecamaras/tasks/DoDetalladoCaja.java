package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.AlertDoc;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import com.co.confecamaras.userinterfaces.DetalladoCaja;
import com.co.confecamaras.userinterfaces.MenuSistema;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class DoDetalladoCaja implements Task {

    private final String selectOperador;
    private final String idFechaInicial;
    private final String idFechaFinal;
    private final String selectTiposInforme;
    private final String selectTiposSalida;
    private final String idEmailControl;
    private final String selectAmbiente;

    public DoDetalladoCaja(String selectOperador, String idFechaInicial, String idFechaFinal, String selectTiposInforme,
                           String selectTiposSalida, String idEmailControl, String selectAmbiente) {
        this.selectOperador = selectOperador;
        this.idFechaInicial = idFechaInicial;
        this.idFechaFinal = idFechaFinal;
        this.selectTiposInforme = selectTiposInforme;
        this.selectTiposSalida = selectTiposSalida;
        this.idEmailControl = idEmailControl;
        this.selectAmbiente = selectAmbiente;
    }

    public static Performable detalladoCaja(String selectOperador, String idFechaInicial, String idFechaFinal, String selectTiposInforme,
                                            String selectTiposSalida, String idEmailControl, String selectAmbiente){
        return instrumented(DoDetalladoCaja.class, selectOperador, idFechaInicial, idFechaFinal, selectTiposInforme,
                selectTiposSalida, idEmailControl, selectAmbiente);
    }
    

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue("Detallado de Caja por Cajero (SIREP)").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(DetalladoCaja.SELECT_OPERACION_DETALLADO),
                SelectFromOptions.byVisibleText(selectOperador).from(DetalladoCaja.SELECT_OPERACION_DETALLADO),
                WaitInteractions.untilAppears(DetalladoCaja.TXT_FECHA_INICIAL_DETALLADO),
                Enter.theValue(idFechaInicial).into(DetalladoCaja.TXT_FECHA_INICIAL_DETALLADO),
                WaitInteractions.untilAppears(DetalladoCaja.TXT_FECHA_FINAL_DETALLADO),
                Enter.theValue(idFechaFinal).into(DetalladoCaja.TXT_FECHA_FINAL_DETALLADO),
                WaitInteractions.untilAppears(DetalladoCaja.SELECT_TIPOS_INFORME_DETALLADO),
                SelectFromOptions.byVisibleText(selectTiposInforme).from(DetalladoCaja.SELECT_TIPOS_INFORME_DETALLADO),
                WaitInteractions.untilAppears(DetalladoCaja.SELECT_TIPOS_SALIDA_DETALLADO),
                SelectFromOptions.byVisibleText(selectTiposSalida).from(DetalladoCaja.SELECT_TIPOS_SALIDA_DETALLADO),
                WaitInteractions.untilAppears(DetalladoCaja.TXT_EMAIL_CONTROL_DETALLADO),
                Enter.theValue(idEmailControl).into(DetalladoCaja.TXT_EMAIL_CONTROL_DETALLADO),
                WaitInteractions.untilAppears(DetalladoCaja.SELECT_AMBIENTE_DETALLADO),
                SelectFromOptions.byVisibleText(selectAmbiente).from(DetalladoCaja.SELECT_AMBIENTE_DETALLADO),
                WaitInteractions.untilAppears(DetalladoCaja.GENERAR_DETALLADO_BTN),
                Click.on(DetalladoCaja.GENERAR_DETALLADO_BTN),
                WaitConstant.esperaConstante(),
                Click.on(DetalladoCaja.GENERAR_DOS_DETALLADO_BTN)
                //Click.on(DetalladoCaja.DESCARGAR_BTN)
        );
        /*GetNewUrl.url().urlEstatico();
        PdfVal.session();*/
    }
}
