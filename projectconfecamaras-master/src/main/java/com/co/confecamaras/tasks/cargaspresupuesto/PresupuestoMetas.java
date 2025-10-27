package com.co.confecamaras.tasks.cargaspresupuesto;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted7Segundos;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.cargapresupuesto.CargaPresupuestoPage.*;

public class PresupuestoMetas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue("Carga de metas y presupuestos").into(TXT_BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                WaitInteractions.untilBeEnable(IMPUT_ANIO),
                Enter.theValue("2023").into(IMPUT_ANIO),
                WaitInteractions.untilAppears(BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR),
                WaitSeconds.seconds(7)
                /*********El Ing. Francisco confirma que el sistema no realice estos pasos***************/
                /*WaitInteractions.untilAppears(BOTON_REGISTRAR),
                Scroll.to(BOTON_REGISTRAR),
                WaitInteractions.untilAppears(BOTON_REGISTRAR),
                Click.on(BOTON_REGISTRAR),
                WaitInterrupted7Segundos.esperaConstante7(),
                WaitInteractions.untilAppears(BOTON_ACEPTAR),
                Click.on(BOTON_ACEPTAR)*/
                /******************************************************************************************/
        );
    }

    public static PresupuestoMetas cargar() {
        return Tasks.instrumented(PresupuestoMetas.class);
    }
}
