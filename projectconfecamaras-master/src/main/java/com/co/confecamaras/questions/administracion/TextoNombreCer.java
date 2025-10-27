package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TextoNombreCer implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Target.the("INPUT_NOMBRE_")
                .located(By.id("nombre"))
                .resolveFor(actor)
                .getValue();
    }

    public static TextoNombreCer es(){
        return new TextoNombreCer();
    }
}
