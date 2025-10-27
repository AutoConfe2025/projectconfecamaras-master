package com.co.confecamaras.interactions;

import com.co.confecamaras.interactions.News.WaitSeconds;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import static com.co.confecamaras.userinterfaces.GrabarFormularioPersonaNaturalUI.*;

public class FormularioPersonaNatural implements Interaction {

    private Target campoGenero;
    private String idGenero;
    private Target campoLugarExpedicion;
    private String idLugarExpedicion;
    private Target campoPaisExpedicion;
    private String idPaisExpedicion;
    private Target campoEmprendimientoSocial;
    private String idEmprendimientoSocial;
    private Target campoNomenclatura;
    private String idNomenclatura;
    private Target campoNombreVias;
    private String idNombreVias;
    private Target campoNro;
    private String idNro;
    private Target campoLetras;
    private String idLetras;
    private Target campoBarrio;
    private String idBarrio;
    private Target campoTelefonoUno;
    private String idTelefonoUno;
    private Target campoTelefonoDos;
    private String idTelefonoDos;
    private Target campoZona;
    private String idZona;
    private Target campoCorreoElectronico;
    private String idCorreoElectronico;
    private Target campoUbicacion;
    private String idUbicacion;
    private Target campoSede;
    private String idSede;
    private Target campoAutorizacion;
    private String idAutorizacion;
    private Target campoActivosCorrientes;
    private String idActivosCorrientes;
    private Target campoPatrimonio;
    private String idPatrimonio;
    private Target campoIngresosOperacionales;
    private String idIngresosOperacionales;
    private Target campoGrupoNiif;
    private String idGrupoNiif;
    private Target campoActividadEconomica;
    private String idActividadEconomica;
    private Target campoConsulta;
    private String idConsulta;
    private Target campoFechaInicio;
    private String idFechaInicio;
    private Target campoGeneraCiiu;
    private String idGeneraCiiu;
    private Target campoEsAportante;
    private String idEsAportante;
    private Target campoQueTipoEs;
    private String idQueTipoEs;
    private final String lugarExpedicion = "MANIZALES";
    private final String lugarExpedicionuno = "MANIZALES (CAL)";
    private final String lugarExpediciondos = "MANIZALES (CALDAS)";

