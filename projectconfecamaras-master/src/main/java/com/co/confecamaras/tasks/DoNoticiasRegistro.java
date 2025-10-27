package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;

import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.NoticiasRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.SELECCIONAR_OPT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoNoticiasRegistro implements Task {

    private final String fechaInicial;
    private final String fechaFinal;
    private final String libro;

    public DoNoticiasRegistro(String fechaInicial, String fechaFinal, String libro) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.libro = libro;
    }

    public static Performable noticiasRegistro(String fechaInicial, String fechaFinal, String libro){
        return instrumented(DoNoticiasRegistro.class, fechaInicial, fechaFinal, libro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue("Noticia registros publicos").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(SELECCIONAR_OPT),
                Enter.theValue(fechaInicial).into(NoticiasRegistro.FECHA_INICIO_INPUT),
                Enter.theValue(fechaFinal).into(NoticiasRegistro.FECHA_FINAL_INPUT),
                SelectFromOptions.byVisibleText(libro).from(NoticiasRegistro.LIBRO_SLC),
                Click.on(NoticiasRegistro.CONTINUAR_BTN),
                WaitUntil.the(NoticiasRegistro.SELLO_BTN, WebElementStateMatchers.isClickable()),
                JavaScriptClick.on(NoticiasRegistro.SELLO_BTN),
                JavaScriptClick.on(NoticiasRegistro.SI_BTN),
                WaitConstant.esperaConstante(),
                GetNewUrl.url(),
                GetSessionID.session(),
                WaitConstant.esperaConstante(),
                PdfVal.session()
        );
    }
}