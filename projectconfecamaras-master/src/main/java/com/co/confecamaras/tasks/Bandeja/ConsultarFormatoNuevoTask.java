package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.CancelAlert;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.tasks.utils.VerificarURL;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.CertificadosPendientesPage.ENLACE_CONSULTAR_FORMATO_NUEVO;


public class ConsultarFormatoNuevoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitInteractions.untilAppears(ENLACE_CONSULTAR_FORMATO_NUEVO),

                Click.on(ENLACE_CONSULTAR_FORMATO_NUEVO),
                AceptAlert.cancelar()
        );


    }

    public static ConsultarFormatoNuevoTask consultar() {
        return new ConsultarFormatoNuevoTask();
    }
}