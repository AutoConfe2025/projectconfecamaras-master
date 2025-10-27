package com.co.confecamaras.interactions.News;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CloseCurrentWindowAndSwitchBackHome implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String previous_window = actor.recall("main_window");

        BrowseTheWeb.as(actor).getDriver().close();
        BrowseTheWeb.as(actor).getDriver().switchTo().window(previous_window);
    }
    /**
     * Se usa para cerrar la segunda ventana que ya no se va a usar,<br>
     * y es abierta por nuestra ventana principal.
     *
     * @return
     * @author: Isaac Gomez
     */
    public static CloseCurrentWindowAndSwitchBackHome closeAndSwitchBackHome() {
        return Tasks.instrumented(CloseCurrentWindowAndSwitchBackHome.class);
    }
}
