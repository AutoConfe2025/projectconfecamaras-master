package com.co.confecamaras.tasks.aseguramientosii;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.aseguramientosii.SegmentosIpPage.GRABAR_SEGMENTO;
import static com.co.confecamaras.userinterfaces.aseguramientosii.SegmentosIpPage.SEGMENTOS_IP;
import static com.co.confecamaras.utils.aeguramientosii.SegmentoConstants.SEGMENTO_DE_IP;

public class Segmento implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(SEGMENTO_DE_IP).into(TXT_BUSQUEDA_INPUT),
                Click.on(SEGMENTOS_IP)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(GRABAR_SEGMENTO),
                Click.on(GRABAR_SEGMENTO)
        );
    }

    public static Segmento IP(){
        return Tasks.instrumented(Segmento.class);
    }
}
