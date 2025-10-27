package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.PublicarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerJsonTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerXMLTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.BTN_PUBLICAR;

public class NoticiasNoPublicadasRueTask implements Task {
    private final String dato_consulta;

    public NoticiasNoPublicadasRueTask(String datoConsulta) {
        dato_consulta = datoConsulta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ConsultaGrillaTask.consultar(dato_consulta),
                VerXMLTask.ver("seccionalentidad"),
                VerJsonTask.ver("seccionalentidad"),
                ConsultaGrillaTask.consultar(dato_consulta)
        );
        if(actor.asksFor(ElementoElegible.para(BTN_PUBLICAR))){
            actor.attemptsTo(
                    PublicarTask.publicar("Publicar en RUE", "CANCELARA")
            );
        }
    }

    public static NoticiasNoPublicadasRueTask noticias(String dato_consulta) {
        return new NoticiasNoPublicadasRueTask(dato_consulta);
    }
}
