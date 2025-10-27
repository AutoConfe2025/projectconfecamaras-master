package com.co.confecamaras.interactions.otros;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted2Segundos;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.RobotCerrarPestanas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.Certificados.otros.CertificadoGenerado.*;


public class CertificadoGenerado implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitSeconds.seconds(5),
                Click.on(BTN_OK_VENTANA_INFORMACION)
                );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(VALIDACION_VENTANA_EMERGENTE_CERTIFICADO))){
                int indexFila = i = 50;
                System.out.println("lA VENTANA EMERGENTE DEL CERTIFICADO SI ESTA ");
            } else {
                int indexFila = i++;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(VALIDACION_VENTANA_EMERGENTE_CERTIFICADO),
                Ensure.that(VALIDACION_VENTANA_EMERGENTE_CERTIFICADO).text().isEqualTo("Certificado generado"),
                WaitSeconds.seconds(2),
                Click.on(BTN_DESCARGA_CERTIFICADO),
                RobotCerrarPestanas.toTab(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_CONTINUAR_TIPO_C),
                WaitInteractions.untilBeEnable(BTN_SOPORTES),
                Click.on(BTN_SOPORTES),
                Ensure.that(MENSAJE_VALIDACION_SOPORTES).text().isEqualTo("Soportes de la transacción"),
                Click.on(BTN_VER_SOPORTE),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(BTN_CERRAR),
                Click.on(BTN_CERRAR),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_VER),
                Click.on(BTN_VER),
                Click.on(BTN_DESCARGA_CERTIFICADO),
                RobotCerrarPestanas.toTab()
        );
    }
    public static CertificadoGenerado certificadoGenerado() {
        return Tasks.instrumented(CertificadoGenerado.class);
    }
}
