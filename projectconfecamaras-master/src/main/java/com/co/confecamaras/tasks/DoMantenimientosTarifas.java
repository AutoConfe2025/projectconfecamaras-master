package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitConstantTwo;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.MantenimientosAdmin;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientosTarifas implements Task {

    private final String servicio;
    private final String ano; private final String grpUno;
    private final String maximoUno; private final String tarifaUno;
    private final String tarifaPnatUno; private final String tarfifaPjurUno;

    public DoMantenimientosTarifas(String servicio, String ano, String grpUno, String maximoUno, String tarifaUno,
                                   String tarifaPnatUno, String tarifaPjurUno) {
        this.servicio = servicio;
        this.ano = ano;
        this.grpUno = grpUno;
        this.maximoUno = maximoUno;
        this.tarifaUno = tarifaUno;
        this.tarifaPnatUno = tarifaPnatUno;
        this.tarfifaPjurUno = tarifaPjurUno;
    }

    public static Performable mantenimientoTarifas(String servicio, String ano, String gprUno, String maximoUno, String tarifaUno,
                                                   String tarifaPnatUno, String tarfifaPjurUno){
        return instrumented(DoMantenimientosTarifas.class, servicio, ano, gprUno,maximoUno, tarifaUno, tarifaPnatUno, tarfifaPjurUno);
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Tarifas").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                SelectFromOptions.byVisibleText(servicio).from(MantenimientosAdmin.SERVICIO_SLC),
                Clear.field(MantenimientosAdmin.ANO_INPUT).then(Enter.theValue(ano).into(MantenimientosAdmin.ANO_INPUT)),
                Click.on(MantenimientosAdmin.CONTINUAR_MT_BTN),
                DoubleClick.on(MantenimientosAdmin.MINIMO_LOAD),
                Clear.field(MantenimientosAdmin.MINIMO_INPUT),
                Enter.theValue(grpUno).into(MantenimientosAdmin.MINIMO_INPUT),
                DoubleClick.on(MantenimientosAdmin.MAXIMO_LOAD),
                Clear.field(MantenimientosAdmin.MAXIMO_INPUT).then(Enter.theValue(maximoUno).into(MantenimientosAdmin.MAXIMO_INPUT)),
                DoubleClick.on(MantenimientosAdmin.TARIFA_LOAD),
                Clear.field(MantenimientosAdmin.TARIFA_INPUT).then(Enter.theValue(tarifaUno).into(MantenimientosAdmin.TARIFA_INPUT)),
                DoubleClick.on(MantenimientosAdmin.TARIFA_PNAT_LOAD),
                Clear.field(MantenimientosAdmin.TARIFA_PNAT_INPUT).then(Enter.theValue(tarifaUno).into(MantenimientosAdmin.TARIFA_PNAT_INPUT)),
                DoubleClick.on(MantenimientosAdmin.TARIFA_PJUR_LOAD),
                Clear.field(MantenimientosAdmin.TARIFA_PJUR_INPUT).then(Enter.theValue(tarifaUno).into(MantenimientosAdmin.TARIFA_PJUR_INPUT)),
                Click.on(MantenimientosAdmin.GRABAR_MT_BTN),
                WaitConstantTwo.esperaConstante(),
                toAlert(),
                WaitConstant.esperaConstante(),
                Click.on(MantenimientosAdmin.CONTINUAR_MT_BTN)

        );
    }
}
