package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.tasks.Consulta.ConsultaModuloTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.RadicarDepositoEstadosFinancierosUI.*;

public class DepositoEstadosFinancierosTask implements Task {
    private String escenarios[] = null;
    private final String selectNit;
    private final String idNit;

    /*------Estado de Situación Financiera------*/
    private final String idFechaSituacionFinanciera;
    private final String idFoliosSituacionFinanciera;

    /*------Estado de Resultados Integral------*/
    private final String idFechaResultadosIntegral;
    private final String idFoliosResultadosIntegral;

    /*------Estado de Flujos de Efectivo------*/
    private final String idFechaFlujosEfectivo;
    private final String idFoliosFlujosEfectivo;

    /*------Estado de Cambios en el Patrimonio------*/
    private final String idFechaCambiosPatrimonio;
    private final String idFoliosCambiosPatrimonio;

    /*------Estado de Notas Financieras------*/
    private final String idFechaNotasFinancieras;
    private final String idFoliosNotasFinancieras;

    /*------Dictamen------*/
    private final String idFechaDictamen;
    private final String idFoliosDictamen;

    /*------Otros------*/
    private final String idFechaOtros;
    private final String idFoliosOtros;

    public DepositoEstadosFinancierosTask(String selectNit, String idNit, String idFechaSituacionFinanciera, String idFoliosSituacionFinanciera, String idFechaResultadosIntegral, String idFoliosResultadosIntegral, String idFechaFlujosEfectivo, String idFoliosFlujosEfectivo, String idFechaCambiosPatrimonio, String idFoliosCambiosPatrimonio, String idFechaNotasFinancieras, String idFoliosNotasFinancieras, String idFechaDictamen, String idFoliosDictamen, String idFechaOtros, String idFoliosOtros) {
        this.selectNit = selectNit;
        this.idNit = idNit;
        /*------Estado de Situación Financiera------*/
        this.idFechaSituacionFinanciera = idFechaSituacionFinanciera;
        this.idFoliosSituacionFinanciera = idFoliosSituacionFinanciera;
        /*------Estado de Resultados Integral------*/
        this.idFechaResultadosIntegral = idFechaResultadosIntegral;
        this.idFoliosResultadosIntegral = idFoliosResultadosIntegral;
        /*------Estado de Flujos de Efectivo------*/
        this.idFechaFlujosEfectivo = idFechaFlujosEfectivo;
        this.idFoliosFlujosEfectivo = idFoliosFlujosEfectivo;
        /*------Estado de Cambios en el Patrimonio------*/
        this.idFechaCambiosPatrimonio = idFechaCambiosPatrimonio;
        this.idFoliosCambiosPatrimonio = idFoliosCambiosPatrimonio;
        /*------Estado de Notas Financieras------*/
        this.idFechaNotasFinancieras = idFechaNotasFinancieras;
        this.idFoliosNotasFinancieras = idFoliosNotasFinancieras;
        /*------Dictamen------*/
        this.idFechaDictamen = idFechaDictamen;
        this.idFoliosDictamen = idFoliosDictamen;
        /*------Otros------*/
        this.idFechaOtros = idFechaOtros;
        this.idFoliosOtros = idFoliosOtros;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ConsultaModuloTask.consultarModulo("Depósito de Estados Financieros"),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(SELECT_BUSCAR_POR_RADICAR_DEPOSITO),
                SelectFromOptions.byVisibleText(selectNit).from(SELECT_BUSCAR_POR_RADICAR_DEPOSITO),
                WaitSeconds.seconds(1),
                WaitInteractions.untilBeEnable(TXT_NIT_RADICAR_DEPOSITO),
                Enter.theValue(idNit).into(TXT_NIT_RADICAR_DEPOSITO),
                Click.on(BTN_CONSULTAR_RADICAR_DEPOSITO),
                WaitSeconds.seconds(1),
                WaitInteractions.untilBeEnable(BTN_SELECCIONAR_MATRICULA_RADICAR_DEPOSITO),
                Click.on(BTN_SELECCIONAR_MATRICULA_RADICAR_DEPOSITO),
                WaitSeconds.seconds(1),
                WaitInteractions.untilBeEnable(BTN_INICIAR_RADICAR_DEPOSITO),
                Click.on(BTN_INICIAR_RADICAR_DEPOSITO),
                ModalLoader.modalLoader()
        );

