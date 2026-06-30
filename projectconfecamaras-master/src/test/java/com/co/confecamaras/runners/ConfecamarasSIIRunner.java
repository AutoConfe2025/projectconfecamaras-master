package com.co.confecamaras.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/renovaciones/renovacion_esadl_org_catorce_clase_49_61_externo.feature",
        glue = "com.co.confecamaras",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "rerun:target/rerun.txt"
        }
//        ,tags=("@pruebas")

)
public class ConfecamarasSIIRunner {

}
