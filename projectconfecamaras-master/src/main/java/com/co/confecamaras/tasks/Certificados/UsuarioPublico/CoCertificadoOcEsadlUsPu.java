package com.co.confecamaras.tasks.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.otros.CertificadoGenerado;
import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted2Segundos;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoOcEsadlUsPu.*;

public class CoCertificadoOcEsadlUsPu implements Task {

    public final Map<String, String> data;

    public CoCertificadoOcEsadlUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADOS),
                Click.on(BTN_CERTIFICADOS),
                WaitInteractions.untilBeEnable(TXT_MATRICULA),
                Enter.theValue(data.get("Matricula")).into(TXT_MATRICULA),
                WaitInteractions.untilAppears(BTN_CONSULTAR),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR),
                Scroll.to(BTN_CONSULTAR).andAlignToBottom(),
                Click.on(BTN_CONSULTAR),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADO_AUTOMATICO_IMEDIATO),
                Click.on(BTN_CERTIFICADO_AUTOMATICO_IMEDIATO),
                WaitInteractions.untilBeEnable(TXT_CERTIFICADO_ESADL),
                Enter.theValue(data.get("Certificados")).into(TXT_CERTIFICADO_ESADL),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFIACDO_ESADL),
                ModalLoader.modalLoader(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
        //try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }

    public static CoCertificadoOcEsadlUsPu coCertificadoOcEsadlUsPu(Map<String, String> data) {
        return Tasks.instrumented(CoCertificadoOcEsadlUsPu.class, data);
    }
}
