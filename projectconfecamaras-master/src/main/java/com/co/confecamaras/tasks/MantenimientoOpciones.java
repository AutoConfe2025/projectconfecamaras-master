package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MantenimientoOpcionesUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MantenimientoOpciones implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilAppears(BTN_PARAMETRIZACION_ERP),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_PARAMETRIZACION_ERP),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_MANTENIMIENTO_TABLAS_BASICAS),
                WaitInterrupted2Segundos.esperaConstante2(),
                Scroll.to(BTN_OPCIONES).andAlignToBottom(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_OPCIONES),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_EDITAR_MANTENIMIENTO_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_EDITAR_MANTENIMIENTO_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_GRABAR_REGISTRO_MANTENIMIENTO_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilAppears(LBL_REGISTRO_ACTUALIZADO_MANTENIMIENTO_OPCIONES),
                Click.on(BTN_REGRESAR_MANTENIMIENTO_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_INACTIVAR_MANTENIMIENTO_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_ACTIVAR_MANTENIMIENTO_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_OCULTAR_MOVILES_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_MOSTRAR_MOVILES_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_OCULTAR_BOOTSTRAP_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_MOSTRAR_BOOTSTRAP_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_OCULTAR_SII2_OPCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_MOSTRAR_SII2_OPCIONES)
        );
    }

    public static MantenimientoOpciones enConfecamaraSII(){
        return instrumented(MantenimientoOpciones.class);
    }
}