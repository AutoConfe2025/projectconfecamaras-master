package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.userinterfaces.MantenimientoKardex;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoKardex implements Task {

    private final String numInicial;
    private final String libro;
    private final String texto;

    public DoMantenimientoKardex(String libro, String numInicial, String texto){
        this.libro = libro;
        this.numInicial = numInicial;
        this.texto = texto;
    }

    public static Performable matenimientoKardex(String libro, String numInicial, String texto){
        return instrumented(DoMantenimientoKardex.class, libro, numInicial, texto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Mantenimiento Kardex SII").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                SelectFromOptions.byVisibleText(libro).from(MantenimientoKardex.LIBRO_SLC),
                Enter.theValue(numInicial).into(MantenimientoKardex.NUM_INICIAL_INPUT),
                Click.on(MantenimientoKardex.CONTINUAR_BTN),
                Click.on(MantenimientoKardex.EDITAR_IMG),
                Clear.field(MantenimientoKardex.NOTICIA_TXT).then(Enter.theValue(texto).into(MantenimientoKardex.NOTICIA_TXT)),
                Click.on(MantenimientoKardex.GRABAR_BTN),
                WaitInteractions.untilAppears(MantenimientoKardex.BTN_CERRAR_KARDEX),
                Scroll.to(MantenimientoKardex.BTN_CERRAR_KARDEX).andAlignToBottom(),
                Click.on(MantenimientoKardex.BTN_CERRAR_KARDEX),
                WaitInteractions.untilAppears(MantenimientoKardex.BTN_REGRESAR_KARDEX),
                Scroll.to(MantenimientoKardex.BTN_REGRESAR_KARDEX).andAlignToBottom(),
                Click.on(MantenimientoKardex.BTN_REGRESAR_KARDEX),
                // ---- Consulta nuevamente ---- //
                SelectFromOptions.byVisibleText(libro).from(MantenimientoKardex.LIBRO_SLC),
                Enter.theValue(numInicial).into(MantenimientoKardex.NUM_INICIAL_INPUT),
                Click.on(MantenimientoKardex.CONTINUAR_BTN),
                Click.on(MantenimientoKardex.EDITAR_IMG)
        );
    }
}
