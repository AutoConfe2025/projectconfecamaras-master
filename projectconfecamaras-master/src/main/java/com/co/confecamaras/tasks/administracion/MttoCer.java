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
import static com.co.confecamaras.userinterfaces.administracion.MttoCertEspecialesPage.*;
import static com.co.confecamaras.utils.administracion.MttoCertEspecialesConstants.*;


public class MttoCer implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(MTTO_CERT_ESPECIALES).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(BUSQUEDA_MTTO_CERT_ESPECIALES),
                Click.on(BUSQUEDA_MTTO_CERT_ESPECIALES)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_RECIVO),
                Enter.theValue(VALOR_MATRICULA_CER).into(INPUT_RECIVO),
                WaitInteractions.untilBeEnable(BTN_EDITAR_CERT),
                Click.on(BTN_EDITAR_CERT),
                WaitInteractions.untilBeEnable(INPUT_NOMBRE_),
                Enter.theValue(NOMBRE_EDITADO).into(INPUT_NOMBRE_),
                WaitInteractions.untilBeEnable(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_RECIVO),
                Enter.theValue(VALOR_MATRICULA_CER).into(INPUT_RECIVO),
                WaitInteractions.untilBeEnable(BTN_EDITAR_CERT),
                Click.on(BTN_EDITAR_CERT)
        );

        actor.attemptsTo(
                Ensure.that(INPUT_NOMBRE_.resolveFor(actor).getValue()).isEqualTo(NOMBRE_EDITADO)
        );

        actor.attemptsTo(
                Enter.theValue(NOMBRE_ORIGINAL).into(INPUT_NOMBRE_),
                WaitInteractions.untilBeEnable(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_RECIVO),
                Enter.theValue(VALOR_MATRICULA_CER).into(INPUT_RECIVO),
                WaitInteractions.untilBeEnable(BTN_EDITAR_CERT),
                Click.on(BTN_EDITAR_CERT)
        );
    }

    public static MttoCer especiales() {
        return Tasks.instrumented(MttoCer.class);
    }
}
