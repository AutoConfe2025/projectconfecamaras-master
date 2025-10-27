package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.BoletinNoticiaMercantilUI.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class BoletinNoticiaMercantil implements Task {

    private final String idAnoMes;
    private final String idEmailControl;

    public BoletinNoticiaMercantil(String idAnoMes, String idEmailControl) {
        this.idAnoMes = idAnoMes;
        this.idEmailControl = idEmailControl;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES),
                WaitInteractions.untilAppears(BTN_BOLETIN_NOTICIA_MERCANTIL),
                Scroll.to(BTN_BOLETIN_NOTICIA_MERCANTIL).andAlignToBottom(),
                JavaScriptClick.on(BTN_BOLETIN_NOTICIA_MERCANTIL),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(TXT_ANO_MES_BNM),
                Enter.theValue(idAnoMes).into(TXT_ANO_MES_BNM),
                WaitInteractions.untilAppears(TXT_EMAIL_CONTROL_BNM),
                Enter.theValue(idEmailControl).into(TXT_EMAIL_CONTROL_BNM),
                WaitInteractions.untilAppears(BTN_GENERAR_BNM),
                Click.on(BTN_GENERAR_BNM),
                WaitInteractions.untilAppears(BTN_GENERAR_DOS_BNM),
                Click.on(BTN_GENERAR_DOS_BNM),
                WaitInteractions.untilAppears(LBL_MENSAJE_FINAL_BNM),
                Ensure.that(LBL_MENSAJE_FINAL_BNM).isEnabled()
        );
    }

    public static BoletinNoticiaMercantil enConfecamarasSII(String idAnoMes, String idEmailControl) {
        return instrumented(BoletinNoticiaMercantil.class, idAnoMes, idEmailControl);
    }
}