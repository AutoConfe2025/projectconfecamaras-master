package com.co.confecamaras.tasks.matricula;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.utils.matriculas.MatriculaEmbargoConstants;
import com.co.confecamaras.utils.usuarioCaja.UsuarioCajaConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.*;
import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.BTN_ACCIONES;
import static com.co.confecamaras.userinterfaces.Matricula.MatriculaConEmbargoPage.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.TXT_NUEVOS_ACTIVOS_SOCIEDAD;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static com.co.confecamaras.userinterfaces.mercantil.RenovacionESADLPage.DIV_DESPLEGAR_ACCIONES;
import static com.co.confecamaras.userinterfaces.mercantil.RenovacionMatriculaPage.BTN_CONTINUAR_RENOVACION_MATRICULA;
import static com.co.confecamaras.userinterfaces.mercantil.RenovacionMatriculaPage.BTN_RENOVAR_MATRICULA;
import static com.co.confecamaras.utils.matriculas.MatriculaEmbargoConstants.ESTADO_MATRICULA_EMBARGADA;
import static com.co.confecamaras.utils.matriculas.MatriculaEmbargoConstants.MATRICULA_EMBARGADA;

public class MatriculaConEmbargo  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(CHECK_BOX_CONSULTA),
                Click.on(CHECK_BOX_CONSULTA),
                WaitInteractions.untilBeEnable(TXT_INFORMACION),
                //Enter.theValue(MATRICULA_EMBARGADA).into(TXT_INFORMACION),
                Enter.theValue("204043").into(TXT_INFORMACION),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR),
                Click.on(BTN_CONTINUAR),
                Ensure.that(TEXTO_ESTADO_MATRICULA).text().isEqualTo(ESTADO_MATRICULA_EMBARGADA),
                WaitInteractions.untilBeEnable(BTN_ACCIONES),
                Click.on(BTN_ACCIONES),
                WaitInteractions.untilBeEnable(DIV_DESPLEGAR_ACCIONES),
                Click.on(DIV_DESPLEGAR_ACCIONES),
                WaitInteractions.untilBeEnable(BTN_RENOVAR_MATRICULA),
                Click.on(BTN_RENOVAR_MATRICULA),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_RENOVACION_MATRICULA),
                Scroll.to(BTN_CONTINUAR_RENOVACION_MATRICULA).then(Click.on(BTN_CONTINUAR_RENOVACION_MATRICULA)),
                ModalLoader.modalLoader()
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilBeEnable(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue(MatriculaEmbargoConstants.VALOR_ACTIVO).into(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Scroll.to(BTN_CONTINUAR_LIQUIDACION_MATRICULA).andAlignToBottom().then(Click.on(BTN_CONTINUAR_LIQUIDACION_MATRICULA))
        );
    }
    public static MatriculaConEmbargo conMatriculaEmbargada(){
        return Tasks.instrumented(MatriculaConEmbargo.class);
    }
}
