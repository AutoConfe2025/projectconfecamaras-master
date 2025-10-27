package com.co.confecamaras.tasks.mercantil;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitText;
import com.co.confecamaras.utils.mercantil.RenovacionESDALAConstans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.*;
import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.BTN_ACCIONES;
import static com.co.confecamaras.userinterfaces.mercantil.RenovacionESADLPage.*;
import static com.co.confecamaras.utils.mercantil.RenovacionESDALAConstans.ANIO;

public class RenovarESDALAntes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(CHECK_BOX_CONSULTA),
                Click.on(CHECK_BOX_CONSULTA),
                WaitInteractions.untilBeEnable(TXT_INFORMACION),
                Enter.theValue(RenovacionESDALAConstans.MATRICULA).into(TXT_INFORMACION),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR),
                Click.on(BTN_CONTINUAR),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_ACCIONES),
                Click.on(BTN_ACCIONES),
                WaitInteractions.untilBeEnable(DIV_DESPLEGAR_ACCIONES),
                Click.on(DIV_DESPLEGAR_ACCIONES),
                WaitInteractions.untilBeEnable(HREF_MUTACION_DE_DIRECCION),
                Click.on(HREF_MUTACION_DE_DIRECCION),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR),
                Scroll.to(BTN_ACEPTAR).then(Click.on(BTN_ACEPTAR)),
                ModalLoader.modalLoader(),
                WaitText.textAppears(TEXTO_INFORMACION),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_INFO),
                Scroll.to(BTN_ACEPTAR_INFO).then(Click.on(BTN_ACEPTAR_INFO)),
                Ensure.that(TD_ANIO_RENOVACION).text().isEqualTo(ANIO),
                WaitInteractions.untilBeEnable(BTN_DESMARCAR_TODAS_CHECKBOX),
                Click.on(BTN_DESMARCAR_TODAS_CHECKBOX),
                WaitInteractions.untilBeEnable(TD_ANIO_A_PARTIR_RENOVADO),
                Enter.theValue(RenovacionESDALAConstans.VALOR_ACTIVO).into(TD_ANIO_A_PARTIR_RENOVADO),
                Click.on(CHECKBOX_ANIO_2013),
                Enter.theValue(RenovacionESDALAConstans.VALOR_ACTIVO).into(TD_ANIO_DOS_RENOVADO),
                Click.on(CHECKBOX_ANIO_2014),
                Enter.theValue(RenovacionESDALAConstans.VALOR_ACTIVO).into(TD_ANIO_TRES_RENOVADO),
                Click.on(CHECKBOX_ANIO_2015),
                Enter.theValue(RenovacionESDALAConstans.VALOR_ACTIVO).into(TD_ANIO_CUATRO_RENOVADO),
                Click.on(CHECKBOX_ANIO_2016),
                WaitInteractions.untilBeEnable(INPUT_MUMEERO_EMPLEADOS),
                Scroll.to(INPUT_MUMEERO_EMPLEADOS).then(Clear.field(INPUT_MUMEERO_EMPLEADOS).then(Enter.theValue("1").into(INPUT_MUMEERO_EMPLEADOS))),
                WaitInteractions.untilBeEnable(BTN_LIQUIDAR),
                Click.on(BTN_LIQUIDAR),
                ModalLoader.modalLoader()
                );
    }

    public static RenovarESDALAntes delDosMilTrece(){
        return Tasks.instrumented(RenovarESDALAntes.class);
    }
}
