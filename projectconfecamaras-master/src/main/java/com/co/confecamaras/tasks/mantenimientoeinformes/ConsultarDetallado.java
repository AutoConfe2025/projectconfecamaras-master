package com.co.confecamaras.tasks.mantenimientoeinformes;

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
import static com.co.confecamaras.userinterfaces.clickopciones.ClickPrimeraOpcion.BTN_PRIMERA_OPCION;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoDeImpuestoPage.*;
import static com.co.confecamaras.utils.mantenimientoeinformes.DetalladoDeImpuestoConstants.*;

public class ConsultarDetallado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_DETALLADO_IMPUESTO).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BTN_PRIMERA_OPCION),
                Click.on(BTN_PRIMERA_OPCION)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_FECHA_INICIAL_DETALLADO),
                Enter.theValue(VALOR_FECHA_INICIAL_DETALLADO).into(INPUT_FECHA_INICIAL_DETALLADO),
                WaitInteractions.untilBeEnable(INPUT_FECHA_FINAL_DETALLADO),
                Enter.theValue(VALOR_FECHA_FINAL_DETALLADO).into(INPUT_FECHA_FINAL_DETALLADO),
                WaitInteractions.untilBeEnable(BTN_GENERAR),
                Click.on(BTN_GENERAR),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_GENERAR),
                Click.on(BTN_ACEPTAR_GENERAR)
        );
    }

    public static ConsultarDetallado deImpuesto(){
        return Tasks.instrumented(ConsultarDetallado.class);
    }
}