        for (WebElementFacade opcion : LINKS_PANEL.resolveAllFor(actor)) {
            escenarios = seleccionarEscenario(opcion.getText());
            actor.attemptsTo(
                    LogEvent.recordevent(Reportes.INFO, "Estado: " + opcion.getText()),
                    JavaScriptClick.on(opcion),
                    ModalLoader.modalLoader(),
                    Enter.theValue(escenarios[0]).into(INP_FECHA_SITUACION_FINANCIERA_RADICAR_DEPOSITO),
                    Enter.theValue(escenarios[1]).into(INP_FOLIOS_SITUACION_FINANCIERA_RADICAR_DEPOSITO),
                    Scroll.to(BTN_GUARDAR_RADICAR_DEPOSITO).andAlignToBottom(),
                    JavaScriptClick.on(BTN_GUARDAR_RADICAR_DEPOSITO),
                    ModalLoader.modalLoader(),
                    WaitInteractions.untilAppears(BTN_ACEPTAR_RADICAR_DEPOSITO),
                    JavaScriptClick.on(BTN_ACEPTAR_RADICAR_DEPOSITO),
                    SendKeys.of(FileUpload.subirArchivo().archivoComandos()).into(BTN_CARGUE_SOPORTE),

                    ModalLoader.modalLoader(),
                    WaitInteractions.untilAppears(BTN_CERRAR_RADICAR_DEPOSITO),
                    JavaScriptClick.on(BTN_CERRAR_RADICAR_DEPOSITO),
                    WaitInteractions.untilAppears(AccionesPage.LINK_ACCION.of("Ver Soporte")),
                    Scroll.to(AccionesPage.LINK_ACCION.of("Ver Soporte")).andAlignToBottom(),
                    JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Ver Soporte")),
                    WaitSeconds.seconds(1),
                    WaitInteractions.untilBeEnable(AccionesPage.LINK_ACCION.of("Expandir / colapsar")),
                    JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Expandir / colapsar")),
                    WaitMilliseconds.milliseconds(500),
                    JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Expandir / colapsar")),
                    WaitInteractions.untilAppears(BTN_CERRAR_VISTA_DOCUMENTO),
                    JavaScriptClick.on(BTN_CERRAR_VISTA_DOCUMENTO),
                    WaitInteractions.untilAppears(AccionesPage.LINK_ACCION.of("Borrar soporte")),
                    Scroll.to(AccionesPage.LINK_ACCION.of("Borrar soporte")).andAlignToBottom(),
                    JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Borrar soporte")),
                    ModalLoader.modalLoader(),
                    WaitInteractions.untilAppears(BTN_ACEPTAR_RADICAR_DEPOSITO),
                    JavaScriptClick.on(BTN_ACEPTAR_RADICAR_DEPOSITO),
                    ModalLoader.modalLoader(),
                    SendKeys.of(FileUpload.subirArchivo().archivoComandos()).into(BTN_CARGUE_SOPORTE),
                    ModalLoader.modalLoader(),
                    WaitInteractions.untilAppears(BTN_CERRAR_RADICAR_DEPOSITO),
                    JavaScriptClick.on(BTN_CERRAR_RADICAR_DEPOSITO),
                    ModalLoader.modalLoader()
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_RADICAR_DEPOSITO),
                Scroll.to(BTN_RADICAR_DEPOSITO).andAlignToBottom(),
                JavaScriptClick.on(BTN_RADICAR_DEPOSITO),
                WaitInteractions.untilAppears(BTN_ACEPTAR_RADICAR_DEPOSITO),
                JavaScriptClick.on(BTN_ACEPTAR_RADICAR_DEPOSITO),
                WaitInteractions.untilAppears(BTN_SERVICIOS_RADICAR_DEPOSITO),
                JavaScriptClick.on(BTN_SERVICIOS_RADICAR_DEPOSITO),
                WaitInteractions.untilAppears(BTN_SOPORTES_RADICAR_DEPOSITO),
                JavaScriptClick.on(BTN_SOPORTES_RADICAR_DEPOSITO),
                WaitInteractions.untilAppears(BTN_VER_RECIBO_CAJA_RADICAR_DEPOSITO),
                JavaScriptClick.on(BTN_VER_RECIBO_CAJA_RADICAR_DEPOSITO),
                WaitInteractions.untilAppears(BTN_CERRAR_VISTA_DOCUMENTO),
                JavaScriptClick.on(BTN_CERRAR_VISTA_DOCUMENTO),
                WaitInteractions.untilAppears(BTN_VER_RADICADO_RADICAR_DEPOSITO),
                JavaScriptClick.on(BTN_VER_RADICADO_RADICAR_DEPOSITO),
                WaitInteractions.untilAppears(MODAL_RADICAR_DEPOSITO),
                ModalLoader.modalLoader()
        );
    }

    private String[] seleccionarEscenario(String escenario) {
        String[] datos = null;
        switch (escenario) {
            case "Estado de Situación Financiera":
                datos = new String[]{idFechaSituacionFinanciera, idFoliosSituacionFinanciera};
                break;
            case "Estado de Resultados Integral":
                datos = new String[]{idFechaResultadosIntegral, idFoliosResultadosIntegral};
                break;
            case "Estado de Flujos de Efectivo":
                datos = new String[]{idFechaFlujosEfectivo, idFoliosFlujosEfectivo};
                break;
            case "Estado de Cambios en el Patrimonio":
                datos = new String[]{idFechaCambiosPatrimonio, idFoliosCambiosPatrimonio};
                break;
            case "Estado de notas Financieras":
                datos = new String[]{idFechaNotasFinancieras, idFoliosNotasFinancieras};
                break;
            case "Dictamen":
                datos = new String[]{idFechaDictamen, idFoliosDictamen};
                break;
            case "Otros":
                datos = new String[]{idFechaOtros, idFoliosOtros};
                break;
        }
        return datos;
    }

    public static DepositoEstadosFinancierosTask enConfecamaraSII(String selectNit, String idNit, String idFechaSituacionFinanciera,
                                                                  String idFoliosSituacionFinanciera, String idFechaResultadosIntegral, String idFoliosResultadosIntegral,
                                                                  String idFechaFlujosEfectivo, String idFoliosFlujosEfectivo, String idFechaCambiosPatrimonio,
                                                                  String idFoliosCambiosPatrimonio, String idFechaNotasFinancieras, String idFoliosNotasFinancieras,
                                                                  String idFechaDictamen, String idFoliosDictamen, String idFechaOtros, String idFoliosOtros) {
        return new DepositoEstadosFinancierosTask(selectNit, idNit, idFechaSituacionFinanciera,
                idFoliosSituacionFinanciera, idFechaResultadosIntegral, idFoliosResultadosIntegral,
                idFechaFlujosEfectivo, idFoliosFlujosEfectivo, idFechaCambiosPatrimonio,
                idFoliosCambiosPatrimonio, idFechaNotasFinancieras, idFoliosNotasFinancieras,
                idFechaDictamen, idFoliosDictamen, idFechaOtros, idFoliosOtros);
    }
}