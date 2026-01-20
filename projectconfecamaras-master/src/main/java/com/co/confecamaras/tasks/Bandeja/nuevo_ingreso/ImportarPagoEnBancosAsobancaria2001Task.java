package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;



import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.EstadisticasYExtracciones.ImportarPagoBancosExcelPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ImportarPagoEnBancosAsobancaria2001Task implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(SELECT_BANCO, isVisible()).forNoMoreThan(20).seconds(),

                SelectFromOptions.byVisibleText("Banco de Bogotá")
                        .from(SELECT_BANCO),
                SelectFromOptions.byVisibleText("ATH PRINCIPAL ( 20ATH)")
                        .from(SELECT_USUARIO),
                SelectFromOptions.byVisibleText("Contado")
                        .from(SELECT_FORMA_PAGO),
                SelectFromOptions.byVisibleText("Pagada en caja")
                        .from(SELECT_ESTADO_FINAL),
                Enter.theValue("2026-01-15").into(INPUT_FECHA_),
                Enter.theValue("2026-01-15").into(INPUT_FECHA_RENOVACION),
                Click.on(BTN_CARGAR_ARCHIVO_TARIFAS),
                WaitSeconds.seconds(2),
                Click.on(BTN_GENERAR_TODOS_DOS),
                WaitSeconds.seconds(2),
                Click.on(BTN_EXPORTAR),
                WaitSeconds.seconds(2)


        );

        actor.attemptsTo(LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamente Importar Pago En Bancos Asobancaria 2001"));
    }

    public static ImportarPagoEnBancosAsobancaria2001Task estadisticasYextracciones() {
        return new ImportarPagoEnBancosAsobancaria2001Task();
    }
}


