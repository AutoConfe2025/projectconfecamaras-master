package com.co.confecamaras.tasks.administracion;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.utils.usuarioCaja.UsuarioCajaConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.VALOR_TOTAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.administracion.CuposAfiliacionPage.CUPOS_AFILIACION;
import static com.co.confecamaras.userinterfaces.administracion.MaestroCiiusPage.*;
import static com.co.confecamaras.utils.administracion.CuposAfiliadosConstants.CUPOS_AFILIADOS_TEXTO;
import static com.co.confecamaras.utils.administracion.MaestroCiiusConstants.*;

public class ConsultarMaestro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(BUSQUEDA_MAESTRO_CIIUS).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(MAESTRO_CIIUS),
                Click.on(MAESTRO_CIIUS)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(BTN_EDITAR),
                Click.on(BTN_EDITAR),
                WaitInteractions.untilBeEnable(SELECT_RESTRICCION_PONAL),
                Scroll.to(SELECT_RESTRICCION_PONAL),
                SelectFromOptions.byValue(VALOR_RESTRICCION_PONAL).from(SELECT_RESTRICCION_PONAL),
                WaitInteractions.untilBeEnable(SELECT_ACTIVIDAD_COMERCIAL),
                SelectFromOptions.byValue(PRIMER_VALOR_ACTIVIDAD_COMERCIAL).from(SELECT_ACTIVIDAD_COMERCIAL),
                WaitInteractions.untilBeEnable(BTN_GUARDAR),
                Click.on(BTN_GUARDAR),
                Ensure.that(TEXTO_ACTIVIDAD_COMERCIAL).text().isEqualTo(PRIMER_TEXTO_ACTIVIDAD_COMERCIAL)
                );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_EDITAR),
                Click.on(BTN_EDITAR),
                WaitInteractions.untilBeEnable(SELECT_ACTIVIDAD_COMERCIAL),
                Scroll.to(SELECT_ACTIVIDAD_COMERCIAL),
                SelectFromOptions.byValue(SEGUNDO_VALOR_ACTIVIDAD_COMERCIAL).from(SELECT_ACTIVIDAD_COMERCIAL),
                WaitInteractions.untilBeEnable(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
        );
    }

    public static ConsultarMaestro ciiu(){
        return Tasks.instrumented(ConsultarMaestro.class);
    }
}
