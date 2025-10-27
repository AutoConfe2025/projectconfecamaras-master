package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class CheckboxMotivosDevolucion implements Interaction {

    private Target campoId;
    private Target campoCheckbox;
    private String idMotivosDevolucion;

    public CheckboxMotivosDevolucion(Target campoId, Target campoCheckbox, String idMotivosDevolucion) {
        this.campoId = campoId;
        this.campoCheckbox = campoCheckbox;
        this.idMotivosDevolucion = idMotivosDevolucion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        checkbox(campoId, campoCheckbox, actor);
    }

    public void  checkbox(Target campoId, Target campoCheckbox, Actor actor){
        List<WebElementFacade> numeroId = campoId.resolveAllFor(actor);
        List<WebElementFacade> selectCheckbox = campoCheckbox.resolveAllFor(actor);

        for (int f=0; f<numeroId.size(); f++){
            if (numeroId.get(f).getText().equals(idMotivosDevolucion)){
                selectCheckbox.get(f).click();
                break;
            }
        }
    }

    public static CheckboxMotivosDevolucion enConfecamaraSII(Target campoId, Target campoCheckbox, String idMotivosDevolucion){
        return new CheckboxMotivosDevolucion(campoId, campoCheckbox, idMotivosDevolucion);
    }
}