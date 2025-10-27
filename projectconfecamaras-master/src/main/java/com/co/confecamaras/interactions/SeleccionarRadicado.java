package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SeleccionarRadicado implements Interaction {

    private Target campoNombre;
    private Target campoBuscar;
    private String idNombre;

    public SeleccionarRadicado(Target campoNombre, Target campoBuscar, String idNombre) {
        this.campoNombre = campoNombre;
        this.campoBuscar = campoBuscar;
        this.idNombre = idNombre;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        nombre(campoNombre, campoBuscar, actor);
    }

    public void nombre(Target campoNombre, Target campoBuscar, Actor actor){
        List<WebElementFacade> nombre = campoNombre.resolveAllFor(actor);
        List<WebElementFacade> buscar = campoBuscar.resolveAllFor(actor);

        for (int f=0; f<nombre.size(); f++){
            if (nombre.get(f).getText().equals(idNombre)){
                buscar.get(f).waitUntilClickable();
                buscar.get(f).click();
                break;
            }
        }
    }

    public static SeleccionarRadicado enConfecamaraSII(Target campoNombre, Target campoBuscar, String idNombre){
        return new SeleccionarRadicado(campoNombre, campoBuscar, idNombre);
    }
}