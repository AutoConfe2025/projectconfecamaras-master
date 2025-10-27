package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryConfecamarasCambiarEstadoCodBarras;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.*;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class RevisionDesistimientoPresencialTask implements Task {
    public RevisionDesistimientoPresencialTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    private final String codigo_barras;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                QueryConfecamarasCambiarEstadoCodBarras.CambiarEstado(), // COMENTAREAR LINEA SI NO TIENE ACCESO A LA BD
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaTask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                MarcarPersonaTask.notificar(AccionesPage.LINK_ACCION.of("Marcar notificado presencialmente"), codigo_barras, "Isaac qa", "prueba manual"),
                ArchivarTask.archivar()
        );
    }

    public static RevisionDesistimientoPresencialTask revision(String codigo_barras) {
        return new RevisionDesistimientoPresencialTask(codigo_barras);
    }
}
