package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;

public class FormularioRadicarActualizacionDatosMutacion implements Interaction {

    private Target campoDireccion;
    private String idDireccion;
    private Target campoTelefono;
    private String idTelefono;

    public FormularioRadicarActualizacionDatosMutacion(Target campoDireccion, String idDireccion,
                                                       Target campoTelefono, String idTelefono) {
        this.campoDireccion = campoDireccion;
        this.idDireccion = idDireccion;
        this.campoTelefono = campoTelefono;
        this.idTelefono = idTelefono;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        formularioMutacion(campoDireccion, idDireccion, campoTelefono, idTelefono, actor);
    }

    public void formularioMutacion(Target campoDireccion, String idDireccion,
                                   Target campoTelefono, String idTelefono, Actor actor){
        WebElementFacade direccion = campoDireccion.resolveFor(actor);
        WebElementFacade telefono = campoTelefono.resolveFor(actor);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (!idDireccion.equals("")) {
            TXT_DIRECCION_EXPEDIENTES.resolveFor(actor).clear();
            direccion.sendKeys(idDireccion);
        }
        if (!idTelefono.equals("")) {
            TXT_TELEFONO_EXPEDIENTES.resolveFor(actor).clear();
            telefono.sendKeys(idTelefono);
        }
    }
    public static FormularioRadicarActualizacionDatosMutacion enConfecamaraSII(Target campoDireccion, String idDireccion,
                                                                               Target campoTelefono, String idTelefono){
        return new FormularioRadicarActualizacionDatosMutacion(campoDireccion, idDireccion, campoTelefono, idTelefono);
    }
}