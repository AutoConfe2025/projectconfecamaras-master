package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MantenimientoKardex;
import com.co.confecamaras.userinterfaces.MantenimientoReciboCaja;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.CRITERIO_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoReciboCaja implements Task {

    private final String numRecibo;
    private final String beneficario;

    public DoMantenimientoReciboCaja(String numRecibo, String beneficario) {
        this.numRecibo = numRecibo;
        this.beneficario = beneficario;
    }

    public static Performable matenimientoReciboCaja(String numRecibo, String beneficario){
        return instrumented(DoMantenimientoReciboCaja.class, numRecibo, beneficario);
    }

    public static Performable toToAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }
    public static Performable toAlertCancel() {
        return new DriverTask(driver -> driver.switchTo().alert().dismiss() );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Mantenimiento Recibos Caja").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                WaitUntil.the(MantenimientoReciboCaja.NUMERO_RECIBO_INPUT, WebElementStateMatchers.isEmpty()),
                Enter.theValue(numRecibo).into(MantenimientoReciboCaja.NUMERO_RECIBO_INPUT),
                Click.on(MantenimientoReciboCaja.RECUPERAR_BTN),
                Enter.theValue(beneficario).into(MantenimientoReciboCaja.BENEFICIO_INPUT),
                Click.on(MantenimientoReciboCaja.GRABAR_BTN),
                toToAlert(),
                Click.on(MantenimientoReciboCaja.RECUPERAR_BTN),
                Click.on(MantenimientoReciboCaja.ELIMINAR_BTN),
                toAlertCancel(),
                Click.on(MantenimientoReciboCaja.ABANDONAR_BTN)
        );
    }

}