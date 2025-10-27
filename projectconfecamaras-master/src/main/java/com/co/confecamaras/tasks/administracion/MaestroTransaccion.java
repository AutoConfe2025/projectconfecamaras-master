package com.co.confecamaras.tasks.administracion;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.administracion.MaestroTransaccionesOrdenPage.*;
import static com.co.confecamaras.utils.administracion.MaestroTransaccionConstants.*;
import static com.co.confecamaras.utils.administracion.MttoCodBarrasConstants.TEXTO_ESTADO;

public class MaestroTransaccion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MAESTRO_TRANSACCIONES).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(MAESTRO_TRANSACCIONES_ORDEN),
                Click.on(MAESTRO_TRANSACCIONES_ORDEN)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(BTN_EDITAR),
                Click.on(BTN_EDITAR),
                WaitInteractions.untilBeEnable(INPUT_TITULO),
                Enter.theValue(TITULO_MAESTRO).into(INPUT_TITULO),
                WaitInteractions.untilBeEnable(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
                //Ensure.that(TEXTO_NOMBRE).text().isEqualTo(TEXTO_ESTADO)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_EDITAR),
                Click.on(BTN_EDITAR),
                WaitInteractions.untilBeEnable(INPUT_TITULO),
                Enter.theValue(TITULO_MAESTRO_ORIGINAL).into(INPUT_TITULO),
                WaitInteractions.untilBeEnable(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
        );
    }

    public static MaestroTransaccion orden(){
        return Tasks.instrumented(MaestroTransaccion.class);
    }
}
