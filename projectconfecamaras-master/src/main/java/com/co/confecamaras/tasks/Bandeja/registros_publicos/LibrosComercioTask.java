package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.LibrosComercio.DevolverRequerirTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.LibrosComercio.EstudiarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.FinalizarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.PublicarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.HashMap;
import java.util.Map;

public class LibrosComercioTask implements Task {
    private final String codigo_barras;

    public LibrosComercioTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaTask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                EstudiarTask.estudiar("Estudiar", codigo_barras),
                DevolverRequerirTask.devolverRequerir("Devolver/Requerir"),
                PublicarTask.publicar("Finalizar estudio","cancelara"),
                PublicarTask.publicar("Archivar trámite","cancelara")
        );
    }

    public static LibrosComercioTask libros(String codigo_barras) {
        return new LibrosComercioTask(codigo_barras);
    }
}
