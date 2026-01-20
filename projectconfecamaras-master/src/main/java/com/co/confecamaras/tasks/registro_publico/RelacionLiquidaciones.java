package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.interactions.EnterRobot;
import com.co.confecamaras.interactions.sikulli.ClickConSikuli;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.RelacionLiquidacionesPage.*;
import static com.co.confecamaras.userinterfaces.sikuli.liquidacion_renovacion.liquidacion_renovacion.TITULO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class RelacionLiquidaciones implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INICIAL,isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue("2025-01-01").into(CAMPO_FECHA_INICIAL),
//                ClickConSikuli.en(TITULO),
                Enter.theValue("2026-12-31").into(CAMPO_FECHA_FIN),
                Click.on(CAMPO_SOLO_PAGADAS),
                Enter.theValue("S").into(CAMPO_SOLO_PAGADAS),
                Click.on(CAMPO_SOLO_FIRMADAS),
                Enter.theValue("E").into(CAMPO_SOLO_FIRMADAS),
                Click.on(BTN_GENERAR),
                AceptAlert.aceptar(),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA),

                Click.on(CAMPO_SOLO_FIRMADAS),
                Clear.field(CAMPO_SOLO_FIRMADAS),
                Enter.theValue("M").into(CAMPO_SOLO_FIRMADAS),
                Click.on(BTN_GENERAR),
                AceptAlert.aceptar(),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA),

                Click.on(CAMPO_SOLO_FIRMADAS),
                Clear.field(CAMPO_SOLO_FIRMADAS),
                Enter.theValue("T").into(CAMPO_SOLO_FIRMADAS),
                Click.on(BTN_GENERAR),
                AceptAlert.aceptar(),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA)

        );
    }

    public static RelacionLiquidaciones relacionLiquidaciones(){
        return new RelacionLiquidaciones();
    }
}
