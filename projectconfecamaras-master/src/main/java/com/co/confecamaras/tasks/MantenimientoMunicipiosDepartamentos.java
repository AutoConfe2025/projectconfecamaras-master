package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MantenimientoMunicipiosDepartamentosUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MantenimientoMunicipiosDepartamentos implements Task {

    private String selectExento;

    public MantenimientoMunicipiosDepartamentos(String selectExento) {
        this.selectExento = selectExento;
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilAppears(BTN_PARAMETRIZACION_ERP),
                JavaScriptClick.on(BTN_PARAMETRIZACION_ERP),
                WaitInteractions.untilAppears(BTN_MANTENIMIENTO_TABLAS_BASICAS),
                JavaScriptClick.on(BTN_MANTENIMIENTO_TABLAS_BASICAS),
                WaitInteractions.untilAppears(BTN_MUNICIPIOS_DEPARTAMENTOS),
                Scroll.to(BTN_MUNICIPIOS_DEPARTAMENTOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_MUNICIPIOS_DEPARTAMENTOS),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_UBICAR_MUNICIPIOS_DEPARTAMENTOS),
                Click.on(BTN_UBICAR_MUNICIPIOS_DEPARTAMENTOS),
                WaitInteractions.untilAppears(BTN_CERRAR_MUNICIPIOS_DEPARTAMENTOS),
                Click.on(BTN_CERRAR_MUNICIPIOS_DEPARTAMENTOS),
                WaitInteractions.untilAppears(BTN_IR_MUNICIPIOS_DEPARTAMENTOS),
                Click.on(BTN_IR_MUNICIPIOS_DEPARTAMENTOS),
                WaitInteractions.untilAppears(SELECT_EXENTO_MUNICIPIOS_DEPARTAMENTOS),
                SelectFromOptions.byVisibleText(selectExento).from(SELECT_EXENTO_MUNICIPIOS_DEPARTAMENTOS),
                Scroll.to(BTN_GRABAR_MUNICIPIOS_DEPARTAMENTOS).andAlignToBottom(),
                Click.on(BTN_GRABAR_MUNICIPIOS_DEPARTAMENTOS),
                WaitInteractions.untilAppears(BTN_GRABAR_DOS_MUNICIPIOS_DEPARTAMENTOS),
                Click.on(BTN_GRABAR_DOS_MUNICIPIOS_DEPARTAMENTOS),
                toAlert(),
                WaitInteractions.untilAppears(BTN_EXPORTAR_CSV_MUNICIPIOS_DEPARTAMENTOS),
                Click.on(BTN_EXPORTAR_CSV_MUNICIPIOS_DEPARTAMENTOS),
                Click.on(BTN_EXPORTAR_XML_MUNICIPIOS_DEPARTAMENTOS),
                Click.on(BTN_GENERAR_PDF_MUNICIPIOS_DEPARTAMENTOS)
        );
    }

    public static MantenimientoMunicipiosDepartamentos enConfecamaraSII(String selectExento){
        return instrumented(MantenimientoMunicipiosDepartamentos.class, selectExento);
    }
}