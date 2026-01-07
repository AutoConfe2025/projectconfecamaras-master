package com.co.confecamaras.questions.bandeja.estudio_general;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static com.co.confecamaras.userinterfaces.Bandejas.control_calidad.Page.*;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.userinterfaces.registros_publicos.ExtraccionLibrosActosPage.*;


public class ValidaComentarioPresente{
    public static Question<Boolean> ahora() {
        return Visibility.of(TARJETA_COMENTARIOS);
    }
    public static Question<Boolean> validaDigitacion() {
        return Visibility.of(VALIDA_TITULO_DIGITACION);
    }
    public static Question<Boolean> validaTituloDigitacion() {
        return Visibility.of(TITULO_DIGITACION_FORMULARIO);
    }

    public static Question<Boolean> tituloInformativo() {
        return Visibility.of(TITULO_MENSAJE_INFORMATIVO);
    }

    public static Question<Boolean> validaExpedienteNo() {
        return Visibility.of(EXPEDIENTE_NO);
    }

}
