package com.co.confecamaras.tasks.Bandeja.registros_publicos.ExpedientesEnRevision;

import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBack;
import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ExpedientesEnRevisionPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ActualizarFormularioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AccionesPage.LINK_ACCION.of("Actualizar formulario")),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.PASSED,"Actualizar formulario"),
                Scroll.to(ExpedientesEnRevisionPage.SLC_ACCESO_PUBLICO),
                SelectFromOptions.byIndex(1).from(ExpedientesEnRevisionPage.SLC_ACCESO_PUBLICO),
                Click.on(ExpedientesEnRevisionPage.LINK_GRABAR),
                GetTextOfElement.de(ExpedientesEnRevisionPage.TXT_ALERT),
                Click.on(ExpedientesEnRevisionPage.BTN_OK_ALERT),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack()
        );
    }

    public static ActualizarFormularioTask actualizar(){
        return new ActualizarFormularioTask();
    }
}
