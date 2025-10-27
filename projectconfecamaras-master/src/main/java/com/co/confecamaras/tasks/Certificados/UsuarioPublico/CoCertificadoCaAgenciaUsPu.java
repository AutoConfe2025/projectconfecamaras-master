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
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCaAgenciaUsPu.*;

public class CoCertificadoCaAgenciaUsPu implements Task {

    public final Map<String, String> data;

    public CoCertificadoCaAgenciaUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_TRAMITES_CONSULTA_EXPEDIENTES),
                Click.on(BTN_TRAMITES_CONSULTA_EXPEDIENTES),
                Enter.theValue(data.get("Matricula")).into(TXT_NUMERO_MATRICULA),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSULTA),
                Scroll.to(BTN_CONTINUAR_CONSULTA).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_CONSULTA),
                WaitInteractions.untilBeEnable(BTN_ACCIONES_AGENCIA),
                Click.on(BTN_ACCIONES_AGENCIA),
                WaitInteractions.untilBeEnable(BTN_OPCION_MERCANTIL_AGENCIA),
                Click.on(BTN_OPCION_MERCANTIL_AGENCIA),
                Click.on(BTN_SOLICITAR_CERTIFICADO),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADO_AUTOMATICO_ACCIONES),
                Click.on(BTN_CERTIFICADO_AUTOMATICO_ACCIONES),
                WaitInteractions.untilBeEnable(TXT_CERTIFICADO),
                Enter.theValue(data.get("Certificados")).into(TXT_CERTIFICADO),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFICADO_SUCURSAL),
                ModalLoader.modalLoader(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
    }
    public static CoCertificadoCaAgenciaUsPu coCertificadoCaAgenciaUsPu(Map<String, String> data) {
        return Tasks.instrumented(CoCertificadoCaAgenciaUsPu.class, data);
    }
}
