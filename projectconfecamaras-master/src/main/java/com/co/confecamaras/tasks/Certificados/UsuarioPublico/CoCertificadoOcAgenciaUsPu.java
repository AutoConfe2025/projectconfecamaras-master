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
import java.util.Map;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoOcAgenciaUsPu.*;


public class CoCertificadoOcAgenciaUsPu implements Task {

    public final Map<String, String> data;

    public CoCertificadoOcAgenciaUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADOS_AGENCIA),
                Click.on(BTN_CERTIFICADOS_AGENCIA),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_AGENCIA),
                Enter.theValue(data.get("Matricula")).into(TXT_MATRICULA_AGENCIA),
                WaitInteractions.untilAppears(BTN_CONSULTAR_AGENCIA),
                Click.on(BTN_CONSULTAR_AGENCIA),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADO_AUTOMATICO_IMEDIATO),
                Click.on(BTN_CERTIFICADO_AUTOMATICO_IMEDIATO),
                WaitInteractions.untilBeEnable(TXT_CERTIFICADO_AGENCIA),
                Enter.theValue(data.get("Certificados")).into(TXT_CERTIFICADO_AGENCIA),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFIACDO_AGENCIA),
                ModalLoader.modalLoader(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
        //try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }
    public static CoCertificadoOcAgenciaUsPu coCertificadoOcAgenciaUsPu(Map<String, String> data) {
        return Tasks.instrumented(CoCertificadoOcAgenciaUsPu.class, data);
    }
}
