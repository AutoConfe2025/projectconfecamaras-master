package com.co.confecamaras.questions.bandeja.registros_publicos;

import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

public class ResportesEEQuestion implements Question<Boolean> {
    private String expectedText;



    @Override
    public Boolean answeredBy(Actor actor) {
        Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        expectedText = alert.getText();
        alert.accept();
        if (expectedText.equals("No hay reportes de contratos, multas y sanciones pendientes de registrar")) {
            Reportes.reportEvent(Reportes.INFO,"Se esperaba: "+expectedText);
        } else {
            Reportes.reportEvent(Reportes.WARNING,"No se esperaba: "+expectedText);
        }
        return expectedText.equals("No hay reportes de contratos, multas y sanciones pendientes de registrar");
    }

    public static ResportesEEQuestion validarReportes() {
        return new ResportesEEQuestion();
    }
}
