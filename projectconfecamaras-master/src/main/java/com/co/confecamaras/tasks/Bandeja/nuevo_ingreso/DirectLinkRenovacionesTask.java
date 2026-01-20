package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;



import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.EstadisticasYExtracciones.ImportarPagoBancosExcelPage.INPUT_FECHA_RECIBIDOS;
import static com.co.confecamaras.userinterfaces.EstadisticasYExtracciones.DirectLinkRenovacionesPage   .*;
import static com.co.confecamaras.userinterfaces.EstadisticasYExtracciones.PrediligenciadosRenovacionPage.SELECT_BANCO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class DirectLinkRenovacionesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(INPUT_IDENTIFICADOR, isVisible()).forNoMoreThan(20).seconds(),
                    Enter.theValue("2026-AFILIADOS-20260119").into(INPUT_IDENTIFICADOR),
                Click.on(BTN_SELECCIONAR),
                WaitUntil.the(BTN_BLANQUEAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_BLANQUEAR),
                AcceptAlert.aceptar(),
                WaitSeconds.seconds(1),
                WaitUntil.the(BTN_SELECCIONAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_SELECCIONAR),
                WaitSeconds.seconds(2),
                SelectFromOptions.byVisibleText("Afiliados")
                        .from(SELECT_TIPO_COMERCIANTE),
                Enter.theValue("2025").into(IMPUT_ANO_RENOVADO),
                Enter.theValue("10000000000").into(INPUT_MINIMO_ACTIVOS),
                WaitSeconds.seconds(2),
                Click.on(BTN_SELECCIONAR),
                AcceptAlert.aceptar(),
                WaitUntil.the(BTN_EXPORTAR_EXCEL, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_EXPORTAR_EXCEL),
                AcceptAlert.aceptar(),
                WaitSeconds.seconds(2),
                Click.on(BTN_ENVIAR),
                AcceptAlert.conTexto("frojas@confecamaras.org.co"),
                WaitSeconds.seconds(2),
                AcceptAlert.aceptar(),
                WaitSeconds.seconds(2)
        );

        actor.attemptsTo(LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamente Direct Link Renovaciones"));
    }

    public static DirectLinkRenovacionesTask estadisticasYextracciones() {
        return new DirectLinkRenovacionesTask();
    }
}


