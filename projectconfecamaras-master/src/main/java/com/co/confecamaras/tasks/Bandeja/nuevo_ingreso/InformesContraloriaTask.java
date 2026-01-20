package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.ComparativoRenovacionesPage.*;


public class InformesContraloriaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Enter.theValue("2026").into(INPUT_ANO_RENOVACION),
                Enter.theValue("frojas@confecamaras.org.co").into(INPUT_EMAIL_CONTROL),
                WaitSeconds.seconds(2),
                Click.on(BTN_GENERAR),
                WaitSeconds.seconds(2),
                Click.on(BTN_ACEPTAR_GENERAR),
                 WaitSeconds.seconds(2)
        );


        actor.attemptsTo(

                LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamnete Comparativo Renovaciones")
        );








    }

    public static InformesContraloriaTask estadisticasYextracciones() {
        return new InformesContraloriaTask();
    }
}