package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.Bandejas.Administracion.AdminPage.*;
import static com.co.confecamaras.userinterfaces.EstadisticasYExtracciones.InformesSSPage.*;


public class RelacionDeEmailssnotificacionesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Enter.theValue("01122025").into(CAMPO_FECHA_INICIAL),
                Enter.theValue("31122025").into(CAMPO_FECHA_FINAL),
                WaitSeconds.seconds(2),
                Enter.theValue("frojasqaconfe@gmail.com").into(CAMPO_EMAIL_USUARIO_SISTEMA),
                Scroll.to(BOTON_EXPORTAR),
                Click.on(BOTON_EXPORTAR),
                WaitSeconds.seconds(2)
        );


        actor.attemptsTo(

                LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamnete Relación de EMAILs (notificaciones)")
        );


    }

    public static RelacionDeEmailssnotificacionesTask estadisticasYextracciones() {
        return new RelacionDeEmailssnotificacionesTask();
    }
}