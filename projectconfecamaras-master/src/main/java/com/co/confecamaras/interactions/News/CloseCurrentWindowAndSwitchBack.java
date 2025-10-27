package com.co.confecamaras.interactions.News;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CloseCurrentWindowAndSwitchBack implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String previous_window = actor.recall("second_main_window");

        BrowseTheWeb.as(actor).getDriver().close();
        BrowseTheWeb.as(actor).getDriver().switchTo().window(previous_window);
    }

    /**
     * Se usa para cerrar ventanas que ya no se van a usar,<br>
     * y son abiertas por una segunda ventana.
     *
     * @return
     * @author: Isaac Gomez
     */
    public static CloseCurrentWindowAndSwitchBack closeAndSwitchBack() {
        return Tasks.instrumented(CloseCurrentWindowAndSwitchBack.class);
    }
}
