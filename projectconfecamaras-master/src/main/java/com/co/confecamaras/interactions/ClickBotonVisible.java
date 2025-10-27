package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ClickBotonVisible implements Interaction {

    private final Target listButtonContinuar;

    public ClickBotonVisible(Target listButtonContinuar) {
        this.listButtonContinuar = listButtonContinuar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        clickContinuar(listButtonContinuar, actor);
    }

    public void clickContinuar(Target listButtonContinuar, Actor actor) {
        List<WebElementFacade> buttonContinuar = listButtonContinuar.resolveAllFor(actor);

        for (int f = 0; f<buttonContinuar.size(); f++) {
            if (buttonContinuar.get(f).isCurrentlyVisible()) {
                buttonContinuar.get(f).click();
                break;
            }
        }
    }

    public static ClickBotonVisible enConfecamaraSII(Target listButtonContinuar){
        return new ClickBotonVisible(listButtonContinuar);
    }
}