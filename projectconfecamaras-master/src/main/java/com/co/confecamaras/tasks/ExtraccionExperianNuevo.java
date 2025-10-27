package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExtraccionExperianNuevoUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class ExtraccionExperianNuevo implements Task {

    private final String idFechaInicial;
    private final String idFechaFinal;

    public ExtraccionExperianNuevo(String idFechaInicial, String idFechaFinal) {
        this.idFechaInicial = idFechaInicial;
        this.idFechaFinal = idFechaFinal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES),
                WaitInteractions.untilAppears(BTN_EXTRACCION_EXPERIAN_NUEVO),
                Scroll.to(BTN_EXTRACCION_EXPERIAN_NUEVO).andAlignToBottom(),
                JavaScriptClick.on(BTN_EXTRACCION_EXPERIAN_NUEVO),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(TXT_FECHA_INICIAL_EEN),
                Enter.theValue(idFechaInicial).into(TXT_FECHA_INICIAL_EEN),
                WaitInteractions.untilAppears(TXT_FECHA_FINAL_EEN),
                Enter.theValue(idFechaFinal).into(TXT_FECHA_FINAL_EEN),
                WaitInteractions.untilAppears(BTN_EXTRAER_EEN),
                Click.on(BTN_EXTRAER_EEN),
                WaitInteractions.untilAppears(BTN_EXPERIAN_DATA_UNO_EEN),
                Scroll.to(BTN_EXPERIAN_DATA_UNO_EEN).andAlignToBottom()
        );
        String textUrl = BTN_EXPERIAN_DATA_UNO_EEN.resolveFor(actor).getAttribute("href");
        abrirPestana(actor, textUrl);
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_EXPERIAN_DATA_DOS_EEN),
                Scroll.to(BTN_EXPERIAN_DATA_DOS_EEN).andAlignToBottom()
        );
        String textUrlDos = BTN_EXPERIAN_DATA_DOS_EEN.resolveFor(actor).getAttribute("href");
        abrirPestana(actor, textUrlDos);
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_EXPERIAN_DATA_TRES_EEN),
                Scroll.to(BTN_EXPERIAN_DATA_TRES_EEN).andAlignToBottom()
        );
        String textUrlTres = BTN_EXPERIAN_DATA_TRES_EEN.resolveFor(actor).getAttribute("href");
        abrirPestana(actor, textUrlTres);
    }

    public void abrirPestana(Actor actor, String textUrl){
        JavascriptExecutor jse = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        jse.executeScript("window.open('');");
        Set<String> handlesSet = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
        List<String> handlesList = new ArrayList<>(handlesSet);
        BrowseTheWeb.as(actor).getDriver().switchTo().window(handlesList.get(2));
        BrowseTheWeb.as(actor).getDriver().get(textUrl);
        BrowseTheWeb.as(actor).getDriver().switchTo().window(handlesList.get(2)).close();
        BrowseTheWeb.as(actor).getDriver().switchTo().window(handlesList.get(1));
    }

    public static ExtraccionExperianNuevo enConfecamarasSII(String idFechaInicial, String idFechaFinal) {
        return instrumented(ExtraccionExperianNuevo.class, idFechaInicial, idFechaFinal);
    }
}