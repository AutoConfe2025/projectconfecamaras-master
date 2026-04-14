package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.co.confecamaras.userinterfaces.Bandejas.RevisionSIPREF.RevisionSIPREFPage.*;


public class IngresoaEnviarSMSTask implements Task {

    public IngresoaEnviarSMSTask() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(ICONO_ENVIAR_SMS),
                Click.on(ICONO_ENVIAR_SMS),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso a la accion: EnviarSMS "),
                WaitSeconds.seconds(5),
                WaitInteractions.untilBeEnable(BOTON_NOTIFICAR_EMAILS),
                Scroll.to(BOTON_REGRESAR),
                Click.on(BOTON_REGRESAR)
        );
    }

    public static IngresoaEnviarSMSTask GestionNotificaciones() {
        return new IngresoaEnviarSMSTask();
    }
}