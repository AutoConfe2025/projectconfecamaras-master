package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FileUpload;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.LoginSistema;
import com.co.confecamaras.userinterfaces.MantenimientosAdmin;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoTablaRetencion implements Task {

    private final String tipoFormato;
    private final String descripcion;

    public DoMantenimientoTablaRetencion(String tipoFormato, String descripcion) {
        this.tipoFormato = tipoFormato;
        this.descripcion = descripcion;
    }

    public static Performable mantenimientoTablaRetencion(String tipoFormato, String descripcion){
        return instrumented(DoMantenimientoTablaRetencion.class, tipoFormato, descripcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue("Tabla de Retencion Documental").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                WaitUntil.the(MantenimientosAdmin.EDITAR_BTN, WebElementStateMatchers.isClickable()),
                Click.on(MantenimientosAdmin.EDITAR_BTN),
                WaitUntil.the(MantenimientosAdmin.GUARDAR_BTN, WebElementStateMatchers.isClickable()),
                Click.on(MantenimientosAdmin.GUARDAR_BTN),
                WaitUntil.the(MantenimientosAdmin.FORMATOS_BTN, WebElementStateMatchers.isClickable()),
                Click.on(MantenimientosAdmin.FORMATOS_BTN),
                Enter.theValue(tipoFormato).into(MantenimientosAdmin.TIPO_INPUT),
                Enter.theValue(descripcion).into(MantenimientosAdmin.DESCRIPCION_INPUT),
                Enter.theValue(FileUpload.subirArchivo().archivoDoc()).into(MantenimientosAdmin.ARCHIVO_ANEXO_INPUT),
                Click.on(MantenimientosAdmin.GRABAR_BTN),
                WaitUntil.the(MantenimientosAdmin.ELIMINAR_BTN, WebElementStateMatchers.isClickable()),
                Click.on(MantenimientosAdmin.ELIMINAR_BTN),
                Click.on(MantenimientosAdmin.REGRESAR_BTN),
                Click.on(MantenimientosAdmin.RUTA_BTN),
                WaitUntil.the(MantenimientosAdmin.REGRESAR_DOS_BTN, WebElementStateMatchers.isClickable()),
                Click.on(MantenimientosAdmin.REGRESAR_DOS_BTN)
        );
    }
}
