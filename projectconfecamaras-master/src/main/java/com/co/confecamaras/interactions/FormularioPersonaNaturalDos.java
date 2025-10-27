package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.GrabarFormularioPersonaNaturalUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class FormularioPersonaNaturalDos implements Interaction {

    private String selectGenero;
    private String selectLugarExpedicion;
    private String selectPaisExpedicion;
    private String selectEmprendimientoSocial;
    private String selectNomenclatura;
    private String idNombreVias;
    private String idNro;
    private String selectLetras;
    private String selectBarrio;
    private String idTelefonoUno;
    private String idTelefonoDos;
    private String selectZona;
    private String idCorreoElectronico;
    private String selectUbicacion;
    private String selectSede;
    private String selectAutorizacion;
    private String idActivosCorrientes;
    private String idPatrimonio;
    private String idIngresosOperacionales;
    private String idGrupoNiif;
    private String idActividadEconomica;
    private String idConsulta;
    private String idFechaInicio;
    private String selectGeneraCiiu;
    private String selectEsAportante;
    private String selectQueTipoEs;
    private final String lugarExpedicionUno = "BOGOTA (BOGOTA)";
    private final String lugarExpedicionDos = "BOGOTA (BOG)";

    public FormularioPersonaNaturalDos(String selectGenero, String selectLugarExpedicion, String selectPaisExpedicion,
                                       String selectEmprendimientoSocial, String selectNomenclatura, String idNombreVias,
                                       String idNro, String selectLetras, String selectBarrio, String idTelefonoUno, String idTelefonoDos,
                                       String selectZona, String idCorreoElectronico, String selectUbicacion, String selectSede,
                                       String selectAutorizacion, String idActivosCorrientes, String idPatrimonio,
                                       String idIngresosOperacionales, String idGrupoNiif, String idActividadEconomica,
                                       String idConsulta, String idFechaInicio, String selectGeneraCiiu,
                                       String selectEsAportante, String selectQueTipoEs) {
        this.selectGenero = selectGenero;
        this.selectLugarExpedicion = selectLugarExpedicion;
        this.selectPaisExpedicion = selectPaisExpedicion;
        this.selectEmprendimientoSocial = selectEmprendimientoSocial;
        this.selectNomenclatura = selectNomenclatura;
        this.idNombreVias = idNombreVias;
        this.idNro = idNro;
        this.selectLetras = selectLetras;
        this.selectBarrio = selectBarrio;
        this.idTelefonoUno = idTelefonoUno;
        this.idTelefonoDos = idTelefonoDos;
        this.selectZona = selectZona;
        this.idCorreoElectronico = idCorreoElectronico;
        this.selectUbicacion = selectUbicacion;
        this.selectSede = selectSede;
        this.selectAutorizacion = selectAutorizacion;
        this.idActivosCorrientes = idActivosCorrientes;
        this.idPatrimonio = idPatrimonio;
        this.idIngresosOperacionales = idIngresosOperacionales;
        this.idGrupoNiif = idGrupoNiif;
        this.idActividadEconomica = idActividadEconomica;
        this.idConsulta = idConsulta;
        this.idFechaInicio = idFechaInicio;
        this.selectGeneraCiiu = selectGeneraCiiu;
        this.selectEsAportante = selectEsAportante;
        this.selectQueTipoEs = selectQueTipoEs;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(SELECT_GENERO_DOS_NATURAL),
                SelectFromOptions.byVisibleText(selectGenero).from(SELECT_GENERO_DOS_NATURAL),
                SelectFromOptions.byVisibleText(lugarExpedicionUno).from(SELECT_LUGAR_EXPEDICION_DOS_NATURAL),
                SelectFromOptions.byVisibleText(selectPaisExpedicion).from(SELECT_PAIS_EXPEDICION_DOS_NATURAL),
                SelectFromOptions.byVisibleText(selectEmprendimientoSocial).from(SELECT_EMPRENDIMIENTO_SOCIAL_DOS_NATURAL),
                Scroll.to(BTN_GENERADOR_DIRECCIONES_NATURAL).andAlignToBottom(),
                Click.on(BTN_GENERADOR_DIRECCIONES_NATURAL),
                WaitInteractions.untilAppears(SELECT_NOMENCALTURAS_DOS_NATURAL),
                SelectFromOptions.byVisibleText(selectNomenclatura).from(SELECT_NOMENCALTURAS_DOS_NATURAL),
                Enter.theValue(idNombreVias).into(TXT_NOMBRE_VIAS_NATURAL),
                Enter.theValue(idNro).into(TXT_NRO_NATURAL),
                SelectFromOptions.byVisibleText(selectLetras).from(SELECT_LETRAS_DOS_NATURAL),
                Click.on(BTN_TRASLADAR_DIRECCION_NATURAL),
                SelectFromOptions.byVisibleText(selectBarrio).from(SELECT_BARRIO_DOS_NATURAL),
                Enter.theValue(idTelefonoUno).into(TXT_TELEFONO_UNO_NATURAL),
                Enter.theValue(idTelefonoDos).into(TXT_TELEFONO_DOS_NATURAL),
                SelectFromOptions.byVisibleText(selectZona).from(SELECT_ZONA_DOS_NATURAL),
                Enter.theValue(idCorreoElectronico).into(TXT_CORREO_ELECTRONICO_NATURAL),
                SelectFromOptions.byVisibleText(selectUbicacion).from(SELECT_UBICACION_DOS_NATURAL),
                SelectFromOptions.byVisibleText(selectSede).from(SELECT_SEDE_DOS_NATURAL),
                Scroll.to(BTN_DUPLICAR_NATURAL).andAlignToBottom(),
                Click.on(BTN_DUPLICAR_NATURAL),
                SelectFromOptions.byVisibleText(selectAutorizacion).from(SELECT_AUTORIZACION_DOS_NATURAL),
                Clear.field(TXT_ACTIVOS_CORRIENTES_NATURAL),
                Enter.theValue(idActivosCorrientes).into(TXT_ACTIVOS_CORRIENTES_NATURAL),
                Clear.field(TXT_PATRIMONIO_NATURAL),
                Enter.theValue(idPatrimonio).into(TXT_PATRIMONIO_NATURAL),
                Clear.field(TXT_INGRESOS_OPERACIONALES_NATURAL),
                Enter.theValue(idIngresosOperacionales).into(TXT_INGRESOS_OPERACIONALES_NATURAL),
                SelectFromOptions.byVisibleText(idGrupoNiif).from(SELECT_GRUPO_NIIF_DOS_NATURAL),
                Scroll.to(TXT_ACTIVIDAD_ECONOMICA_NATURAL).andAlignToBottom(),
                Enter.theValue(idActividadEconomica).into(TXT_ACTIVIDAD_ECONOMICA_NATURAL),
                Click.on(BTN_CIUU_NATURAL),
                Enter.theValue(idConsulta).into(TXT_CONSULTA_NATURAL),
                Click.on(BTN_CONSULTA_NATURAL),
                Click.on(BTN_CONSULTA_G4761_NATURAL),
                Enter.theValue(idFechaInicio).into(TXT_FECHA_INICIO_NATURAL),
                SelectFromOptions.byVisibleText(selectGeneraCiiu).from(SELECT_GENERA_CIIU_DOS_NATURAL),
                Scroll.to(SELECT_ES_APORTANTE_DOS_NATURAL).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectEsAportante).from(SELECT_ES_APORTANTE_DOS_NATURAL),
                SelectFromOptions.byVisibleText(selectQueTipoEs).from(SELECT_QUE_TIPO_ES_DOS_NATURAL),
                Scroll.to(BTN_REPOSNSABILIDADES_TRIBUTARIAS_NATURAL).andAlignToBottom(),
                Click.on(BTN_REPOSNSABILIDADES_TRIBUTARIAS_NATURAL),
                WaitInteractions.untilAppears(BTN_NO_RESPONSABLE_IVA_NATURAL),
                JavaScriptClick.on(BTN_NO_RESPONSABLE_IVA_NATURAL),
                Click.on(BTN_GRABAR_NATURAL)
        );
    }

    public static FormularioPersonaNaturalDos enConfecamaraSII(String selectGenero, String selectLugarExpedicion, String selectPaisExpedicion,
                                                               String selectEmprendimientoSocial, String selectNomenclatura, String idNombreVias,
                                                               String idNro, String selectLetras, String selectBarrio, String idTelefonoUno, String idTelefonoDos,
                                                               String selectZona, String idCorreoElectronico, String selectUbicacion, String selectSede,
                                                               String selectAutorizacion, String idActivosCorrientes, String idPatrimonio,
                                                               String idIngresosOperacionales, String idGrupoNiif, String idActividadEconomica,
                                                               String idConsulta, String idFechaInicio, String selectGeneraCiiu,
                                                               String selectEsAportante, String selectQueTipoEs){
        return instrumented(FormularioPersonaNaturalDos.class, selectGenero, selectLugarExpedicion, selectPaisExpedicion,
                selectEmprendimientoSocial, selectNomenclatura, idNombreVias, idNro, selectLetras, selectBarrio, idTelefonoUno,
                idTelefonoDos, selectZona, idCorreoElectronico, selectUbicacion, selectSede, selectAutorizacion,
                idActivosCorrientes, idPatrimonio, idIngresosOperacionales, idGrupoNiif, idActividadEconomica, idConsulta,
                idFechaInicio, selectGeneraCiiu, selectEsAportante, selectQueTipoEs);
    }
}