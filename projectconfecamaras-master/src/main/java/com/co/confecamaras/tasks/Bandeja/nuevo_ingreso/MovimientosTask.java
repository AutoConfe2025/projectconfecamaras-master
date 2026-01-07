package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.*;


public class MovimientosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Enter.theValue("2025-05-01").into(CAMPO_FECHA_INICIO),
                Enter.theValue("2025-05-30").into(CAMPO_FECHA_FIN),
                Click.on(ENLACE_GENERAR),
                AcceptAlert.aceptar()
        );


        actor.attemptsTo(
                Click.on(ENLACE_RELACION_MOVIMIENTOS),

//                GuardarArchivo.guardar(),
//                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA,120),
                LogEvent.recordevent(Reportes.PASSED, "Se descargado el Archivo correctamente "),
//                Click.on(SEGUNDO_ENLACE_CENTRAL),
                WaitSeconds.seconds(3)



//                GuardarArchivo.guardar(),
//                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA),
//                LogEvent.recordevent(Reportes.PASSED, "Se descargado el Archivo correctamente ")
        );


    }

    public static MovimientosTask RUES() {
        return new MovimientosTask();
    }
}