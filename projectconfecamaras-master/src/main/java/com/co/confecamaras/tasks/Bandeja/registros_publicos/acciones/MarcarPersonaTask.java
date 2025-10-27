package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.RevisionDesistimientoPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;

public class MarcarPersonaTask implements Task {
    private final Target opcion;
    private final String codigo_barras;
    private final String quien_confirma;
    private final String detalle;

    public MarcarPersonaTask(Target opcion, String codigo_barras, String quien_confirma, String detalle) {
        this.opcion = opcion;
        this.codigo_barras = codigo_barras;
        this.quien_confirma = quien_confirma;
        this.detalle = detalle;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(ElementoElegible.para(opcion))) {
            actor.attemptsTo(
                    JavaScriptClick.on(opcion),
                    WaitInteractions.untilAppears(RevisionDesistimientoPage.INP_QUIEN_CONFIRMA),
                    Enter.theValue(quien_confirma).into(RevisionDesistimientoPage.INP_QUIEN_CONFIRMA),
                    Enter.theValue(detalle).into(RevisionDesistimientoPage.TXTA_DETALLE),
                    WaitSeconds.seconds(1),
                    Click.on(RevisionDesistimientoPage.BTN_CONFIRMAR),
                    AcceptAlert.aceptar(),
                    Click.on(RevisionDesistimientoPage.LINK_REGRESAR),
                    ConsultaGrillaTask.consultar(codigo_barras)
            );
        } else {
            actor.attemptsTo(
                    LogEvent.recordevent(Reportes.WARNING, "El registro ya cuenta con una marcacion de notificacion")
            );
        }

    }

    public static MarcarPersonaTask notificar(Target opcion, String codigo_barras, String quien_confirma, String detalle) {
        return new MarcarPersonaTask(opcion, codigo_barras, quien_confirma, detalle);
    }


}
