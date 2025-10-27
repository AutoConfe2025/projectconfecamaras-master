package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.SubirArchivo;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted10Segundos;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import com.co.confecamaras.utils.RobotCopiar;
import com.co.confecamaras.utils.RobotPegar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static com.co.confecamaras.models.VariableEstudioInscripcionDocumentosProponentes.setBarcode;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.DataInscripcionDocumentosMercantilUI.*;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DataInscripcionDocumentosMercantilTres implements Task {

    private final String idTelefonoFijo;
    private final String idNroCelular;
    private final String selectUsuario;

    public DataInscripcionDocumentosMercantilTres(String idTelefonoFijo, String idNroCelular, String selectUsuario) {
        this.idTelefonoFijo = idTelefonoFijo;
        this.idNroCelular = idNroCelular;
        this.selectUsuario = selectUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(TXT_TELEFONO_FIJO_DIDM),
                Enter.theValue(idTelefonoFijo).into(TXT_TELEFONO_FIJO_DIDM),
                WaitInteractions.untilAppears(TXT_NRO_CELULAR_DIDM),
                Enter.theValue(idNroCelular).into(TXT_NRO_CELULAR_DIDM),
                SubirArchivo.enConfecamaraSII(),
                WaitInteractions.untilAppears(BTN_GENERAR_RECIBO_DIDM),
                Scroll.to(BTN_GENERAR_RECIBO_DIDM).andAlignToBottom(),
                Click.on(BTN_GENERAR_RECIBO_DIDM),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRES_DIDM),
                Click.on(BTN_CONTINUAR_TRES_DIDM)
                );
        String barcode = LBL_CODIGO_BARRAS_DIDM.resolveFor(actor).getText();
        System.out.println("¡ESTE ES EL CODIGO DE BARRAS!" + barcode);
        setBarcode(barcode);
/*
        actor.attemptsTo(
                WaitInteractions.untilAppears(LBL_CODIGO_BARRAS_DIDM),
                MoveMouse.to(LBL_CODIGO_BARRAS_DIDM).andThen(Actions::doubleClick),
                RobotCopiar.toText(),WaitInteractions.untilAppears(LBL_CODIGO_BARRAS_DIDM),
                MoveMouse.to(LBL_CODIGO_BARRAS_DIDM).andThen(Actions::doubleClick),
                RobotCopiar.toText()
        );*/

        actor.attemptsTo(
                Switch.toTheOtherWindow(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCambioPestanaDos.toTab(),
                WaitInteractions.untilAppears(BTN_CERRAR_DIDM),
                Click.on(BTN_CERRAR_DIDM),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_BANDEJAS),
                Click.on(BTN_BANDEJAS),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS),
                Click.on(BTN_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_REPARTO_ESCANEO),
                Scroll.to(BTN_REPARTO_ESCANEO).andAlignToBottom(),
                Click.on(BTN_REPARTO_ESCANEO),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(TXT_CODIGO_BARRAS_DIDM),
                Enter.theValue(barcode).into(TXT_CODIGO_BARRAS_ID),
                Click.on(TXT_FECHA_INICIAL),
                WaitInteractions.untilAppears(BTN_FINALIZAR_ESCANEO_DIDM),
                Click.on(BTN_FINALIZAR_ESCANEO_DIDM),
                WaitInteractions.untilAppears(BTN_SIGUIENTE_DIDM),
                Click.on(BTN_SIGUIENTE_DIDM),
                //Switch.toFrame(0),
                WaitInteractions.untilAppears(SELECT_USUARIO_DIDM),
                //SelectFromOptions.byVisibleText(selectUsuario).from(SELECT_USUARIO_DIDM),
                SelectFromOptions.byVisibleText("CAJAQA(CAJAQA)").from(SELECT_USUARIO_DIDM),
                WaitInteractions.untilAppears(BTN_ASIGNAR_DIDM),
                Click.on(BTN_ASIGNAR_DIDM),
                Ensure.that(LBL_PROCESO_FINALIZADO_DIDM).isEnabled(),
                //Switch.toParentFrame(),
                Switch.toTheOtherWindow(),
                RobotCambioPestanaDos.toTab()
        );
    }

    public static DataInscripcionDocumentosMercantilTres enConfecamaraSII(String idTelefonoFijo, String idNroCelular, String selectUsuario) {
        return instrumented(DataInscripcionDocumentosMercantilTres.class, idTelefonoFijo, idNroCelular, selectUsuario);
    }
}