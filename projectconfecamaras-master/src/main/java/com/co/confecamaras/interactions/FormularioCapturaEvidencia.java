package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.*;

public class FormularioCapturaEvidencia implements Interaction {

    private Target campoNombreClienteRazonSocial;
    private String idNombreClienteRazonSocial;
    private Target campoPrimerNombre;
    private String idPrimerNombre;
    private Target campoSegundoNombre;
    private String idSegundoNombre;
    private Target campoPrimerApellido;
    private String idPrimerApellido;
    private Target campoSegundoApellido;
    private String idSegundoApellido;
    private Target campoDireccionComercial;
    private String idDireccionComercial;
    private Target campoMunicipioComercial;
    private String idMunicipioComercial;
    private Target campoCodigoPostal;
    private String idCodigoPostal;
    private Target campoTelefono;
    private String idTelefono;
    private Target campoCelular;
    private String idCelular;
    private Target campoEmail;
    private String idEmail;
    private Target campoConfirmacionEmail;
    private String idConfirmacionEmail;
    private Target campoFechaExpedicion;
    private String idFechaExpedicion;
    private final String municipioComercialuno = "MANIZALES (CAL)";
    private final String municipioComercialdos = "MANIZALES (CALDAS)";

    public FormularioCapturaEvidencia(Target campoNombreClienteRazonSocial, String idNombreClienteRazonSocial, Target campoPrimerNombre,
                                      String idPrimerNombre, Target campoSegundoNombre, String idSegundoNombre,
                                      Target campoPrimerApellido, String idPrimerApellido, Target campoSegundoApellido,
                                      String idSegundoApellido, Target campoDireccionComercial, String idDireccionComercial, Target campoMunicipioComercial,
                                      String idMunicipioComercial, Target campoCodigoPostal, String idCodigoPostal,
                                      Target campoTelefono, String idTelefono, Target campoCelular, String idCelular, Target campoEmail,
                                      String idEmail, Target campoConfirmacionEmail, String idConfirmacionEmail, Target campoFechaExpedicion,
                                      String idFechaExpedicion) {
        this.campoNombreClienteRazonSocial = campoNombreClienteRazonSocial;
        this.idNombreClienteRazonSocial = idNombreClienteRazonSocial;
        this.campoPrimerNombre = campoPrimerNombre;
        this.idPrimerNombre = idPrimerNombre;
        this.campoSegundoNombre = campoSegundoNombre;
        this.idSegundoNombre = idSegundoNombre;
        this.campoPrimerApellido = campoPrimerApellido;
        this.idPrimerApellido = idPrimerApellido;
        this.campoSegundoApellido = campoSegundoApellido;
        this.idSegundoApellido = idSegundoApellido;
        this.campoDireccionComercial = campoDireccionComercial;
        this.idDireccionComercial= idDireccionComercial;
        this.campoMunicipioComercial = campoMunicipioComercial;
        this.idMunicipioComercial = idMunicipioComercial;
        this.campoCodigoPostal = campoCodigoPostal;
        this.idCodigoPostal = idCodigoPostal;
        this.campoTelefono = campoTelefono;
        this.idTelefono = idTelefono;
        this.campoCelular = campoCelular;
        this.idCelular = idCelular;
        this.campoEmail = campoEmail;
        this.idEmail = idEmail;
        this.campoConfirmacionEmail = campoConfirmacionEmail;
        this.idConfirmacionEmail = idConfirmacionEmail;
        this.campoFechaExpedicion = campoFechaExpedicion;
        this.idFechaExpedicion = idFechaExpedicion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        llenarFormularioCapturarEvidencia(campoNombreClienteRazonSocial, idNombreClienteRazonSocial, campoPrimerNombre, idPrimerNombre,
                campoSegundoNombre, idSegundoNombre, campoPrimerApellido, idPrimerApellido, campoSegundoApellido, idSegundoApellido,
                campoDireccionComercial, idDireccionComercial, campoMunicipioComercial, idMunicipioComercial, campoCodigoPostal,
                idCodigoPostal, campoTelefono, idTelefono, campoCelular, idCelular, campoEmail, idEmail, campoConfirmacionEmail,
                idConfirmacionEmail, campoFechaExpedicion, idFechaExpedicion,actor);
    }

