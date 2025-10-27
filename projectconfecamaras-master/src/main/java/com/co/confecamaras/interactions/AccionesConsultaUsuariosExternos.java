package com.co.confecamaras.interactions;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.GestionUsuariosExternosUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.BTN_OK_SOCIEDAD;

public class AccionesConsultaUsuariosExternos implements Interaction {

    private String idIdentificacionUsuarioDos;

    public AccionesConsultaUsuariosExternos(String idIdentificacionUsuarioDos) {
        this.idIdentificacionUsuarioDos = idIdentificacionUsuarioDos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(TXT_IDENTIFICACION_USUARIO_EXTERNOS),
                Enter.theValue(idIdentificacionUsuarioDos).into(TXT_IDENTIFICACION_USUARIO_EXTERNOS),
                Click.on(BTN_CONTINUAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_EDITAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_EDITAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_REGRESAR_DOS_USUARIO_EXTERNOS),
                Scroll.to(BTN_REGRESAR_DOS_USUARIO_EXTERNOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGRESAR_DOS_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_INACTIVAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_INACTIVAR_USUARIO_EXTERNOS),
                WaitSeconds.seconds(2),
                WaitInteractions.untilAppears(BTN_SI_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_SI_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_OK_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_OK_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_ACTIVAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_ACTIVAR_USUARIO_EXTERNOS),
                WaitSeconds.seconds(2),
                WaitInteractions.untilAppears(BTN_SI_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_SI_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_OK_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_OK_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_EMAIL_SMS_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_EMAIL_SMS_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_EMAIL_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_EMAIL_USUARIO_EXTERNOS),
                ModalLoader.modalLoader()
        );
        for (int i = 0; i <= 5; i++){
            if(actor.asksFor(ElementoElegible.para(BTN_OK_USUARIO_EXTERNOS))){
                actor.attemptsTo(
                        WaitInteractions.untilAppears(BTN_OK_USUARIO_EXTERNOS),
                        JavaScriptClick.on(BTN_OK_USUARIO_EXTERNOS),
                        ModalLoader.modalLoader()
                );
                int indexFila = i = 5;
            } else {
                int indexFila = i+1;
                actor.attemptsTo(
                        JavaScriptClick.on(BTN_ACEPTAR_USUARIO_EXTERNOS),
                        WaitInteractions.untilAppears(BTN_EMAIL_SMS_USUARIO_EXTERNOS),
                        JavaScriptClick.on(BTN_EMAIL_SMS_USUARIO_EXTERNOS),
                        WaitInteractions.untilAppears(BTN_EMAIL_USUARIO_EXTERNOS),
                        JavaScriptClick.on(BTN_EMAIL_USUARIO_EXTERNOS),
                        ModalLoader.modalLoader()
                );
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_VER_IMAGENES_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_VER_IMAGENES_USUARIO_EXTERNOS),
                ModalLoader.modalLoader()
        );
        if(actor.asksFor(ElementoElegible.para(BTN_CERRAR_USUARIO_EXTERNOS))){
            actor.attemptsTo(
                    WaitInteractions.untilAppears(BTN_CERRAR_USUARIO_EXTERNOS),
                    JavaScriptClick.on(BTN_CERRAR_USUARIO_EXTERNOS)
            );
        } else {
            actor.attemptsTo(
                    WaitInteractions.untilAppears(BTN_OK_SOCIEDAD),
                    JavaScriptClick.on(BTN_OK_SOCIEDAD)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_ELIMINAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_ELIMINAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_NO_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_NO_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_REGRESAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_REGRESAR_USUARIO_EXTERNOS)
        );
    }

    public static AccionesConsultaUsuariosExternos enConfecamaraSII(String idIdentificacionUsuarioDos){
        return new AccionesConsultaUsuariosExternos(idIdentificacionUsuarioDos);
    }
}