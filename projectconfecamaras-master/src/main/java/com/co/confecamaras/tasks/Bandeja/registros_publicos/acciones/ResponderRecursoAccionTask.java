package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;

import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.SelectRandomOption;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.RecursosReposicionPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class ResponderRecursoAccionTask implements Task {
    private final String accion;
    private final String codigo_barras;

    public ResponderRecursoAccionTask(String accion, String codigo_barras) {
        this.accion = accion;
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of(String.valueOf(accion))),
                LogEvent.recordevent(Reportes.INFO, "Se ha ingresado a la acción: " + accion),
                WaitInteractions.untilAppears(RecursosReposicionPage.SLC_TIPO_RESPUESTA),
                SelectRandomOption.select(RecursosReposicionPage.SLC_TIPO_RESPUESTA),
                Enter.theValue("2").into(RecursosReposicionPage.INP_NUM_RESOLUCION),
                Enter.theValue("12012024").into(RecursosReposicionPage.DATE_FECHA_RESOLUCION),
                Click.on(RecursosReposicionPage.BTN_ACTUALIZAR),
                WaitInteractions.untilAppears(RecursosReposicionPage.TXT_INFORMATIVO),
                GetTextOfElement.de(RecursosReposicionPage.TXT_INFORMATIVO),
                Click.on(RecursosReposicionPage.BTN_REGRESAR)
                //ConsultaGrillaTask.consultar(codigo_barras)
        );
    }

    public static ResponderRecursoAccionTask recurso(String accion, String codigo_barras) {
        return new ResponderRecursoAccionTask(accion, codigo_barras);
    }
}
