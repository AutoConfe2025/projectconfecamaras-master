package com.co.confecamaras.questions.bandeja.estudio_general;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.Pagina_Princial.*;


public class ValidaComentarioPresente{
    public static Question<Boolean> ahora() {
        return Visibility.of(TARJETA_COMENTARIOS);
    }
}
