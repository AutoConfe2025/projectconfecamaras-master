package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FormularioSoloEstablecimientoComercioDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.GrabarFormularioEstablecimientoUI.*;

public class GrabarFormularioSoloEstablecimientoComercio implements Task {

    private String idNomenclatura;
    private String idNombreVias;
    private String idNro;
    private String idLetras;
    private String idMunicipio;
    private String idBarrio;
    private String idTelefonoUno;
    private String idTelefonoDos;
    private String idZona;
    private String idCorreoElectronico;
    private String idUbicacion;
    private String idPersonalOcupado;
    private String idTipoLocal;
    private String idActividadEconomica;
    private String idConsulta;
    private String idCamaraComercio;
    private String idMatricula;
    private String idOrganizacionJuridica;
    private String idDireccionComercial;
    private String idMunicipioComercial;
    private String idDireccionNotificacion;
    private String idMunicipioNotificacion;
    private String idFijo;
    private String idCelular;
    private String idcampovalorDelEstablecimiento;

    public GrabarFormularioSoloEstablecimientoComercio(String idNomenclatura, String idNombreVias, String idNro, String idLetras, String idMunicipio,
                                                       String idBarrio, String idTelefonoUno, String idTelefonoDos, String idZona, String idCorreoElectronico,
                                                       String idUbicacion, String idPersonalOcupado, String idTipoLocal, String idActividadEconomica,
                                                       String idConsulta, String idCamaraComercio, String idMatricula, String idOrganizacionJuridica,
                                                       String idDireccionComercial, String idMunicipioComercial, String idDireccionNotificacion,
                                                       String idMunicipioNotificacion, String idFijo, String idCelular, String idcampovalorDelEstablecimiento) {
        this.idNomenclatura = idNomenclatura;
        this.idNombreVias = idNombreVias;
        this.idNro = idNro;
        this.idLetras = idLetras;
        this.idMunicipio = idMunicipio;
        this.idBarrio = idBarrio;
        this.idTelefonoUno = idTelefonoUno;
        this.idTelefonoDos = idTelefonoDos;
        this.idZona = idZona;
        this.idCorreoElectronico = idCorreoElectronico;
        this.idUbicacion = idUbicacion;
        this.idPersonalOcupado = idPersonalOcupado;
        this.idTipoLocal = idTipoLocal;
        this.idActividadEconomica = idActividadEconomica;
        this.idConsulta = idConsulta;
        this.idCamaraComercio = idCamaraComercio;
        this.idMatricula = idMatricula;
        this.idOrganizacionJuridica = idOrganizacionJuridica;
        this.idDireccionComercial = idDireccionComercial;
        this.idMunicipioComercial = idMunicipioComercial;
        this.idDireccionNotificacion = idDireccionNotificacion;
        this.idMunicipioNotificacion = idMunicipioNotificacion;
        this.idFijo = idFijo;
        this.idCelular = idCelular;
        this.idcampovalorDelEstablecimiento = idcampovalorDelEstablecimiento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GRABAR_FORMULARIO_ESTABLECIMIENTO),
                FormularioSoloEstablecimientoComercioDos.enConfecamaraSII(SELECT_NOMENCALTURAS_ESTABLECIMIENTO, idNomenclatura, TXT_NOMBRE_VIAS_ESTABLECIMIENTO, idNombreVias,
                        TXT_NRO_ESTABLECIMIENTO, idNro, SELECT_LETRAS_ESTABLECIMIENTO, idLetras, SELECT_MUNICIPIO_ESTABLECIMIENTO, idMunicipio, SELECT_BARRIO_ESTABLECIMIENTO, idBarrio, TXT_TELEFONO_UNO_ESTABLECIMIENTO,
                        idTelefonoUno, TXT_TELEFONO_DOS_ESTABLECIMIENTO, idTelefonoDos, SELECT_ZONA_ESTABLECIMIENTO, idZona, TXT_CORREO_ELECTRONICO_ESTABLECIMIENTO, idCorreoElectronico,
                        SELECT_UBICACION_ESTABLECIMIENTO, idUbicacion, TXT_PERSONAL_OCUPADO_ESTABLECIMIENTO, idPersonalOcupado, SELECT_TIPO_LOCAL_ESTABLECIMIENTO, idTipoLocal, TXT_ACTIVIDAD_ECONOMICA_ESTABLECIMIENTO,
                        idActividadEconomica, TXT_CONSULTA_ESTABLECIMIENTO, idConsulta, SELECT_CAMARA_COMERCIO_ESTABLECIMIENTO, idCamaraComercio, TXT_MATRICULA_ESTABLECIMIENTO, idMatricula,
                        SELECT_ORGANIZACION_JURIDICA_ESTABLECIMIENTO, idOrganizacionJuridica, TXT_DIRECCION_COMERCIAL_ESTABLECIMIENTO, idDireccionComercial, SELECT_MUNICIPIO_COMERCIAL_ESTABLECIMIENTO,
                        idMunicipioComercial, TXT_DIRECCION_NOTIFICACION_ESTABLECIMIENTO, idDireccionNotificacion, SELECT_MUNICIPIO_NOTIFICACION_ESTABLECIMIENTO, idMunicipioNotificacion,
                        TXT_FIJO_ESTABLECIMIENTO, idFijo, TXT_CELULAR_ESTABLECIMIENTO, idCelular, TXT_VALOR_ESTABLECIMIENTO, idcampovalorDelEstablecimiento),
               Click.on(BTN_OK_ESTABLECIMIENTO),
               Click.on(BTN_RECIBIR_PAGO_ESTABLECIMIENTO)
        );
    }

    public static GrabarFormularioSoloEstablecimientoComercio enConfecamaraSII(String idNomenclatura, String idNombreVias, String idNro,
                                                                               String idLetras, String idMunicipio, String idBarrio, String idTelefonoUno,
                                                                               String idTelefonoDos, String idZona, String idCorreoElectronico,
                                                                               String idUbicacion, String idPersonalOcupado, String idTipoLocal,
                                                                               String idActividadEconomica, String idConsulta, String idCamaraComercio,
                                                                               String idMatricula, String idOrganizacionJuridica, String idDireccionComercial,
                                                                               String idMunicipioComercial, String idDireccionNotificacion,
                                                                               String idMunicipioNotificacion, String idFijo, String idCelular, String idcampovalorDelEstablecimiento){
        return Tasks.instrumented(GrabarFormularioSoloEstablecimientoComercio.class, idNomenclatura, idNombreVias, idNro, idLetras, idMunicipio,
                idBarrio, idTelefonoUno, idTelefonoDos, idZona, idCorreoElectronico, idUbicacion, idPersonalOcupado,
                idTipoLocal, idActividadEconomica, idConsulta, idCamaraComercio, idMatricula, idOrganizacionJuridica, idDireccionComercial,
                idMunicipioComercial, idDireccionNotificacion, idMunicipioNotificacion, idFijo, idCelular, idcampovalorDelEstablecimiento);
    }
}