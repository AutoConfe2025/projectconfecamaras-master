package com.co.confecamaras.tasks.Bandeja.registros_publicos.ExpedientesEnRevision;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ExpedientesEnRevisionPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ActualizarCapitalesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AccionesPage.LINK_ACCION.of("Actualizar capitales")),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.PASSED,"Actualizar financiera"),
                WaitSeconds.seconds(1),
                GetTextOfElement.de(ExpedientesEnRevisionPage.TXT_INFORMACION),
                WaitSeconds.seconds(2),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack()
        );
    }

    public static ActualizarCapitalesTask actualizar(){
        return new ActualizarCapitalesTask();
    }
}
