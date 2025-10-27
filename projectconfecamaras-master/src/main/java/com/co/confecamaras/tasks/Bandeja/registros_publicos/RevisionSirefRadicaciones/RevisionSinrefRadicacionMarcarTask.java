package com.co.confecamaras.tasks.Bandeja.registros_publicos.RevisionSirefRadicaciones;

import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBackHome;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.RevisionSirefRadicacionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RevisionSinrefRadicacionMarcarTask implements Task {
    private final String observacion;
    private final String codigo_barras;

    public RevisionSinrefRadicacionMarcarTask(String codigo_barras, String observacion) {
        this.codigo_barras = codigo_barras;
        this.observacion = observacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(ElementoElegible.para(AccionesPage.LINK_ACCION.of("Marcar como revisado")))) {
            actor.attemptsTo(
                    ConsultaGrillaTask.consultar(codigo_barras),
                    Click.on(AccionesPage.LINK_ACCION.of("Marcar como revisado")),
                    LogEvent.recordevent(Reportes.PASSED, "Se ingreso a la acción de marcar como revisado"),
                    Enter.theValue(observacion).into(RevisionSirefRadicacionesPage.TXTA_OBSERVACION),
                    Click.on(RevisionSirefRadicacionesPage.BTN_REGRESAR)
            );
        } else

            actor.attemptsTo(LogEvent.recordevent(Reportes.WARNING, "No se encontro la accion para Marcar como leido"));
        actor.attemptsTo(CloseCurrentWindowAndSwitchBackHome.closeAndSwitchBackHome());
    }

    public static RevisionSinrefRadicacionMarcarTask marcar(String codigo_barras, String observacion) {
        return new RevisionSinrefRadicacionMarcarTask(codigo_barras, observacion);
    }

}
