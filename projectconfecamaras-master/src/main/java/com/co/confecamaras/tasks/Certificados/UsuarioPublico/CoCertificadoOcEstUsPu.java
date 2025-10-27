package com.co.confecamaras.tasks.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.otros.CertificadoGenerado;
import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoOcEstUsPu.*;

public class CoCertificadoOcEstUsPu implements Task {

    public final Map<String, String> data;

    public CoCertificadoOcEstUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADOS),
                Click.on(BTN_CERTIFICADOS),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(TXT_MATRICULA),
                Enter.theValue(data.get("Matricula")).into(TXT_MATRICULA),
                WaitInteractions.untilAppears(BTN_CONSULTAR_EST),
                Scroll.to(BTN_CONSULTAR_EST).andAlignToBottom(),
                Click.on(BTN_CONSULTAR_EST),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADO_AUTOMATICO_IMEDIATO),
                Click.on(BTN_CERTIFICADO_AUTOMATICO_IMEDIATO),
                WaitInteractions.untilBeEnable(TXT_CERTIFICADO_EST),
                Enter.theValue(data.get("Certificados")).into(TXT_CERTIFICADO_EST),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFIACDO_ESADL),
                ModalLoader.modalLoader(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
        //try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }
    public static CoCertificadoOcEstUsPu coCertificadoOcEstUsPu(Map<String, String> data) {
        return Tasks.instrumented(CoCertificadoOcEstUsPu.class, data);
    }
}
