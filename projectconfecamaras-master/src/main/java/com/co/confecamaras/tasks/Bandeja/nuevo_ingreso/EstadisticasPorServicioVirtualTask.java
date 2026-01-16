package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoDeImpuestoPage.*;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoDeImpuestoPage.BTN_GENERAR;


public class EstadisticasPorServicioVirtualTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Enter.theValue("01122025").into(INPUT_FECHA_INICIAL_DETALLADO),
                Enter.theValue("22122025").into(INPUT_FECHA_FINAL_DETALLADO),
                WaitSeconds.seconds(2),
                Click.on(BTN_GENERAR),
                WaitSeconds.seconds(2),
                Click.on(BTN_ACEPTAR_GENERAR),
                 WaitSeconds.seconds(2)
        );


        actor.attemptsTo(

                LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamnete Estadísticas Por Servicio (Virtual) ")
        );








    }

    public static EstadisticasPorServicioVirtualTask estadisticasYextracciones() {
        return new EstadisticasPorServicioVirtualTask();
    }
}