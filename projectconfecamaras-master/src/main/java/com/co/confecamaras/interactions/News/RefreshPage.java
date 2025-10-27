package com.co.confecamaras.interactions.News;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RefreshPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().navigate().refresh();
    }

    /**
     *
     * @return
     */
    public static RefreshPage refresh(){
        return Tasks.instrumented(RefreshPage.class);
    }
}
