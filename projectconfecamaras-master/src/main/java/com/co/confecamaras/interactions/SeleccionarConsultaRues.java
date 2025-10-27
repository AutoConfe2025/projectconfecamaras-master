package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SeleccionarConsultaRues implements Interaction {

    private Target campoConsultaRues;
    private String idConsultaRues;

    public SeleccionarConsultaRues(Target campoConsultaRues, String idConsultaRues) {
        this.campoConsultaRues = campoConsultaRues;
        this.idConsultaRues = idConsultaRues;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        selecionarConsultaRues(campoConsultaRues, actor);
    }

    public void selecionarConsultaRues(Target campoConsultaRues, Actor actor){
        List<WebElementFacade> selectConsultaRues = campoConsultaRues.resolveAllFor(actor);

        for (int f=0; f<selectConsultaRues.size(); f++){
            if (selectConsultaRues.get(f).getText().equals(idConsultaRues)){
                selectConsultaRues.get(f).click();
                break;
            }
        }
    }

    public static SeleccionarConsultaRues enConfecamaraSII(Target campoConsultaRues, String idConsultaRues){
        return new SeleccionarConsultaRues(campoConsultaRues, idConsultaRues);
    }
}