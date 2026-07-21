package com.co.confecamaras.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/renovaciones/renovacion_agil_pn.feature",
        glue = "com.co.confecamaras",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "rerun:target/rerun.txt"
        }
//        ,tags=("@")

)
public class ConfecamarasSIIRunner {

}