    public FormularioPersonaNatural(Target campoGenero, String idGenero, Target campoLugarExpedicion, String idLugarExpedicion,
                                    Target campoPaisExpedicion, String idPaisExpedicion, Target campoEmprendimientoSocial,
                                    String idEmprendimientoSocial, Target campoNomenclatura, String idNomenclatura,
                                    Target campoNombreVias, String idNombreVias, Target campoNro, String idNro, Target campoLetras, String idLetras,
                                    Target campoBarrio, String idBarrio, Target campoTelefonoUno, String idTelefonoUno, Target campoTelefonoDos,
                                    String idTelefonoDos, Target campoZona, String idZona, Target campoCorreoElectronico, String idCorreoElectronico,
                                    Target campoUbicacion, String idUbicacion, Target campoSede, String idSede, Target campoAutorizacion,
                                    String idAutorizacion, Target campoActivosCorrientes, String idActivosCorrientes, Target campoPatrimonio,
                                    String idPatrimonio, Target campoIngresosOperacionales, String idIngresosOperacionales, Target campoGrupoNiif,
                                    String idGrupoNiif, Target campoActividadEconomica, String idActividadEconomica, Target campoConsulta,
                                    String idConsulta, Target campoFechaInicio, String idFechaInicio, Target campoGeneraCiiu,
                                    String idGeneraCiiu, Target campoEsAportante, String idEsAportante, Target campoQueTipoEs,
                                    String idQueTipoEs) {
        this.campoGenero = campoGenero;
        this.idGenero = idGenero;
        this.campoLugarExpedicion = campoLugarExpedicion;
        this.idLugarExpedicion = idLugarExpedicion;
        this.campoPaisExpedicion = campoPaisExpedicion;
        this.idPaisExpedicion = idPaisExpedicion;
        this.campoEmprendimientoSocial = campoEmprendimientoSocial;
        this.idEmprendimientoSocial = idEmprendimientoSocial;
        this.campoNomenclatura = campoNomenclatura;
        this.idNomenclatura = idNomenclatura;
        this.campoNombreVias = campoNombreVias;
        this.idNombreVias = idNombreVias;
        this.campoNro = campoNro;
        this.idNro = idNro;
        this.campoLetras = campoLetras;
        this.idLetras = idLetras;
        this.campoBarrio = campoBarrio;
        this.idBarrio = idBarrio;
        this.campoTelefonoUno = campoTelefonoUno;
        this.idTelefonoUno = idTelefonoUno;
        this.campoTelefonoDos = campoTelefonoDos;
        this.idTelefonoDos = idTelefonoDos;
        this.campoZona = campoZona;
        this.idZona = idZona;
        this.campoCorreoElectronico = campoCorreoElectronico;
        this.idCorreoElectronico = idCorreoElectronico;
        this.campoUbicacion = campoUbicacion;
        this.idUbicacion = idUbicacion;
        this.campoSede = campoSede;
        this.idSede = idSede;
        this.campoAutorizacion = campoAutorizacion;
        this.idAutorizacion = idAutorizacion;
        this.campoActivosCorrientes = campoActivosCorrientes;
        this.idActivosCorrientes = idActivosCorrientes;
        this.campoPatrimonio = campoPatrimonio;
        this.idPatrimonio = idPatrimonio;
        this.campoIngresosOperacionales = campoIngresosOperacionales;
        this.idIngresosOperacionales = idIngresosOperacionales;
        this.campoGrupoNiif = campoGrupoNiif;
        this.idGrupoNiif = idGrupoNiif;
        this.campoActividadEconomica = campoActividadEconomica;
        this.idActividadEconomica = idActividadEconomica;
        this.campoConsulta = campoConsulta;
        this.idConsulta = idConsulta;
        this.campoFechaInicio = campoFechaInicio;
        this.idFechaInicio = idFechaInicio;
        this.campoGeneraCiiu = campoGeneraCiiu;
        this.idGeneraCiiu = idGeneraCiiu;
        this.campoEsAportante = campoEsAportante;
        this.idEsAportante = idEsAportante;
        this.campoQueTipoEs = campoQueTipoEs;
        this.idQueTipoEs = idQueTipoEs;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        llenarFormularioPersonaNatural(campoGenero, campoLugarExpedicion, campoPaisExpedicion, campoEmprendimientoSocial, campoNomenclatura,
                idNomenclatura, campoNombreVias, idNombreVias, campoNro, idNro, campoLetras, idLetras, campoBarrio, campoTelefonoUno,
                idTelefonoUno, campoTelefonoDos, idTelefonoDos, campoZona, campoCorreoElectronico, idCorreoElectronico, campoUbicacion,
                campoSede, campoAutorizacion, campoActivosCorrientes, idActivosCorrientes, campoPatrimonio, idPatrimonio,
                campoIngresosOperacionales, idIngresosOperacionales, campoGrupoNiif, campoActividadEconomica, idActividadEconomica,
                campoConsulta, idConsulta, campoFechaInicio, idFechaInicio, campoGeneraCiiu, campoEsAportante, campoQueTipoEs,
                actor);
    }

