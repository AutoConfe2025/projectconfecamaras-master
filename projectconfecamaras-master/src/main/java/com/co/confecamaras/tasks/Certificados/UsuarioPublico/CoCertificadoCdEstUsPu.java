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
import java.util.Map;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCdEstUsPu.*;


public class CoCertificadoCdEstUsPu implements Task {

    public final Map<String, String> data;

    public CoCertificadoCdEstUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_TRAMITES_CONSULTA_EXPEDIENTES),
                Click.on(BTN_TRAMITES_CONSULTA_EXPEDIENTES),
                Enter.theValue(data.get("Matricula")).into(TXT_NUMERO_MATRICULA),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_CONTINUAR_CONSULTA),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_CONSULTA_DETALLADA),
                Click.on(BTN_CONSULTA_DETALLADA),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(BTN_OPERACION_REG_MERCANTIL_ESADL),
                Click.on(BTN_OPERACION_REG_MERCANTIL_ESADL),
                WaitInteractions.untilBeEnable(BTN_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilBeEnable(BTN_CER_AUTOMATICO),
                Click.on(BTN_CER_AUTOMATICO),
                WaitInteractions.untilBeEnable(TXT_CER_MATRICULA_EST),
                Enter.theValue(data.get("Certificados")).into(TXT_CER_MATRICULA_EST),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFICADO),
                ModalLoader.modalLoader(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
        //try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }
    public static CoCertificadoCdEstUsPu coCertificadoCdEstUsPu(Map<String, String> data) {
        return Tasks.instrumented(CoCertificadoCdEstUsPu.class, data);
    }
}
