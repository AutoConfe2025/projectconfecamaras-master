package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBackHome;
import com.co.confecamaras.interactions.News.RefreshPage;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaModuloTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GrabarAnexoTask implements Task {
    private final String modulo;
    private final String codigo_barras;
    private final String accion;

    public GrabarAnexoTask(String modulo, String codigo_barras, String accion) {
        this.modulo = modulo;
        this.codigo_barras = codigo_barras;
        this.accion = accion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_GRAB_ANEXO))){
            actor.attemptsTo(
                    Click.on(DigitacionPage.LINK_GRAB_ANEXO),
                    Click.on(DigitacionPage.BTN_GRABAR),
                    CloseCurrentWindowAndSwitchBackHome.closeAndSwitchBackHome(),
                    RefreshPage.refresh(),
                    ConsultaModuloTask.consultarModulo(modulo),
                    ConsultaGrillaTask.consultar(codigo_barras),
                    Click.on(AccionesPage.LINK_ACCION.of(accion))
            );
        }
    }

    public static GrabarAnexoTask grabar(String modulo, String codigo_barras, String accion) {
        return new GrabarAnexoTask(modulo, codigo_barras, accion);
    }
}
