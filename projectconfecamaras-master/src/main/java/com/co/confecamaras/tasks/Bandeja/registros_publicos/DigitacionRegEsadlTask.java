package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryDigitacionRegEsadlCambiarEstadoCodBarras;
import com.co.confecamaras.interactions.News.RefreshPage;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones.ActualizacionRuesTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones.AdicionarVinculosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones.EnvioInformacionTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones.FinalizarArchivarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class DigitacionRegEsadlTask implements Task {
    private final String codigo_barras;

    public DigitacionRegEsadlTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                QueryDigitacionRegEsadlCambiarEstadoCodBarras.cambiarEstado(codigo_barras),
                RefreshPage.refresh(),
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaTask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                ConsultaGrillaTask.consultar(codigo_barras),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Digitar informacion")),
                AdicionarVinculosTask.adicionar(),
                ActualizacionRuesTask.actualizar(),
                EnvioInformacionTask.envio(codigo_barras),
                FinalizarArchivarTask.realizar(codigo_barras)
        );
    }

    public static DigitacionRegEsadlTask digitar(String codigo_barras) {
        return new DigitacionRegEsadlTask(codigo_barras);
    }
}
