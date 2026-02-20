package com.co.confecamaras.tasks.mantenimientoeinformes.activos;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.interactions.ActionBackPage;
import com.co.confecamaras.interactions.RefreshPage;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.Activos.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidaDescargas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_EXPORTAR_EXCEL),
                AceptAlert.aceptar(),
                WaitUntil.the(BOTON_DESCRAGR_EXCEL, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(BOTON_DESCRAGR_EXCEL),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA_SISTEMA),
                ActionBackPage.ahora(),
                RefreshPage.ahora(),
                Click.on(BOTON_IMPORTAR_EXCEL),
                Click.on(BOTON_CONTINUAR)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static ValidaDescargas excel(){
        return new ValidaDescargas();
    }
}
