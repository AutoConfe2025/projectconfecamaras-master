package com.co.confecamaras.tasks.Bandeja.registros_publicos.LibrosComercio;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.LibrosComerciosPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class EstudiarTask implements Task {
    private final String accion;
    private final String codigo_barras;

    public EstudiarTask(String accion, String codigo_barras) {
        this.accion = accion;
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(ElementoElegible.para(AccionesPage.LINK_ACCION.of(accion))))
            actor.attemptsTo(
                    JavaScriptClick.on(AccionesPage.LINK_ACCION.of(accion)),
                    WaitInteractions.untilAppears(LibrosComerciosPage.BTN_REGRESAR),
                    LogEvent.recordevent(Reportes.DONE, "Se ha ingresado a la acción: " + accion),
                    Click.on(LibrosComerciosPage.BTN_REGRESAR),
                    ConsultaGrillaTask.consultar(codigo_barras)

            );
        else Reportes.reportEvent(Reportes.WARNING, "No se encontro la accion: " + accion);
    }

    public static EstudiarTask estudiar(String accion, String codigo_barras) {
        return new EstudiarTask(accion, codigo_barras);
    }
}
