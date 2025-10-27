package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MantenimientoTres;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoMaestroT implements Task {

    private String duplicar;
    private String codigo;
    private String nombre;
    private String nombreCorto;

    public DoMantenimientoMaestroT(String duplicar, String codigo, String nombre, String nombreCorto) {
        this.duplicar = duplicar;
        this.codigo = codigo;
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
    }

    public static Performable mantenimientoMaestroT(String duplicar, String codigo, String nombre, String nombreCorto){
        return instrumented(DoMantenimientoMaestroT.class, duplicar, codigo, nombre, nombreCorto);
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Maestro Transacciones Registro").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(MantenimientoTres.EDITAR_BTN),
                Click.on(MantenimientoTres.CONTINUAR_EDITAR_BTN),
                Click.on(MantenimientoTres.DUPLICAR_BTN),
                Enter.theValue(duplicar).into(MantenimientoTres.DUPLICAR_TXT),
                Click.on(MantenimientoTres.OK_DUPLICAR_BTN),
                toAlert(),
                WaitConstant.esperaConstante(),
                Enter.theValue(duplicar).into(MantenimientoTres.BUSCAR_TXT),
                Click.on(MantenimientoTres.BORRAR_BTN),
                Click.on(MantenimientoTres.CONTINUAR_BORRAR_BTN),
                Click.on(MantenimientoTres.VER_BTN),
                WaitConstant.esperaConstante(),
                JavaScriptClick.on(MantenimientoTres.CERRAR_BTN),
                JavaScriptClick.on(MantenimientoTres.NUEVA_BTN),
                Enter.theValue(codigo).into(MantenimientoTres.CODIGO_TXT),
                Enter.theValue(nombre).into(MantenimientoTres.NOMBRE_TXT),
                SelectFromOptions.byVisibleText(nombreCorto).from(MantenimientoTres.NOMBRE_CORTO_SLC),
                Click.on(MantenimientoTres.CONTINUAR_EDITAR_BTN),
                Enter.theValue(codigo).into(MantenimientoTres.BUSCAR_TXT),
                Click.on(MantenimientoTres.EXPORTAR_CONTROLES_BTN),
                Click.on(MantenimientoTres.DESCARGAR_BTN)
        );
    }

}
