package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FormularioPersonaNaturalDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.GrabarFormularioEstablecimientoUI.BTN_RECIBIR_PAGO_ESTABLECIMIENTO;
import static com.co.confecamaras.userinterfaces.GrabarFormularioPersonaNaturalUI.BTN_GRABAR_FORMULARIO_PERSONA_NATURAL;
import static com.co.confecamaras.userinterfaces.GrabarFormularioPersonaNaturalUI.BTN_OK_NATURAL;
import static net.serenitybdd.screenplay.Tasks.*;

public class GrabarFormularioPersonaNaturalDos implements Task {

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

    public GrabarFormularioPersonaNaturalDos(String selectGenero, String selectLugarExpedicion, String selectPaisExpedicion,
                                             String selectEmprendimientoSocial, String selectNomenclatura, String idNombreVias,
                                             String idNro, String selectLetras, String selectBarrio, String idTelefonoUno,
                                             String idTelefonoDos, String selectZona, String idCorreoElectronico,
                                             String selectUbicacion, String selectSede, String selectAutorizacion, String idActivosCorrientes,
                                             String idPatrimonio, String idIngresosOperacionales, String idGrupoNiif,
                                             String idActividadEconomica, String idConsulta, String idFechaInicio, String selectGeneraCiiu,
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
                Click.on(BTN_GRABAR_FORMULARIO_PERSONA_NATURAL),
                FormularioPersonaNaturalDos.enConfecamaraSII(selectGenero, selectLugarExpedicion, selectPaisExpedicion,
                        selectEmprendimientoSocial, selectNomenclatura, idNombreVias, idNro, selectLetras, selectBarrio,
                        idTelefonoUno, idTelefonoDos, selectZona, idCorreoElectronico, selectUbicacion, selectSede,
                        selectAutorizacion, idActivosCorrientes, idPatrimonio, idIngresosOperacionales, idGrupoNiif,
                        idActividadEconomica, idConsulta, idFechaInicio, selectGeneraCiiu, selectEsAportante, selectQueTipoEs),
                Click.on(BTN_OK_NATURAL),
                Click.on(BTN_RECIBIR_PAGO_ESTABLECIMIENTO)
        );
    }

    public static GrabarFormularioPersonaNaturalDos enConfecamaraSII(String selectGenero, String selectLugarExpedicion, String selectPaisExpedicion,
                                                                     String selectEmprendimientoSocial, String selectNomenclatura, String idNombreVias,
                                                                     String idNro, String selectLetras, String selectBarrio, String idTelefonoUno,
                                                                     String idTelefonoDos, String selectZona, String idCorreoElectronico,
                                                                     String selectUbicacion, String selectSede, String selectAutorizacion, String idActivosCorrientes,
                                                                     String idPatrimonio, String idIngresosOperacionales, String idGrupoNiif,
                                                                     String idActividadEconomica, String idConsulta, String idFechaInicio, String selectGeneraCiiu,
                                                                     String selectEsAportante, String selectQueTipoEs){
        return instrumented(GrabarFormularioPersonaNaturalDos.class, selectGenero, selectLugarExpedicion, selectPaisExpedicion,
                selectEmprendimientoSocial, selectNomenclatura, idNombreVias, idNro, selectLetras, selectBarrio, idTelefonoUno,
                idTelefonoDos, selectZona, idCorreoElectronico, selectUbicacion, selectSede, selectAutorizacion, idActivosCorrientes,
                idPatrimonio, idIngresosOperacionales, idGrupoNiif, idActividadEconomica, idConsulta, idFechaInicio, selectGeneraCiiu,
                selectEsAportante, selectQueTipoEs);
    }
}