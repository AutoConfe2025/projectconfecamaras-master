package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.*;


public class IngresoPorCuentaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Enter.theValue("2025-11-01").into(CAMPO_FECHA_INICIO),
                Enter.theValue("2025-11-15").into(CAMPO_FECHA_FIN),
                Click.on(ENLACE_GENERAR),
                AcceptAlert.aceptar()
        );


        actor.attemptsTo(
                WaitInteractions.untilAppears(ENLACE_RELACION_MOVIMIENTOS_CUENTA),
                Click.on(ENLACE_RELACION_MOVIMIENTOS_CUENTA),

                GuardarArchivo.guardar(),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA),
                LogEvent.recordevent(Reportes.PASSED, "Se descargado el Archivo correctamente "),
                WaitSeconds.seconds(3)

        );


    }

    public static IngresoPorCuentaTask Cuenta() {
        return new IngresoPorCuentaTask();
    }
}