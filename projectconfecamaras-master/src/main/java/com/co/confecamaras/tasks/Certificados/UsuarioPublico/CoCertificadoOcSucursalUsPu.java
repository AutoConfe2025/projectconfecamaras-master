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
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoOcSucursalUsPu.*;


public class CoCertificadoOcSucursalUsPu implements Task {
    public final Map<String, String> data;

    public CoCertificadoOcSucursalUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADOS),
                Click.on(BTN_CERTIFICADOS),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_MATRICULA),
                Enter.theValue(data.get("Matricula")).into(TXT_MATRICULA),
                WaitInteractions.untilAppears(BTN_CONSULTAR_SUCURSAL),
                ModalLoader.modalLoader(),
                Click.on(BTN_CONSULTAR_SUCURSAL),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADO_AUTOMATICO_IMEDIATO),
                Click.on(BTN_CERTIFICADO_AUTOMATICO_IMEDIATO),
                WaitInteractions.untilBeEnable(TXT_CERTIFICADO_SUCURSAL),
                Enter.theValue(data.get("Certificados")).into(TXT_CERTIFICADO_SUCURSAL),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFIACDO_SUCURSAL),
                ModalLoader.modalLoader(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitInterrupted3Segundos.esperaConstante3(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
    }
    public static CoCertificadoOcSucursalUsPu coCertificadoOcSucursalUsPu(Map<String, String> data){
        return Tasks.instrumented(CoCertificadoOcSucursalUsPu.class, data);
    }
}
