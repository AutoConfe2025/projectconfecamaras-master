package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.GestonDeCajaPage.*;


public class GeneraClavePrepagoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitSeconds.seconds(3),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso correctammete a Genera clave prepago" ),
                Enter.theValue("1026265083").into(CAMPO_IDENTIFICACION),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CAMPO_CORREO_ELECTRONICO),
                LogEvent.recordevent(Reportes.INFO, "Se va a intentar generar Clave" ),
                Click.on(BOTON_GENERAR_CLAVE)
                );


        actor.attemptsTo(
                LogEvent.recordevent(Reportes.INFO, "Mensaje de verificacion" ),
                WaitSeconds.seconds(2),
                Click.on(BOTON_CERRAR_MODAL),
                WaitSeconds.seconds(2),
                LogEvent.recordevent(Reportes.INFO, "Finalizo correctamente" )


        );






    }

    public static GeneraClavePrepagoTask Gestiondecaja() {
        return new GeneraClavePrepagoTask();
    }
}