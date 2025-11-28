package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.CAMPO_BUSQUEDA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class IngresarCodioBarras implements Task {

    private final String codigo;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(CAMPO_BUSQUEDA, isVisible()).forNoMoreThan(360).seconds(),
                Click.on(CAMPO_BUSQUEDA),
                Enter.theValue(codigo).into(CAMPO_BUSQUEDA)
        );
    }

    public static IngresarCodioBarras IngresaCodigo(String codigo){
        return new IngresarCodioBarras(codigo);
    }
}
