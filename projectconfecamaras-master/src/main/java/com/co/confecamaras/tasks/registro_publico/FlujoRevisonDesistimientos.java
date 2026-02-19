package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.BOTON_REGRESAR_AREF_MIN;
import static com.co.confecamaras.userinterfaces.registros_publicos.RevisionDesistimientosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoRevisonDesistimientos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_REVISAR,isPresent()).forNoMoreThan(50).seconds(),
                Click.on(BOTON_REVISAR),
                WaitUntil.the(BOTON_REGRESAR_AREF_MIN,isPresent()).forNoMoreThan(50).seconds(),
                Scroll.to(BOTON_REGRESAR_AREF_MIN),
                Click.on(BOTON_REGRESAR_AREF_MIN),
                WaitUntil.the(BOTON_REGENERAR,isPresent()).forNoMoreThan(50).seconds(),
                Click.on(BOTON_REGENERAR),
                AceptAlert.aceptar()
        );
    }
    public static FlujoRevisonDesistimientos revisionDesistimientos(){
        return new FlujoRevisonDesistimientos();
    }
}
