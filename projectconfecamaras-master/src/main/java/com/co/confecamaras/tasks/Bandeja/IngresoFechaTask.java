package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TramitesReingresadosPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.Bandejas.RevisionSIPREF.RevisionSIPREFPage.CAMPO_FECHA_INICIAL;
import static com.co.confecamaras.utils.bandejas.Revision_Asentamiento.Revision_Asentamientos.fecha_inicial;

public class IngresoFechaTask implements Task {

    public IngresoFechaTask() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Ingresando Fecha ");
        actor.attemptsTo(
                WaitInteractions.untilAppears(CAMPO_FECHA_INICIAL),
                Enter.theValue(fecha_inicial).into(CAMPO_FECHA_INICIAL).thenHit(Keys.ENTER)
        );


    }

    public static IngresoFechaTask fecha() {
        return new IngresoFechaTask();
    }
}
