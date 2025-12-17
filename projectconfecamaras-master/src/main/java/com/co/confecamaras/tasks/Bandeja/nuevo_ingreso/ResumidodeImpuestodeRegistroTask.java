package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.GestonDeCajaPage.*;


public class ResumidodeImpuestodeRegistroTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso correctammete a Resumido de Impuesto de Registro " ),
                Click.on(BOTON_CONSULTAR),
                WaitSeconds.seconds(1),
                Click.on(BOTON_SI_CONFIRMACION)
        );


        actor.attemptsTo(
                WaitSeconds.seconds(1),
                Scroll.to(BOTON_CERRAR_CUSTOM_MODAL),
                WaitSeconds.seconds(2),
                Click.on(BOTON_CERRAR_CUSTOM_MODAL),
                WaitSeconds.seconds(2),
                LogEvent.recordevent(Reportes.INFO, "Se finalizo correctamnete  correctamente" )
        );

    }

    public static ResumidodeImpuestodeRegistroTask Gestiondecaja() {
        return new ResumidodeImpuestodeRegistroTask();
    }
}