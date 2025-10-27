package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryConfecamarasCambiarEstadoCodBarras;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.MarcarPersonaTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.PublicarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage.*;

public class RevisionDesistimientoTelefonicoTask implements Task {
    private final String codigo_barras;

    public RevisionDesistimientoTelefonicoTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                QueryConfecamarasCambiarEstadoCodBarras.CambiarEstado(), // COMENTAREAR LINEA SI NO TIENE ACCESO A LA BD
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaTask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                MarcarPersonaTask.notificar(AccionesPage.LINK_ACCION.of("Marcar notificado telefonicamente"), codigo_barras, "Isaac qa", "prueba manual")
                //PublicarTask.publicar("Archivar trámite", "cancelar")
        );
        actor.attemptsTo(
                Clear.field(INPUT_BUSCAR),
                ConsultaGrillaTask.consultar(codigo_barras),
                WaitInteractions.untilBeEnable(BTN_ARCHIVAR),
                JavaScriptClick.on(BTN_ARCHIVAR),
                Click.on(AccionesPage.BTN_CANCELAR_F),
                LogEvent.recordevent(Reportes.PASSED, "Se ha cancelado el trámite")
        );
    }

    public static RevisionDesistimientoTelefonicoTask revision(String codigo_barras) {
        return new RevisionDesistimientoTelefonicoTask(codigo_barras);
    }
}
