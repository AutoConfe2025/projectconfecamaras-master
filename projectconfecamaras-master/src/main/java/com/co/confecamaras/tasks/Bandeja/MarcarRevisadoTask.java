package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.Bandejas.RevisionSIPREF.RevisionSIPREFPage.*;


public class MarcarRevisadoTask implements Task {

    public MarcarRevisadoTask() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(ICONO_MARCAR_COMO_REVISADO),
                Click.on(ICONO_MARCAR_COMO_REVISADO),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso a la accion: Marcar como Revisado "),
                WaitSeconds.seconds(2),
                Scroll.to(IMPUT_OBSERVACIONES),
                Enter.theValue("Prueba atomatizada ").into(IMPUT_OBSERVACIONES),
                Click.on(BOTON_MARCAR_COMO_REVISADO),
                AcceptAlert.aceptar(),
                WaitSeconds.seconds(4)

        );

    }

    public static MarcarRevisadoTask RevisionNotificaciones() {
        return new MarcarRevisadoTask();
    }
}