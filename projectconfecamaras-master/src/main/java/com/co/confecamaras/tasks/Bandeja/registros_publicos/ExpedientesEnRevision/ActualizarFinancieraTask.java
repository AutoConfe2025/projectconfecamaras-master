package com.co.confecamaras.tasks.Bandeja.registros_publicos.ExpedientesEnRevision;

import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBack;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ExpedientesEnRevisionPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ActualizarFinancieraTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String nuevo_valor = "310000";
        actor.attemptsTo(
                Click.on(AccionesPage.LINK_ACCION.of("Actualizar financiera")),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.PASSED,"Actualizar financiera"),
                WaitSeconds.seconds(1),
                Click.on(ExpedientesEnRevisionPage.LINK_EDIT_FINANCIERA.of("2008")),
                WaitInteractions.untilAppears(ExpedientesEnRevisionPage.INP_ACT_CORRIENTE),
                Enter.theValue(nuevo_valor).into(ExpedientesEnRevisionPage.INP_ACT_CORRIENTE),
                Enter.theValue(nuevo_valor).into(ExpedientesEnRevisionPage.INP_ACT_TOTAL),
                Enter.theValue(nuevo_valor).into(ExpedientesEnRevisionPage.INP_PAT_NETO),
                Enter.theValue(nuevo_valor).into(ExpedientesEnRevisionPage.INP_PASIV_PATRIM),
                Enter.theValue(nuevo_valor).into(ExpedientesEnRevisionPage.INP_INGR_OPERACIONAL),
                Click.on(ExpedientesEnRevisionPage.LINK_GRABAR),
                WaitSeconds.seconds(2),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack()
        );

    }

    public static ActualizarFinancieraTask actualizar() {
        return new ActualizarFinancieraTask();
    }
}
