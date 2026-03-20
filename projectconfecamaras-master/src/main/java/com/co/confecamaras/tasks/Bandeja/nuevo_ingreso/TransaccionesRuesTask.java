package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.cambiarpestana.SwitchToWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TransaccionesRUESPage.CAMPO_FECHA_RUES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class TransaccionesRuesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToWindow.at(1),
                WaitUntil.the(CAMPO_FECHA_RUES,isPresent()).forNoMoreThan(30).seconds(),
                Clear.field(CAMPO_FECHA_RUES),
                Enter.theValue("20251110").into(CAMPO_FECHA_RUES),
                SendKeys.of(Keys.TAB).into(CAMPO_FECHA_RUES),
                TransaccionesRuesAccionesTask.acciones()
        );
    }

    public static TransaccionesRuesTask rues() {
        return new TransaccionesRuesTask();
    }
}
