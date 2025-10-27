package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class FormularioSolicutudMatriculaEstablecimiento implements Interaction {

    private Target campoNombreCompleto;
    private String idNombreCompleto;
    private Target campoTipoIdentificacion;
    private String idTipoIdentificacion;
    private Target campoNumeroIdentificacion;
    private String idNumeroIdentificacion;
    private Target campoDomicilio;
    private String idDomicilio;
    private Target campoTamanoEmpresa;
    private String idTamanoEmpresa;
    private Target campoNombreEstablecimiento;
    private String idNombreEstablecimiento;
    private Target campoValorActivosDos;
    private String idValorActivosDos;
    private Target campoDomicilioEstablecimiento;
    private String idDomicilioEstablecimiento;

    public FormularioSolicutudMatriculaEstablecimiento(Target campoNombreCompleto, String idNombreCompleto, Target campoTipoIdentificacion,
                                                       String idTipoIdentificacion, Target campoNumeroIdentificacion, String idNumeroIdentificacion,
                                                       Target campoDomicilio, String idDomicilio, Target campoTamanoEmpresa, String idTamanoEmpresa,
                                                       Target campoNombreEstablecimiento, String idNombreEstablecimiento, Target campoValorActivosDos,
                                                       String idValorActivosDos, Target campoDomicilioEstablecimiento, String idDomicilioEstablecimiento) {
        this.campoNombreCompleto = campoNombreCompleto;
        this.idNombreCompleto = idNombreCompleto;
        this.campoTipoIdentificacion = campoTipoIdentificacion;
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.campoNumeroIdentificacion = campoNumeroIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.campoDomicilio = campoDomicilio;
        this.idDomicilio = idDomicilio;
        this.campoTamanoEmpresa = campoTamanoEmpresa;
        this.idTamanoEmpresa = idTamanoEmpresa;
        this.campoNombreEstablecimiento = campoNombreEstablecimiento;
        this.idNombreEstablecimiento = idNombreEstablecimiento;
        this.campoValorActivosDos = campoValorActivosDos;
        this.idValorActivosDos = idValorActivosDos;
        this.campoDomicilioEstablecimiento = campoDomicilioEstablecimiento;
        this.idDomicilioEstablecimiento = idDomicilioEstablecimiento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        llenarFormularioEstablecimiento(campoNombreCompleto, idNombreCompleto, campoTipoIdentificacion, campoNumeroIdentificacion, idNumeroIdentificacion,
                campoDomicilio, campoTamanoEmpresa, campoNombreEstablecimiento, idNombreEstablecimiento, campoValorActivosDos, idValorActivosDos,
                campoDomicilioEstablecimiento, actor);
    }

    public void llenarFormularioEstablecimiento (Target campoNombreCompleto, String idNombreCompleto, Target campoTipoIdentificacion,
                                                 Target campoNumeroIdentificacion, String idNumeroIdentificacion, Target campoDomicilio,
                                                 Target campoTamanoEmpresa, Target campoNombreEstablecimiento, String idNombreEstablecimiento,
                                                 Target campoValorActivosDos, String idValorActivosDos, Target campoDomicilioEstablecimiento,
                                                 Actor actor){
        WebElementFacade nombreCompletoTres = campoNombreCompleto.resolveFor(actor);
        List<WebElementFacade> selectTipoIdentificacionTres = campoTipoIdentificacion.resolveAllFor(actor);
        WebElementFacade tipoIdentificacionTres = campoNumeroIdentificacion.resolveFor(actor);
        List<WebElementFacade> selectDomicilioTres = campoDomicilio.resolveAllFor(actor);
        List<WebElementFacade> selectTamanoEmpresaTres = campoTamanoEmpresa.resolveAllFor(actor);
        WebElementFacade nombreEstablecimientoTres = campoNombreEstablecimiento.resolveFor(actor);
        WebElementFacade valoresActivosTres = campoValorActivosDos.resolveFor(actor);
        List<WebElementFacade> selectDomicilioEstablecimientoTres = campoDomicilioEstablecimiento.resolveAllFor(actor);

        if (!idNombreCompleto.equals("")) {
            nombreCompletoTres.sendKeys(idNombreCompleto);
        }
        for (int f=0; f<selectTipoIdentificacionTres.size(); f++){
            if (selectTipoIdentificacionTres.get(f).getText().equals(idTipoIdentificacion)){
                selectTipoIdentificacionTres.get(f).click();
                break;
            }
        }
        if (!idNumeroIdentificacion.equals("")) {
            tipoIdentificacionTres.sendKeys(idNumeroIdentificacion);
        }
        for (int f=0; f<selectDomicilioTres.size(); f++){
            if (selectDomicilioTres.get(f).getText().equals(idDomicilio)){
                selectDomicilioTres.get(f).click();
                break;
            }
        }
        for (int f=0; f<selectTamanoEmpresaTres.size(); f++){
            if (selectTamanoEmpresaTres.get(f).getText().equals(idTamanoEmpresa)){
                selectTamanoEmpresaTres.get(f).click();
                break;
            }
        }
        if (!idNombreEstablecimiento.equals("")) {
            nombreEstablecimientoTres.sendKeys(idNombreEstablecimiento);
        }
        if (!idValorActivosDos.equals("")) {
            valoresActivosTres.sendKeys(idValorActivosDos);
        }
        for (int f=0; f<selectDomicilioEstablecimientoTres.size(); f++){
            if (selectDomicilioEstablecimientoTres.get(f).getText().equals(idDomicilioEstablecimiento)){
                selectDomicilioEstablecimientoTres.get(f).click();
                break;
            }
        }
    }

    public static FormularioSolicutudMatriculaEstablecimiento enConfecamaraSII(Target campoNombreCompleto, String idNombreCompleto, Target campoTipoIdentificacion,
                                                                               String idTipoIdentificacion, Target campoNumeroIdentificacion, String idNumeroIdentificacion,
                                                                               Target campoDomicilio, String idDomicilio, Target campoTamanoEmpresa, String idTamanoEmpresa,
                                                                               Target campoNombreEstablecimiento, String idNombreEstablecimiento, Target campoValorActivosDos,
                                                                               String idValorActivosDos, Target campoDomicilioEstablecimiento, String idDomicilioEstablecimiento){
        return new FormularioSolicutudMatriculaEstablecimiento(campoNombreCompleto, idNombreCompleto, campoTipoIdentificacion, idTipoIdentificacion, campoNumeroIdentificacion,
                idNumeroIdentificacion, campoDomicilio, idDomicilio, campoTamanoEmpresa, idTamanoEmpresa, campoNombreEstablecimiento, idNombreEstablecimiento, campoValorActivosDos,
                idValorActivosDos, campoDomicilioEstablecimiento, idDomicilioEstablecimiento);
    }
}