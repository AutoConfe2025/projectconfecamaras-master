package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FormularioPersonaNatural;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.GrabarFormularioPersonaNaturalUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GrabarFormularioPersonaNatural implements Task {

    private String idGenero;
    private String idLugarExpedicion;
    private String idPaisExpedicion;
    private String idEmprendimientoSocial;
    private String idNomenclatura;
    private String idNombreVias;
    private String idNro;
    private String idLetras;
    private String idBarrio;
    private String idTelefonoUno;
    private String idTelefonoDos;
    private String idZona;
    private String idCorreoElectronico;
    private String idUbicacion;
    private String idSede;
    private String idAutorizacion;
    private String idActivosCorrientes;
    private String idPatrimonio;
    private String idIngresosOperacionales;
    private String idGrupoNiif;
    private String idActividadEconomica;
    private String idConsulta;
    private String idFechaInicio;
    private String idGeneraCiiu;
    private String idEsAportante;
    private String idQueTipoEs;


    public GrabarFormularioPersonaNatural(String idGenero, String idLugarExpedicion, String idPaisExpedicion, String idEmprendimientoSocial, String idNomenclatura,
                                          String idNombreVias, String idNro, String idLetras, String idBarrio, String idTelefonoUno, String idTelefonoDos,
                                          String idZona, String idCorreoElectronico, String idUbicacion, String idSede, String idAutorizacion,
                                          String idActivosCorrientes, String idPatrimonio, String idIngresosOperacionales, String idGrupoNiif,
                                          String idActividadEconomica, String idConsulta, String idFechaInicio, String idGeneraCiiu,
                                          String idEsAportante, String idQueTipoEs) {
        this.idGenero = idGenero;
        this.idLugarExpedicion = idLugarExpedicion;
        this.idPaisExpedicion = idPaisExpedicion;
        this.idEmprendimientoSocial = idEmprendimientoSocial;
        this.idNomenclatura = idNomenclatura;
        this.idNombreVias = idNombreVias;
        this.idNro = idNro;
        this.idLetras = idLetras;
        this.idBarrio = idBarrio;
        this.idTelefonoUno = idTelefonoUno;
        this.idTelefonoDos = idTelefonoDos;
        this.idZona = idZona;
        this.idCorreoElectronico = idCorreoElectronico;
        this.idUbicacion = idUbicacion;
        this.idSede = idSede;
        this.idAutorizacion = idAutorizacion;
        this.idActivosCorrientes = idActivosCorrientes;
        this.idPatrimonio = idPatrimonio;
        this.idIngresosOperacionales = idIngresosOperacionales;
        this.idGrupoNiif = idGrupoNiif;
        this.idActividadEconomica = idActividadEconomica;
        this.idConsulta = idConsulta;
        this.idFechaInicio = idFechaInicio;
        this.idGeneraCiiu = idGeneraCiiu;
        this.idEsAportante = idEsAportante;
        this.idQueTipoEs = idQueTipoEs;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GRABAR_FORMULARIO_PERSONA_NATURAL),
                FormularioPersonaNatural.enConfecamaraSII(SELECT_GENERO_NATURAL, idGenero, SELECT_LUGAR_EXPEDICION_NATURAL, idLugarExpedicion,
                        SELECT_PAIS_EXPEDICION_NATURAL, idPaisExpedicion, SELECT_EMPRENDIMIENTO_SOCIAL_NATURAL, idEmprendimientoSocial, SELECT_NOMENCALTURAS_NATURAL, idNomenclatura,
                        TXT_NOMBRE_VIAS_NATURAL, idNombreVias, TXT_NRO_NATURAL, idNro, SELECT_LETRAS_NATURAL, idLetras, SELECT_BARRIO_NATURAL, idBarrio, TXT_TELEFONO_UNO_NATURAL,
                        idTelefonoUno, TXT_TELEFONO_DOS_NATURAL, idTelefonoDos, SELECT_ZONA_NATURAL, idZona, TXT_CORREO_ELECTRONICO_NATURAL, idCorreoElectronico,
                        SELECT_UBICACION_NATURAL, idUbicacion, SELECT_SEDE_NATURAL, idSede, SELECT_AUTORIZACION_NATURAL, idAutorizacion, TXT_ACTIVOS_CORRIENTES_NATURAL,
                        idActivosCorrientes, TXT_PATRIMONIO_NATURAL, idPatrimonio, TXT_INGRESOS_OPERACIONALES_NATURAL, idIngresosOperacionales, SELECT_GRUPO_NIIF_NATURAL,
                        idGrupoNiif, TXT_ACTIVIDAD_ECONOMICA_NATURAL, idActividadEconomica, TXT_CONSULTA_NATURAL, idConsulta, TXT_FECHA_INICIO_NATURAL, idFechaInicio,
                        SELECT_GENERA_CIIU_NATURAL, idGeneraCiiu, SELECT_ES_APORTANTE_NATURAL, idEsAportante, SELECT_QUE_TIPO_ES_NATURAL, idQueTipoEs ),
                Click.on(BTN_OK_NATURAL)
        );
    }

    public static GrabarFormularioPersonaNatural enConfecamaraSII(String idGenero, String idLugarExpedicion, String idPaisExpedicion, String idEmprendimientoSocial,
                                                                  String idNomenclatura, String idNombreVias, String idNro, String idLetras,
                                                                  String idBarrio, String idTelefonoUno, String idTelefonoDos, String idZona,
                                                                  String idCorreoElectronico, String idUbicacion, String idSede, String idAutorizacion,
                                                                  String idActivosCorrientes, String idPatrimonio, String idIngresosOperacionales,
                                                                  String idGrupoNiif, String idActividadEconomica, String idConsulta, String idFechaInicio,
                                                                  String idGeneraCiiu, String idEsAportante, String idQueTipoEs){
        return instrumented(GrabarFormularioPersonaNatural.class, idGenero, idLugarExpedicion, idPaisExpedicion, idEmprendimientoSocial,
                idNomenclatura, idNombreVias, idNro, idLetras, idBarrio, idTelefonoUno, idTelefonoDos, idZona, idCorreoElectronico,
                idUbicacion, idSede, idAutorizacion, idActivosCorrientes, idPatrimonio, idIngresosOperacionales, idGrupoNiif, idActividadEconomica,
                idConsulta, idFechaInicio, idGeneraCiiu, idEsAportante, idQueTipoEs);
    }
}