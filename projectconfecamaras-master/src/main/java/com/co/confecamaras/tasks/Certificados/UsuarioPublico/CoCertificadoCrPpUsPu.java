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
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCrPpUsPu.*;


public class CoCertificadoCrPpUsPu implements Task {
    public final Map<String, String> data;

    public CoCertificadoCrPpUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADOS_RUP),
                Click.on(BTN_CERTIFICADOS_RUP),
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_RUP),
                Enter.theValue(data.get("Proponente")).into(TXT_PROPONENTE_RUP),
                WaitInteractions.untilAppears(BTN_CONSULTAR_RUP),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_CONSULTAR_RUP),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADO_AUTOMATICO_IMEDIATO),
                Click.on(BTN_CERTIFICADO_AUTOMATICO_IMEDIATO),
                WaitInteractions.untilBeEnable(TXT_CERTIFICADO_RUP),
                Enter.theValue(data.get("Certificados")).into(TXT_CERTIFICADO_RUP),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFIACDO_RUP),
                ModalLoader.modalLoader(),
                //Wait.seconds(6),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
    }
    public static CoCertificadoCrPpUsPu coCertificadoCrPpUsPu(Map<String, String> data) {
        return Tasks.instrumented(CoCertificadoCrPpUsPu.class, data);
    }
}
