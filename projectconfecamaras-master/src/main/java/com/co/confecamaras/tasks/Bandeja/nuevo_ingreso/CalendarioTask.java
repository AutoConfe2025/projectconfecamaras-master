package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.HacerClicEnFechaDinamica;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.ENLACE_GRABAR;
import static com.co.confecamaras.userinterfaces.utils.FechasDinamicasPage.ELEMENTO_FECHA_DINAMICA;


public class CalendarioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                HacerClicEnFechaDinamica.conID(ELEMENTO_FECHA_DINAMICA,"20260205"),
                HacerClicEnFechaDinamica.conID(ELEMENTO_FECHA_DINAMICA,"20260212"),
                HacerClicEnFechaDinamica.conID(ELEMENTO_FECHA_DINAMICA,"20260219"),
                WaitSeconds.seconds(2),
                Scroll.to(ENLACE_GRABAR),
                WaitSeconds.seconds(2)
        );




    }

    public static CalendarioTask mantenimiento() {
        return new CalendarioTask();
    }
}