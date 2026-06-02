package com.co.confecamaras.navigation;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.core.di.SerenityInfrastructure;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable confecamarasHomePage() {
        return Task.where("{0} abre la página de inicio de Confecamaras",
                Open.browserOn().the(ConfecamarasHomePage.class),
                LogEvent.recordevent(Reportes.INFO, "*** Inicializando navegador"));
    }

    public static Performable confecamarasMatriculaPage() {
        return Task.where("{0} abre la página con matrícula",
                actor -> {

                    String matricula = actor.recall("matriculaPnEstablecimiento");

                    String baseUrl = EnvironmentSpecificConfiguration
                            .from(SerenityInfrastructure.getEnvironmentVariables())
                            .getProperty("webdriver.base.url.matriculas");

                    actor.attemptsTo(
                            Open.url(baseUrl + matricula)
                    );
                }
        );
    }
    public static Performable confecamarasAgilPage() {
        return Task.where("{0} abre la página renovacion agil",
                actor -> {


                    String baseUrl = EnvironmentSpecificConfiguration
                            .from(SerenityInfrastructure.getEnvironmentVariables())
                            .getProperty("webdriver.base.url.agil");

                    actor.attemptsTo(
                            Open.url(baseUrl)
                    );
                }
        );
    }

    public static Performable confecamarasCertificadosPage() {
        return Task.where("{0} abre la página renovacion agil",
                actor -> {


                    String baseUrl = EnvironmentSpecificConfiguration
                            .from(SerenityInfrastructure.getEnvironmentVariables())
                            .getProperty("webdriver.base.url.certificados");

                    actor.attemptsTo(
                            Open.url(baseUrl)
                    );
                }
        );
    }
}