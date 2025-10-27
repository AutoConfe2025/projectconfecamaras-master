package com.co.confecamaras.questions.bandeja;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.TEXTO_DEVOLUCION_REGISTRADA;

public class BandejaPonalTexto  implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TEXTO_DEVOLUCION_REGISTRADA).answeredBy(actor);
    }
    public static BandejaPonalTexto es (){
        return new BandejaPonalTexto();
    }
}
