package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.TextosPropios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.SELECCIONAR_OPT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoTextosPropios implements Task {

    private String idTexto;
    private String contenido;

    public DoTextosPropios(String idTexto, String contenido) {
        this.idTexto = idTexto;
        this.contenido = contenido;
    }

    public static Performable textosPropios(String idTexto, String contenido){
        return instrumented(DoTextosPropios.class, idTexto, contenido);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue("Textos propios").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(TextosPropios.EDITAR_TEXT_BTN),
                Click.on(TextosPropios.GRABAR_BTN),
                Click.on(TextosPropios.BORRAR_TEXT_BTN),
                Click.on(TextosPropios.CREAR_NUEVO_BTN),
                Enter.theValue(idTexto).into(TextosPropios.ID_TEXTO_INPUT),
                Enter.theValue(contenido).into(TextosPropios.CONTENIDO_TEXT),
                Click.on(TextosPropios.GRABAR_BTN)
        );
    }
}
