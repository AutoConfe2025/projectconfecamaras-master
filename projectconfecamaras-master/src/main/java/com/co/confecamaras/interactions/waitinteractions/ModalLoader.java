package com.co.confecamaras.interactions.waitinteractions;

import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.ModalLoader.MODAL_LOADER;

public class ModalLoader implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(MODAL_LOADER))){
            System.out.println("Esperando que el modal cargue");
            actor.attemptsTo(
                    WaitInteractions.untilDisappears(MODAL_LOADER),
                    WaitMilliseconds.milliseconds(500)
            );
        } else {
            System.out.println("No hay modal de carga");
            actor.attemptsTo(
                    WaitSeconds.seconds(2)
            );
        }

    }
    public static ModalLoader modalLoader() {
        return  new ModalLoader();
    }
}
