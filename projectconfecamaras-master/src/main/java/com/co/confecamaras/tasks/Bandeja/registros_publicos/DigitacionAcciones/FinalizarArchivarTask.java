package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.database.Bandeja.QueryDigitacionRegEsadlCambiarEstadoCodBarras;
import com.co.confecamaras.interactions.News.RefreshPage;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.FinalizarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.PublicarTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.TXT_FECHA_INICIAL;

public class FinalizarArchivarTask implements Task {
    private final String codigo_barras;

    public FinalizarArchivarTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(TXT_FECHA_INICIAL))){
            actor.attemptsTo(
                    PublicarTask.publicar("Finalizar digitación", "continuara"),
                    Click.on(DigitacionPage.BTN_VOLVER)
            );
        }
        actor.attemptsTo(
                QueryDigitacionRegEsadlCambiarEstadoCodBarras.cambiarEstado(codigo_barras),
                RefreshPage.refresh(),
                ConsultaGrillaTask.consultar(codigo_barras),
                FinalizarTask.finalizar("Archivar trámite", "continuara", codigo_barras),
                Click.on(DigitacionPage.BTN_REGRESAR),
                QueryDigitacionRegEsadlCambiarEstadoCodBarras.cambiarEstado(codigo_barras),
                RefreshPage.refresh(),
                ConsultaGrillaTask.consultar(codigo_barras)
        );
    }

    public static FinalizarArchivarTask realizar(String codigo_barras) {
        return new FinalizarArchivarTask(codigo_barras);
    }
}
