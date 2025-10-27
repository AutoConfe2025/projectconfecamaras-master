package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;

import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBack;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.cambiarpestana.SwitchToWindow;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.utils.LeerXml;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage.LINK_ACCION;
import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage.LINK_ACCION_1;

public class VerXMLTask implements Task {
    private final String nombre_tag;

    public VerXMLTask(String nombre_tag) {
        this.nombre_tag = nombre_tag;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if(actor.asksFor(ElementoElegible.para(LINK_ACCION_1))){
            actor.attemptsTo(
                    WaitInteractions.untilAppears(LINK_ACCION_1),
                    Click.on(LINK_ACCION_1),
                    WaitSeconds.seconds(1),
                    ChangeToLastWindow.changeToLastWindow(),
                    LogEvent.recordevent(Reportes.INFO, "Se ingreso a la accion: Ver XML"),
                    WaitSeconds.seconds(2)
            );
        } else {
            actor.attemptsTo(
                    WaitInteractions.untilAppears(LINK_ACCION),
                    Click.on(LINK_ACCION),
                    WaitSeconds.seconds(1),
                    ChangeToLastWindow.changeToLastWindow(),
                    LogEvent.recordevent(Reportes.INFO, "Se ingreso a la accion: Ver XML"),
                    WaitSeconds.seconds(2)
            );
        }

        String current_url = BrowseTheWeb.as(actor).getDriver().getCurrentUrl().toString();
        System.out.println("NOTA: CUANDO EL XML ESTE CORREGIDO ACTIVAR LA LECTURA, EL XML YUNCIONA PPERO NO SE PUEDE LEER" + current_url);

        actor.attemptsTo(
                //LeerXml.leer(current_url, nombre_tag),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack()
        );
    }

    public static VerXMLTask ver(String nombre_tag) {
        return new VerXMLTask(nombre_tag);
    }
}
