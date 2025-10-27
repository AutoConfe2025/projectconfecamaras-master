package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;

public class CheckboxDatosModificar implements Interaction {

    private Target campoCheckbox;
    private String idCheckbox;

    public CheckboxDatosModificar(Target campoCheckbox, String idCheckbox) {
        this.campoCheckbox = campoCheckbox;
        this.idCheckbox = idCheckbox;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        checkbox(campoCheckbox, actor);
    }

    public void checkbox(Target campoCheckbox, Actor actor){
        List<WebElementFacade> selectCheckbox = campoCheckbox.resolveAllFor(actor);

        for (int f=0; f<selectCheckbox.size(); f++){
            if (selectCheckbox.get(f).getText().equals(idCheckbox)){
                selectCheckbox.get(f).click();
                break;
            }
        }
        BTN_CONTINUAR_DOS_EXPEDIENTES.resolveFor(actor).click();
    }

    public static CheckboxDatosModificar enConfecamaraSII(Target campoCheckbox, String idCheckbox){
        return new CheckboxDatosModificar(campoCheckbox, idCheckbox);
    }
}