package com.co.confecamaras.questions.matriculas;

import com.co.confecamaras.userinterfaces.Matricula.MatriculaConEmbargoPage;
import com.co.confecamaras.userinterfaces.mercantil.LiquidacionRenovacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class TextoMatriculaEmbargoRecibo  implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(MatriculaConEmbargoPage.TEXTO_DATOS_GENERALES).answeredBy(actor);
    }

    public static TextoMatriculaEmbargoRecibo es (){
        return new TextoMatriculaEmbargoRecibo();
    }
}
