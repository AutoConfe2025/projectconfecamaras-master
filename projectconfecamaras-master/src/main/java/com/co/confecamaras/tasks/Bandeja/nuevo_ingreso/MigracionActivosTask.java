package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.CARGA_ACTIVOS;

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
    }

    public static MigracionActivosTask jsp7() {
        return new MigracionActivosTask();
    }
}