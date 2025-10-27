package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.News.ManagePageAlert;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.PublicarTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class TramitesDevueltosTask implements Task {
    private final String codigo_barras;

    public TramitesDevueltosTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaTask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION")
        );
        try{
            actor.attemptsTo(PublicarTask.publicar("Entregar al usuario", "cancelara"));
        }catch (Exception e) {
            actor.attemptsTo(
                    Click.on(AccionesPage.LINK_ACCION.of("Entregar al usuario")),
                    ManagePageAlert.accept(AccionesPage.TXT_ALERT,AccionesPage.BTN_OK)
            );
        }
    }

    public static TramitesDevueltosTask devueltos(String codigo_barras) {
        return new TramitesDevueltosTask(codigo_barras);
    }
}
