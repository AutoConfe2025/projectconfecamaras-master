package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExtraccionAfiliadosUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class ExtraccionAfiliados implements Task {

    private String selectTipoAfiliadoIncluir;
    private String idEmail;

    public ExtraccionAfiliados(String selectTipoAfiliadoIncluir, String idEmail) {
        this.selectTipoAfiliadoIncluir = selectTipoAfiliadoIncluir;
        this.idEmail = idEmail;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES),
                WaitInteractions.untilAppears(BTN_EXTRACCION_AFILIADOS),
                Scroll.to(BTN_EXTRACCION_AFILIADOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_EXTRACCION_AFILIADOS),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(SELECT_TIPO_AFILIADO_INCLUIR_EXTRACCION_AFILIADOS),
                SelectFromOptions.byVisibleText(selectTipoAfiliadoIncluir).from(SELECT_TIPO_AFILIADO_INCLUIR_EXTRACCION_AFILIADOS),
                Enter.theValue(idEmail).into(TXT_EMAIL_EXTRACCION_AFILIADOS),
                Click.on(BTN_GENERAR_DESDE_SII_EXTRACCION_AFILIADOS)
        );
    }

    public static ExtraccionAfiliados enConfecamaraSII(String selectTipoAfiliadoIncluir, String idEmail){
        return instrumented(ExtraccionAfiliados.class, selectTipoAfiliadoIncluir, idEmail);
    }
}