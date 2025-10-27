package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.userinterfaces.MantenimientosAdmin;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.MenuSistema.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoKardexPro implements Task {

    private final String fechaInicial; private final String actualizar;

    public DoMantenimientoKardexPro(String fechaInicial, String actualizar) {
        this.fechaInicial = fechaInicial;
        this.actualizar = actualizar;
    }

    public static Performable mantenimientoKardexPro(String fechaInicial, String actualizar){
        return instrumented(DoMantenimientoKardexPro.class, fechaInicial, actualizar);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue("Mantenimiento Kardex Proponentes").into(MenuSistema.BUSQUEDA_INPUT),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Clear.field(MantenimientosAdmin.FECHA_INICIAL_INPUT).then(Enter.theValue(fechaInicial).into(MantenimientosAdmin.FECHA_INICIAL_INPUT)),
                Click.on(MantenimientosAdmin.CONTINUAR_MK_BTN),
                Click.on(MantenimientosAdmin.EDITAR_MK_BTN),
                Scroll.to(MantenimientosAdmin.ACTUALIZAR_SLC),
                SelectFromOptions.byVisibleText(actualizar).from(MantenimientosAdmin.ACTUALIZAR_SLC),
                Click.on(MantenimientosAdmin.GRABAR_MK_BTN),
                WaitConstant.esperaConstante()
        );
    }

}
