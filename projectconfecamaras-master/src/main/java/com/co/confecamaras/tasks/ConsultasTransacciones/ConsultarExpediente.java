package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.consultasytransacciones.ExpedienteDigitalPage.*;
import static com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants.*;

public class ConsultarExpediente implements Task {
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
                WaitInteractions.untilBeEnable(BTN_EXPEDIENTE_DIGITAL),
                Scroll.to(BTN_EXPEDIENTE_DIGITAL),
                JavaScriptClick.on(BTN_EXPEDIENTE_DIGITAL)
        );

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(INPUT_IDENTIFICACION),
                Enter.theValue("30306963").into(INPUT_IDENTIFICACION),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_EXPEDIENTE),
                Click.on(BTN_CONTINUAR_EXPEDIENTE),
                WaitInteractions.untilBeEnable(BTN_NUEVA_BUSQUEDA),
                Click.on(BTN_NUEVA_BUSQUEDA)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_MATRICULA),
                Enter.theValue(MATRICULA_EXP).into(INPUT_MATRICULA),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_EXPEDIENTE),
                Click.on(BTN_CONTINUAR_EXPEDIENTE),
                WaitInteractions.untilBeEnable(BTN_NUEVA_BUSQUEDA),
                Click.on(BTN_NUEVA_BUSQUEDA)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_MATRICULA),
                Enter.theValue(MATRICULA_EXP).into(INPUT_MATRICULA),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_EXPEDIENTE),
                Click.on(BTN_CONTINUAR_EXPEDIENTE),
                WaitInteractions.untilBeEnable(BTN_NUEVA_BUSQUEDA),
                Click.on(BTN_NUEVA_BUSQUEDA)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_NOMBRE),
                Enter.theValue(NOMBRE).into(INPUT_NOMBRE),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_EXPEDIENTE),
                Click.on(BTN_CONTINUAR_EXPEDIENTE),
                WaitInteractions.untilBeEnable(BTN_NUEVA_BUSQUEDA),
                Click.on(BTN_NUEVA_BUSQUEDA)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_PALABRA),
                Enter.theValue("CAFETERIA LO RICO DEL SABOR").into(INPUT_PALABRA),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_EXPEDIENTE),
                Click.on(BTN_CONTINUAR_EXPEDIENTE),
                WaitInteractions.untilBeEnable(DIV_TABLA_EXPEDIENTE)
        );
    }

    public static ConsultarExpediente digital(){
        return Tasks.instrumented(ConsultarExpediente.class);
    }
}
