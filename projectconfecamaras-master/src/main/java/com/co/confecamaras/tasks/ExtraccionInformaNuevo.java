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
import static com.co.confecamaras.userinterfaces.ExtraccionInformaNuevoUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class ExtraccionInformaNuevo implements Task {

    private final String idFechaInicial;
    private final String idFechaFinal;
    private final String idFormatoAjustado;
    private final String idTelefono60X;

    public ExtraccionInformaNuevo(String idFechaInicial, String idFechaFinal, String idFormatoAjustado,
                                  String idTelefono60X) {
        this.idFechaInicial = idFechaInicial;
        this.idFechaFinal = idFechaFinal;
        this.idFormatoAjustado = idFormatoAjustado;
        this.idTelefono60X = idTelefono60X;
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
                WaitInteractions.untilAppears(BTN_EXTRACCION_INFORMA_NUEVO),
                Scroll.to(BTN_EXTRACCION_INFORMA_NUEVO).andAlignToBottom(),
                JavaScriptClick.on(BTN_EXTRACCION_INFORMA_NUEVO),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(TXT_FECHA_INICIAL_EIN),
                Enter.theValue(idFechaInicial).into(TXT_FECHA_INICIAL_EIN),
                WaitInteractions.untilAppears(TXT_FECHA_FINAL_EIN),
                Enter.theValue(idFechaFinal).into(TXT_FECHA_FINAL_EIN),
                WaitInteractions.untilAppears(TXT_FORMATO_AJUSTADO_EIN),
                Enter.theValue(idFormatoAjustado).into(TXT_FORMATO_AJUSTADO_EIN),
                WaitInteractions.untilAppears(TXT_TELEFONOS_60X_EIN),
                Enter.theValue(idTelefono60X).into(TXT_TELEFONOS_60X_EIN),
                WaitInteractions.untilAppears(BTN_EXTRAER_EIN),
                Click.on(BTN_EXTRAER_EIN),
                WaitInteractions.untilAppears(BTN_EXPERIAN_DATA_UNO_EIN),
                Scroll.to(BTN_EXPERIAN_DATA_UNO_EIN).andAlignToBottom()
        );
        String textUrl = BTN_EXPERIAN_DATA_UNO_EIN.resolveFor(actor).getAttribute("href");
        abrirPestana(actor, textUrl);
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_EXPERIAN_DATA_DOS_EIN),
                Scroll.to(BTN_EXPERIAN_DATA_DOS_EIN).andAlignToBottom()
        );
        String textUrlDos = BTN_EXPERIAN_DATA_DOS_EIN.resolveFor(actor).getAttribute("href");
        abrirPestana(actor, textUrlDos);
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_EXPERIAN_DATA_TRES_EIN),
                Scroll.to(BTN_EXPERIAN_DATA_TRES_EIN).andAlignToBottom()
        );
        String textUrlTres = BTN_EXPERIAN_DATA_TRES_EIN.resolveFor(actor).getAttribute("href");
        abrirPestana(actor, textUrlTres);
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_EXPERIAN_DATA_CUATRO_EIN),
                Scroll.to(BTN_EXPERIAN_DATA_CUATRO_EIN).andAlignToBottom()
        );
        String textUrlCuatro = BTN_EXPERIAN_DATA_CUATRO_EIN.resolveFor(actor).getAttribute("href");
        abrirPestana(actor, textUrlCuatro);
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

    public static ExtraccionInformaNuevo enConfecamarasSII(String idFechaInicial, String idFechaFinal, String idFormatoAjustado,
                                                           String idTelefono60X) {
        return instrumented(ExtraccionInformaNuevo.class, idFechaInicial, idFechaFinal, idFormatoAjustado, idTelefono60X);
    }
}