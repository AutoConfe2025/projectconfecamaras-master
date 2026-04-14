package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.Bandejas.sincronizacion_maestros_jsp7.PageSincronizacionMaestrosSjp7.BOTON_SINCRONIZAR_TABLAS;
import static com.co.confecamaras.userinterfaces.Bandejas.sincronizacion_maestros_jsp7.PageSincronizacionMaestrosSjp7.SINCRONIZACION_COMPLETA_TEXTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SincronizacionMaestrosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2));

        actor.attemptsTo(
                Click.on(BOTON_SINCRONIZAR_TABLAS),
                AceptAlert.aceptar(),
                WaitInterrupted5Segundos.esperaConstante5(),
                Scroll.to(SINCRONIZACION_COMPLETA_TEXTO)
        );


        actor.should(

                seeThat(
                        Text.of(SINCRONIZACION_COMPLETA_TEXTO),
                        Matchers.equalTo("Sincronización maestros JSP7 realizada correctamente.")

                )
        );
    }

    public static SincronizacionMaestrosTask jsp7() {
        return new SincronizacionMaestrosTask();
    }
}
