package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.MatrizServicioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoMAtrizServicios implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_GENERAR_ACARCHIVO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_GENERAR_ACARCHIVO),
                AceptAlert.aceptar(),
                Click.on(BOTON_DESCARGAR_ACARCHIVO),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA)
        );
    }

    public static FlujoMAtrizServicios matrizServicios(){
        return new FlujoMAtrizServicios();
    }
}
