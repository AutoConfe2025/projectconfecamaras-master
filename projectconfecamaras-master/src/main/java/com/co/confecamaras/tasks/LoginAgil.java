package com.co.confecamaras.tasks;

import com.co.confecamaras.models.UsuarioPublicoModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilPnPage.*;

@AllArgsConstructor
public class LoginAgil implements Task {

    private final UsuarioPublicoModel usuario;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getUsuario()).into(CAMPO_CORREO_AGIL),
                Enter.theValue(usuario.getIdentificacion()).into(CAMPO_IDENTIFICACION_AGIL),
                Enter.theValue(usuario.getContrasena()).into(CAMPO_CONTRASEÑA_AGIL),
                Click.on(BOTON_INGRESAR)

        );
    }

    public static LoginAgil loginA(UsuarioPublicoModel usuario){
        return Tasks.instrumented(LoginAgil.class, usuario);
    }
}
