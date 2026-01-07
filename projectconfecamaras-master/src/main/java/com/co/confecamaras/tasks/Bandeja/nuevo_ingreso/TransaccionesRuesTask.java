package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.utils.SeleccionarFechaCalendario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TransaccionesRUESPage.*;

public class TransaccionesRuesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_CONTINUAR),
                Click.on(BOTON_CONTINUAR),
                Click.on(BOTON_NUEVA_CONSULTA),
                WaitSeconds.seconds(2),
                SeleccionarFechaCalendario.conFecha(10, 11, 2025),
                Click.on(BTN_CONSULTAR),
                WaitSeconds.seconds(2),

                TransaccionesRuesAccionesTask.acciones()
        );
    }

    public static TransaccionesRuesTask rues() {
        return new TransaccionesRuesTask();
    }
}