    public void llenarFormularioPersonaNatural(Target campoGenero, Target campoLugarExpedicion, Target campoPaisExpedicion, Target campoEmprendimientoSocial,
                                               Target campoNomenclatura, String idNomenclatura, Target campoNombreVias, String idNombreVias,
                                               Target campoNro, String idNro, Target campoLetras, String idLetras, Target campoBarrio,Target campoTelefonoUno,
                                               String idTelefonoUno, Target campoTelefonoDos, String idTelefonoDos,Target campoZona,
                                               Target campoCorreoElectronico, String idCorreoElectronico, Target campoUbicacion, Target campoSede,
                                               Target campoAutorizacion, Target campoActivosCorrientes, String idActivosCorrientes, Target campoPatrimonio,
                                               String idPatrimonio, Target campoIngresosOperacionales, String idIngresosOperacionales,
                                               Target campoGrupoNiif, Target campoActividadEconomica, String idActividadEconomica, Target campoConsulta,
                                               String idConsulta, Target campoFechaInicio, String idFechaInicio, Target campoGeneraCiiu,
                                               Target campoEsAportante, Target campoQueTipoEs, Actor actor){
        List<WebElementFacade> selectGenero = campoGenero.resolveAllFor(actor);
        List<WebElementFacade> selectLugarExpedicion = campoLugarExpedicion.resolveAllFor(actor);
        List<WebElementFacade> selectPaisExpedicion = campoPaisExpedicion.resolveAllFor(actor);
        List<WebElementFacade> selectEmprendimientoSocial = campoEmprendimientoSocial.resolveAllFor(actor);
        WebElementFacade selectNomenclatura = campoNomenclatura.resolveFor(actor);
        WebElementFacade nombreVias = campoNombreVias.resolveFor(actor);
        WebElementFacade nro = campoNro.resolveFor(actor);
        WebElementFacade selectLetras = campoLetras.resolveFor(actor);
        List<WebElementFacade> selectBarrio = campoBarrio.resolveAllFor(actor);
        WebElementFacade telefonoUno = campoTelefonoUno.resolveFor(actor);
        WebElementFacade telefonoDos = campoTelefonoDos.resolveFor(actor);
        List<WebElementFacade> selectZona = campoZona.resolveAllFor(actor);
        WebElementFacade correoElectronico = campoCorreoElectronico.resolveFor(actor);
        List<WebElementFacade> selectUbicacion = campoUbicacion.resolveAllFor(actor);
        List<WebElementFacade> selectSede = campoSede.resolveAllFor(actor);
        List<WebElementFacade> selectAutorizacion = campoAutorizacion.resolveAllFor(actor);
        WebElementFacade activosCorrientes = campoActivosCorrientes.resolveFor(actor);
        WebElementFacade patrimonio = campoPatrimonio.resolveFor(actor);
        WebElementFacade ingresosOperacionales = campoIngresosOperacionales.resolveFor(actor);
        List<WebElementFacade> selectGrupoNiif = campoGrupoNiif.resolveAllFor(actor);
        WebElementFacade actividadEconomica = campoActividadEconomica.resolveFor(actor);
        WebElementFacade consulta = campoConsulta.resolveFor(actor);
        WebElementFacade fechaInicio = campoFechaInicio.resolveFor(actor);
        List<WebElementFacade> selectGeneraCiiu = campoGeneraCiiu.resolveAllFor(actor);
        List<WebElementFacade> selectEsAportante = campoEsAportante.resolveAllFor(actor);
        List<WebElementFacade> selectQueTipoEs = campoQueTipoEs.resolveAllFor(actor);

        for (int f=0; f<selectGenero.size(); f++){
            if (selectGenero.get(f).getText().equals(idGenero)){
                selectGenero.get(f).click();
                break;
            }
        }
        for (int f=0; f<selectLugarExpedicion.size(); f++){
            if (selectLugarExpedicion.get(f).getText().equals(lugarExpedicionuno)){
                selectLugarExpedicion.get(f).click();
                break;
            } else if (selectLugarExpedicion.get(f).getText().equals(lugarExpediciondos)){
                selectLugarExpedicion.get(f).click();
                break;
            }
        }
        WaitSeconds.seconds(3);
        for (int f=0; f<selectPaisExpedicion.size(); f++){
            if (selectPaisExpedicion.get(f).getText().equals(idPaisExpedicion)){
                selectPaisExpedicion.get(f).click();
                break;
            }
        }
        for (int f=0; f<selectEmprendimientoSocial.size(); f++){
            if (selectEmprendimientoSocial.get(f).getText().equals(idEmprendimientoSocial)){
                selectEmprendimientoSocial.get(f).click();
                break;
            }
        }
        BTN_GENERADOR_DIRECCIONES_NATURAL.resolveFor(actor).click();
        SELECT_NOMENCALTURAS_NATURAL.resolveFor(actor).waitUntilVisible();
        if (!idNomenclatura.equals("")) {
            selectNomenclatura.selectByVisibleText(idNomenclatura);
        }
        if (!idNombreVias.equals("")) {
            nombreVias.sendKeys(idNombreVias);
        }
        if (!idNro.equals("")) {
            nro.sendKeys(idNro);
        }
        if (!idLetras.equals("")) {
            selectLetras.selectByVisibleText(idLetras);
        }
        BTN_TRASLADAR_DIRECCION_NATURAL.resolveFor(actor).click();
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(MENU_DES_MUNICIPIO),
                SelectFromOptions.byVisibleText(lugarExpedicion).from(MENU_DES_MUNICIPIO)
        );
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(SELECT_BARRIO_DOS_NATURAL),
                SelectFromOptions.byVisibleText(idBarrio).from(SELECT_BARRIO_DOS_NATURAL)
                //SelectFromOptions.byVisibleText("11 DE NOVIEMBRE").from(SELECT_BARRIO_DOS_NATURAL)
        );
