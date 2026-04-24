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
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.EstadisticasYExtracciones.InformesSSPage.*;


public class InformesSSTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Enter.theValue("2025").into(INPUT_ANO_INICIAL),
                Enter.theValue("2025").into(INPUT_ANO_FINAL),
                WaitSeconds.seconds(2),
                SelectFromOptions.byVisibleText("Producción").from(SELECT_AMBIENTE),
                Enter.theValue("2025").into(INPUT_ANO_SUPERVIVENCIA),
                Enter.theValue("101015").into(INPUT_CIIU),
                Enter.theValue("frojasqaconfe@gmail.com").into(INPUT_CIIU),
                Scroll.to(BOTON_EXTRAER),
                Click.on(BOTON_EXTRAER),
                WaitSeconds.seconds(2),
                Click.on(BTN_ACEPTAR_GENERAR),
                WaitSeconds.seconds(2)
        );

        actor.attemptsTo(
                LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamnete Informes SS")
        );
    }

    public static InformesSSTask estadisticasYextracciones() {
        return new InformesSSTask();
    }
}