    public void llenarFormularioCapturarEvidencia(Target campoNombreClienteRazonSocial, String idNombreClienteRazonSocial, Target campoPrimerNombre,
                                                  String idPrimerNombre, Target campoSegundoNombre, String idSegundoNombre,
                                                  Target campoPrimerApellido, String idPrimerApellido, Target campoSegundoApellido,
                                                  String idSegundoApellido, Target campoDireccionComercial, String idDireccionComercial,
                                                  Target campoMunicipioComercial, String idMunicipioComercial, Target campoCodigoPostal,
                                                  String idCodigoPostal, Target campoTelefono, String idTelefono, Target campoCelular,
                                                  String idCelular, Target campoEmail, String idEmail, Target campoConfirmacionEmail,
                                                  String idConfirmacionEmail, Target campoFechaExpedicion, String idFechaExpedicion, Actor actor){
        WebElementFacade nombreClienteRazonSocial = campoNombreClienteRazonSocial.resolveFor(actor);
        WebElementFacade primerNombre = campoPrimerNombre.resolveFor(actor);
        WebElementFacade segundoNombre = campoSegundoNombre.resolveFor(actor);
        WebElementFacade primerApellido = campoPrimerApellido.resolveFor(actor);
        WebElementFacade segundoApellido = campoSegundoApellido.resolveFor(actor);
        WebElementFacade direccionComercial = campoDireccionComercial.resolveFor(actor);
        WebElementFacade selectMunicipioComercial = campoMunicipioComercial.resolveFor(actor);
        WebElementFacade codigoPostal = campoCodigoPostal.resolveFor(actor);
        WebElementFacade telefono = campoTelefono.resolveFor(actor);
        WebElementFacade celular = campoCelular.resolveFor(actor);
        WebElementFacade email = campoEmail.resolveFor(actor);
        WebElementFacade confimacionEmail = campoConfirmacionEmail.resolveFor(actor);
        WebElementFacade fechaExpedicion = campoFechaExpedicion.resolveFor(actor);

        if (!idNombreClienteRazonSocial.equals("")) {
            TXT_NOMBRE_CLIENTE_RAZON_SOCIAL_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            nombreClienteRazonSocial.sendKeys(idNombreClienteRazonSocial);
        }
        if (!idPrimerNombre.equals("")) {
            TXT_PRIMER_NOMBRE_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            primerNombre.sendKeys(idPrimerApellido);
        }
        if (!idSegundoNombre.equals("")) {
            TXT_SEGUNDO_NOMBRE_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            segundoNombre.sendKeys(idSegundoNombre);
        }
        if (!idPrimerApellido.equals("")) {
            TXT_PRIMER_APELLIDO_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            primerApellido.sendKeys(idPrimerApellido);
        }
        if (!idSegundoApellido.equals("")) {
            TXT_SEGUNDO_APELLIDO_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            segundoApellido.sendKeys(idSegundoApellido);
        }
        if (!idDireccionComercial.equals("")) {
            TXT_DIRECCION_COMERCIAL_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            direccionComercial.sendKeys(idDireccionComercial);
        }
            if (!idMunicipioComercial.equals("")) {
            selectMunicipioComercial.selectByVisibleText(municipioComercialuno);
        }
        if (!idCodigoPostal.equals("")) {
            TXT_CODIGO_POSTAL_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            codigoPostal.sendKeys(idCodigoPostal);
        }
        BTN_DUPLICAR_CAPTURAR_EVIDENCIA.resolveFor(actor).click();
        if (!idTelefono.equals("")) {
            TXT_FIJO_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            telefono.sendKeys(idTelefono);
        }
        if (!idCelular.equals("")) {
            TXT_CELULAR_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            celular.sendKeys(idCelular);
        }
        if (!idEmail.equals("")) {
            TXT_EMAIL_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            email.sendKeys(idEmail);
        }
        if (!idConfirmacionEmail.equals("")) {
            TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            confimacionEmail.sendKeys(idConfirmacionEmail);
        }
        BTN_DUPLICAR_DOS_CAPTURAR_EVIDENCIA.resolveFor(actor).click();
        if (!idFechaExpedicion.equals("")) {
            TXT_FECHA_EXPEDICION_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            fechaExpedicion.sendKeys(idFechaExpedicion);
        }
    }

    public static FormularioCapturaEvidencia enConfecamaraSII(Target campoNombreClienteRazonSocial, String idNombreClienteRazonSocial, Target campoPrimerNombre,
                                                               String idPrimerNombre, Target campoSegundoNombre, String idSegundoNombre,
                                                               Target campoPrimerApellido, String idPrimerApellido, Target campoSegundoApellido,
                                                               String idSegundoApellido, Target campoDireccionComercial, String idDireccionComercial,Target campoMunicipioComercial,
                                                               String idMunicipioComercial, Target campoCodigoPostal, String idCodigoPostal, Target campoTelefono, String idTelefono,
                                                               Target campoCelular, String idCelular, Target campoEmail,
                                                               String idEmail, Target campoConfirmacionEmail, String idConfirmacionEmail, Target campoFechaExpedicion,
                                                               String idFechaExpedicion){
        return new FormularioCapturaEvidencia(campoNombreClienteRazonSocial, idNombreClienteRazonSocial, campoPrimerNombre, idPrimerNombre,
                campoSegundoNombre, idSegundoNombre, campoPrimerApellido, idPrimerApellido, campoSegundoApellido, idSegundoApellido,
                campoDireccionComercial, idDireccionComercial, campoMunicipioComercial, idMunicipioComercial, campoCodigoPostal,
                idCodigoPostal, campoTelefono, idTelefono, campoCelular, idCelular, campoEmail, idEmail, campoConfirmacionEmail, idConfirmacionEmail,
                campoFechaExpedicion, idFechaExpedicion);
    }
}