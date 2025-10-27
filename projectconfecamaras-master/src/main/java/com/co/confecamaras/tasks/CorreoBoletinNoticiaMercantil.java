package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstantTwo;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.co.confecamaras.userinterfaces.BoletinNoticiaMercantilUI.*;
import static com.co.confecamaras.utils.UrlPages.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class CorreoBoletinNoticiaMercantil implements Task {

    private final String idEmail;
    private final String idContrasena;

    public CorreoBoletinNoticiaMercantil(String idEmail, String idContrasena) {
        this.idEmail = idEmail;
        this.idContrasena = idContrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().get(urlGmail);
        actor.attemptsTo(WaitInteractions.untilAppears(TXT_EMAIL_BNM));
        actor.attemptsTo(Enter.theValue(idEmail).into(TXT_EMAIL_BNM));
        actor.attemptsTo(WaitInteractions.untilAppears(BTN_SIGUIENTE_BNM));
        actor.attemptsTo(Click.on(BTN_SIGUIENTE_BNM));
        actor.attemptsTo(WaitInteractions.untilAppears(TXT_CONTRASENA_BNM));
        actor.attemptsTo(Enter.theValue(idContrasena).into(TXT_CONTRASENA_BNM));
        actor.attemptsTo(WaitInteractions.untilAppears(BTN_SIGUIENTE_BNM));
        actor.attemptsTo(Click.on(BTN_SIGUIENTE_BNM));
        int count = 0;
        do {
            count = count + 1;
            WaitConstantTwo.esperaConstante();
        } while (!BTN_CORREO_BOLETIN_BNM.resolveFor(actor).isCurrentlyVisible() && count<60);
        actor.attemptsTo(
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilAppears(BTN_CORREO_BOLETIN_BNM),
                Click.on(BTN_CORREO_BOLETIN_BNM)
                //JavaScriptClick.on(BTN_CORREO_BOLETIN_BNM1)
        );
    }

    public static CorreoBoletinNoticiaMercantil enConfecamarasSII(String idEmail, String idContrasena) {
        return instrumented(CorreoBoletinNoticiaMercantil.class, idEmail, idContrasena);
    }
}
