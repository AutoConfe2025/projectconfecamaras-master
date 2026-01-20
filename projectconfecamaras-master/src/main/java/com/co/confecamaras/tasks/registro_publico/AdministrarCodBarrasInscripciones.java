package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.interactions.ScrollHastaElFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.BTN_GENERAR_DATA_PICKER;

public class AdministrarCodBarrasInscripciones implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GENERAR_DATA_PICKER),
                AceptAlert.aceptar(),
                ScrollHastaElFinal.deLaPagina()
        );
    }

    public static AdministrarCodBarrasInscripciones CodBarrasInscripciones() {
        return new AdministrarCodBarrasInscripciones();
    }
}
