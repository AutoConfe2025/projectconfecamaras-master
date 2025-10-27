package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.cambiarpestana.SwitchToWindow;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage.*;
import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TramitesReingresadosPage.INPUT_BUSCAR;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.TXT_FECHA_INICIAL;

public class PublicarTask implements Task {
    private final String accion;
    private final String confirmacion;

    public PublicarTask(String accion, String confirmacion) {
        this.accion = accion;
        this.confirmacion = confirmacion.toUpperCase();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(TXT_FECHA_INICIAL))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(TXT_FECHA_INICIAL),
                    Enter.theValue("2025-03-28").into(TXT_FECHA_INICIAL),
                    Click.on(INPUT_BUSCAR),
                    WaitSeconds.seconds(2)
            );
        } else {
            actor.attemptsTo(
                    //ConsultaGrillaTask.consultar("701377"),
                    ConsultaGrillaTask.consultar("567377"),
                    WaitSeconds.seconds(2)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(LINK_ACCION_DOS),
                JavaScriptClick.on(LINK_ACCION_DOS)
        );
        if(actor.asksFor(ElementoElegible.para(AccionesPage.MSG_POPUP_PUBLICAR))){
            actor.attemptsTo(
                    WaitInteractions.untilAppears(AccionesPage.MSG_POPUP_PUBLICAR),
                    GetTextOfElement.de(AccionesPage.MSG_POPUP_PUBLICAR)
            );
        } else {
            actor.attemptsTo(
                    SwitchToWindow.at(1)
            );
            if (accion.equals("Finalizar estudio") && actor.asksFor(ElementoElegible.para(AccionesPage.BTN_FINALIZAR_ESTUDIO))) {
                actor.attemptsTo(
                        WaitInteractions.untilBeEnable(BTN_FINALIZAR_ESTUDIO),
                        Click.on(BTN_FINALIZAR_ESTUDIO)
                );
                System.out.println("Finalizar estudio");
            }
            if (accion.equals("Archivar trámite") && actor.asksFor(ElementoElegible.para(BTN_ARCHIVAR_TRAMITE))) {
                actor.attemptsTo(
                        WaitInteractions.untilBeEnable(BTN_ARCHIVAR_TRAMITE),
                        Click.on(BTN_ARCHIVAR_TRAMITE)
                );
                System.out.println("Archivar trámite");
            }
        }
        if (confirmacion.equals("CONTINUARA") && actor.asksFor(ElementoElegible.para(AccionesPage.BTN_CONTINUAR_F))) {
            actor.attemptsTo(
                    Click.on(AccionesPage.BTN_CONTINUAR_F),
                    LogEvent.recordevent(Reportes.PASSED, "Se ha continuado el trámite"),
                    GetTextOfElement.de(AccionesPage.TXT_FINALIZADO),
                    WaitSeconds.seconds(2)
            );

        } else
        if (confirmacion.equals("CANCELARA") && actor.asksFor(ElementoElegible.para(AccionesPage.BTN_CANCELAR_F))) {
            actor.attemptsTo(Click.on(AccionesPage.BTN_CANCELAR_F), LogEvent.recordevent(Reportes.PASSED, "Se ha cancelado el trámite"));
        } else {
            actor.attemptsTo(LogEvent.recordevent(Reportes.FAILED, "No coincide ninguna de las respuestas"), Click.on(AccionesPage.BTN_CERRAR_POPUP));
            //Assert.fail("No coincide ninguna de las respuestas");
        }
    }

    public static PublicarTask publicar(String accion, String confirmacion) {
        return new PublicarTask(accion, confirmacion.toUpperCase());
    }
}
