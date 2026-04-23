package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.log.Log;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.LibrosComercio.DevolverRequerirTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.LibrosComercio.EstudiarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.FinalizarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.PublicarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.HashMap;
import java.util.Map;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage.TITULO_LIBROS_COMERCIO;

public class LibrosComercioTask implements Task {
    private final String codigo_barras;

    public LibrosComercioTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toNewWindow(),
                WaitSeconds.seconds(2)
        );
        if(actor.asksFor(ElementoElegible.para(TITULO_LIBROS_COMERCIO))){
            actor.attemptsTo(
                    Log.message("Ingreso a Libros de comercio"),
                    ConsultaGrillaTask.consultar(codigo_barras),
                    VerRutaTask.verRuta("Ver ruta", codigo_barras),
                    AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                    EstudiarTask.estudiar("Estudiar", codigo_barras),
                    DevolverRequerirTask.devolverRequerir("Devolver/Requerir"),
                    PublicarTask.publicar("Finalizar estudio","cancelara"),
                    PublicarTask.publicar("Archivar trámite","cancelara")
            );
        } else {
            actor.attemptsTo(
                    Log.message("else"),
                    ConsultaGrillaTask.consultar(codigo_barras),
                    VerRutaTask.verRuta("Ver ruta", codigo_barras),
                    AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                    EstudiarTask.estudiar("Estudiar", codigo_barras),
                    DevolverRequerirTask.devolverRequerir("Devolver/Requerir"),
                    PublicarTask.publicar("Finalizar estudio","cancelara"),
                    PublicarTask.publicar("Archivar trámite","cancelara")
            );
        }
    }

    public static LibrosComercioTask libros(String codigo_barras) {
        return new LibrosComercioTask(codigo_barras);
    }
}
