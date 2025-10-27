package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MaestroVinculosUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MaestroVinculos implements Task {

    private String idDescripcion;
    private String idDescripcionDos;

    public MaestroVinculos(String idDescripcion, String idDescripcionDos) {
        this.idDescripcion = idDescripcion;
        this.idDescripcionDos = idDescripcionDos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO),
                Scroll.to(BTN_MODULO_REGISTRO).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_MAESTRO_VINCULOS),
                Scroll.to(BTN_MAESTRO_VINCULOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_MAESTRO_VINCULOS),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_EDITAR_DESCRIPCION_VINCULOS),
                DoubleClick.on(BTN_EDITAR_DESCRIPCION_VINCULOS),
                Enter.theValue(idDescripcion).into(TXT_EDITAR_DESCRIPCION_VINCULOS),
                Click.on(BTN_GRABAR_VINCULOS),
                WaitInteractions.untilAppears(BTN_EDITAR_DESCRIPCION_VINCULOS),
                DoubleClick.on(BTN_EDITAR_DESCRIPCION_VINCULOS),
                Enter.theValue(idDescripcionDos).into(TXT_EDITAR_DESCRIPCION_VINCULOS),
                Click.on(BTN_GRABAR_VINCULOS)
        );
    }

    public static MaestroVinculos enConfecamaraSII(String idDescripcion, String idDescripcionDos){
        return instrumented(MaestroVinculos.class, idDescripcion, idDescripcionDos);
    }
}