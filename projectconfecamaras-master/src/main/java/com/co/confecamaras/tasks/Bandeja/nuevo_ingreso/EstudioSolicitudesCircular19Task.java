package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;



import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class EstudioSolicitudesCircular19Task implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                SwitchToNewWindow.switchToNewTab(),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso correctammete a Estudio Solicitudes Circular 19)" )
                      );

        actor.attemptsTo(
                WaitSeconds.seconds(4),
                LogEvent.recordevent(Reportes.PASSED, "Se Finalizo corectamente las validaciones a Estudio Solicitudes Circular 19" )


        );

    }

    public static EstudioSolicitudesCircular19Task Abogados() {
        return new EstudioSolicitudesCircular19Task();
    }
}