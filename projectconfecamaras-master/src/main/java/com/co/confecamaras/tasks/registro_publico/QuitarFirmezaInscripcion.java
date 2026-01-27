package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.registros_publicos.FirmezaInscripcionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class QuitarFirmezaInscripcion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_INSCRIPCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_INSCRIPCION),
                Enter.theValue("38962").into(CAMPO_INSCRIPCION),
                Click.on(BOTON_CONSULTAR_MY_BOTON),
                WaitUntil.the(BOTON_LEVANTAR_FIRMEZA, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_LEVANTAR_FIRMEZA),
                Click.on(BOTON_LEVANTAR_FIRMEZA),
                AceptAlert.aceptar()
        );
    }

    public static QuitarFirmezaInscripcion quitarFirmeza(){
        return new QuitarFirmezaInscripcion();
    }
}
