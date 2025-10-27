package com.co.confecamaras.tasks.Bandeja.registros_publicos.LibrosComercio;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.LibrosComerciosPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

public class DevolverRequerirTask implements Task {
    private final String accion;

    public DevolverRequerirTask(String accion) {
        this.accion = accion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(ElementoElegible.para(AccionesPage.LINK_ACCION.of(accion)))) {
            actor.attemptsTo(
                    JavaScriptClick.on(AccionesPage.LINK_ACCION.of(accion)),
                    WaitSeconds.seconds(2),
                    ChangeToLastWindow.changeToLastWindow(),
                    LogEvent.recordevent(Reportes.DONE, "Se ha ingresado a la acción: " + accion),
                    //ChangeToLastWindow.changeToLastWindow(),
                    WaitSeconds.seconds(2),
                    WaitInteractions.untilAppears(LibrosComerciosPage.SLC_TIPO_TRAMITE),
                    SelectRandomOption.select(LibrosComerciosPage.SLC_TIPO_TRAMITE),
                    SelectRandomOption.select(LibrosComerciosPage.SLC_PROCEDE_REINGRESO),
                    SelectRandomOption.select(LibrosComerciosPage.SLC_TIPO_DEVOLUCION),
                    WaitSeconds.seconds(2)
            );
            if (actor.asksFor(ElementoElegible.para(LibrosComerciosPage.LINK_BORRAR_MOTIVO))) {
                actor.attemptsTo(
                        Scroll.to(LibrosComerciosPage.LINK_BORRAR_MOTIVO),
                        Click.on(LibrosComerciosPage.LINK_BORRAR_MOTIVO),
                        WaitSeconds.seconds(2)
                );
            }
            actor.attemptsTo(
                    Click.on(LibrosComerciosPage.LINK_MOITVO),
                    WaitSeconds.seconds(1),
                    Scroll.to(LibrosComerciosPage.TEXTA_OBSERVACION),
                    Enter.theValue("TEST AUTOMATIZACION").into(LibrosComerciosPage.TEXTA_OBSERVACION),
                    Scroll.to(LibrosComerciosPage.BTN_GRABAR),
                    Click.on(LibrosComerciosPage.BTN_GRABAR),
                    CloseCurrentWindowAndSwitchBack.closeAndSwitchBack()
            );
        }else {
            Reportes.reportEvent(Reportes.WARNING, "No se encontro la accion: " + accion);
        }
    }

    public static DevolverRequerirTask devolverRequerir(String accion) {
        return new DevolverRequerirTask(accion);
    }
}
