package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.Administracion.AdminPage.*;


public class DepuracionLiquidacionesNoTerminadasTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Enter.theValue("2025-01-01").into(CAMPO_FECHA_INICIAL),
                Enter.theValue("2025-01-01").into(CAMPO_FECHA_LIMITE),
                WaitSeconds.seconds(2),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CAMPO_EMAIL_USUARIO_SISTEMA),
                Click.on(ENLACE_BORRAR),
                WaitSeconds.seconds(2),
                AcceptAlert.aceptar(),
                WaitSeconds.seconds(2)



        );




    }

    public static DepuracionLiquidacionesNoTerminadasTask administracion() {
        return new DepuracionLiquidacionesNoTerminadasTask();
    }
}