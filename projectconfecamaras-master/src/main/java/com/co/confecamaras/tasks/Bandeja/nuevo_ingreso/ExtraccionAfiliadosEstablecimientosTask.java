package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ExtraccionAfiliadosEstablecimientosPage.*;


public class ExtraccionAfiliadosEstablecimientosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                SwitchToNewWindow.switchToNewTab(),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso correctammete a Extraccion dec Afiliados Establecimientos " )
                      );


        actor.attemptsTo(


                WaitSeconds.seconds(1),
                Click.on(BOTON_GENERAR),
                WaitSeconds.seconds(2),
                Click.on(BOTON_GENERAR_REPORTE),
                WaitSeconds.seconds(2),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Extracción de Afiliados Establecimientos" )

        );






    }

    public static ExtraccionAfiliadosEstablecimientosTask EstadisticasyExtracciones() {
        return new ExtraccionAfiliadosEstablecimientosTask();
    }
}