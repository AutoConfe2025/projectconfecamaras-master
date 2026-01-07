package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.Administracion.AdminPage.*;


public class SincronizarCertificasMatriculaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Enter.theValue("42304").into(CAMPO_MATRICULA),
                WaitSeconds.seconds(2),
                Click.on(ENLACE_SINCRONIZAR_CERTIFICAS),
                WaitSeconds.seconds(2),
                AcceptAlert.aceptar(),
                WaitSeconds.seconds(2)



        );




    }

    public static SincronizarCertificasMatriculaTask administracion() {
        return new SincronizarCertificasMatriculaTask();
    }
}