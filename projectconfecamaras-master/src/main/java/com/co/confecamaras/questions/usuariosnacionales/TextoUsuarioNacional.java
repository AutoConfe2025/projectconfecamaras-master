package com.co.confecamaras.questions.usuariosnacionales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.confecamaras.userinterfaces.usuariosnacionales.UsuariosNacionalesPage.TEXTO_USUARIO_NO_ENCONTRADO;

public class TextoUsuarioNacional implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(TEXTO_USUARIO_NO_ENCONTRADO).answeredBy(actor);
    }
    public static TextoUsuarioNacional es(){
        return new TextoUsuarioNacional();
    }
}
