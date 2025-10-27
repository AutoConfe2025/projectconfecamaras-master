package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MaestroRutasDigitacionUI.*;
import static com.co.confecamaras.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MaestroRutasDigitacion implements Task {

    private String selectPasoUno;
    private String selectPasoUnoDos;

    public MaestroRutasDigitacion(String selectPasoUno, String selectPasoUnoDos) {
        this.selectPasoUno = selectPasoUno;
        this.selectPasoUnoDos = selectPasoUnoDos;
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_MAESTRO_RUTAS_DIGITACION),
                Scroll.to(BTN_MAESTRO_RUTAS_DIGITACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_MAESTRO_RUTAS_DIGITACION),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_EDITAR_PASOS_DIGITACION),
                Click.on(BTN_EDITAR_PASOS_DIGITACION),
                SelectFromOptions.byVisibleText("Importar Formulario VUE").from(SELECT_PASO_UNO_DIGITACION),
                Scroll.to(BTN_GRABAR_DIGITACION).andAlignToBottom(),
                Click.on(BTN_GRABAR_DIGITACION),
                toAlert(),
                Ensure.that(SELECT_PASO_UNO_DIGITACION).text().contains(PASO_UNO),
                SelectFromOptions.byVisibleText(selectPasoUnoDos).from(SELECT_PASO_UNO_DIGITACION),
                Scroll.to(BTN_GRABAR_DIGITACION).andAlignToBottom(),
                Click.on(BTN_GRABAR_DIGITACION),
                toAlert()
        );
    }

    public static MaestroRutasDigitacion enConfecamaraSII(String selectPasoUno, String selectPasoUnoDos) {
        return instrumented(MaestroRutasDigitacion.class, selectPasoUno, selectPasoUnoDos);
    }
}