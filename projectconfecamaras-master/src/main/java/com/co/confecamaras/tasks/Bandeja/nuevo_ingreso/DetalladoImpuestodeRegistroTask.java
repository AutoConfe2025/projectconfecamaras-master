package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.GestonDeCajaPage.*;


public class DetalladoImpuestodeRegistroTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso correctammete a Detallado de Impuesto de Registro " ),
                Click.on(BOTON_CONSULTAR)
                );

        long tiempoDescargaInicio = System.currentTimeMillis();

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                Enter.theValue("05122025").into(CAMPO_FECHA_INICIAL),
                Enter.theValue("05122025").into(CAMPO_FECHA_FINAL),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso la fecha correctamente" ),
                WaitSeconds.seconds(1),
                Click.on(BOTON_CONSULTAR)
        );

        actor.attemptsTo(
                Click.on(BOTON_DESCARGAR_MODAL),
                LogEvent.recordevent(Reportes.INFO, "Iniciando monitoreo de descarga en carpeta del sistema."),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA, 120, tiempoDescargaInicio),
                Click.on(BOTON_OK)
        );
    }
    public static DetalladoImpuestodeRegistroTask Gestiondecaja() {
        return new DetalladoImpuestodeRegistroTask();
    }
}