package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.RelaciondeAnexosDocumentalesPage.*;


public class RelaciondeAnexosDocumentalesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                SwitchToNewWindow.switchToNewTab(),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso correctammete a Georeferenciar Censo Empresarial (Armenia)" )
                      );


        actor.attemptsTo(


                WaitSeconds.seconds(1),
                Scroll.to(CAMPO_MATRICULA_INICIAL),
                Enter.theValue("42739").into(CAMPO_MATRICULA_INICIAL),
                Enter.theValue("42739").into(CAMPO_MATRICULA_FINAL),
                Enter.theValue("N").into(CAMPO_SIN_IMAGEN),
                Click.on(BOTON_GENERAR_TABLA),
                WaitInteractions.untilAppears(ENLACE_DESCARGAR)
        );
        long tiempoDescargaInicio = System.currentTimeMillis();
        actor.attemptsTo(
                Click.on(ENLACE_DESCARGAR),
                LogEvent.recordevent(Reportes.INFO, "Iniciando monitoreo de descarga en carpeta del sistema."),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA, 120, tiempoDescargaInicio),

                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Extracción de Afiliados Establecimientos" )

        );






    }

    public static RelaciondeAnexosDocumentalesTask Escaneo() {
        return new RelaciondeAnexosDocumentalesTask();
    }
}