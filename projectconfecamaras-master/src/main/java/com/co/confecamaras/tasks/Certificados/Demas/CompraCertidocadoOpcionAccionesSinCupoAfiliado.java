package com.co.confecamaras.tasks.Certificados.Demas;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.Map;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraCertidocadoOpcionAccionesSinCupoAfiliado.*;

public class CompraCertidocadoOpcionAccionesSinCupoAfiliado implements Task {

    public final Map<String, String> data;

    public CompraCertidocadoOpcionAccionesSinCupoAfiliado(Map<String, String> data) {
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
                Click.on(BTN_OPCIONES_MERCANTIL),
                Click.on(BTN_SOLICITAR_CERTIFICADO)
                );
        try {Thread.sleep(1000);} catch (InterruptedException e){throw new RuntimeException(e);}
        actor.attemptsTo(
                Click.on(BTN_CERTIFICADO_AUTOMATICO),
                Enter.theValue("1").into(TXT_CERTIFICADOS),
                Click.on(BTN_CONSULTAR_SOLICITUD_CERTIFICADO),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                Click.on(BTN_OK),
                Click.on(BTN_DESCARGAR_CERTIFICADO),
                RobotCerrarPestanas.toTab(),
                Click.on(BTN_CONTINUAR_TIPO_C_CERTIFICADO),
                WaitInteractions.untilBeEnable(VALIDACION_DATOS_RECIBO),
                Ensure.that(VALIDACION_DATOS_RECIBO).text().isEqualTo("DIEGO ALBERTO RIOS MAYORGA"),
                Click.on(BTN_SERVICIO),
                Ensure.that(VALIDACION_SERVICIO).text().isEqualTo("01010101"),
                Click.on(BTN_SOPORTE),
                Click.on(BTN_VER),
                Ensure.that(VERIFICAR_TITULO_VENTANA).text().isEqualTo("Ver documento"),
                Click.on(BTN_CERRAR)
        );
        //try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }

    public static CompraCertidocadoOpcionAccionesSinCupoAfiliado compraCertidocadoOpcionAccionesSinCupoAfiliado(Map<String, String> data) {
        return Tasks.instrumented(CompraCertidocadoOpcionAccionesSinCupoAfiliado.class, data);
    }
}
