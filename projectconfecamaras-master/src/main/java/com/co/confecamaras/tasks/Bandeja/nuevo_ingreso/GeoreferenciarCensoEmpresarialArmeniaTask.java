package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.GeoreferenciarCensoEmpresarial_ArmeniaPage.*;


public class GeoreferenciarCensoEmpresarialArmeniaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                SwitchToNewWindow.switchToNewTab(),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso correctammete a Georeferenciar Censo Empresarial (Armenia)" )
                      );


        actor.attemptsTo(


                WaitSeconds.seconds(1),

                SelectFromOptions.byVisibleText("Censo general (1)")
                        .from(SELECT_TABLA_CENSO),
                SelectFromOptions.byVisibleText("MANIZALES")
                        .from(SELECT_MUNICIPIO),
                SelectFromOptions.byVisibleText("Servicios")
                        .from(SELECT_ACTIVIDAD),
                SelectFromOptions.byVisibleText("Todos")
                        .from(SELECT_ACTIVIDAD),
                Click.on(BOTON_GENERAR),
                AceptAlert.aceptar(),
                WaitSeconds.seconds(3),
                LogEvent.recordevent(Reportes.PASSED, "Se Finalizo corectamente las validaciones  a Georeferenciar Censo Empresarial (Armenia)" )



        );







    }

    public static GeoreferenciarCensoEmpresarialArmeniaTask ConsultaInterna() {
        return new GeoreferenciarCensoEmpresarialArmeniaTask();
    }
}