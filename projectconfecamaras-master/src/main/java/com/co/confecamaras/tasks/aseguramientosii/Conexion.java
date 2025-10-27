package com.co.confecamaras.tasks.aseguramientosii;

import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.aseguramientosii.ConexionSegaPage.*;
import static com.co.confecamaras.utils.aeguramientosii.ConexionSegaConstants.MANTENIMIENTO_SEGA;
import static com.co.confecamaras.utils.aeguramientosii.ConexionSegaConstants.TEXTO_CAMARA;

public class Conexion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(MANTENIMIENTO_SEGA).into(TXT_BUSQUEDA_INPUT),
                JavaScriptClick.on(CONEXION_SEGA)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                Ensure.that(NOMBRE_CAMARA).text().isEqualTo(TEXTO_CAMARA),
                WaitInteractions.untilBeEnable(BTN_EDITAR),
                Click.on(BTN_EDITAR)
        );
    }
    public static Conexion sega(){
        return Tasks.instrumented(Conexion.class);
    }
}
