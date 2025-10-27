package com.co.confecamaras.tasks.login;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.models.UsuarioPublicoModel;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.sikulli.SafeActions;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.LoginUsuarioPublico.*;
import static com.co.confecamaras.userinterfaces.sikuli.PaginaPrincipal.BUSCAR_CAMARA;
import static com.co.confecamaras.userinterfaces.sikuli.PaginaPrincipal.CAMPO_INGRESO_CAMARA_COMERCIO;

@AllArgsConstructor
public class loginModelo implements Interaction {

    private final UsuarioPublicoModel usuario;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LogEvent.recordevent(Reportes.INFO, "Se ingresó a la cámara: [" + usuario.getCamara() + "]..."),
                SafeActions.click(TXT_CAMARA, BUSCAR_CAMARA),
                SafeActions.enter(usuario.getCamara(), TXT_CAMARA, BUSCAR_CAMARA),
                SafeActions.click(BTN_CAMARA, CAMPO_INGRESO_CAMARA_COMERCIO),
                WaitInteractions.untilAppears(TXT_USUARIO),
                Enter.theValue(usuario.getUsuario()).into(TXT_USUARIO),
                Enter.theValue(usuario.getIdentificacion()).into(TXT_IDENTIFICACION),
                Enter.theValue(usuario.getContrasena()).into(TXT_CLAVE),
                Click.on(BTN_INGRESAR)
        );
    }

    public static loginModelo enConfecamaras(UsuarioPublicoModel usuario) {
        return Tasks.instrumented(loginModelo.class, usuario);
    }
}
