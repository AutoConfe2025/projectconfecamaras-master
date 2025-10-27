package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.administracion.MaestroClasesVinculosPage.TXT_DESCRIPCION;
import static com.co.confecamaras.userinterfaces.administracion.MaestroTransaccionesOrdenPage.TEXTO_NOMBRE;

public class NombreMaestro implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TEXTO_NOMBRE).answeredBy(actor);

    }
    public static NombreMaestro es(){
        return new NombreMaestro();
    }
}
