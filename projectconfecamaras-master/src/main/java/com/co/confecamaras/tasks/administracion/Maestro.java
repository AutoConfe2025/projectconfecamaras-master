package com.co.confecamaras.tasks.administracion;

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
import static com.co.confecamaras.userinterfaces.administracion.CuposAfiliacionPage.CUPOS_AFILIACION;
import static com.co.confecamaras.userinterfaces.administracion.MaestroDeDescuentoPage.*;
import static com.co.confecamaras.userinterfaces.administracion.MaestroDeDescuentoPage.TIPO;
import static com.co.confecamaras.utils.administracion.CuposAfiliadosConstants.CUPOS_AFILIADOS_TEXTO;
import static com.co.confecamaras.utils.administracion.MaestroDeDescuentosConstants.*;

public class Maestro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(MAESTRO_DESCUENTOS_BUSQUEDA).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(MAESTRO_DESCUENTOS),
                Click.on(MAESTRO_DESCUENTOS)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(ID_CODIGO),
                Enter.theValue(VALOR_ID).into(ID_CODIGO),
                WaitInteractions.untilBeEnable(NOMBRE_USUARIO),
                Enter.theValue(NOMBRE_).into(NOMBRE_USUARIO),
                WaitInteractions.untilBeEnable(TIPO),
                Enter.theValue(VALOR_TIPO).into(TIPO),
                WaitInteractions.untilBeEnable(CONDICIONADO),
                Enter.theValue(CONDICIONADO_).into(CONDICIONADO),
                WaitInteractions.untilBeEnable(BTN_GRABAR),
                Click.on(BTN_GRABAR)
        );

    }

    public static Maestro descuento(){
        return Tasks.instrumented(Maestro.class);
    }
}
