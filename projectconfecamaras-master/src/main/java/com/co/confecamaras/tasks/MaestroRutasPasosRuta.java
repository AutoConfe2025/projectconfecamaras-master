package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MaestroRutasPasosRutaUI.*;
import static com.co.confecamaras.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MaestroRutasPasosRuta implements Task {

    private String idFinEst;
    private String idFinEstDos;

    public MaestroRutasPasosRuta(String idFinEst, String idFinEstDos) {
        this.idFinEst = idFinEst;
        this.idFinEstDos = idFinEstDos;
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
                WaitInteractions.untilAppears(BTN_MAESTRO_RUTAS_PASOS_RUTA),
                Scroll.to(BTN_MAESTRO_RUTAS_PASOS_RUTA).andAlignToBottom(),
                JavaScriptClick.on(BTN_MAESTRO_RUTAS_PASOS_RUTA),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_FIN_EST_PASOS_RUTA),
                DoubleClick.on(BTN_FIN_EST_PASOS_RUTA),
                Enter.theValue(idFinEst).into(TXT_FIN_EST_PASOS_RUTA),
                Click.on(BTN_GRABAR_PASOS_RUTA),
                toAlert(),
                Ensure.that(BTN_FIN_EST_PASOS_RUTA).text().isEqualTo(FINEST),
                DoubleClick.on(BTN_FIN_EST_PASOS_RUTA),
                Enter.theValue(idFinEstDos).into(TXT_FIN_EST_PASOS_RUTA),
                Click.on(BTN_GRABAR_PASOS_RUTA),
                toAlert()
        );
    }

    public static MaestroRutasPasosRuta enConfecamaraSII(String idFinEst, String idFinEstDos){
        return instrumented(MaestroRutasPasosRuta.class, idFinEst, idFinEstDos);
    }
}