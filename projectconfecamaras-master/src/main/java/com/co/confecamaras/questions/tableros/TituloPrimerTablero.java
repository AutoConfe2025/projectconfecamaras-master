package com.co.confecamaras.questions.tableros;
import com.co.confecamaras.userinterfaces.tableros.tableroSection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.tableros.tableroSection.TITULO_MATRICULADOS;


public class TituloPrimerTablero implements Question<String> {

    public static TituloPrimerTablero esIgual(){
        return new TituloPrimerTablero();
    }
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TITULO_MATRICULADOS).answeredBy(actor);
    }
}
