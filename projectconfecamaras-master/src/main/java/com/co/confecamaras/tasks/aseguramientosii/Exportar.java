package com.co.confecamaras.tasks.aseguramientosii;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.aseguramientosii.ConexionSegaPage.CONEXION_SEGA;
import static com.co.confecamaras.userinterfaces.aseguramientosii.ExportarEstructuraPage.DESCARGAR_ESTRUCTUIRA;
import static com.co.confecamaras.userinterfaces.aseguramientosii.ExportarEstructuraPage.EXPORTAR_ESTRUCTURA;
import static com.co.confecamaras.utils.aeguramientosii.ConexionSegaConstants.MANTENIMIENTO_SEGA;
import static com.co.confecamaras.utils.aeguramientosii.ExportarConstants.EXPORTAR_ESTRUCTURA_DEL_SII;

public class Exportar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(EXPORTAR_ESTRUCTURA_DEL_SII).into(TXT_BUSQUEDA_INPUT),
                Click.on(EXPORTAR_ESTRUCTURA)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(DESCARGAR_ESTRUCTUIRA)
        );
    }

    public static Exportar estructura(){
        return Tasks.instrumented(Exportar.class);
    }
}
