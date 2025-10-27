package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FormularioCapturaEvidenciaSoloEstablecimiento;
import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SubirArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.*;

public class CapturaEvidenciaSoloEstablecimientoComercio implements Task {

    private String idNombreClienteRazonSocial;
    private String idPrimerNombre;
    private String idSegundoNombre;
    private String idPrimerApellido;
    private String idSegundoApellido;
    private String idDireccionComercial;
    private String idMunicipioComercial;
    private String idCodigoPostal;
    private String idTelefono;
    private String idCelular;
    private String idEmail;
    private String idConfirmacionEmail;
    private String idFechaExpedicion;

    public CapturaEvidenciaSoloEstablecimientoComercio(String idNombreClienteRazonSocial, String idPrimerNombre, String idSegundoNombre,
                                                       String idPrimerApellido, String idSegundoApellido, String idDireccionComercial,
                                                       String idMunicipioComercial, String idCodigoPostal, String idTelefono, String idCelular,
                                                       String idEmail, String idConfirmacionEmail, String idFechaExpedicion) {
        this.idNombreClienteRazonSocial = idNombreClienteRazonSocial;
        this.idPrimerNombre = idPrimerNombre;
        this.idSegundoNombre = idSegundoNombre;
        this.idPrimerApellido = idPrimerApellido;
        this.idSegundoApellido = idSegundoApellido;
        this.idDireccionComercial = idDireccionComercial;
        this.idMunicipioComercial = idMunicipioComercial;
        this.idCodigoPostal = idCodigoPostal;
        this.idTelefono = idTelefono;
        this.idCelular = idCelular;
        this.idEmail = idEmail;
        this.idConfirmacionEmail = idConfirmacionEmail;
        this.idFechaExpedicion = idFechaExpedicion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CONTINUAR_CAPTURAR_EVIDENCIA),
                Click.on(BTN_VERIFICAR_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                FormularioCapturaEvidenciaSoloEstablecimiento.enConfecamaraSII(TXT_NOMBRE_CLIENTE_RAZON_SOCIAL_CAPTURAR_EVIDENCIA, idNombreClienteRazonSocial, TXT_PRIMER_NOMBRE_CAPTURAR_EVIDENCIA,
                        idPrimerNombre, TXT_SEGUNDO_NOMBRE_CAPTURAR_EVIDENCIA, idSegundoNombre, TXT_PRIMER_APELLIDO_CAPTURAR_EVIDENCIA, idPrimerApellido,
                        TXT_SEGUNDO_APELLIDO_CAPTURAR_EVIDENCIA, idSegundoApellido, TXT_DIRECCION_COMERCIAL_CAPTURAR_EVIDENCIA, idDireccionComercial, SELECT_MUNICIPIO_COMERCIAL_CAPTURAR_EVIDENCIA,
                        idMunicipioComercial, TXT_CODIGO_POSTAL_CAPTURAR_EVIDENCIA, idCodigoPostal, TXT_FIJO_CAPTURAR_EVIDENCIA, idTelefono, TXT_CELULAR_CAPTURAR_EVIDENCIA, idCelular,
                        TXT_EMAIL_CAPTURAR_EVIDENCIA, idEmail, TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA, idConfirmacionEmail, TXT_FECHA_EXPEDICION_CAPTURAR_EVIDENCIA, idFechaExpedicion),
                WaitSeconds.seconds(1),
                SubirArchivo.enConfecamaraSII(),
                WaitSeconds.seconds(1),
                Click.on(BTN_GENERAR_RECIBO_CAPTURAR_EVIDENCIA),
                Click.on(BTN_CONTINUAR_CAPTURAR_EVIDENCIA)
                /*WaitInteractions.untilDisappears(PROGRESO_ESPERA)*/
        );
    }

    public static CapturaEvidenciaSoloEstablecimientoComercio enConfecamaraSII(String idNombreClienteRazonSocial, String idPrimerNombre, String idSegundoNombre,
                                                                               String idPrimerApellido, String idSegundoApellido, String idDireccionComercial,
                                                                               String idMunicipioComercial, String idCodigoPostal, String idTelefono, String idCelular,
                                                                               String idEmail, String idConfirmacionEmail, String idFechaExpedicion){
        return Tasks.instrumented(CapturaEvidenciaSoloEstablecimientoComercio.class, idNombreClienteRazonSocial, idPrimerNombre, idSegundoNombre, idPrimerApellido,
                idSegundoApellido, idDireccionComercial, idMunicipioComercial, idCodigoPostal, idTelefono, idCelular, idEmail,
                idConfirmacionEmail, idFechaExpedicion);
    }
}