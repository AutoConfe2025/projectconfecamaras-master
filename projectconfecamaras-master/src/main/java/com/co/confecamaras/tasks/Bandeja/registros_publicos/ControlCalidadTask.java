package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.ControlCalidad.*;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.PublicarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ControlCalidadTask implements Task {
    private final String codigo_barras;

    public ControlCalidadTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaTask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                VerCertificadoTask.certificado(),
                DigitarInformacionTask.informacion(codigo_barras),
                ConfirmarTask.confirmar(),
                RegresarEstudioTask.estudio(),
                RegresarDigitacionTask.digitacion(),
                PublicarTask.publicar("Archivar trámite", "continuara")
        );
    }

    public static ControlCalidadTask control(String codigo_barras) {
        return new ControlCalidadTask(codigo_barras);
    }
}
