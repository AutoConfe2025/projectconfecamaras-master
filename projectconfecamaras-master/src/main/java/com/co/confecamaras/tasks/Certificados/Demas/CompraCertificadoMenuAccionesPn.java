package com.co.confecamaras.tasks.Certificados.Demas;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.Map;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraCertificadoMenuAccionesPn.*;

public class CompraCertificadoMenuAccionesPn implements Task {

    public final Map<String, String> data;

    public CompraCertificadoMenuAccionesPn(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                JavaScriptClick.on(BTN_TRAMITES_Y_CONSULTAS_DEL_EXPEDIENTE),
                Enter.theValue(data.get("Matricula")).into(TXT_BUSQUEDA),
                Click.on(BTN_CONSULTAR),
                Click.on(BTN_ACCIONES),
                Click.on(BTN_OPERACION_MERCANTIL),
                Click.on(BTN_SOLICITAR_CERTIFICADOS),
                Click.on(BTN_C_AUTOMATICO),
                Enter.theValue("1").into(TXT_CANTIDAD_CERTIFICADOS),
                Click.on(BTN_CONTINUAR),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                RobotCerrarPestanas.toTab(),
                Click.on(BTN_OK),
                Click.on(BTN_DESCARGA_CERTIFICADO),
                Switch.toNewWindow(),
                Switch.toTheOtherWindow(),
                RobotCerrarPestanas.toTab(),
                Click.on(BTN_CONTINUAR_TIPO_C),
                Click.on(BTN_SOPORTE),
                Click.on(BTN_VER),
                Ensure.that(VAL_TITULO_VER_DOCUMENTO).text().isEqualTo("Ver documento"),
                Click.on(BTN_CERRAR_X)
        );
        //try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }

    public static CompraCertificadoMenuAccionesPn compraCertificadoCupoAfiliadoPN(Map<String, String> data) {
        return Tasks.instrumented(CompraCertificadoMenuAccionesPn.class, data);
    }
}
