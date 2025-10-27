package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class EnvioInformacionTask implements Task {
    private final String codigo_barras;

    public EnvioInformacionTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DigitacionPage.LINK_ENVIO_INFO_ALCALDIA),
                Scroll.to(DigitacionPage.BTN_VOLVER),
                Click.on(DigitacionPage.BTN_VOLVER),
                Click.on(DigitacionPage.BTN_VOLVER),
                ConsultaGrillaTask.consultar(codigo_barras)
        );
    }
    public static EnvioInformacionTask envio(String codigo_barras){
        return new EnvioInformacionTask(codigo_barras);
    }
}
