package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.co.confecamaras.userinterfaces.DigitoVerificacion;
import com.co.confecamaras.userinterfaces.MenuSistema;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.co.confecamaras.userinterfaces.MenuSistema.SELECCIONAR_OPT;

public class DoDigitoVerificacion implements Task {

    private final String cedula;
    private final String cedulaDos;

    public DoDigitoVerificacion(String cedula, String cedulaDos){
        this.cedula = cedula;
        this.cedulaDos = cedulaDos;
    }

    public static Performable digitoVerificacion(String cedula, String cedulaDos){
        return instrumented(DoDigitoVerificacion.class, cedula, cedulaDos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue("Calcular Digito de Verificacion").into(MenuSistema.BUSQUEDA_INPUT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Click.on(DigitoVerificacion.CEDULA_NIT_INPUT),
                Enter.theValue(cedula).into(DigitoVerificacion.CEDULA_NIT_INPUT),
                Click.on(DigitoVerificacion.CALCULAR_BTN),
                Click.on(DigitoVerificacion.AGREGAR_BTN),
                Enter.theValue(cedulaDos).into(DigitoVerificacion.CEDULA_NIT_DOS_INPUT),
                Click.on(DigitoVerificacion.CALCULAR_BTN)
        );
    }
}
