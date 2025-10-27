package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.userinterfaces.FirmadoManuscritoSobre;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.BTN_ACEPTAR_ALERTA_IMPORTANTE;
import static com.co.confecamaras.userinterfaces.FirmadoManuscritoSobre.MENU_DESP_SEDE_ADMIN;
import static com.co.confecamaras.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoFirmadoManuscritoSobre implements Task {

    private final String idCelular;

    public DoFirmadoManuscritoSobre(String idCelular) {
        this.idCelular = idCelular;
    }

    public static Performable firmadoManuscritoSobre(String idCelular){
        return instrumented(DoFirmadoManuscritoSobre.class, idCelular);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitSeconds.seconds(3),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_CONTINUAR_MANUSCRITO),
                WaitSeconds.seconds(3),
                JavaScriptClick.on(FirmadoManuscritoSobre.BTN_CONTINUAR_MANUSCRITO),
                WaitInteractions.untilAppears(BTN_ACEPTAR_ALERTA_IMPORTANTE),
                WaitSeconds.seconds(3),
                Click.on(BTN_ACEPTAR_ALERTA_IMPORTANTE),
                //WaitInteractions.untilAppears(MENU_DESP_SEDE_ADMIN),
                //SelectFromOptions.byVisibleText("PROPIA").from(MENU_DESP_SEDE_ADMIN),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_CONTINUAR_DOS_MANUSCRITO),
                WaitSeconds.seconds(3),
                Scroll.to(FirmadoManuscritoSobre.BTN_CONTINUAR_DOS_MANUSCRITO).andAlignToBottom(),
                WaitSeconds.seconds(3),
                JavaScriptClick.on(FirmadoManuscritoSobre.BTN_CONTINUAR_DOS_MANUSCRITO),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_FIRMA_MANUSCRITA_MANUSCRITO),
                WaitSeconds.seconds(3),
                Scroll.to(FirmadoManuscritoSobre.BTN_FIRMA_MANUSCRITA_MANUSCRITO).andAlignToBottom(),
                WaitSeconds.seconds(3),
                JavaScriptClick.on(FirmadoManuscritoSobre.BTN_FIRMA_MANUSCRITA_MANUSCRITO),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.TXT_CELULAR_MANUSCRITO),
                WaitSeconds.seconds(3),
                Clear.field(FirmadoManuscritoSobre.TXT_CELULAR_MANUSCRITO),
                WaitSeconds.seconds(3),
                Enter.theValue(idCelular).into(FirmadoManuscritoSobre.TXT_CELULAR_MANUSCRITO),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_ENVIAR_EMAIL_MANUSCRITO),
                WaitSeconds.seconds(3),
                JavaScriptClick.on(FirmadoManuscritoSobre.BTN_ENVIAR_EMAIL_MANUSCRITO),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_ENVIAR_SMS_MANUSCRITO),
                WaitSeconds.seconds(3),
                JavaScriptClick.on(FirmadoManuscritoSobre.BTN_ENVIAR_SMS_MANUSCRITO),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_GENERAR_QR_MANUSCRITO),
                WaitSeconds.seconds(3),
                JavaScriptClick.on(FirmadoManuscritoSobre.BTN_GENERAR_QR_MANUSCRITO),
                WaitSeconds.seconds(3),
                ReadQrCode.inThePage(FirmadoManuscritoSobre.IMG_QR_MANUSCRITO),
                WaitConstant.esperaConstante(),
                SignatureAndQr.doFirmar(),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_GUARDAR_FIRMA_MANUSCRITO),
                WaitSeconds.seconds(3),
                Click.on(FirmadoManuscritoSobre.BTN_GUARDAR_FIRMA_MANUSCRITO),
                Switch.toTheOtherWindow(),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_CERRAR_MANUSCRITO),
                WaitSeconds.seconds(3),
                Click.on(FirmadoManuscritoSobre.BTN_CERRAR_MANUSCRITO),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_SI_MANUSCRITO),
                WaitSeconds.seconds(3),
                Click.on(FirmadoManuscritoSobre.BTN_SI_MANUSCRITO),
                WaitSeconds.seconds(5),
                WaitInteractions.untilBeEnable(FirmadoManuscritoSobre.BTN_SOBRE_DIGITAL_MANUSCRITO),
                JavaScriptClick.on(FirmadoManuscritoSobre.BTN_SOBRE_DIGITAL_MANUSCRITO),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.LBL_VER_DOCUMENTO_MANUSCRITO),
                Ensure.that(FirmadoManuscritoSobre.LBL_VER_DOCUMENTO_MANUSCRITO).hasText(VER_DOCUMENTO),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_CERRAR_MANUSCRITO),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(FirmadoManuscritoSobre.BTN_CERRAR_MANUSCRITO)
        );
    }
}