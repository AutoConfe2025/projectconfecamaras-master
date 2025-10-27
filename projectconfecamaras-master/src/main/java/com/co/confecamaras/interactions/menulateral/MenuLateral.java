package com.co.confecamaras.interactions.menulateral;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.RefreshPage;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTNS_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;

public class MenuLateral implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL)
        );
        for (int i = 0; i <= 50; i++) {
            if(actor.asksFor(ElementoElegible.para(BTNS_MENU_LATERAL))){
                int indexFila = i = 50;
                System.out.println("Menu lateral con opciones desplegadas");
            } else {
                int indexFila = i + 1;
                BrowseTheWeb.as(actor).getDriver().navigate().refresh();
                actor.attemptsTo(
                        //RefreshPage.refresh(),
                        WaitSeconds.seconds(3),
                        ModalLoader.modalLoader(),
                        WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                        Click.on(BTN_MENU_LATERAL)
                );
                System.out.println("Refrescando Pagina " + indexFila);
            }
        }
    }
    public static MenuLateral menuLateral() {
        return Tasks.instrumented(MenuLateral.class);
    }
}
