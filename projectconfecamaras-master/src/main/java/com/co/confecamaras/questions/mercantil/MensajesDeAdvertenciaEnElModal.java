package com.co.confecamaras.questions.mercantil;

import com.co.confecamaras.userinterfaces.mercantil.RenovacionMatriculaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajesDeAdvertenciaEnElModal implements Question<String> {

    public static MensajesDeAdvertenciaEnElModal sonLosSiguientes() {
        return new MensajesDeAdvertenciaEnElModal();
    }

    @Override
    public String  answeredBy(Actor actor) {
        return Text.of(RenovacionMatriculaPage.WARNING_MATRICULA_2022).answeredBy(actor);
    }
}