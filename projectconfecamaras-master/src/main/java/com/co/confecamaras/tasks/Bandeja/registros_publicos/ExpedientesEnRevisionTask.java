package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.ExpedientesEnRevision.*;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ExpedientesEnRevisionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ConsultaGrillaTask.consultar("S0016110"),
                CertificadosAntiguoNuevoTask.certificados(),
                ActualizarFormularioTask.actualizar(),
                ActualizarVinculosTask.actualizar(),
                ActualizarFinancieraTask.actualizar(),
                ActualizarCapitalesTask.actualizar(),
                ActualizarCertificasTask.actualizar(),
                ActualizarKardexTask.actualizar(),
                AcceptAlert.aceptar()
        );
    }

    public static ExpedientesEnRevisionTask revisar() {
        return new ExpedientesEnRevisionTask();
    }
}
