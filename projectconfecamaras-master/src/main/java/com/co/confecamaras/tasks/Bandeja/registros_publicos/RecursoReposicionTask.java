package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBackHome;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.*;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class RecursoReposicionTask implements Task {
    private final String codigo_barras;

    public RecursoReposicionTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaTask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                ResponderRecursoAccionTask.recurso("Responder Recurso", codigo_barras),
                PublicarTask.publicar("Archivar trámite", "CANCELARA"),
                CloseCurrentWindowAndSwitchBackHome.closeAndSwitchBackHome()
        );
    }

    public static RecursoReposicionTask recursos(String codigo_barras) {
        return new RecursoReposicionTask(codigo_barras);
    }


}
