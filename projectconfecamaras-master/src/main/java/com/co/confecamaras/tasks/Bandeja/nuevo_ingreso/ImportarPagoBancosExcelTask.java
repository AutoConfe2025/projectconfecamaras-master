package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.EstadisticasYExtracciones.ImportarPagoBancosExcelPage.*;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.ComparativoRenovacionesPage.INPUT_ANO_RENOVACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ImportarPagoBancosExcelTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(SELECT_BANCO, isVisible()).forNoMoreThan(20).seconds(),

                SelectFromOptions.byVisibleText("Banco de Occidente")
                        .from(SELECT_BANCO),
                SelectFromOptions.byVisibleText(" AGUIRRE OROZCO YESSICA ( YAO-CAJ)")
                        .from(SELECT_OPERADOR),
                Enter.theValue("2026-01-15").into(INPUT_FECHA_RECIBIDOS),
                Enter.theValue("2026-01-15").into(INPUT_FECHA_RENOVACION),
                Click.on(BTN_CARGAR_ARCHIVO_TARIFAS),
                WaitSeconds.seconds(2),
                Click.on(BTN_GENERAR_TODOS),
                WaitSeconds.seconds(2),
                Click.on(BTN_EXPORTAR_EXCEL),
                WaitSeconds.seconds(2)


        );

        actor.attemptsTo(LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamente Importar Pago Bancos Excel"));
    }

    public static ImportarPagoBancosExcelTask estadisticasYextracciones() {
        return new ImportarPagoBancosExcelTask();
    }
}


