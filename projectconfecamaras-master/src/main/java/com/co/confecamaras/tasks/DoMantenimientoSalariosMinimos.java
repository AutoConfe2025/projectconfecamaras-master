package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitConstantTwo;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import com.co.confecamaras.userinterfaces.MantenimientosAdmin;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoSalariosMinimos implements Task {

    private final String fecha;
    private final String salarioMinimo;
    private final String transporteLegal;
    private final String valorUvt;

    public DoMantenimientoSalariosMinimos(String fecha, String salarioMinimo, String transporteLegal, String valorUvt) {
        this.fecha = fecha;
        this.salarioMinimo = salarioMinimo;
        this.transporteLegal = transporteLegal;
        this.valorUvt = valorUvt;
    }

    public static Performable mantenimientoSalariosMinimos(String fecha, String salarioMinimo, String transporteLegal, String valorUvt){
        return instrumented(DoMantenimientoSalariosMinimos.class, fecha, salarioMinimo, transporteLegal, valorUvt);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Salarios Minimos Mensuales").into(MenuSistema.BUSQUEDA_INPUT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                WaitConstantTwo.esperaConstante(),
                //Enter.theValue(fecha).into(MantenimientosAdmin.FECHA_INPUT),
                Enter.theValue("20260101").into(MantenimientosAdmin.FECHA_INPUT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Enter.theValue(salarioMinimo).into(MantenimientosAdmin.SALARIO_MINIMO_INPUT),
                Enter.theValue(transporteLegal).into(MantenimientosAdmin.TRANSPORTE_LEGAL_INPUT),
                WaitInterrupted3Segundos.esperaConstante3(),
                Enter.theValue(valorUvt).into(MantenimientosAdmin.VALOR_UVT),
                Enter.theValue("11,552").into(MantenimientosAdmin.VALOR_UVB),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(MantenimientosAdmin.GRABAR_MS_BTN),
                WaitConstant.esperaConstante(),
                Scroll.to(MantenimientosAdmin.BORRAR_REGISTRO_BTN),
                WaitSeconds.seconds(3),
                Click.on(MantenimientosAdmin.BORRAR_REGISTRO_BTN),
                WaitSeconds.seconds(5)
        );
    }
}