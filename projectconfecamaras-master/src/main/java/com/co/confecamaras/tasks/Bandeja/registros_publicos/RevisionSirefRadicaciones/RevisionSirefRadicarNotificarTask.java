package com.co.confecamaras.tasks.Bandeja.registros_publicos.RevisionSirefRadicaciones;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.RevisionSirefRadicacionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class RevisionSirefRadicarNotificarTask implements Task {
    private final String codigo_barras;

    public RevisionSirefRadicarNotificarTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(ElementoElegible.para(AccionesPage.LINK_ACCION.of("Enviar")))) {
            actor.attemptsTo(
                    ConsultaGrillaTask.consultar(codigo_barras),
                    Click.on(AccionesPage.LINK_ACCION.of("Enviar")),
                    LogEvent.recordevent(Reportes.PASSED, "Se ingreso a la acción de notificar"),
                    Click.on(RevisionSirefRadicacionesPage.BTN_REGRESAR)
            );
        } else
            actor.attemptsTo(LogEvent.recordevent(Reportes.WARNING, "No se encontro la accion de Notificaciones"));
    }

    public static RevisionSirefRadicarNotificarTask notificar(String codigo_barras) {
        return new RevisionSirefRadicarNotificarTask(codigo_barras);
    }
}
