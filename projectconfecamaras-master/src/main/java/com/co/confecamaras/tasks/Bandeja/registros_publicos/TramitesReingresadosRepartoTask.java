package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.EscanearTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.FinalizarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class TramitesReingresadosRepartoTask implements Task {
    private final String codigo_barras;

    public TramitesReingresadosRepartoTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaTask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                EscanearTask.escanear("Escanear", codigo_barras),
                FinalizarTask.finalizar("Finalizar escaneo y digitalización", "continuara", codigo_barras)
        );
    }

    public static TramitesReingresadosRepartoTask tramites(String codigo_barras) {
        return new TramitesReingresadosRepartoTask(codigo_barras);
    }


}
