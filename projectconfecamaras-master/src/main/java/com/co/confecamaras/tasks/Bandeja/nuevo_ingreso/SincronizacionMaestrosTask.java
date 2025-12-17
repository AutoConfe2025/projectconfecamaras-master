package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SincronizacionMaestrosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2));


        actor.should(

                seeThat(
                        Text.of(TEXTO_BODY),
                        Matchers.equalTo("Error, no se encontraron los parametros de conexion con JSP7 (revise claves-valor)")

                )
        );
        actor.attemptsTo(
                LogEvent.recordevent(Reportes.PASSED, "Validacion de texto cumplida"),
                WaitSeconds.seconds(2)
        );

    }

    public static SincronizacionMaestrosTask jsp7() {
        return new SincronizacionMaestrosTask();
    }
}