//        for (int f=0; f<selectBarrio.size(); f++){
//            //if (selectBarrio.get(f).getText().equals(idBarrio)){
//            if (selectBarrio.get(f).getText().equals("11 DE NOVIEMBRE")){
//                selectBarrio.get(f).click();
//                break;
//            }
//        }
        if (!idTelefonoUno.equals("")) {
            telefonoUno.sendKeys(idTelefonoUno);
        }
        if (!idTelefonoDos.equals("")) {
            telefonoDos.sendKeys(idTelefonoDos);
        }
        for (int f=0; f<selectZona.size(); f++){
            if (selectZona.get(f).getText().equals(idZona)){
                selectZona.get(f).click();
                break;
            }
        }
        if (!idCorreoElectronico.equals("")) {
            correoElectronico.sendKeys(idCorreoElectronico);
        }
        for (int f=0; f<selectUbicacion.size(); f++){
            if (selectUbicacion.get(f).getText().equals(idUbicacion)){
                selectUbicacion.get(f).click();
                break;
            }
        }
        for (int f=0; f<selectSede.size(); f++){
            if (selectSede.get(f).getText().equals(idSede)){
                selectSede.get(f).click();
                break;
            }
        }
        BTN_DUPLICAR_NATURAL.resolveFor(actor).click();
        for (int f=0; f<selectAutorizacion.size(); f++){
            if (selectAutorizacion.get(f).getText().equals(idAutorizacion)){
                selectAutorizacion.get(f).click();
                break;
            }
        }
        if (!idActivosCorrientes.equals("")) {
            TXT_ACTIVOS_CORRIENTES_NATURAL.resolveFor(actor).clear();
            activosCorrientes.sendKeys(idActivosCorrientes);
        }
        if (!idPatrimonio.equals("")) {
            TXT_PATRIMONIO_NATURAL.resolveFor(actor).clear();
            patrimonio.sendKeys(idPatrimonio);
        }
        if (!idIngresosOperacionales.equals("")) {
            TXT_INGRESOS_OPERACIONALES_NATURAL.resolveFor(actor).clear();
            ingresosOperacionales.sendKeys(idIngresosOperacionales);
        }
        for (int f=0; f<selectGrupoNiif.size(); f++){
            if (selectGrupoNiif.get(f).getText().equals(idGrupoNiif)){
                selectGrupoNiif.get(f).click();
                break;
            }
        }
        if (!idActividadEconomica.equals("")) {
            actividadEconomica.sendKeys(idActividadEconomica);
        }
        BTN_CIUU_NATURAL.resolveFor(actor).click();
        if (!idConsulta.equals("")) {
            consulta.sendKeys(idConsulta);
        }
        BTN_CONSULTA_NATURAL.resolveFor(actor).click();
        BTN_CONSULTA_G4761_NATURAL.resolveFor(actor).click();
        if (!idFechaInicio.equals("")) {
            fechaInicio.sendKeys(idFechaInicio);
        }
        for (int f=0; f<selectGeneraCiiu.size(); f++){
            if (selectGeneraCiiu.get(f).getText().equals(idGeneraCiiu)){
                selectGeneraCiiu.get(f).click();
                break;
            }
        }
        for (int f=0; f<selectEsAportante.size(); f++){
            if (selectEsAportante.get(f).getText().equals(idEsAportante)){
                selectEsAportante.get(f).click();
                break;
            }
        }
        for (int f=0; f<selectQueTipoEs.size(); f++){
            if (selectQueTipoEs.get(f).getText().equals(idQueTipoEs)){
                selectQueTipoEs.get(f).click();
                break;
            }
        }
        BTN_REPOSNSABILIDADES_TRIBUTARIAS_NATURAL.resolveFor(actor).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        BTN_NO_RESPONSABLE_IVA_NATURAL.resolveFor(actor).click();
        BTN_GRABAR_NATURAL.resolveFor(actor).click();
    }

    public static FormularioPersonaNatural enConfecamaraSII(Target campoGenero, String idGenero, Target campoLugarExpedicion,
                                                            String idLugarExpedicion, Target campoPaisExpedicion, String idPaisExpedicion,
                                                            Target campoEmprendimientoSocial, String idEmprendimientoSocial, Target campoNomenclatura,
                                                            String idNomenclatura, Target campoNombreVias, String idNombreVias,
                                                            Target campoNro, String idNro, Target campoLetras, String idLetras, Target campoBarrio,
                                                            String idBarrio, Target campoTelefonoUno, String idTelefonoUno, Target campoTelefonoDos,
                                                            String idTelefonoDos, Target campoZona, String idZona, Target campoCorreoElectronico,
                                                            String idCorreoElectronico, Target campoUbicacion, String idUbicacion, Target campoSede,
                                                            String idSede, Target campoAutorizacion, String idAutorizacion, Target campoActivosCorrientes,
                                                            String idActivosCorrientes, Target campoPatrimonio, String idPatrimonio,
                                                            Target campoIngresosOperacionales, String idIngresosOperacionales, Target campoGrupoNiif,
                                                            String idGrupoNiif, Target campoActividadEconomica, String idActividadEconomica,
                                                            Target campoConsulta, String idConsulta, Target campoFechaInicio, String idFechaInicio,
                                                            Target campoGeneraCiiu, String idGeneraCiiu, Target campoEsAportante, String idEsAportante,
                                                            Target campoQueTipoEs, String idQueTipoEs){
        return new FormularioPersonaNatural(campoGenero, idGenero, campoLugarExpedicion, idLugarExpedicion, campoPaisExpedicion,
                idPaisExpedicion, campoEmprendimientoSocial, idEmprendimientoSocial, campoNomenclatura, idNomenclatura, campoNombreVias, idNombreVias, campoNro, idNro, campoLetras, idLetras,
                campoBarrio, idBarrio, campoTelefonoUno, idTelefonoUno, campoTelefonoDos, idTelefonoDos, campoZona, idZona, campoCorreoElectronico,
                idCorreoElectronico, campoUbicacion, idUbicacion, campoSede, idSede, campoAutorizacion, idAutorizacion, campoActivosCorrientes,
                idActivosCorrientes, campoPatrimonio, idPatrimonio, campoIngresosOperacionales, idIngresosOperacionales, campoGrupoNiif,
                idGrupoNiif, campoActividadEconomica, idActividadEconomica, campoConsulta, idConsulta, campoFechaInicio, idFechaInicio,
                campoGeneraCiiu, idGeneraCiiu, campoEsAportante, idEsAportante, campoQueTipoEs, idQueTipoEs);
    }
}