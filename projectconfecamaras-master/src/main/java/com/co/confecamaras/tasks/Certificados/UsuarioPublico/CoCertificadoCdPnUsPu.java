package com.co.confecamaras.tasks.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.News.WaitSeconds;
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
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCdPnUsPu.*;


public class CoCertificadoCdPnUsPu implements Task {

    public final Map<String, String> data;

    public CoCertificadoCdPnUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_TRAMITES_CONSULTA_EXPEDIENTES_PN),
                Click.on(BTN_TRAMITES_CONSULTA_EXPEDIENTES_PN),
                Enter.theValue(data.get("Matricula")).into(TXT_NUMERO_MATRICULA_PN),
                WaitSeconds.seconds(2),
                Click.on(BTN_CONTINUAR_CONSULTA_PN),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_CONSULTA_DETALLADA_PN),
                Click.on(BTN_CONSULTA_DETALLADA_PN),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(BTN_OPERACION_REG_MERCANTIL_PN),
                Scroll.to(BTN_OPERACION_REG_MERCANTIL_PN),
                Click.on(BTN_OPERACION_REG_MERCANTIL_PN),
                WaitInteractions.untilBeEnable(BTN_SOLICITUD_CERTIFICADOS_PN),
                Scroll.to(BTN_SOLICITUD_CERTIFICADOS_PN),
                Click.on(BTN_SOLICITUD_CERTIFICADOS_PN),
                WaitInteractions.untilBeEnable(BTN_CER_AUTOMATICO_PN),
                Click.on(BTN_CER_AUTOMATICO_PN),
                WaitInteractions.untilBeEnable(TXT_CER_MATRICULA_PN),
                Enter.theValue(data.get("Certificados")).into(TXT_CER_MATRICULA_PN),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFICADO_PN),
                ModalLoader.modalLoader(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
    }
    public static CoCertificadoCdPnUsPu coCertificadoCdPnUsPu(Map<String, String> data) {
        return Tasks.instrumented(CoCertificadoCdPnUsPu.class, data);
    }
}
