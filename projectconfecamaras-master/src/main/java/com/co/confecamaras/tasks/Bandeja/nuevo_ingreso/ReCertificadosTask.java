package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.database.Bandeja.QueryGetDatosReimpresion.KEY_OPERACION;
import static com.co.confecamaras.database.Bandeja.QueryGetDatosReimpresion.KEY_RECIBO;
import static com.co.confecamaras.userinterfaces.Bandejas.Administracion.AdminPage.*;

public class ReCertificadosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String numOperacion = actor.recall(KEY_OPERACION);
        String numRecibo = actor.recall(KEY_RECIBO);



        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitInteractions.untilAppears(CAMPO_OPERACION),
                Enter.theValue(numOperacion).into(CAMPO_OPERACION),
                Enter.theValue(numRecibo).into(CAMPO_RECIBO),
                SelectFromOptions.byVisibleText("01 - Bloqueo de Impresora")
                        .from(DROPDOWN_ID_MOTIVO),
                WaitSeconds.seconds(2),
                Enter.theValue("test automatico test automatico test automaticotest automatico test automatico test automatico test automaticotest automatico test automatico test automatico").into(CAMPO_MOTIVO),
                Click.on(ENLACE_RECUPERAR_RECIBO),
                WaitSeconds.seconds(5)
        );


    }

    public static ReCertificadosTask administracion() {
        return new ReCertificadosTask();
    }
}
