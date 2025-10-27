package com.co.confecamaras.tasks.mercantil;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.mercantil.RenovacionAniosConstans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.awt.*;

import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.*;
import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.BTN_ACCIONES;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.BTN_LIQUIDAR_SOCIEDAD;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static com.co.confecamaras.userinterfaces.mercantil.RenovacionESADLPage.DIV_DESPLEGAR_ACCIONES;
import static com.co.confecamaras.userinterfaces.mercantil.RenovacionMatriculaPage.*;

public class RenovarVarios implements Task {

    private String matriculaAnios;

    public RenovarVarios(String matriculaAnios) {
        this.matriculaAnios = matriculaAnios;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(CHECK_BOX_CONSULTA),
                Click.on(CHECK_BOX_CONSULTA),
                WaitInteractions.untilBeEnable(TXT_INFORMACION),
                Enter.theValue(matriculaAnios).into(TXT_INFORMACION),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR),
                Click.on(BTN_CONTINUAR),
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

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                //BLOQUE INGRESO ACTIVOS 2024
                Click.on(CHECKBOX_RENOVACION_1),
                WaitInteractions.untilBeEnable(TNPUT_ACTIVOS_2023_PERSONA_NATURAL),
                Enter.theValue(RenovacionAniosConstans.VALOR_ACTIVO).into(TNPUT_ACTIVOS_2023_PERSONA_NATURAL),
                Click.on(CHECKBOX_RENOVACION_3)
        );
        if(actor.asksFor(ElementoElegible.para(TNPUT_ACTIVOS_2023_ESTABLECIMIENTO))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(TNPUT_ACTIVOS_2023_ESTABLECIMIENTO),
                    Enter.theValue(RenovacionAniosConstans.VALOR_ACTIVO).into(TNPUT_ACTIVOS_2023_ESTABLECIMIENTO)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_NUMERO_DE_EMPLEADOS),
                Scroll.to(INPUT_NUMERO_DE_EMPLEADOS).then(Clear.field(INPUT_NUMERO_DE_EMPLEADOS).then(Enter.theValue("1").into(INPUT_NUMERO_DE_EMPLEADOS))),
                WaitInteractions.untilBeEnable(BTN_LIQUIDAR_SOCIEDAD),
                Click.on(BTN_LIQUIDAR_SOCIEDAD),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(WARNING_MATRICULA_2022),
                //Ensure.that(WARNING_MATRICULA_2022).textContentValues().contains(RenovacionAniosConstans.WARNING),
                WaitInteractions.untilBeEnable(CERRAR_WARNING),
                Click.on(CERRAR_WARNING)
        );

        actor.attemptsTo(
                //BLOQUE ACTIVOS 2025
                WaitInteractions.untilBeEnable(TNPUT_ACTIVOS_2023_PERSONA_NATURAL),
                Clear.field(TNPUT_ACTIVOS_2023_PERSONA_NATURAL),
                Click.on(CHECKBOX_RENOVACION_2),
                Click.on(CHECKBOX_RENOVACION_3),
                WaitInteractions.untilBeEnable(INPUT_ACTIVOS_2024_PERSONA_NATURAL),
                Enter.theValue(RenovacionAniosConstans.VALOR_ACTIVO).into(INPUT_ACTIVOS_2024_PERSONA_NATURAL)
        );
        if(actor.asksFor(ElementoElegible.para(TNPUT_ACTIVOS_2023_ESTABLECIMIENTO))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(TNPUT_ACTIVOS_2023_ESTABLECIMIENTO),
                    Scroll.to(TNPUT_ACTIVOS_2023_ESTABLECIMIENTO),
                    Clear.field(TNPUT_ACTIVOS_2023_ESTABLECIMIENTO)
            );
        }
        if(actor.asksFor(ElementoElegible.para(INPUT_ACTIVOS_2024_ESTABLECIMIENTO))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(INPUT_ACTIVOS_2024_ESTABLECIMIENTO),
                    Enter.theValue(RenovacionAniosConstans.VALOR_ACTIVO).into(INPUT_ACTIVOS_2024_ESTABLECIMIENTO)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_LIQUIDAR_SOCIEDAD),
                Click.on(BTN_LIQUIDAR_SOCIEDAD),
                WaitSeconds.seconds(2)
        );
    }

    public static RenovarVarios anios(String matriculaAnios) {
        return Tasks.instrumented(RenovarVarios.class, matriculaAnios);
    }
}