package com.co.confecamaras.tasks.Certificados.Demas;

import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
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

import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraRapidaCertificadosNoAfiliado.*;


public class CompraRapidaCertificadosNoAfiliado implements Task {

    public final Map<String, String> data;

    public CompraRapidaCertificadosNoAfiliado(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_OPCION_BUSCAR),
                Enter.theValue(data.get("Matricula1")).into(CUADRO_TEXTO_MATRICULA),
                Click.on(BOTON_CONSULTAR),
                Click.on(BOTON_SELECCIONAR),
                WaitInteractions.untilBeEnable(BOTON_AÑADIR),
                Click.on(BOTON_AÑADIR),
                Click.on(BTN_SEGUIR_COMPRANDO),
                WaitInteractions.untilBeEnable(CUADRO_TEXTO_MATRICULA),
                Enter.theValue(data.get("Matricula2")).into(CUADRO_TEXTO_MATRICULA),
                Click.on(BOTON_CONSULTAR),
                Click.on(BOTON_SELECCIONAR),
                WaitInteractions.untilBeEnable(BOTON_AÑADIR),
                Click.on(BOTON_AÑADIR),
                Click.on(BTN_MI_CARRITO),
                WaitInteractions.untilBeEnable(BTN_CERRAR),
                Click.on(BTN_CERRAR),
                WaitInteractions.untilBeEnable(BTN_VER_CARRITO),
                Click.on(BTN_VER_CARRITO),
                Click.on(BTN_LIMPIAR),
                Click.on(BTN_CERRAR),
                WaitInteractions.untilBeEnable(BTN_SEGUIR_COMPRANDO),
                Click.on(BTN_SEGUIR_COMPRANDO),
                Click.on(BOTON_OPCION_BUSCAR),
                Enter.theValue(data.get("Matricula1")).into(CUADRO_TEXTO_MATRICULA),
                Click.on(BOTON_CONSULTAR),
                Click.on(BOTON_SELECCIONAR),
                WaitInteractions.untilBeEnable(BOTON_AÑADIR),
                Click.on(BOTON_AÑADIR),
                WaitInteractions.untilBeEnable(BTN_VER_CARRITO),
                Click.on(BTN_VER_CARRITO),
                Click.on(BOTON_PAGAR),
                Enter.theValue(data.get("Correo")).into(TXT_CORREO),
                Click.on(BTN_OK),
                PagoUsuarioPublicoNoPresencial.enConfecamaras(),
                RobotCerrarPestanas.toTab(),
                Click.on(BTN_OK_VENTANA_INFORMACION),
                Ensure.that(VALIDACION_VENTANA_EMERGENTE_CERTIFICADO).text().isEqualTo("Certificado generado"),
                Click.on(BTN_DESCARGA_CERTIFICADO),
                Switch.toNewWindow(),
                Switch.toTheOtherWindow(),
                RobotCerrarPestanas.toTab(),
                Click.on(BTN_CONTINUAR_TIPO_C),
                Click.on(BTN_SOPORTES),
                Ensure.that(MENSAJE_VALIDACION_SOPORTES).text().isEqualTo("Soportes de la transacción"),
                Click.on(BTN_VER_SOPORTE)
        );
        try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }

    public static CompraRapidaCertificadosNoAfiliado compraRapidaCertificadosNoAfiliado(Map<String, String> data) {
        return Tasks.instrumented(CompraRapidaCertificadosNoAfiliado.class, data);
    }
}
