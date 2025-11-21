package com.co.confecamaras.tasks.Bandeja;



import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;



public class RevisionSIPREFAsentamientoTask implements Task {

    public RevisionSIPREFAsentamientoTask() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                IngresoFechaTask.fecha(),
                IngresoaEnviarSMSTask.GestionNotificaciones(),
                IngresoFechaTask.fecha(),
                MarcarRevisadoTask.RevisionNotificaciones()

        );

    }


    public static RevisionSIPREFAsentamientoTask ver() {
        return new RevisionSIPREFAsentamientoTask();
    }
}