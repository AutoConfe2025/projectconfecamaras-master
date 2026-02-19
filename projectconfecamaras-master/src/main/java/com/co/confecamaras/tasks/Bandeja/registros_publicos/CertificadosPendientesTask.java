package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.interactions.News.PressKey;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.tasks.Bandeja.ConsultarExpedienteTask;
import com.co.confecamaras.tasks.Bandeja.ConsultarFormatoNuevoTask;
import com.co.confecamaras.utils.News.Acciones.TypeKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.CertificadosPendientesPage.*;
import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.CertificadosPendientesPage.INP_RECIBO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CertificadosPendientesTask implements Task {
    private final String recibo;

    public CertificadosPendientesTask(String recibo) {
        this.recibo = recibo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(INP_RECIBO, isVisible()).forNoMoreThan(10).seconds()
        );

        // 2. Ingresar el recibo
        actor.attemptsTo(
                Enter.theValue(recibo).into(INP_RECIBO),
                PressKey.press(TypeKey.TAB),
                WaitSeconds.seconds(6) // Se puede optimizar esta espera
        );

        // 3. Consultar Expediente y Formato Nuevo
        actor.attemptsTo(ConsultarExpedienteTask.consultar());
        actor.attemptsTo(ConsultarFormatoNuevoTask.consultar());

        actor.attemptsTo(
                Click.on(ENLACE_ENVIAR_CERTIFICADO),
                AceptAlert.cancelar(),
                Enter.theValue(recibo).into(INP_RECIBO),
                PressKey.press(TypeKey.TAB),
                WaitSeconds.seconds(6) // Se puede optimizar esta espera
        );
    }

    public static CertificadosPendientesTask certificado(String recibo) {
        return new CertificadosPendientesTask(recibo);
    }
}
