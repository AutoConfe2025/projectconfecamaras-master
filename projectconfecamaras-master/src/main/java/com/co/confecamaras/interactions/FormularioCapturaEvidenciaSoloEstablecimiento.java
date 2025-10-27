package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.*;

public class FormularioCapturaEvidenciaSoloEstablecimiento implements Interaction {

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

    public FormularioCapturaEvidenciaSoloEstablecimiento(Target campoNombreClienteRazonSocial, String idNombreClienteRazonSocial, Target campoPrimerNombre,
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
        WebElementFacade nombreClienteRazonSocialTres = campoNombreClienteRazonSocial.resolveFor(actor);
        WebElementFacade primerNombreTres = campoPrimerNombre.resolveFor(actor);
        WebElementFacade segundoNombreTres = campoSegundoNombre.resolveFor(actor);
        WebElementFacade primerApellidoTres = campoPrimerApellido.resolveFor(actor);
        WebElementFacade segundoApellidoTres = campoSegundoApellido.resolveFor(actor);
        WebElementFacade direccionComercialTres = campoDireccionComercial.resolveFor(actor);
        WebElementFacade selectMunicipioComercialTres = campoMunicipioComercial.resolveFor(actor);
        WebElementFacade codigoPostalTres = campoCodigoPostal.resolveFor(actor);
        WebElementFacade telefonoTres = campoTelefono.resolveFor(actor);
        WebElementFacade celularTres = campoCelular.resolveFor(actor);
        WebElementFacade emailTres = campoEmail.resolveFor(actor);
        WebElementFacade confimacionEmailTres = campoConfirmacionEmail.resolveFor(actor);
        WebElementFacade fechaExpedicionTres = campoFechaExpedicion.resolveFor(actor);

        if (!idNombreClienteRazonSocial.equals("")) {
            TXT_NOMBRE_CLIENTE_RAZON_SOCIAL_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            nombreClienteRazonSocialTres.sendKeys(idNombreClienteRazonSocial);
        }
        if (!idPrimerNombre.equals("")) {
            TXT_PRIMER_NOMBRE_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            primerNombreTres.sendKeys(idPrimerApellido);
        }
        if (!idSegundoNombre.equals("")) {
            TXT_SEGUNDO_NOMBRE_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            segundoNombreTres.sendKeys(idSegundoNombre);
        }
        if (!idPrimerApellido.equals("")) {
            TXT_PRIMER_APELLIDO_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            primerApellidoTres.sendKeys(idPrimerApellido);
        }
        if (!idSegundoApellido.equals("")) {
            TXT_SEGUNDO_APELLIDO_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            segundoApellidoTres.sendKeys(idSegundoApellido);
        }
        if (!idDireccionComercial.equals("")) {
            TXT_DIRECCION_COMERCIAL_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            direccionComercialTres.sendKeys(idDireccionComercial);
        }
        if (!idMunicipioComercial.equals("")) {
            //selectMunicipioComercialTres.selectByVisibleText(idMunicipioComercial);
            //selectMunicipioComercialTres.selectByVisibleText("MANIZALES (CALDAS)");
            selectMunicipioComercialTres.selectByVisibleText("MANIZALES (CAL)");
        }
        if (!idCodigoPostal.equals("")) {
            TXT_CODIGO_POSTAL_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            codigoPostalTres.sendKeys(idCodigoPostal);
        }
        BTN_DUPLICAR_CAPTURAR_EVIDENCIA.resolveFor(actor).click();
        if (!idTelefono.equals("")) {
            TXT_FIJO_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            telefonoTres.sendKeys(idTelefono);
        }
        if (!idCelular.equals("")) {
            TXT_CELULAR_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            celularTres.sendKeys(idCelular);
        }
        if (!idEmail.equals("")) {
            TXT_EMAIL_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            emailTres.sendKeys(idEmail);
        }
        if (!idConfirmacionEmail.equals("")) {
            TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            confimacionEmailTres.sendKeys(idConfirmacionEmail);
        }
        BTN_DUPLICAR_DOS_CAPTURAR_EVIDENCIA.resolveFor(actor).click();
        if (!idFechaExpedicion.equals("")) {
            TXT_FECHA_EXPEDICION_CAPTURAR_EVIDENCIA.resolveFor(actor).clear();
            fechaExpedicionTres.sendKeys(idFechaExpedicion);
        }
    }

    public static FormularioCapturaEvidenciaSoloEstablecimiento enConfecamaraSII(Target campoNombreClienteRazonSocial, String idNombreClienteRazonSocial, Target campoPrimerNombre,
                                                                                 String idPrimerNombre, Target campoSegundoNombre, String idSegundoNombre,
                                                                                 Target campoPrimerApellido, String idPrimerApellido, Target campoSegundoApellido,
                                                                                 String idSegundoApellido, Target campoDireccionComercial, String idDireccionComercial,Target campoMunicipioComercial,
                                                                                 String idMunicipioComercial, Target campoCodigoPostal, String idCodigoPostal, Target campoTelefono, String idTelefono,
                                                                                 Target campoCelular, String idCelular, Target campoEmail,
                                                                                 String idEmail, Target campoConfirmacionEmail, String idConfirmacionEmail, Target campoFechaExpedicion,
                                                                                 String idFechaExpedicion){
        return new FormularioCapturaEvidenciaSoloEstablecimiento(campoNombreClienteRazonSocial, idNombreClienteRazonSocial, campoPrimerNombre, idPrimerNombre,
                campoSegundoNombre, idSegundoNombre, campoPrimerApellido, idPrimerApellido, campoSegundoApellido, idSegundoApellido,
                campoDireccionComercial, idDireccionComercial, campoMunicipioComercial, idMunicipioComercial, campoCodigoPostal,
                idCodigoPostal, campoTelefono, idTelefono, campoCelular, idCelular, campoEmail, idEmail, campoConfirmacionEmail, idConfirmacionEmail,
                campoFechaExpedicion, idFechaExpedicion);
    }
}