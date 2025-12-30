package com.co.confecamaras.questions.registros_publicos;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static com.co.confecamaras.userinterfaces.registros_publicos.ExtraccionLibrosActosPage.MENSAJE_INFORMATIVO_EXTRACCION_ACTOS_EXITOSO;

public class ValidaRegistrosPublicos {

    public static Question<Boolean> extraccionInformeDetalladoActos() {
        return Visibility.of(MENSAJE_INFORMATIVO_EXTRACCION_ACTOS_EXITOSO);
    }

    public static Question<Boolean> generacionextraccionProponentes() {
        return Visibility.of(MENSAJE_INFORMATIVO_EXTRACCION_ACTOS_EXITOSO);
    }
}
