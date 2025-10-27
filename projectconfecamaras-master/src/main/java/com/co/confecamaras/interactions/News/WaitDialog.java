package com.co.confecamaras.interactions.News;

import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.ModalLoader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;


public class WaitDialog implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitInteractions.untilDisappears(ModalLoader.WAIT_DIALOG)
            );
        }catch (Exception e){}
    }

    public static WaitDialog waitDialog(){
        return Tasks.instrumented(WaitDialog.class);
    }
}
