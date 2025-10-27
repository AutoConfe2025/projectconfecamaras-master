package com.co.confecamaras.tasks.Certificados.Demas;

import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted10Segundos;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.Map;
import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraCertidocadoUsarioPublicoOpcionCertificadoCupoAfiliado.*;

public class CompraCertidocadoUsarioPublicoOpcionCertificadoCupoAfiliado implements Task {

    public final Map<String, String> data;

    public CompraCertidocadoUsarioPublicoOpcionCertificadoCupoAfiliado(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                JavaScriptClick.on(BTN_CERTIFICADOS),
                Enter.theValue(data.get("Matricula")).into(TXT_MATRICULA),
                WaitInteractions.untilAppears(BTN_CONTINUAR),
                JavaScriptClick.on(BTN_CONTINUAR),
                Click.on(BTN_CERTIFICADO),
                Enter.theValue("1").into(TXT_CANTIDAD_CERTIFICADOS),
                Click.on(BTN_CUPO_AFILIADO),
                Enter.theValue(data.get("Clave cupo afiliado")).into(TXT_CAVE_AFILIADO),
                Click.on(BTN_APLICAR),
                Click.on(BTN_SI),
                WaitInterrupted10Segundos.esperaConstante10(),
                WaitUntil.the(BTN_DESCARGAR_CERTIFICADOS_TIPO_C, WebElementStateMatchers.isVisible()),
                Click.on(BTN_DESCARGAR_CERTIFICADOS_TIPO_C),
                Switch.toNewWindow(),
                Switch.toTheOtherWindow(),
                RobotCerrarPestanas.toTab(),
                Click.on(BTN_CONTINUAR_CERTIFICADO_GENERADO),
                Click.on(BTN_SOPORTE),
                Click.on(BTN_VER_RECIBO_CAJA),
                Click.on(BTN_CERRAR)
        );
        //try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }
    public static CompraCertidocadoUsarioPublicoOpcionCertificadoCupoAfiliado compraCertidocadoUsarioPublicoOpcionCertificadoCupoAfiliado(Map<String, String> data) {
        return Tasks.instrumented(CompraCertidocadoUsarioPublicoOpcionCertificadoCupoAfiliado.class, data);
    }
}
