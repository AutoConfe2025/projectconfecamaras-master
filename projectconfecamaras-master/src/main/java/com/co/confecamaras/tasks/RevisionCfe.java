package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.utils.RobotCambioPestana;
import com.co.confecamaras.utils.RobotCambioPestana1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.RevisionCfeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RevisionCfe implements Task {

    private String idFecharRevisar;
    private String idFiltro;
    private String idReciboIndividual;
    private String idFechaInicial;
    private String idFechaFinal;

    public RevisionCfe(String idFecharRevisar, String idFiltro, String idReciboIndividual, String idFechaInicial,
                       String idFechaFinal) {
        this.idFecharRevisar = idFecharRevisar;
        this.idFiltro = idFiltro;
        this.idReciboIndividual = idReciboIndividual;
        this.idFechaInicial = idFechaInicial;
        this.idFechaFinal = idFechaFinal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                JavaScriptClick.on(BTN_INTEGRACION_ERP_RUES_CFE),
                JavaScriptClick.on(BTN_MANTENIMIENTO_INFORMES),
                Scroll.to(BTN_REVISION_CFE),
                JavaScriptClick.on(BTN_REVISION_CFE),
                SwitchToNewWindow.switchToNewTab(),
                Enter.theValue(idFecharRevisar).into(TXT_FECHA_REVISAR_REVISION),
                SelectFromOptions.byVisibleText(idFiltro).from(SELECT_FILTRO_REVISION),
                Click.on(BTN_CONTINUAR_UNO_REVISION),
                Click.on(BTN_VER_LOG_REVISION),
                RobotCambioPestana1.toTab(),
                Click.on(BTN_RECUPERAR_ESTADO_REVISION),
                RobotCambioPestana1.toTab(),
                Click.on(BTN_VER_DETALLE_RECIBO_REVISION),
                RobotCambioPestana1.toTab(),
                Click.on(BTN_VER_JSON_REQUEST_REVISION),
                RobotCambioPestana1.toTab(),
                Click.on(BTN_VER_JSON_RESPONSE_REVISION),
                RobotCambioPestana1.toTab(),
                Click.on(BTN_FACTURAR_RECIBO_REVISION),
                Click.on(BTN_REGRESAR_REVISION),
                Scroll.to(BTN_SELECCIONAR_FECHA_REVISION),
                Click.on(BTN_SELECCIONAR_FECHA_REVISION),
                Enter.theValue(idReciboIndividual).into(TXT_RECIBO_INDIVIDUAL_REVISION),
                Click.on(BTN_CONTINUAR_DOS_REVISION),
                Click.on(BTN_VER_LOG_REVISION),
                RobotCambioPestana1.toTab(),
                Click.on(BTN_RECUPERAR_ESTADO_REVISION),
                RobotCambioPestana1.toTab(),
                Click.on(BTN_VER_DETALLE_RECIBO_REVISION),
                RobotCambioPestana1.toTab(),
                Click.on(BTN_VER_JSON_REQUEST_REVISION),
                RobotCambioPestana1.toTab(),
                Click.on(BTN_VER_JSON_RESPONSE_REVISION),
                RobotCambioPestana1.toTab(),
                Click.on(BTN_FACTURAR_RECIBO_REVISION),
                Click.on(BTN_REGRESAR_REVISION),
                Scroll.to(BTN_SELECCIONAR_FECHA_REVISION),
                Click.on(BTN_SELECCIONAR_FECHA_REVISION),
                Enter.theValue(idFechaInicial).into(TXT_FECHA_INICIAL_REVISION),
                Enter.theValue(idFechaFinal).into(TXT_FECHA_FINAL_REVISION),
                Click.on(BTN_CONTINUAR_TRES_REVISION),
                /****************  Estadísticas *****************/
                Click.on(BTN_RECIBOS_SIN_FACTURAR_REVISION),
                Click.on(BTN_SELECCIONAR_FECHA_REVISION),
                Scroll.to(BTN_RECIBOS_NO_FACTURABLES_REVISION),
                Click.on(BTN_RECIBOS_NO_FACTURABLES_REVISION),
                Click.on(BTN_CERRAR_REVISION),
                //Click.on(BTN_SELECCIONAR_FECHA_REVISION),
                Scroll.to(BTN_ENVIADOS_CFE_REVISION),
                Click.on(BTN_ENVIADOS_CFE_REVISION),
                Click.on(BTN_CERRAR_REVISION),
                //Click.on(BTN_SELECCIONAR_FECHA_REVISION),
                Scroll.to(BTN_RECHAZADOS_CFE_REVISION),
                Click.on(BTN_RECHAZADOS_CFE_REVISION),
                //Click.on(BTN_CERRAR_REVISION),
                Click.on(BTN_SELECCIONAR_FECHA_REVISION),
                Scroll.to(BTN_ACEPTADOS_OPE_REVISION),
                Click.on(BTN_ACEPTADOS_OPE_REVISION),
                Click.on(BTN_CERRAR_REVISION),
                Scroll.to(BTN_RECHAZADOS_OPE_REVISION),
                Click.on(BTN_RECHAZADOS_OPE_REVISION),
                Click.on(BTN_CERRAR_REVISION),
                Scroll.to(BTN_ACEPTADOS_DIAN_REVISION),
                Click.on(BTN_ACEPTADOS_DIAN_REVISION),
                Click.on(BTN_CERRAR_REVISION),
                Scroll.to(BTN_RECHAZADOS_DIAN_REVISION),
                Click.on(BTN_RECHAZADOS_DIAN_REVISION),
                Click.on(BTN_CERRAR_REVISION),
                Scroll.to(BTN_ACEPTADOS_CLIENTE_REVISION),
                Click.on(BTN_ACEPTADOS_CLIENTE_REVISION),
                Click.on(BTN_CERRAR_REVISION),
                Scroll.to(BTN_RECHAZADOS_CLIENTE_REVISION),
                Click.on(BTN_RECHAZADOS_CLIENTE_REVISION),
                Click.on(BTN_CERRAR_REVISION),
                Scroll.to(BTN_OPE_NO_ENVIADOS_DIAN_REVISION),
                Click.on(BTN_OPE_NO_ENVIADOS_DIAN_REVISION),
                Click.on(BTN_CERRAR_REVISION)
        );
    }

    public static RevisionCfe enConfecamaraSII(String idFecharRevisar, String idFiltro, String idReciboIndividual, String idFechaInicial,
                                               String idFechaFinal){
        return instrumented(RevisionCfe.class, idFecharRevisar, idFiltro, idReciboIndividual, idFechaInicial, idFechaFinal);
    }
}