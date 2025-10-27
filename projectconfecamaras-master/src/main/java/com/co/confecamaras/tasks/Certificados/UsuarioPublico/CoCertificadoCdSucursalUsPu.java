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
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCdSucursalUsPu.*;


public class CoCertificadoCdSucursalUsPu implements Task {

    public final Map<String, String> data;

    public CoCertificadoCdSucursalUsPu(Map<String, String> data) {
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
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSULTA),
                Scroll.to(BTN_CONTINUAR_CONSULTA).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_CONSULTA),
                WaitInteractions.untilBeEnable(BTN_CONSULTA_DETALLADA),
                Click.on(BTN_CONSULTA_DETALLADA),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(BTN_OPERACION_REG_MERCANTIL_PJ),
                Click.on(BTN_OPERACION_REG_MERCANTIL_PJ),
                WaitInteractions.untilBeEnable(BTN_SOLICITUD_CERTIFICADOS),
                Click.on(BTN_SOLICITUD_CERTIFICADOS),
                WaitInteractions.untilBeEnable(BTN_CER_AUTOMATICO),
                Click.on(BTN_CER_AUTOMATICO),
                WaitInteractions.untilBeEnable(TXT_CER_MATRICULA_EST),
                Enter.theValue(data.get("Certificados")).into(TXT_CER_MATRICULA_EST),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFICADO),
                ModalLoader.modalLoader(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitInterrupted3Segundos.esperaConstante3(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
    }
    public static CoCertificadoCdSucursalUsPu coCertificadoCdSucursalUsPu(Map<String, String> data){
        return Tasks.instrumented(CoCertificadoCdSucursalUsPu.class, data);
    }
}
