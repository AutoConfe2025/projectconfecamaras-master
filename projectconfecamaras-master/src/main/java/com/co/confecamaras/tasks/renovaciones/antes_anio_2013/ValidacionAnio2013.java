package com.co.confecamaras.tasks.renovaciones.antes_anio_2013;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoVariosAnio2013Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidacionAnio2013 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        if (SERVICIO_1.isVisibleFor(actor)){
        String servicio1 = Text.of(SERVICIO_1).answeredBy(actor);
        System.out.println("numero servicio 1" + servicio1);
        }

        if (SERVICIO_2.isVisibleFor(actor)){
            String servicio2 = Text.of(SERVICIO_2).answeredBy(actor);
            System.out.println("numero servicio 2" + servicio2);
        }

        if (SERVICIO_3.isVisibleFor(actor)){
            String servicio3 = Text.of(SERVICIO_3).answeredBy(actor);
            System.out.println("numero servicio 3" + servicio3);
        }

        if (SERVICIO_4.isVisibleFor(actor)){
            String servicio4 = Text.of(SERVICIO_4).answeredBy(actor);
            System.out.println("numero servicio 4" + servicio4);
        }

        if (SERVICIO_5.isVisibleFor(actor)){
            String servicio5 = Text.of(SERVICIO_5).answeredBy(actor);
            System.out.println("numero servicio 5" + servicio5);
        }
    }

    public static ValidacionAnio2013 validacionAnio2013(){
        return instrumented(ValidacionAnio2013.class);
    }
}
