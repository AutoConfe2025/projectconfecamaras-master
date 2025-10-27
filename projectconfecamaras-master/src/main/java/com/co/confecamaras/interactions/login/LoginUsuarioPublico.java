package com.co.confecamaras.interactions.login;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.sikulli.SafeActions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.LoginUsuarioPublico.*;
import static com.co.confecamaras.userinterfaces.sikuli.PaginaPrincipal.BUSCAR_CAMARA;
import static com.co.confecamaras.userinterfaces.sikuli.PaginaPrincipal.CAMPO_INGRESO_CAMARA_COMERCIO;

public class LoginUsuarioPublico implements Interaction {

    private final Map<String, String> data;

    public LoginUsuarioPublico(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LogEvent.recordevent(Reportes.INFO, "Se ingreso a la camara: [" + data.get("Camara") + "]..."),
                SafeActions.click(TXT_CAMARA, BUSCAR_CAMARA),
                SafeActions.enter(data.get("Camara"), TXT_CAMARA, BUSCAR_CAMARA),
                SafeActions.click(BTN_CAMARA, CAMPO_INGRESO_CAMARA_COMERCIO),
                WaitInteractions.untilAppears(TXT_USUARIO),
                Enter.theValue(data.get("Usuario")).into(TXT_USUARIO),
                Enter.theValue(data.get("Identificacion")).into(TXT_IDENTIFICACION),
                Enter.theValue(data.get("Contraseña")).into(TXT_CLAVE),
                Click.on(BTN_INGRESAR)
        );
    }

    public static LoginUsuarioPublico enConfecamaras(Map<String, String> data) {
        return Tasks.instrumented(LoginUsuarioPublico.class, data);
    }
}
