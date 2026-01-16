package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;



import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.*;


public class ExportarSaldosPrepagoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Enter.theValue("G").into(CAMPO_TIPO_INFORME),
                WaitSeconds.seconds(2),
                Click.on(ENLACE_EXTRAER),
                WaitSeconds.seconds(2),
                Click.on(BOTON_DESCARGAR_EXCEL)

        );

        long tiempoDescargaInicio = System.currentTimeMillis();
        actor.attemptsTo(
                LogEvent.recordevent(Reportes.INFO, "Iniciando monitoreo de descarga en carpeta del sistema."),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA, 120, tiempoDescargaInicio),
                LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamnete Exportar Saldos Prepago")
        );








    }

    public static ExportarSaldosPrepagoTask estadisticasYextracciones() {
        return new ExportarSaldosPrepagoTask();
    }
}