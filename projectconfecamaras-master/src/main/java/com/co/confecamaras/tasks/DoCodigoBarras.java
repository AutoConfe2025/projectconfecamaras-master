package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import com.co.confecamaras.userinterfaces.CodigoBarras;
import com.co.confecamaras.userinterfaces.MenuSistema;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.ESPERA;
import static com.co.confecamaras.userinterfaces.CodigoBarras.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.co.confecamaras.userinterfaces.MenuSistema.SELECCIONAR_OPT;

public class DoCodigoBarras implements Task {

    private final String numBarras;
    private final String asignarUsuario;
    private final String estadoAplicar;
    private final String tipo;
    private final String observacion;

    public DoCodigoBarras(String numBarras, String asignarUsuario, String estadoAplicar, String tipo, String observacion){
        this.numBarras = numBarras;
        this.asignarUsuario = asignarUsuario;
        this.estadoAplicar = estadoAplicar;
        this.tipo = tipo;
        this.observacion = observacion;
    }

    public static Performable codigoBarras(String numBarras, String asignarUsuario, String estadoAplicar, String tipo, String observacion){
        return instrumented(DoCodigoBarras.class, numBarras, asignarUsuario, estadoAplicar, tipo, observacion);
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                Enter.theValue("Reasignacion Codigo de Barras (Digitacion)").into(MenuSistema.BUSQUEDA_INPUT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                WaitInterrupted3Segundos.esperaConstante3(),
                Enter.theValue(numBarras).into(CodigoBarras.NUM_CODIGO_BARRA_INPUT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(CodigoBarras.CONTINUAR_BTN),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(ASIGNAR_USUARIO_SLC),
                //SelectFromOptions.byVisibleText(asignarUsuario).from(CodigoBarras.ASIGNAR_USUARIO_SLC),

                //SelectFromOptions.byVisibleText(asignarUsuario).from(ASIGNAR_USUARIO_SLC),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(ESTADO_APLICAR_SLC),
                //SelectFromOptions.byVisibleText(estadoAplicar).from(ESTADO_APLICAR_SLC),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(TIPO_SLC),
                //SelectFromOptions.byVisibleText(tipo).from(TIPO_SLC),
                WaitInterrupted3Segundos.esperaConstante3(),
                Enter.theValue(observacion).into(CodigoBarras.OBSERVACIONES_TXT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(CodigoBarras.APLICAR_BTN),
                WaitInterrupted3Segundos.esperaConstante3(),
                toAlert()
        );

    }
}