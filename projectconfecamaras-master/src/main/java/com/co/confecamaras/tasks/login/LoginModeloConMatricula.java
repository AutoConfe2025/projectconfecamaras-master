package com.co.confecamaras.tasks.login;

import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.models.UsuarioPublicoModel;
import com.co.confecamaras.utils.sikulli.SafeActions;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.LoginUsuarioPublico.*;
import static com.co.confecamaras.userinterfaces.sikuli.PaginaPrincipal.BUSCAR_CAMARA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class LoginModeloConMatricula implements Task {

    private final UsuarioPublicoModel usuario;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_CERRAR_MENSAJE_EXTERNO_MATRICULA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_MENSAJE_EXTERNO_MATRICULA),
                Enter.theValue(usuario.getUsuario()).into(TXT_USUARIO),
                Enter.theValue(usuario.getIdentificacion()).into(TXT_IDENTIFICACION),
                Enter.theValue(usuario.getContrasena()).into(TXT_CLAVE),
                Click.on(BTN_INGRESAR)
        );
    }

    public static LoginModeloConMatricula ingresoMatriculaEnUrl(UsuarioPublicoModel usuario) {
        return Tasks.instrumented(LoginModeloConMatricula.class, usuario);
    }
}
