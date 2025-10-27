package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.FirmadoUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class FirmadoEletronicoSobre implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitSeconds.seconds(2),
                WaitInteractions.untilBeEnable(BTN_MIS_TRAMITES_FIRMADO),
                Click.on(BTN_MIS_TRAMITES_FIRMADO),
                SeleccionarTramite.enConfecamaraSII(LBL_CODIGO_TRAMITES_FIRMADO, BTN_BUSCAR_FIRMADO),
                WaitSeconds.seconds(3),
                ClickBotonVisible.enConfecamaraSII(BTN_CONTINUAR_TRAMITE_FIRMADO),
                WaitInteractions.untilAppears(BTN_ACEPTAR_ALERTA_IMPORTANTE),
                Click.on(BTN_ACEPTAR_ALERTA_IMPORTANTE),
//                WaitInteractions.untilAppears(MENU_DESPLEGABLE_SEDE_ADMINISTRATIVA),
//                SelectFromOptions.byVisibleText("PROPIA").from(MENU_DESPLEGABLE_SEDE_ADMINISTRATIVA)
                WaitInteractions.untilAppears(BTN_CONTINUAR_COSTO_FIRMADO),
                Scroll.to(BTN_CONTINUAR_COSTO_FIRMADO).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_COSTO_FIRMADO),
                WaitSeconds.seconds(3),
                WaitInteractions.untilBeEnable(BTN_FIRMA_ELECTRONICA_FIRMADO),
                Scroll.to(BTN_FIRMA_ELECTRONICA_FIRMADO).andAlignToBottom(),
                Click.on(BTN_FIRMA_ELECTRONICA_FIRMADO),
                WaitInteractions.untilAppears(BTN_FIRMAR_FIRMADO),
                Click.on(BTN_FIRMAR_FIRMADO),
                WaitInteractions.untilAppears(BTN_SI_FIRMADO),
                Click.on(BTN_SI_FIRMADO),
                WaitInteractions.untilAppears(BTN_CONTINUAR_FIRMADO),
                Click.on(BTN_CONTINUAR_FIRMADO),
                WaitSeconds.seconds(3),
                WaitInteractions.untilBeEnable(BTN_SOBRE_DIGITAL_FIRMADO),
                Scroll.to(BTN_SOBRE_DIGITAL_FIRMADO).andAlignToBottom(),
                JavaScriptClick.on(BTN_SOBRE_DIGITAL_FIRMADO)
        );
    }

    public static FirmadoEletronicoSobre enConfecamaraSII(){
        return instrumented(FirmadoEletronicoSobre.class);
    }
}