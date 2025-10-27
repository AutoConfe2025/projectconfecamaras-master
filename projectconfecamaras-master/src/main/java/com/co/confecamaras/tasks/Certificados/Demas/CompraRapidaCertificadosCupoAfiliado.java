package com.co.confecamaras.tasks.Certificados.Demas;

import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.Map;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraRapidaCertificadosCupoAfiliado.*;

public class CompraRapidaCertificadosCupoAfiliado implements Task {

    public final Map<String, String> data;

    public CompraRapidaCertificadosCupoAfiliado(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(BOTON_OPCION_BUSCAR),
                    Enter.theValue(data.get("Matricula")).into(CUADRO_TEXTO_MATRICULA),
                    Click.on(BOTON_CONSULTAR),
                    WaitInteractions.untilBeEnable(BOTON_SELECCIONAR),
                    Click.on(BOTON_SELECCIONAR),
                    WaitInteractions.untilBeEnable(BOTON_AÑADIR),
                    Click.on(BOTON_AÑADIR),
                    Click.on(BTN_VER_CARRRITO),
                    WaitInteractions.untilBeEnable(BTN_CUPO_AFILIADO),
                    Click.on(BTN_CUPO_AFILIADO),
                    WaitInteractions.untilBeEnable(TXT_EMAIL),
                    Enter.theValue(data.get("Correo")).into(TXT_EMAIL),
                    Enter.theValue(data.get("Clave cupo afiliado")).into(TXT_CONTRASEÑA_AFILIADO),
                    Click.on(BTN_CONTINUAR_CLAVE_AFILIADO),Click.on(BOTON_OK),
                    Click.on(BTN_DESCARGAR_CERTIFICADO),
                    Switch.toNewWindow(),
                    Switch.toTheOtherWindow(),
                    RobotCerrarPestanas.toTab(),
                    Click.on(BTN_CONTINUAR),
                    Click.on(BTN_DATOS_RECIBO),
                    Ensure.that(VALIDACION_NOMBRE_RECIBO).text().isEqualTo("Recibo"),
                    Click.on(BTN_SERVICIOS),
                    Ensure.that(VALIDACION_FORMA_DE_PAGO).text().isEqualTo("Forma de pago"),
                    Click.on(BTN_SOPORTES),
                    Click.on(BTN_VER),
                    Ensure.that(MENSAJE_DOCUMENTO).text().isEqualTo("Ver documento"),
                    Click.on(BTN_CERRAR)
            );
            //try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }

    public static CompraRapidaCertificadosCupoAfiliado compraCertificadoCupoAfiliado(Map<String, String> data) {
        return Tasks.instrumented(CompraRapidaCertificadosCupoAfiliado.class, data);
    }

}
