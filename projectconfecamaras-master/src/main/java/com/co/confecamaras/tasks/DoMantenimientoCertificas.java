package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted10Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MantenimientoDosAdmin;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class DoMantenimientoCertificas implements Task {

    private final String descripcion;
    private final String modf = "1";

    public DoMantenimientoCertificas(String descripcion) {
        this.descripcion = descripcion;
    }

    public static Performable certificas(String descripcion){
        return instrumented(DoMantenimientoCertificas.class,descripcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue("Maestro Certificas").into(MenuSistema.BUSQUEDA_INPUT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(MantenimientoDosAdmin.DESCRIPCION_CERT),
                WaitInterrupted3Segundos.esperaConstante3(),
                DoubleClick.on(MantenimientoDosAdmin.DESCRIPCION_CERT),
                Enter.theValue(modf).into(MantenimientoDosAdmin.DESCRIPCION_CERT_INPUT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(MantenimientoDosAdmin.GRABAR_CERT_BTN),
                WaitConstant.esperaConstante(),
                Click.on(MantenimientoDosAdmin.DESCRIPCION_CERT),
                WaitInterrupted3Segundos.esperaConstante3(),
                DoubleClick.on(MantenimientoDosAdmin.DESCRIPCION_CERT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Clear.field(MantenimientoDosAdmin.DESCRIPCION_CERT_INPUT).then(Enter.theValue(descripcion).into(MantenimientoDosAdmin.DESCRIPCION_CERT_INPUT)),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(MantenimientoDosAdmin.GRABAR_CERT_BTN),
                WaitConstant.esperaConstante()
        );
    }
}
