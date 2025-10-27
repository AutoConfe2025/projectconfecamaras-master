package com.co.confecamaras.tasks.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.otros.CertificadoGenerado;
import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted2Segundos;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.Map;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraRapidaCertificadosNoAfiliado.BTN_OK_VENTANA_INFORMACION;
import static com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico.CoCertificadoCaEsadlUsPu.*;

public class CoCertificadoCaEsadlUsPu implements Task {

    public final Map<String, String> data;

    public CoCertificadoCaEsadlUsPu(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                WaitInteractions.untilBeEnable(BTN_TRAMITES_CONSULTA_EXPEDIENTES),
                Click.on(BTN_TRAMITES_CONSULTA_EXPEDIENTES),
                Enter.theValue(data.get("Matricula")).into(TXT_NUMERO_MATRICULA),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_CONTINUAR_CONSULTA),
                WaitInteractions.untilBeEnable(BTN_ACCIONES_ESADL),
                Click.on(BTN_ACCIONES_ESADL),
                WaitInteractions.untilBeEnable(BTN_OPCION_MERCANTIL_ESADL),
                Click.on(BTN_OPCION_MERCANTIL_ESADL),
                Click.on(BTN_SOLICITAR_CERTIFICADO),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADO_AUTOMATICO_ACCIONES),
                Click.on(BTN_CERTIFICADO_AUTOMATICO_ACCIONES),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_CERTIFICADO_LIBROS),
                Enter.theValue(data.get("Certificados")).into(TXT_CERTIFICADO_LIBROS),
                Click.on(BTN_CONTINUAR_SOLICITUD_CERTIFICADO_ESADL)
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(BTN_OK_VENTANA_INFORMACION))){
                int indexFila = i = 50;
            } else {
                int indexFila = i++;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                WaitInterrupted2Segundos.esperaConstante2(),
                RobotCerrarPestanas.toTab(),
                CertificadoGenerado.certificadoGenerado()
        );
    }
    public static CoCertificadoCaEsadlUsPu coCertificadoCaEsadlUsPu(Map<String, String> data) {
        return Tasks.instrumented(CoCertificadoCaEsadlUsPu.class, data);
    }
}
