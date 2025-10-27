package com.co.confecamaras.tasks.Bandeja.registros_publicos.ControlCalidad;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ControlCalidadPage;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class DigitarInformacionTask implements Task {
    private final String codigo_barras;

    public DigitarInformacionTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AccionesPage.LINK_ACCION.of("Digitar informacion")),
                WaitInteractions.untilAppears(ControlCalidadPage.LINK_FORMULARIO),
                Click.on(ControlCalidadPage.LINK_FORMULARIO),
                WaitInteractions.untilAppears(ControlCalidadPage.LINK_CERTIFICADO),
                Click.on(ControlCalidadPage.LINK_CERTIFICADO),
                GuardarArchivo.guardar(),
                Click.on(ControlCalidadPage.LINK_VOLVER_DIGITACION),
                Click.on(ControlCalidadPage.LINK_VOLVER_BANDEJA),
                ConsultaGrillaTask.consultar(codigo_barras)
        );
    }

    public static DigitarInformacionTask informacion(String codigo_barras) {
        return new DigitarInformacionTask(codigo_barras);
    }
}
