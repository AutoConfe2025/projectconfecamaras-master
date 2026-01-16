package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;



import com.co.confecamaras.interactions.News.AcceptAlert;
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


public class VerificacionInfFinancieraDec399Task implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),

                WaitSeconds.seconds(2),
                Click.on(BOTON_CONSTRUIR),
                WaitSeconds.seconds(1),
                Click.on(BOTON_EJECUTAR),
                WaitSeconds.seconds(3),
                Click.on(LINK_DESCARGAR_EXTRACCION)

        );

        long tiempoDescargaInicio = System.currentTimeMillis();
        actor.attemptsTo(
                LogEvent.recordevent(Reportes.INFO, "Iniciando monitoreo de descarga en carpeta del sistema."),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA, 120, tiempoDescargaInicio),
                LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamnete Verificacion Inf Financiera Dec 399")
        );

    }

    public static VerificacionInfFinancieraDec399Task estadisticasYextracciones() {
        return new VerificacionInfFinancieraDec399Task();
    }
}