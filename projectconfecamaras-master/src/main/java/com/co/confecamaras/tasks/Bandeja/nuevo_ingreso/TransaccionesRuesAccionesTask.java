package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.cambiarpestana.SwitchToWindow;
import com.co.confecamaras.interactions.cerrarpestana.CloseCurrentWindow;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TransaccionesRUESPage;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.News.gestion_archivos.CargarArchivo;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Alert;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TransaccionesRUESPage.*;

public class TransaccionesRuesAccionesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_OPCIONES_PRIMER_RESULTADO),
                Click.on(OPCION_RUTA_NACIONAL),
                LogEvent.recordevent(Reportes.PASSED, "Acción: Consulta de ruta nacional"),
                WaitSeconds.seconds(3),
                Click.on(BTN_CERRAR_MODAL)
        );
        actor.attemptsTo(
                Click.on(BTN_OPCIONES_PRIMER_RESULTADO),
                Click.on(OPCION_SINCRONIZAR_ESTADOS),
                LogEvent.recordevent(Reportes.PASSED, "Acción: Sincronizar estados con RUES"),
                WaitSeconds.seconds(3)


        );
        actor.attemptsTo(
                Click.on(BTN_OPCIONES_PRIMER_RESULTADO),
                Click.on(OPCION_SOLICITAR_CAMBIO_ESTADO),
                LogEvent.recordevent(Reportes.PASSED, "Acción: Solicitar cambio de estado"),
                WaitSeconds.seconds(3),
                Click.on(BTN_CERRAR_MODAL)


        );
        actor.attemptsTo(
                Click.on(BTN_OPCIONES_PRIMER_RESULTADO),
                Click.on(OPCION_VISOR_IMAGENES),
                LogEvent.recordevent(Reportes.PASSED, "Vísor de imágenes"),
                WaitSeconds.seconds(3),

//                GuardarArchivo.guardar(),
//                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_EVIDENCIAS)
                Click.on(BTN_CERRAR_MODAL)


        );
    }

    public static TransaccionesRuesAccionesTask acciones() {
        return new TransaccionesRuesAccionesTask();
    }
}
