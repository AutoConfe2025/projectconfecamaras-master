package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;

import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBack;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.bandeja.registros_publicos.TextoEsperadoQuestion;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.Assert;

import java.util.List;

public class EscanearTask implements Task {
    private final String escanear;
    private final String codigo_barras;

    public EscanearTask(String escanear, String codigo_barras) {
        this.escanear = escanear;
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(AccionesPage.LINK_ACCION.of(escanear)),
                Click.on(AccionesPage.LINK_ACCION.of(escanear)),
                WaitSeconds.seconds(1),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso a la accion: " + escanear)
        );
        boolean validar = actor.asksFor(TextoEsperadoQuestion.verificar(AccionesPage.TITULO_ESCANEAR, codigo_barras));
        if (!validar) {
            Reportes.reportEvent(Reportes.FAILED, "No coincide el numero de barras: " + codigo_barras);
            Assert.fail("No coincide el numero de barras: " + codigo_barras);
        }
        List<WebElementFacade> information = AccionesPage.TABLA_OBSERVACIONES.resolveAllFor(actor);
        if (information.size() > 1) {
            for (WebElementFacade dato : information) {
                actor.attemptsTo(WaitSeconds.seconds(1), LogEvent.recordevent(Reportes.INFO, "Se encontro el registro: [" + dato.getText() + "]"));
            }
        } else
            Reportes.reportEvent(Reportes.WARNING, "No se encontraron registros");

        actor.attemptsTo(WaitSeconds.seconds(1), CloseCurrentWindowAndSwitchBack.closeAndSwitchBack());
    }

    public static EscanearTask escanear(String escanear, String codigo_barras) {
        return new EscanearTask(escanear, codigo_barras);
    }
}
