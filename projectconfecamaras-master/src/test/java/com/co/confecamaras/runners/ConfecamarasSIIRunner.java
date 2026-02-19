package com.co.confecamaras.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/renovaciones/esadl_org_doce_caja.feature",
        glue = "com.co.confecamaras",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty"
//        , tags = "@SII4"
)
public class ConfecamarasSIIRunner {

}
