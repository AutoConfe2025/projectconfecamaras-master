package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.EstadisticasYExtracciones.FirmezaInscripcionesProponentesPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class FirmezaInscripcionesProponentesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(LINK_VERIFICAR_INSCRIPCIONES, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LINK_VERIFICAR_INSCRIPCIONES),

                // Manejo de la alerta (Asegúrate que el log confirme que se aceptó)
                WaitSeconds.seconds(2),
                AcceptAlert.aceptar(),

                // ESPERAR A QUE EL ICONO APAREZCA (Ya no usamos Switch.toFrame)
                WaitUntil.the(ICONO_VER_XML, isPresent()).forNoMoreThan(20).seconds(),

                LogEvent.recordevent(Reportes.INFO, "Icono XML detectado, ejecutando JavaScript Click"),
                JavaScriptClick.on(ICONO_VER_XML),
                WaitSeconds.seconds(3),

                // Espera al modal y cierra
                WaitUntil.the(BOTON_CERRAR_MODAL, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_CERRAR_MODAL),


                // Poner en firme
                WaitUntil.the(ICONO_PONER_EN_FIRME, isPresent()).forNoMoreThan(20).seconds(),
                JavaScriptClick.on(ICONO_PONER_EN_FIRME),
                WaitSeconds.seconds(2),
                AcceptAlert.aceptar(),
                WaitSeconds.seconds(3),
                Click.on(BOTON_CERRAR_MODAL)
        );

        actor.attemptsTo(LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamente Poner en firme"));
    }

    public static FirmezaInscripcionesProponentesTask estadisticasYextracciones() {
        return new FirmezaInscripcionesProponentesTask();
    }
}


