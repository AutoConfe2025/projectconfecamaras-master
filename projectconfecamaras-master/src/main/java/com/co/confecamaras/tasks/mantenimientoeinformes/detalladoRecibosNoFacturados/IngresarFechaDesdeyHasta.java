package com.co.confecamaras.tasks.mantenimientoeinformes.detalladoRecibosNoFacturados;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoRecibosNoFacturablesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class IngresarFechaDesdeyHasta implements Task {
    private final String fecha_inicial;
    private final String fecha_final;

    public IngresarFechaDesdeyHasta(String fecha_inicial, String fecha_final) {
        this.fecha_inicial = fecha_inicial;
        this.fecha_final = fecha_final;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(fecha_inicial).into(DetalladoRecibosNoFacturablesPage.FECHA_INICIO),
                Enter.theValue(fecha_final).into(DetalladoRecibosNoFacturablesPage.FECHA_FIN),
                LogEvent.recordevent(Reportes.INFO, "Se ha ingresado la fecha inicio: " + fecha_inicial + " y fecha final: " + fecha_final),
                Click.on(DetalladoRecibosNoFacturablesPage.BTN_GENERAR),
                WaitSeconds.seconds(1)
        );

        try {
            Alert alert = BrowseTheWeb.as(actor).getAlert();
            if (alert != null) {
                actor.attemptsTo(LogEvent.recordevent(Reportes.FAILED, "No se esperaba: " + alert.getText()));
                alert.accept();
                Assert.fail(alert.getText());
            }
        } catch (Exception e) {
        }

    }

    public static IngresarFechaDesdeyHasta generar(String fecha_inicial, String fecha_final) {
        return new IngresarFechaDesdeyHasta(fecha_inicial, fecha_final);
    }
}
