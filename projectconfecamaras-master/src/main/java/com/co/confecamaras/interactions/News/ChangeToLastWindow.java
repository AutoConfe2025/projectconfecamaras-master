package com.co.confecamaras.interactions.News;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.ArrayList;
import java.util.List;

public class ChangeToLastWindow implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> all_windows = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());

        String last_window = all_windows.get(all_windows.size()  -1);
        BrowseTheWeb.as(actor).getDriver().switchTo().window(last_window);
    }
    /**
     * Cambiara a la ultima ventana abierta.<br>
     *
     * @return
     * @author: Isaac Gomez
     */
    public static ChangeToLastWindow changeToLastWindow() {
        return Tasks.instrumented(ChangeToLastWindow.class);
    }
}
