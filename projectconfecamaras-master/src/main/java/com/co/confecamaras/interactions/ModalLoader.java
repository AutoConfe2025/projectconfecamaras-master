package com.co.confecamaras.interactions;

import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static com.co.confecamaras.userinterfaces.ModalLoader.MODAL_LOADER;
import static com.co.confecamaras.userinterfaces.ModalLoader.MODAL_LOADER_INICIO;

public class ModalLoader implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        if(actor.asksFor(ElementoElegible.para(MODAL_LOADER))){
            System.out.println("Esperando que el modal de carga finalice");
            actor.attemptsTo(
                    WaitInteractions.untilDisappears(MODAL_LOADER),
                    WaitMilliseconds.milliseconds(500)
            );
        } else {
            System.out.println("No ingreso al modal de carga");
            actor.attemptsTo(
                    WaitSeconds.seconds(2)
            );
        }
    }

    public static ModalLoader modalLoader() {
        return  new ModalLoader();
    }
}
