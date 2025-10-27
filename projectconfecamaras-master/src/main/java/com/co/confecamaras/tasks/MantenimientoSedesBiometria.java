package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MantenimientoSedesBiometriaUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MantenimientoSedesBiometria implements Task {

    private String idCod;
    private String idDescripcion;

    public MantenimientoSedesBiometria(String idCod, String idDescripcion) {
        this.idCod = idCod;
        this.idDescripcion = idDescripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO),
                Scroll.to(BTN_MODULO_REGISTRO).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_SEDES_BIOMETRIA),
                Scroll.to(BTN_SEDES_BIOMETRIA).andAlignToBottom(),
                JavaScriptClick.on(BTN_SEDES_BIOMETRIA),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_ID_COD_MANTENIMIENTO_SEDES_BIOMETRIA),
                DoubleClick.on(BTN_ID_COD_MANTENIMIENTO_SEDES_BIOMETRIA),
                Enter.theValue(idCod).into(TXT_ID_COD_MANTENIMIENTO_SEDES_BIOMETRIA),
                DoubleClick.on(BTN_DESCRIPCION_MANTENIMIENTO_SEDES_BIOMETRIA),
                Enter.theValue(idDescripcion).into(TXT_DESCRIPCION_MANTENIMIENTO_SEDES_BIOMETRIA),
                Click.on(BTN_GRABAR_MANTENIMIENTO_SEDES_BIOMETRIA)
        );
    }

    public static MantenimientoSedesBiometria enConfecamaraSII(String idCod, String idDescripcion){
        return instrumented(MantenimientoSedesBiometria.class, idCod, idDescripcion);
    }
}