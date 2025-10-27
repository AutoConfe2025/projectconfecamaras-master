package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.consultasytransacciones.SolicitarClaveClavePage.*;

public class GenerarClave implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilBeEnable(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                WaitInteractions.untilBeEnable(BTN_SOLICITAR_CLAVE_AFILIADO),
                Scroll.to(BTN_SOLICITAR_CLAVE_AFILIADO),
                JavaScriptClick.on(BTN_SOLICITAR_CLAVE_AFILIADO)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_MATRICULA),
                Enter.theValue("44453").into(INPUT_MATRICULA),
                WaitInteractions.untilBeEnable(INPUT_EMAIL),
                Enter.theValue("frojas@confecamaras.org.co").into(INPUT_EMAIL),
                WaitInteractions.untilBeEnable(BTN_GENERAR_CLAVE),
                Click.on(BTN_GENERAR_CLAVE),
                ModalLoader.modalLoader()
        );
    }

    public static GenerarClave afiliado(){
        return Tasks.instrumented(GenerarClave.class);
    }
}
