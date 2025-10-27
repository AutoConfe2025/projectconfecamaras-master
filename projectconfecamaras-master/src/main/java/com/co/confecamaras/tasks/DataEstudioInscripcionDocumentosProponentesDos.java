package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.*;
import static com.co.confecamaras.models.VariableEstudioInscripcionDocumentosProponentes.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class DataEstudioInscripcionDocumentosProponentesDos implements Task {

    private final String selectUsuario;

    public DataEstudioInscripcionDocumentosProponentesDos(String selectUsuario) {
        this.selectUsuario = selectUsuario;
    }

    String barcode = getBarcode();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitSeconds.seconds(3),
                Click.on(CERRAR_LATERALL),
                WaitSeconds.seconds(5),
                /*Click.on(BTN_MENU_LATERAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_MENU_LATERAL),*/
                //JavaScriptClick.on(BTN_BANDEJAS),
                Click.on(BTN_MENU_LATERAL_INICIAL),
                WaitSeconds.seconds(3),
                Click.on(BTN_BANDEJAS),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_REPARTO_ESCANEO),
                Scroll.to(BTN_REPARTO_ESCANEO).andAlignToBottom(),
                JavaScriptClick.on(BTN_REPARTO_ESCANEO),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(TXT_CODIGO_BARRAS_ID),
                Enter.theValue(barcode).into(TXT_CODIGO_BARRAS_ID).thenHit(Keys.ENTER),
                Click.on(TXT_BUSCAR),
                WaitSeconds.seconds(2),
                WaitInteractions.untilBeEnable(BTN_FINALIZAR_ESCANEO_ID),
                Click.on(BTN_FINALIZAR_ESCANEO_ID),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_FINALIZAR_ESCANEO),
                Click.on(BTN_CONTINUAR_FINALIZAR_ESCANEO),
                WaitSeconds.seconds(3),
                //Switch.toFrame(0),
                WaitInteractions.untilBeEnable(SELECT_USUARIO_ID),
                //SelectFromOptions.byVisibleText(selectUsuario).from(SELECT_USUARIO_ID),
                SelectFromOptions.byVisibleText("CAJAQA(CAJAQA)").from(SELECT_USUARIO_ID),
                WaitInteractions.untilBeEnable(BTN_ASIGNAR_ID),
                Click.on(BTN_ASIGNAR_ID),
                Ensure.that(LBL_PROCESO_FINALIZADO_ID).isEnabled(),
                //Switch.toParentFrame(),
                Switch.toTheOtherWindow(),
                RobotCambioPestanaDos.toTab()
        );
    }

    public static DataEstudioInscripcionDocumentosProponentesDos enConfecamaraSII(String selectUsuario) {
        return instrumented(DataEstudioInscripcionDocumentosProponentesDos.class, selectUsuario);
    }
}