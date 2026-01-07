package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.hamcrest.Matchers;

import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MigracionActivosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2)
        );


        while (WebElementQuestion.the(CARGA_ACTIVOS).answeredBy(actor).isPresent()) {


            actor.attemptsTo(
                    Click.on(CARGA_ACTIVOS),
                    AcceptAlert.aceptar(),
                    LogEvent.recordevent(Reportes.INFO, "Elemento CARGA_ACTIVOS encontrado. Clic e intento de aceptar alerta."),
                    WaitSeconds.seconds(2)
            );


        }



        actor.attemptsTo(
                LogEvent.recordevent(Reportes.PASSED, "El elemento CARGA_ACTIVOS ya no está presente. Continuando con la validación de la página."),
                WaitInteractions.untilAppears(TEXTO_MIGRACION)
        );

        actor.should(
                seeThat(
                        Text.of(TEXTO_MIGRACION),

                        Matchers.containsString("Proceso terminado con errores")
                )
        );

        actor.attemptsTo(
                LogEvent.recordevent(Reportes.PASSED, "Validacion de texto cumplida"),
                WaitSeconds.seconds(3)
        );
    }

    public static MigracionActivosTask jsp7() {
        return new MigracionActivosTask();
    }
}