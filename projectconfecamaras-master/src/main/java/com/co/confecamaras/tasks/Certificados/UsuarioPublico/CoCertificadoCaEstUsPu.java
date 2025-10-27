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
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCaEstUsPu.*;


public class CoCertificadoCaEstUsPu implements Task {

    public final Map<String, String> data;

    public CoCertificadoCaEstUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_TRAMITES_CONSULTA_EXPEDIENTES_CA),
                Click.on(BTN_TRAMITES_CONSULTA_EXPEDIENTES_CA),
                Enter.theValue(data.get("Matricula")).into(TXT_NUMERO_MATRICULA_CA),
                Scroll.to(BTN_CONTINUAR_CONSULTA_CA),
                Click.on(BTN_CONTINUAR_CONSULTA_CA),
                WaitInteractions.untilBeEnable(BTN_ACCIONES_EST),
                Click.on(BTN_ACCIONES_EST),
                WaitInteractions.untilBeEnable(BTN_OPCION_MERCANTIL_EST),
                Click.on(BTN_OPCION_MERCANTIL_EST),
                Click.on(BTN_SOLICITAR_CERTIFICADO_CA),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADO_AUTOMATICO_ACCIONES),
                Click.on(BTN_CERTIFICADO_AUTOMATICO_ACCIONES),
                WaitInteractions.untilBeEnable(TXT_CERTIFICADO),
                Enter.theValue(data.get("Certificados")).into(TXT_CERTIFICADO),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFICADO_ESADL),
                ModalLoader.modalLoader(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
        //try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }
    public static CoCertificadoCaEstUsPu coCertificadoCaEstUsPu(Map<String, String> data) {
        return Tasks.instrumented(CoCertificadoCaEstUsPu.class, data);
    }
}