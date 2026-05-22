package com.co.confecamaras.tasks.login;

import com.co.confecamaras.models.UsuarioPublicoModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.LoginUsuarioPublico.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class LoginSegundario implements Task {

    private final UsuarioPublicoModel usuario;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getUsuario()).into(TXT_USUARIO),
                Enter.theValue(usuario.getIdentificacion()).into(TXT_IDENTIFICACION),
                Enter.theValue(usuario.getContrasena()).into(TXT_CLAVE),
                Click.on(BTN_INGRESAR)
        );
    }

    public static LoginSegundario loginDos(UsuarioPublicoModel usuario){
        return instrumented(LoginSegundario.class,usuario);
    }
}
