package com.co.confecamaras.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/liquidacion_renovacion/liquidacion_renovacion.feature",
        glue = "com.co.confecamaras.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
                tags = "@LiquidacionRenovacionNombre"
)

public class ConfecamarasSIIRunner {

    /*------Tag General------*/
    // @general
    // @Certificados ok
    // @BloqueUno    ok
    // @BloqueDos    ok
    // @BloqueTres   ok
    // @BloqueCuatro  ok
    // @BloqueCinco  ok
    // @BloqueSeis   ok
    // @BloqueSiete  ok
    // @BloqueOcho   ok
    // @BloqueData1  ok
    // @BloqueData2  ok
    // @BloqueData3  ok
    // @BloqueData   ok

    /*------Tag Por Tramites------*/
    //@Certificados
    //@renovacionMercantil
    //@proponetes
}