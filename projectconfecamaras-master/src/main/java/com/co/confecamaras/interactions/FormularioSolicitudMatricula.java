package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class FormularioSolicitudMatricula implements Interaction {

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
    private Target campoValorActivos;
    private String idValorActivos;
    private Target campoNumeroEmpleados;
    private String idNumeroEmpleados;
    private Target campoBotonBeneficiario;
    private String idBotonBeneficiario;
    private Target campoNombreEstablecimiento;
    private String idNombreEstablecimiento;
    private Target campoValorActivosDos;
    private String idValorActivosDos;
    private Target campoDomicilioEstablecimiento;
    private String idDomicilioEstablecimiento;

    public FormularioSolicitudMatricula(Target campoNombreCompleto, String idNombreCompleto, Target campoTipoIdentificacion,
                                        String idTipoIdentificacion, Target campoNumeroIdentificacion, String idNumeroIdentificacion,
                                        Target campoDomicilio, String idDomicilio, Target campoTamanoEmpresa, String idTamanoEmpresa,
                                        Target campoValorActivos, String idValorActivos, Target campoNumeroEmpleados, String idNumeroEmpleados,
                                        Target campoBotonBeneficiario, String idBotonBeneficiario, Target campoNombreEstablecimiento,
                                        String idNombreEstablecimiento, Target campoValorActivosDos, String idValorActivosDos, Target campoDomicilioEstablecimiento,
                                        String idDomicilioEstablecimiento) {
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
        this.campoValorActivos = campoValorActivos;
        this.idValorActivos = idValorActivos;
        this.campoNumeroEmpleados = campoNumeroEmpleados;
        this.idNumeroEmpleados = idNumeroEmpleados;
        this.campoBotonBeneficiario = campoBotonBeneficiario;
        this.idBotonBeneficiario = idBotonBeneficiario;
        this.campoNombreEstablecimiento = campoNombreEstablecimiento;
        this.idNombreEstablecimiento = idNombreEstablecimiento;
        this.campoValorActivosDos = campoValorActivosDos;
        this.idValorActivosDos = idValorActivosDos;
        this.campoDomicilioEstablecimiento = campoDomicilioEstablecimiento;
        this.idDomicilioEstablecimiento = idDomicilioEstablecimiento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        llenarFormulario(campoNombreCompleto, idNombreCompleto, campoTipoIdentificacion, campoNumeroIdentificacion, idNumeroIdentificacion,
                campoDomicilio, campoTamanoEmpresa, campoValorActivos, idValorActivos, campoNumeroEmpleados, idNumeroEmpleados,
                campoBotonBeneficiario, campoNombreEstablecimiento, idNombreEstablecimiento, campoValorActivosDos, idValorActivosDos,
                campoDomicilioEstablecimiento, actor);
    }

    public void llenarFormulario(Target campoNombreCompleto, String idNombreCompleto, Target campoTipoIdentificacion,
                                 Target campoNumeroIdentificacion, String idNumeroIdentificacion, Target campoDomicilio,
                                 Target campoTamanoEmpresa, Target campoValorActivos, String idValorActivos, Target campoNumeroEmpleados,
                                 String idNumeroEmpleados, Target campoBotonBeneficiario, Target campoNombreEstablecimiento,
                                 String idNombreEstablecimiento, Target campoValorActivosDos, String idValorActivosDos, Target campoDomicilioEstablecimiento,
                                 Actor actor){
        WebElementFacade nombreCompleto = campoNombreCompleto.resolveFor(actor);
        List<WebElementFacade> selectTipoIdentificacion = campoTipoIdentificacion.resolveAllFor(actor);
        WebElementFacade tipoIdentificacion = campoNumeroIdentificacion.resolveFor(actor);
        List<WebElementFacade> selectDomicilio = campoDomicilio.resolveAllFor(actor);
        List<WebElementFacade> selectTamanoEmpresa = campoTamanoEmpresa.resolveAllFor(actor);
        WebElementFacade valorActivos = campoValorActivos.resolveFor(actor);
        WebElementFacade numeroEmpleados = campoNumeroEmpleados.resolveFor(actor);
        List<WebElementFacade> seleccionarBeneficiario = campoBotonBeneficiario.resolveAllFor(actor);
        WebElementFacade nombreEstablecimiento = campoNombreEstablecimiento.resolveFor(actor);
        WebElementFacade valoresActivosDos = campoValorActivosDos.resolveFor(actor);
        List<WebElementFacade> selectDomicilioEstablecimiento = campoDomicilioEstablecimiento.resolveAllFor(actor);

        if (!idNombreCompleto.equals("")) {
            nombreCompleto.sendKeys(idNombreCompleto);
        }
        for (int f=0; f<selectTipoIdentificacion.size(); f++){
            if (selectTipoIdentificacion.get(f).getText().equals(idTipoIdentificacion)){
                selectTipoIdentificacion.get(f).click();
                break;
            }
        }
        if (!idNumeroIdentificacion.equals("")) {
            tipoIdentificacion.sendKeys(idNumeroIdentificacion);
        }
        for (int f=0; f<selectDomicilio.size(); f++){
            if (selectDomicilio.get(f).getText().equals(idDomicilio)){
                selectDomicilio.get(f).click();
                break;
            }
        }
        for (int f=0; f<selectTamanoEmpresa.size(); f++){
            if (selectTamanoEmpresa.get(f).getText().equals(idTamanoEmpresa)){
                selectTamanoEmpresa.get(f).click();
                break;
            }
        }
        if (!idValorActivos.equals("")) {
            valorActivos.sendKeys(idValorActivos);
        }
        if (!idNumeroEmpleados.equals("")) {
            numeroEmpleados.sendKeys(idNumeroEmpleados);
        }
        for (int f=0; f<seleccionarBeneficiario.size(); f++){
            if (seleccionarBeneficiario.get(f).getText().equals(idBotonBeneficiario)){
                seleccionarBeneficiario.get(f).click();
                break;
            }
        }
        if (!idNombreEstablecimiento.equals("")) {
            nombreEstablecimiento.sendKeys(idNombreEstablecimiento);
        }
        if (!idValorActivosDos.equals("")) {
            valoresActivosDos.sendKeys(idValorActivosDos);
        }
        for (int f=0; f<selectDomicilioEstablecimiento.size(); f++){
            if (selectDomicilioEstablecimiento.get(f).getText().equals(idDomicilioEstablecimiento)){
                selectDomicilioEstablecimiento.get(f).click();
                break;
            }
        }
    }

    public static FormularioSolicitudMatricula enConfecamaraSII(Target campoNombreCompleto, String idNombreCompleto, Target campoTipoIdentificacion,
                                                                String idTipoIdentificacion, Target campoNumeroIdentificacion, String idNumeroIdentificacion,
                                                                Target campoDomicilio, String idDomicilio, Target campoTamanoEmpresa, String idTamanoEmpresa,
                                                                Target campoValorActivos, String idValorActivos, Target campoNumeroEmpleados,
                                                                String idNumeroEmpleados, Target campoBotonBeneficiario, String idBotonBeneficiario, Target campoNombreEstablecimiento,
                                                                String idNombreEstablecimiento, Target campoValorActivosDos, String idValorActivosDos, Target campoDomicilioEstablecimiento,
                                                                String idDomicilioEstablecimiento){
        return new FormularioSolicitudMatricula(campoNombreCompleto, idNombreCompleto, campoTipoIdentificacion, idTipoIdentificacion,
                campoNumeroIdentificacion, idNumeroIdentificacion, campoDomicilio, idDomicilio, campoTamanoEmpresa, idTamanoEmpresa,
                campoValorActivos, idValorActivos, campoNumeroEmpleados, idNumeroEmpleados, campoBotonBeneficiario, idBotonBeneficiario,
                campoNombreEstablecimiento, idNombreEstablecimiento, campoValorActivosDos, idValorActivosDos, campoDomicilioEstablecimiento,
                idDomicilioEstablecimiento);
    }
}