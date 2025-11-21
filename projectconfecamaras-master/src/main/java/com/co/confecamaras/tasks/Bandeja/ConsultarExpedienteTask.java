package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.tasks.utils.VerificarURL;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.CertificadosPendientesPage.ENLACE_CONSULTAR_EXPEDIENTE;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;


public class ConsultarExpedienteTask implements Task {

    @Override
    @Step("{0} verifica la apertura y cierre del enlace 'Consultar Expediente'")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // 1. Esperar a que el elemento esté visible/presente antes de intentar hacer clic
                WaitInteractions.untilAppears(ENLACE_CONSULTAR_EXPEDIENTE),

                // 2. Usar la tarea VerificarURL que acepta el Target como argumento
                VerificarURL.elEnlace(ENLACE_CONSULTAR_EXPEDIENTE)
        );

        // Tras el completion de VerificarURL, el Actor ha vuelto a la página original.
    }

    public static ConsultarExpedienteTask consultar() {
        return new ConsultarExpedienteTask();
    }
}