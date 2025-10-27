package com.co.confecamaras.tasks.administracion;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.administracion.CuposAfiliacionPage.*;
import static com.co.confecamaras.utils.administracion.CuposAfiliadosConstants.*;

public class Cupos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue(CUPOS_AFILIADOS_TEXTO).into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(CUPOS_AFILIACION),
                Click.on(CUPOS_AFILIACION)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_CUPO),
                Click.on(BTN_CONSULTAR_CUPO),
                WaitInteractions.untilBeEnable(INPUT_MINIMO),
                DoubleClick.on(INPUT_MINIMO).then(Enter.theValue(VALOR_CUPO_MINIMO).into(INPUT)),
                WaitInteractions.untilBeEnable(INPUT_MAXIMO),
                DoubleClick.on(INPUT_MAXIMO).then(Enter.theValue(VALOR_CUPO_MAXIMOP).into(INPUT)),
                WaitInteractions.untilBeEnable(INPUT_CUPO),
                DoubleClick.on(INPUT_CUPO).then(Enter.theValue(VALOR_CUPO_).into(INPUT)),
                WaitInteractions.untilBeEnable(BTN_GRABAR_CUPO),
                Click.on(BTN_GRABAR_CUPO),
                AcceptAlert.aceptar()
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_CUPO),
                Click.on(BTN_CONSULTAR_CUPO)
        );
    }

    public static Cupos afiliados() {
        return Tasks.instrumented(Cupos.class);
    }
}
