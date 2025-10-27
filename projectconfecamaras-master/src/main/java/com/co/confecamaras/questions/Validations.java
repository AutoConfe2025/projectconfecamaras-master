package com.co.confecamaras.questions;

import com.co.confecamaras.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.RepartoDocumentosUI.LBL_REPARTO_DOCUMENTOS;

public class Validations {


    public static Question<String> reciboCaja(){
        return actor -> TextContent.of(RecibosCaja.RECIBO_CAJA_VALIDATION).answeredBy(actor);
    }

    public static Question<String> desistimientos(){
        return actor -> TextContent.of(DesistimientosDecretados.VALIDACION_DOC).answeredBy(actor);
    }

    public static Question<String> mantKardexPro(){
        return actor -> TextContent.of(MantenimientosAdmin.VALIDACION).answeredBy(actor);
    }

}
