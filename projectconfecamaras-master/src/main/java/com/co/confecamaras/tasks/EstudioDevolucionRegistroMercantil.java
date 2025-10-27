package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.BTN_PRIMERA_OPCION;
import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.TXT_BUSCAR_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.EstudioInscripcionDocumentosEsadlUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EstudioDevolucionRegistroMercantil implements Task {

    private String idCodigoBarras;
    private String idMotivosDevolucion;
    private String idTipoTramite;
    private String idProcedeReingreso;
    private String idTipoDevolucion;
    private String idModificarFormulario;
    private String idObservaciones;

    public EstudioDevolucionRegistroMercantil(String idCodigoBarras, String idMotivosDevolucion, String idTipoTramite,
                                              String idProcedeReingreso, String idTipoDevolucion, String idModificarFormulario,
                                              String idObservaciones) {
        this.idCodigoBarras = idCodigoBarras;
        this.idMotivosDevolucion = idMotivosDevolucion;
        this.idTipoTramite = idTipoTramite;
        this.idProcedeReingreso = idProcedeReingreso;
        this.idTipoDevolucion = idTipoDevolucion;
        this.idModificarFormulario = idModificarFormulario;
        this.idObservaciones = idObservaciones;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL_INICIAL),
                Click.on(BTN_MENU_LATERAL_INICIAL),
                Click.on(BTN_BANDEJAS),
                Click.on(BTN_REGISTROS_PUBLICOS)
        );
        if(actor.asksFor(ElementoElegible.para(BTN_ESTUDIO_REGMTIL))){
            actor.attemptsTo(
                    Scroll.to(BTN_ESTUDIO_REGMTIL).andAlignToBottom(),
                    Click.on(BTN_ESTUDIO_REGMTIL)
            );
        } else {
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(TXT_BUSCAR_MENU_LATERAL),
                    Enter.theValue("(R) Estudio RegMtil").into(TXT_BUSCAR_MENU_LATERAL),
                    Click.on(BTN_PRIMERA_OPCION)
            );
        }
        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                Enter.theValue("7000").into(TXT_CODIGO_BARRAS_EASDL).thenHit(Keys.ENTER),
                //Enter.theValue(idCodigoBarras).into(TXT_CODIGO_BARRAS_EASDL).thenHit(Keys.ENTER),
                Click.on(BTN_DEVOLVER_EASDL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Switch.toTheOtherWindow(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCerrarPestanas.toTab(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Switch.toNewWindow(),
                WaitInterrupted2Segundos.esperaConstante2(),
                CheckboxMotivosDevolucion.enConfecamaraSII(LBL_ID_EASDL ,CHK_MOTIVOS_DEVOLUCION_EASDL, idMotivosDevolucion),
                Scroll.to(SELECT_TIPO_TRAMITE_EASDL),
                SelectFromOptions.byVisibleText(idTipoTramite).from(SELECT_TIPO_TRAMITE_EASDL),
                SelectFromOptions.byVisibleText(idProcedeReingreso).from(SELECT_PROCEDE_REINGRESO_EASDL),
                SelectFromOptions.byVisibleText(idTipoDevolucion).from(SELECT_TIPO_DEVOLUCION_EASDL),
                SelectFromOptions.byVisibleText(idModificarFormulario).from(SELECT_MODIFICAR_FORMULARIO_EASDL),
                Click.on(TXT_MOTIVO),
                //SelectFromOptions.byVisibleText("Aclarar el aumento del capital").from(TXT_MOTIVO),
                Enter.theValue(idObservaciones).into(TXT_OBSERVACIONES_EASDL),
                Enter.theValue("analistaqa@confecamaras.org.co").into(TXT_EMAIL),
                Click.on(BTN_GRABAR_DEVOLUCION),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_VER_DEVOLUCION),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_APLICAR_DEVOLUCION),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DEVOLUCION_TOTAL),
                Click.on(BTN_CONTINUAR_DEVOLUCION_TOTAL)
                //AcceptAlertThree.enConfecamaraSII()
        );
    }

    public static EstudioDevolucionRegistroMercantil enConfecamaraSII(String idCodigoBarras, String idMotivosDevolucion, String idTipoTramite,
                                                                      String idProcedeReingreso, String idTipoDevolucion, String idModificarFormulario,
                                                                      String idObservaciones){
        return instrumented(EstudioDevolucionRegistroMercantil.class, idCodigoBarras, idMotivosDevolucion, idTipoTramite, idProcedeReingreso,
                idTipoDevolucion, idModificarFormulario, idObservaciones);
    }
}