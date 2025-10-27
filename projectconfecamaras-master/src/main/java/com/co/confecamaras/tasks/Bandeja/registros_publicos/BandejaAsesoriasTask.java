package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.News.CancelAlert;
import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBackHome;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.BandejaAsesoriasPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.List;

public class BandejaAsesoriasTask implements Task {
    private final String id;

    public BandejaAsesoriasTask(String id) {
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String texto_test = "TEST AUTOMATION";
        if (actor.asksFor(ElementoElegible.para(BandejaAsesoriasPage.LINK_VER.of(id)))) {
            actor.attemptsTo(Click.on(BandejaAsesoriasPage.LINK_VER.of(id)));
            List<WebElementFacade> secciones = BandejaAsesoriasPage.SECTIONS_VER.resolveAllFor(actor);
            for (WebElementFacade seccion : secciones) {
                actor.attemptsTo(Scroll.to(seccion));
            }
            actor.attemptsTo(WaitSeconds.seconds(1), Click.on(BandejaAsesoriasPage.LINK_REGRESAR));
        } else
            Reportes.reportEvent(Reportes.WARNING, "No fue posible realizar la acción VER");

        if (actor.asksFor(ElementoElegible.para(BandejaAsesoriasPage.LINK_COMPLETAR_RESPUESTAS.of(id)))) {
            actor.attemptsTo(
                    Click.on(BandejaAsesoriasPage.LINK_COMPLETAR_RESPUESTAS.of(id)),
                    Scroll.to(BandejaAsesoriasPage.LINK_REGRESAR),
                    Switch.toFrame(0),
                    Enter.theValue(texto_test).into(BandejaAsesoriasPage.INP_RESPUESTA),
                    WaitSeconds.seconds(2),
                    Switch.toDefaultContext(),
                    Click.on(BandejaAsesoriasPage.LINK_GRABAR),
                    Click.on(BandejaAsesoriasPage.LINK_REGRESAR)
            );
        } else
            Reportes.reportEvent(Reportes.WARNING, "No fue posible realizar la acción de RESPONDER COMENTARIOS");

        if (actor.asksFor(ElementoElegible.para(BandejaAsesoriasPage.LINK_RESPONDER.of(id)))) {
            actor.attemptsTo(
                    Click.on(BandejaAsesoriasPage.LINK_RESPONDER.of(id)),
                    //AcceptAlert.aceptar(),
                    CancelAlert.dismiss(),
                    WaitSeconds.seconds(1)
            );
        } else
            Reportes.reportEvent(Reportes.WARNING, "No fue posible realizar la acción de RESPONDER PIDIENDO INFORMACION");

        if (actor.asksFor(ElementoElegible.para(BandejaAsesoriasPage.LINK_RESPONDER_OK.of(id)))) {
            actor.attemptsTo(
                    Click.on(BandejaAsesoriasPage.LINK_RESPONDER_OK.of(id)),
                    CancelAlert.dismiss(),
                    WaitSeconds.seconds(1)
            );
        } else
            Reportes.reportEvent(Reportes.WARNING, "No fue posible realizar la acción de RESPONDER OK AL TRAMITE");

        if (actor.asksFor(ElementoElegible.para(BandejaAsesoriasPage.LINK_RESPONDER_NO.of(id)))) {
            actor.attemptsTo(
                    Click.on(BandejaAsesoriasPage.LINK_RESPONDER_NO.of(id)),
                    CancelAlert.dismiss(),
                    WaitSeconds.seconds(1),
                    CloseCurrentWindowAndSwitchBackHome.closeAndSwitchBackHome()
            );
        } else
            Reportes.reportEvent(Reportes.WARNING, "No fue posible realizar la acción de RESPONDER NO PROCEDE");

    }

    public static BandejaAsesoriasTask asesorias(String id) {
        return new BandejaAsesoriasTask(id);
    }
}
