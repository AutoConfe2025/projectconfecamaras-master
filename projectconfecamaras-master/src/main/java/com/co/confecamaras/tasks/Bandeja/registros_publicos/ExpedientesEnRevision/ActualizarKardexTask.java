package com.co.confecamaras.tasks.Bandeja.registros_publicos.ExpedientesEnRevision;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.ConfirmarAlertaAccionTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ExpedientesEnRevisionPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TramitesReingresadosPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class ActualizarKardexTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String fecha_limite = "11272024";
        actor.attemptsTo(
                Click.on(AccionesPage.LINK_ACCION.of("Actualizar kardex")),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.PASSED,"Actualizar kardex"),
                Enter.theValue("RE51-13452-1").into(TramitesReingresadosPage.INPUT_BUSCAR),
                Click.on(AccionesPage.LINK_ACCION.of("Editar")),
                WaitInteractions.untilAppears(ExpedientesEnRevisionPage.INP_FECHA_LIMITE),
                Enter.theValue(fecha_limite).into(ExpedientesEnRevisionPage.INP_FECHA_LIMITE),
                Scroll.to(ExpedientesEnRevisionPage.LINK_GRABAR),
                Click.on(ExpedientesEnRevisionPage.LINK_GRABAR),
                Enter.theValue("RE51-13452-1").into(TramitesReingresadosPage.INPUT_BUSCAR),
                Click.on(AccionesPage.LINK_ACCION.of("Borrar")),
                ConfirmarAlertaAccionTask.confirmar(ExpedientesEnRevisionPage.TXT_ALERT, ExpedientesEnRevisionPage.BTN_CANCELAR),
                Click.on(AccionesPage.LINK_ACCION.of("Generar sello")),
                ConfirmarAlertaAccionTask.confirmar(ExpedientesEnRevisionPage.TXT_ALERT, ExpedientesEnRevisionPage.BTN_GENERAR_SELLO),
                GuardarArchivo.guardar(),
                WaitSeconds.seconds(2),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack()
        );
    }

    public static ActualizarKardexTask actualizar() {
        return new ActualizarKardexTask();
    }
}
