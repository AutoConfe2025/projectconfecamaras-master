package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;

import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBack;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


public class VerComentariosTask implements Task {
    private String ver_comentario;

    public VerComentariosTask(String ver_comentario) {
        this.ver_comentario = ver_comentario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (actor.asksFor(ElementoElegible.para(AccionesPage.LINK_ACCION.of(ver_comentario)))) {
            actor.attemptsTo(
                    WaitInteractions.untilAppears(AccionesPage.LINK_ACCION.of(ver_comentario)),
                    JavaScriptClick.on(AccionesPage.LINK_ACCION.of(ver_comentario)),
                    ChangeToLastWindow.changeToLastWindow(),
                    LogEvent.recordevent(Reportes.INFO, "Se ingreso a la accion: " + ver_comentario),
                    WaitSeconds.seconds(1),
                    CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                    WaitSeconds.seconds(1)
            );
        }
    }

    public static VerComentariosTask verComentarios(String ver_comentario) {
        return new VerComentariosTask(ver_comentario);
    }
}
