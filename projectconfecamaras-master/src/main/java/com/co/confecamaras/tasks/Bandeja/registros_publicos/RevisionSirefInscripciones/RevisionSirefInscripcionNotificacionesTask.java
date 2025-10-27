package com.co.confecamaras.tasks.Bandeja.registros_publicos.RevisionSirefInscripciones;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.RevisionSirefInscripcionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class RevisionSirefInscripcionNotificacionesTask implements Task {
    private final String dato;

    public RevisionSirefInscripcionNotificacionesTask(String dato) {
        this.dato = dato;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(ElementoElegible.para(RevisionSirefInscripcionesPage.LINK_NOTIFICAR_SMS))) {
            actor.attemptsTo(
                    ConsultaGrillaTask.consultar(dato),
                    Click.on(RevisionSirefInscripcionesPage.LINK_NOTIFICAR_SMS)
            );
            if (!actor.asksFor(ElementoElegible.para(RevisionSirefInscripcionesPage.BTN_NOTIFICAR_EMAILS)) || !actor.asksFor(ElementoElegible.para(RevisionSirefInscripcionesPage.BTN_NOTIFICAR_SMS))) {
                Reportes.reportEvent(Reportes.WARNING,"No se encontraron los botones para enviar notificacion");
            }
            actor.attemptsTo(
                    LogEvent.recordevent(Reportes.PASSED, "Se ingreso a la acción de notificar"),
                    Click.on(RevisionSirefInscripcionesPage.BTN_REGRESAR)
            );
        } else
            actor.attemptsTo(LogEvent.recordevent(Reportes.WARNING, "No se encontro la accion de Notificaciones"));
    }

    public static RevisionSirefInscripcionNotificacionesTask notificacion(String dato) {
        return new RevisionSirefInscripcionNotificacionesTask(dato);
    }
}
