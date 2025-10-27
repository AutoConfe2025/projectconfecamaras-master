package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.PressKey;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TransaccionesRUESPage;
import com.co.confecamaras.utils.News.Acciones.TypeKey;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class TransaccionesRuesTask implements Task {
    //private String estado = "01 - Radicado en nodo central";
    private String estado = "Todos los estados";
    private String tipo_operacion = "Todas las transacciones - Sin certificados";
    private String fecha_inicio = "20240101";
    @Override
    public <T extends Actor> void performAs(T actor) {
        String main_window = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.remember("second_main_window", main_window);
        actor.attemptsTo(
                WaitInteractions.untilAppears(TransaccionesRUESPage.SLC_ESTADOS),
                LogEvent.recordevent(Reportes.INFO, "Información de busqueda: [estado - " + estado + "] - [operacion - " + tipo_operacion + "] - [fecha inicial- " + fecha_inicio + "]"),
                SelectFromOptions.byVisibleText(estado).from(TransaccionesRUESPage.SLC_ESTADOS),
                SelectFromOptions.byVisibleText(tipo_operacion).from(TransaccionesRUESPage.SLC_TIPO_OPERACION),
                Enter.theValue(fecha_inicio).into(TransaccionesRUESPage.INP_FECHA_INICIO),
                PressKey.press(TypeKey.TAB),
                WaitSeconds.seconds(10),
                WaitInteractions.untilAppears(TransaccionesRUESPage.TABLE_RESULTADOS),
                WaitSeconds.seconds(2),
                TransaccionesRuesAccionesTask.acciones()
        );
    }

    public static TransaccionesRuesTask rues() {
        return new TransaccionesRuesTask();
    }
}
