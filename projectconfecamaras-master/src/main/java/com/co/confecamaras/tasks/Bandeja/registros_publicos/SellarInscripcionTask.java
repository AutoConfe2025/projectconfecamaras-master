package com.co.confecamaras.tasks.Bandeja.registros_publicos;


import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInteractions;

import com.co.confecamaras.tasks.CompararElContenidoDelPDFEnMismaPestana;
import com.co.confecamaras.utils.bandejas.Sellar_Inscripcion.Variables_SellarInscripcion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static com.co.confecamaras.userinterfaces.Bandejas.Sellar_Inscripcion.SellarInscripcionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class SellarInscripcionTask implements Task {

    public SellarInscripcionTask() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab()
        );
        if (ENLACE_ACCION_FILA_UNO.isVisibleFor(actor)) {
            actor.attemptsTo(
                    SwitchToNewWindow.switchToNewTab(),
                    WaitUntil.the(ENLACE_ACCION_FILA_UNO, isVisible()).forNoMoreThan(10).seconds()
            );

            // PASO 2: Simular Movimiento del Mouse y Clic (Actions)
            actor.attemptsTo(

                    Click.on(ENLACE_ACCION_FILA_UNO)
            );
            // PASO 3: Navegación post-clic (enlace CAJAQA)
            actor.attemptsTo(
                    WaitSeconds.seconds(1),
                    WaitInteractions.untilBeEnable(ENLACE_CAJAQA),
                    Click.on(ENLACE_CAJAQA)
            );

            // PASO 4: Descarga del Sello
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(ENLACE_DESCARGAR_SELLO),
                    Click.on(ENLACE_DESCARGAR_SELLO),
                    WaitConstant.esperaConstante()
            );
        }else {
            System.out.println("no se enconrtro data para poder realizar el proceso");
        }
    }


    public static SellarInscripcionTask ver() {
        return new SellarInscripcionTask();
    }
}