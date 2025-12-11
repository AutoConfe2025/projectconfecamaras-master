package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SubirArchivoDoc;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.Bandejas.Administracion.AdminPage.*;
import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.ENLACE_GRABAR;


public class ZonasYComunasTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Click.on(IMAGEN_ACCION_FILA_2),
                WaitSeconds.seconds(2),
                Click.on(BOTON_CERRAR_VENTANA),
                Click.on(IMAGEN_ACCION_FILA_4),
                Click.on(BOTON_CERRAR_VENTANA),
                Click.on(ENLACE_GRABAR)


        );




    }

    public static ZonasYComunasTask administracion() {
        return new ZonasYComunasTask();
    }
}