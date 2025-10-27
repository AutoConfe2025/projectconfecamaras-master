package com.co.confecamaras.tasks.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.otros.CertificadoGenerado;
import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCdPpUsPu.*;


public class CoCertificadoCdPpUsPu implements Task {

    public final Map<String, String> data;

    public CoCertificadoCdPpUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_TRAMITES_CONSULTA_EXPEDIENTES_RUP),
                Click.on(BTN_TRAMITES_CONSULTA_EXPEDIENTES_RUP),
                WaitInteractions.untilBeEnable(BTN_PROPONENTE),
                Click.on(BTN_PROPONENTE),
                Enter.theValue(data.get("Proponente")).into(TXT_NUMERO_RUP),
                WaitSeconds.seconds(2),
                Click.on(BTN_CONTINUAR_CONSULTA_RUP),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_CONSULTA_DETALLADA_RUP),
                Click.on(BTN_CONSULTA_DETALLADA_RUP),
                WaitSeconds.seconds(3),
                WaitInteractions.untilBeEnable(BTN_OPERACION_REG_MERCANTIL_RUP),
                Click.on(BTN_OPERACION_REG_MERCANTIL_RUP),
                WaitInteractions.untilBeEnable(BTN_SOLICITUD_CERTIFICADOS_RUP),
                Scroll.to(BTN_SOLICITUD_CERTIFICADOS_RUP),
                Click.on(BTN_SOLICITUD_CERTIFICADOS_RUP),
                WaitInteractions.untilBeEnable(BTN_CER_AUTOMATICO_RUP),
                Click.on(BTN_CER_AUTOMATICO_RUP),
                WaitInteractions.untilBeEnable(TXT_CER_MATRICULA_RUP),
                Enter.theValue(data.get("Certificados")).into(TXT_CER_MATRICULA_RUP),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFICADO_RUP),
                ModalLoader.modalLoader(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitSeconds.seconds(2),
                RobotCerrarPestanas.toTab(),
                WaitSeconds.seconds(3),
                CertificadoGenerado.certificadoGenerado()
        );
    }
    public static CoCertificadoCdPpUsPu coCertificadoCdPpUsPu(Map<String, String> data) {
        return Tasks.instrumented(CoCertificadoCdPpUsPu.class, data);
    }
}
