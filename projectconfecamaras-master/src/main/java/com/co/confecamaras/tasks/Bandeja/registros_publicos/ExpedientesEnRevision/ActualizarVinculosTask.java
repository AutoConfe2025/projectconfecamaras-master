package com.co.confecamaras.tasks.Bandeja.registros_publicos.ExpedientesEnRevision;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ExpedientesEnRevisionPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ActualizarVinculosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AccionesPage.LINK_ACCION.of("Actualizar vínculos")),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.PASSED,"Actualizacion de vinculos"),
                WaitSeconds.seconds(2),
                Click.on(ExpedientesEnRevisionPage.LINK_ADD_VINCULO),
                SelectFromOptions.byIndex(1).from(ExpedientesEnRevisionPage.SLC_INSCRP_NOMBRAMIENTO),
                SelectFromOptions.byIndex(1).from(ExpedientesEnRevisionPage.SLC_TIPO_IDENTIFICACION),
                Enter.theValue("1026265089").into(ExpedientesEnRevisionPage.INP_NUM_IDENTIFICACION),
                SelectFromOptions.byIndex(1).from(ExpedientesEnRevisionPage.SLC_GENERO),
                SelectFromOptions.byIndex(1).from(ExpedientesEnRevisionPage.SLC_TIPO_VINCULO),
                SelectFromOptions.byIndex(1).from(ExpedientesEnRevisionPage.SLC_CARGO),
                Click.on(ExpedientesEnRevisionPage.LINK_GRABAR),
                WaitSeconds.seconds(2),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack()
        );

    }

    public static ActualizarVinculosTask actualizar(){
        return new ActualizarVinculosTask();
    }
}
