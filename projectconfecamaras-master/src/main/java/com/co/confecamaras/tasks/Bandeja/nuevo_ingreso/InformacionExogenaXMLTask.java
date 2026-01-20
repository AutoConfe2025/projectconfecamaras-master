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

import static com.co.confecamaras.userinterfaces.EstadisticasYExtracciones.InformacionExogenaXMLPage.*;


public class InformacionExogenaXMLTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Enter.theValue("01012026").into(INPUT_ANO_INICIAL),
                WaitSeconds.seconds(2),
                Enter.theValue("07012026").into(INPUT_ANO_FINAL),
                Enter.theValue("1").into(INPUT_NUMERO_ENVIO),
                Enter.theValue("1").into(INPUT_TIPO),
                SelectFromOptions.byVisibleText("Default")
                        .from(SELECT_AMBIENTE),
                Enter.theValue("frojas@confecamaras.org.co").into(INPUT_CORREO),
                Scroll.to(BTN_GENERAR),
                Click.on(BTN_GENERAR),
                WaitSeconds.seconds(2),
                Click.on(BOTON_GENERAR_SEGUNDO),
                 WaitSeconds.seconds(2)
        );


        actor.attemptsTo(

                LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamente Información Exógena - XML")
        );








    }

    public static InformacionExogenaXMLTask estadisticasYextracciones() {
        return new InformacionExogenaXMLTask();
    }
}