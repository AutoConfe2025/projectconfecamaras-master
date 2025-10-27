package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static com.co.confecamaras.models.VariableFirmadoElectronicoSobre.*;

public class SeleccionarTramite implements Interaction {

    private final Target campoCodigoTramite;
    private final Target campoBuscar;

    public SeleccionarTramite(Target campoCodigoTramite, Target campoBuscar) {
        this.campoCodigoTramite = campoCodigoTramite;
        this.campoBuscar = campoBuscar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        codigoTramite(campoCodigoTramite, campoBuscar, actor);
    }

    public void codigoTramite(Target campoCodigoTramite, Target campoBuscar, Actor actor){
        List<WebElementFacade> codigoTramite = campoCodigoTramite.resolveAllFor(actor);
        List<WebElementFacade> buscar = campoBuscar.resolveAllFor(actor);
        String numRecuperacion = getNumRecuperacion();

        for (int f=0; f<codigoTramite.size(); f++){
            if (codigoTramite.get(f).getText().contains(numRecuperacion)){
                buscar.get(f).click();
                break;
            }
        }
    }

    public static SeleccionarTramite enConfecamaraSII(Target campoCodigoTramite, Target campoBuscar){
        return new SeleccionarTramite(campoCodigoTramite, campoBuscar);
    }
}