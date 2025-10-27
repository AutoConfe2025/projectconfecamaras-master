package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MantenimientoKardex;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoComentarios implements Task {

    private final String id;
    private final String descripcion;

    public DoMantenimientoComentarios(String id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }

    public static Performable matenimientoComentarios(String id, String descripcion){
        return instrumented(DoMantenimientoComentarios.class, id, descripcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilAppears(TXT_BUSQUEDA_INPUT),
                Enter.theValue("Tipos de Comentarios").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                WaitConstant.esperaConstante(),
                DoubleClick.on(MantenimientoKardex.CAMPO_ID),
                Enter.theValue(id).into(MantenimientoKardex.CAMPO_ID_INPUT),
                DoubleClick.on(MantenimientoKardex.CAMPO_DESCRIPCION),
                Enter.theValue(descripcion).into(MantenimientoKardex.CAMPO_DESCRIPCION_INPUT),
                Click.on(MantenimientoKardex.GRABAR_DESC_BTN),
                WaitConstant.esperaConstante(),
                DoubleClick.on(MantenimientoKardex.CAMPO_ID),
                Clear.field(MantenimientoKardex.CAMPO_ID_INPUT),
                DoubleClick.on(MantenimientoKardex.CAMPO_DESCRIPCION),
                Clear.field(MantenimientoKardex.CAMPO_DESCRIPCION_INPUT),
                Click.on(MantenimientoKardex.GRABAR_DESC_BTN)

        );
    }
}
