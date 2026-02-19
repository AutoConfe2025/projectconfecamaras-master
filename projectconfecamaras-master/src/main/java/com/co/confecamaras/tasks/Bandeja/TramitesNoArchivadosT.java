package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_COMENTARIOS;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.TARJETA_COMENTARIOS_COMPLETA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.is;

public class TramitesNoArchivadosT implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_COMENTARIOS),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(TARJETA_COMENTARIOS_COMPLETA, isVisible()).forNoMoreThan(30).seconds()
        );

        actor.should(
                seeThat("La tarjeta de comentarios es visible",
                        ValidaComentarioPresente.ahora(), is(true))
        );
    }

    public static TramitesNoArchivadosT noArchivados(){
        return new TramitesNoArchivadosT();
    }
}
