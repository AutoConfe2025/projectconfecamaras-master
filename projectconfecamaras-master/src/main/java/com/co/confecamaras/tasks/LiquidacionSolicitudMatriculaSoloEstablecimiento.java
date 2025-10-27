package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.LiquidacionSolicitudMatriculaUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LiquidacionSolicitudMatriculaSoloEstablecimiento implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(BTN_CERRAR_LIQUIDACION))){
                int indexFila = i = 50;
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                Click.on(BTN_CERRAR_LIQUIDACION)
        );
    }
    public static LiquidacionSolicitudMatriculaSoloEstablecimiento enConfecamaraSII(){
        return instrumented(LiquidacionSolicitudMatriculaSoloEstablecimiento.class);
    }
}
