package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.News.SearchForInformation;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.cambiarpestana.SwitchToWindow;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerXMLTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.InscripcionNoFirmePage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage.LINK_ACCION;
import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage.LINK_ACCION_2;

public class InscripcionNoFirmeTask implements Task {
    private final String registro;

    public InscripcionNoFirmeTask(String registro) {
        this.registro = registro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String main_window = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.remember("second_main_window", main_window);
        actor.attemptsTo(
                WaitInteractions.untilAppears(AccionesPage.INPUT_BUSCAR),
                Enter.theValue(registro).into(AccionesPage.INPUT_BUSCAR),
                LogEvent.recordevent(Reportes.INFO, "Se ha consultado el registro proponente: " + registro),
                WaitSeconds.seconds(3),
                SearchForInformation.buscar(InscripcionNoFirmePage.TABLA_RESULTADOS_INSCRIPCION.resolveAllFor(actor), registro),
                //VerXMLTask.ver("Ver XML") //Mientras soluciona lecturea de xml
                WaitInteractions.untilAppears(LINK_ACCION_2),
                Click.on(LINK_ACCION_2),
                WaitSeconds.seconds(2),
                SwitchToWindow.at(2),
                WaitSeconds.seconds(2)
        );
    }

    public static InscripcionNoFirmeTask consultar(String registro) {
        return new InscripcionNoFirmeTask(registro);
    }
}
