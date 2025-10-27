package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import java.util.List;

import static com.co.confecamaras.userinterfaces.GrabarFormularioEstablecimientoUI.*;

public class FormularioSoloEstablecimientoComercioDos implements Interaction {
    private Target campoNomenclatura;
    private String idNomenclatura;
    private Target campoNombreVias;
    private String idNombreVias;
    private Target campoNro;
    private String idNro;
    private Target campoLetras;
    private String idLetras;
    private Target campoMunicipio;
    private String idMunicipio;
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
    private Target campoPersonalOcupado;
    private String idPersonalOcupado;
    private Target campoTipoLocal;
    private String idTipoLocal;
    private Target campoActividadEconomica;
    private String idActividadEconomica;
    private Target campoConsulta;
    private String idConsulta;
    private Target campoCamaraComercio;
    private String idCamaraComercio;
    private Target campoMatricula;
    private String idMatricula;
    private Target campoOrganizacionJuridica;
    private String idOrganizacionJuridica;
    private Target campoDireccionComercial;
    private String idDireccionComercial;
    private Target campoMunicipioComercial;
    private String idMunicipioComercial;
    private Target campoDireccionNotificacion;
    private String idDireccionNotificacion;
    private Target campoMunicipioNotificacion;
    private String idMunicipioNotificacion;
    private Target campoFijo;
    private String idFijo;
    private Target campoCelular;
    private String idCelular;
    private Target campovalorDelEstablecimiento;
    private String idcampovalorDelEstablecimiento;

    public FormularioSoloEstablecimientoComercioDos(Target campoNomenclatura, String idNomenclatura, Target campoNombreVias,
                                                 String idNombreVias, Target campoNro, String idNro, Target campoLetras, String idLetras,
                                                 Target campoMunicipio, String idMunicipio, Target campoBarrio, String idBarrio, Target campoTelefonoUno,
                                                 String idTelefonoUno, Target campoTelefonoDos, String idTelefonoDos, Target campoZona, String idZona,
                                                 Target campoCorreoElectronico, String idCorreoElectronico, Target campoUbicacion, String idUbicacion,
                                                 Target campoPersonalOcupado, String idPersonalOcupado, Target campoTipoLocal, String idTipoLocal,
                                                 Target campoActividadEconomica, String idActividadEconomica, Target campoConsulta,
                                                 String idConsulta, Target campoCamaraComercio, String idCamaraComercio, Target campoMatricula,
                                                 String idMatricula, Target campoOrganizacionJuridica, String idOrganizacionJuridica,
                                                 Target campoDireccionComercial, String idDireccionComercial, Target campoMunicipioComercial,
                                                 String idMunicipioComercial, Target campoDireccionNotificacion, String idDireccionNotificacion,
                                                 Target campoMunicipioNotificacion, String idMunicipioNotificacion, Target campoFijo,
                                                 String idFijo, Target campoCelular, String idCelular, Target campovalorDelEstablecimiento, String idcampovalorDelEstablecimiento) {
        this.campoNomenclatura = campoNomenclatura;
        this.idNomenclatura = idNomenclatura;
        this.campoNombreVias = campoNombreVias;
        this.idNombreVias = idNombreVias;
        this.campoNro = campoNro;
        this.idNro = idNro;
        this.campoLetras = campoLetras;
        this.idLetras = idLetras;
        this.campoMunicipio = campoMunicipio;
        this.idMunicipio = idMunicipio;
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
        this.campoPersonalOcupado = campoPersonalOcupado;
        this.idPersonalOcupado = idPersonalOcupado;
        this.campoTipoLocal = campoTipoLocal;
        this.idTipoLocal = idTipoLocal;
        this.campoActividadEconomica = campoActividadEconomica;
        this.idActividadEconomica = idActividadEconomica;
        this.campoConsulta = campoConsulta;
        this.idConsulta = idConsulta;
        this.campoCamaraComercio = campoCamaraComercio;
        this.idCamaraComercio = idCamaraComercio;
        this.campoMatricula = campoMatricula;
        this.idMatricula = idMatricula;
        this.campoOrganizacionJuridica = campoOrganizacionJuridica;
        this.idOrganizacionJuridica = idOrganizacionJuridica;
        this.campoDireccionComercial = campoDireccionComercial;
        this.idDireccionComercial = idDireccionComercial;
        this.campoMunicipioComercial = campoMunicipioComercial;
        this.idMunicipioComercial = idMunicipioComercial;
        this.campoDireccionNotificacion = campoDireccionNotificacion;
        this.idDireccionNotificacion = idDireccionNotificacion;
        this.campoMunicipioNotificacion = campoMunicipioNotificacion;
        this.idMunicipioNotificacion = idMunicipioNotificacion;
        this.campoFijo = campoFijo;
        this.idFijo = idFijo;
        this.campoCelular = campoCelular;
        this.idCelular = idCelular;
        this.campovalorDelEstablecimiento = campovalorDelEstablecimiento;
        this.idcampovalorDelEstablecimiento = idcampovalorDelEstablecimiento;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        formularioSoloEstablecimientoComercioDos(campoNomenclatura, idNomenclatura, campoNombreVias, idNombreVias, campoNro, idNro,
                campoLetras, idLetras, campoMunicipio, campoBarrio, idBarrio, campoTelefonoUno, idTelefonoUno, campoTelefonoDos, idTelefonoDos,
                campoZona, campoCorreoElectronico, idCorreoElectronico, campoUbicacion, campoPersonalOcupado, idPersonalOcupado,
                campoTipoLocal, campoActividadEconomica, idActividadEconomica, campoConsulta, idConsulta, campoCamaraComercio,
                campoMatricula, idMatricula, campoOrganizacionJuridica, campoDireccionComercial, idDireccionComercial,
                campoMunicipioComercial, campoDireccionNotificacion, idDireccionNotificacion, campoMunicipioNotificacion,
                idMunicipioNotificacion, campoFijo, idFijo, campoCelular, idCelular, campovalorDelEstablecimiento, idcampovalorDelEstablecimiento, actor);
    }

    public void formularioSoloEstablecimientoComercioDos(Target campoNomenclatura, String idNomenclatura, Target campoNombreVias,
                                                      String idNombreVias, Target campoNro, String idNro, Target campoLetras,
                                                      String idLetras, Target campoMunicipio, Target campoBarrio, String idBarrio,
                                                      Target campoTelefonoUno, String idTelefonoUno, Target campoTelefonoDos,
                                                      String idTelefonoDos,Target campoZona, Target campoCorreoElectronico, String idCorreoElectronico,
                                                      Target campoUbicacion, Target campoPersonalOcupado, String idPersonalOcupado,
                                                      Target campoTipoLocal, Target campoActividadEconomica, String idActividadEconomica,
                                                      Target campoConsulta, String idConsulta, Target campoCamaraComercio,  Target campoMatricula,
                                                      String idMatricula, Target campoOrganizacionJuridica, Target campoDireccionComercial,
                                                      String idDireccionComercial, Target campoMunicipioComercial, Target campoDireccionNotificacion, String idDireccionNotificacion,
                                                      Target campoMunicipioNotificacion, String idMunicipioNotificacion, Target campoFijo,
                                                      String idFijo, Target campoCelular, String idCelular, Target campovalorDelEstablecimiento, String idcampovalorDelEstablecimiento, Actor actor){
        WebElementFacade selectNomenclaturaTres = campoNomenclatura.resolveFor(actor);
        WebElementFacade nombreViasTres = campoNombreVias.resolveFor(actor);
        WebElementFacade nroTres = campoNro.resolveFor(actor);
        WebElementFacade selectLetrasTres = campoLetras.resolveFor(actor);
        List<WebElementFacade> selectMunicipioTres = campoMunicipio.resolveAllFor(actor);
        WebElementFacade selectBarrioTres = campoBarrio.resolveFor(actor);
        WebElementFacade telefonoUno = campoTelefonoUno.resolveFor(actor);
        WebElementFacade telefonoDos = campoTelefonoDos.resolveFor(actor);
        List<WebElementFacade> selectZonaTres = campoZona.resolveAllFor(actor);
        WebElementFacade correoElectronicoTres = campoCorreoElectronico.resolveFor(actor);
        List<WebElementFacade> selectUbicacionTres = campoUbicacion.resolveAllFor(actor);
        WebElementFacade personalOcupadoTres = campoPersonalOcupado.resolveFor(actor);
        List<WebElementFacade> selectTipoLocalTres = campoTipoLocal.resolveAllFor(actor);
        WebElementFacade actividadEconomicaTres = campoActividadEconomica.resolveFor(actor);
        WebElementFacade consultaTres = campoConsulta.resolveFor(actor);
        List<WebElementFacade> selectCamaraComercio = campoCamaraComercio.resolveAllFor(actor);
        WebElementFacade matricula = campoMatricula.resolveFor(actor);
        List<WebElementFacade> selectOrganizacionJuridica = campoOrganizacionJuridica.resolveAllFor(actor);
        WebElementFacade direccionComercial = campoDireccionComercial.resolveFor(actor);
        List<WebElementFacade> selectMunicipioComercial = campoMunicipioComercial.resolveAllFor(actor);
        WebElementFacade direccionNotificacion = campoDireccionNotificacion.resolveFor(actor);
        WebElementFacade selectMunicipioNotificacion = campoMunicipioNotificacion.resolveFor(actor);
        WebElementFacade fijo = campoFijo.resolveFor(actor);
        WebElementFacade celular = campoCelular.resolveFor(actor);
        WebElementFacade valorDelEstablecimiento = campovalorDelEstablecimiento.resolveFor(actor);

        BTN_GENERADOR_DIRECCIONES_ESTABLECIMIENTO.resolveFor(actor).click();
        SELECT_NOMENCALTURAS_ESTABLECIMIENTO.resolveFor(actor).waitUntilVisible();
        if (!idNomenclatura.equals("")) {
            selectNomenclaturaTres.selectByVisibleText(idNomenclatura);
        }
        if (!idNombreVias.equals("")) {
            nombreViasTres.sendKeys(idNombreVias);
        }
        if (!idNro.equals("")) {
            nroTres.sendKeys(idNro);
        }
        if (!idLetras.equals("")) {
            selectLetrasTres.selectByVisibleText(idLetras);
        }
        BTN_TRASLADAR_DIRECCION_ESTABLECIMIENTO.resolveFor(actor).click();
        for (int f=0; f<selectMunicipioTres.size(); f++){
            if (selectMunicipioTres.get(f).getText().equals(idMunicipio)){
                selectMunicipioTres.get(f).click();
                break;
            }
        }
        if (!idBarrio.equals("")) {
            selectBarrioTres.selectByVisibleText(idBarrio);
        }
        if (!idTelefonoUno.equals("")) {
            telefonoUno.sendKeys(idTelefonoUno);
        }
        if (!idTelefonoDos.equals("")) {
            telefonoDos.sendKeys(idTelefonoDos);
        }
        for (int f=0; f<selectZonaTres.size(); f++){
            if (selectZonaTres.get(f).getText().equals(idZona)){
                selectZonaTres.get(f).click();
                break;
            }
        }
        if (!idCorreoElectronico.equals("")) {
            correoElectronicoTres.sendKeys(idCorreoElectronico);
        }
        for (int f=0; f<selectUbicacionTres.size(); f++){
            if (selectUbicacionTres.get(f).getText().equals(idUbicacion)){
                selectUbicacionTres.get(f).click();
                break;
            }
        }

        TXT_VALOR_ESTABLECIMIENTO.resolveFor(actor).clear();
        valorDelEstablecimiento.sendKeys("5000000");

        if (!idPersonalOcupado.equals("")) {
            TXT_PERSONAL_OCUPADO_ESTABLECIMIENTO.resolveFor(actor).clear();
            personalOcupadoTres.sendKeys(idPersonalOcupado);
        }
        for (int f=0; f<selectTipoLocalTres.size(); f++){
            if (selectTipoLocalTres.get(f).getText().equals(idTipoLocal)){
                selectTipoLocalTres.get(f).click();
                break;
            }
        }
        if (!idActividadEconomica.equals("")) {
            actividadEconomicaTres.sendKeys(idActividadEconomica);
        }
        BTN_CIUU_ESTABLECIMIENTO.resolveFor(actor).click();
        if (!idConsulta.equals("")) {
            consultaTres.sendKeys(idConsulta);
        }
        BTN_CONSULTA_ESTABLECIMIENTO.resolveFor(actor).click();
        BTN_CONSULTA_G4761_ESTABLECIMIENTO.resolveFor(actor).click();
        for (int f=0; f<selectCamaraComercio.size(); f++){
            if (selectCamaraComercio.get(f).getText().equals(idCamaraComercio)){
                selectCamaraComercio.get(f).click();
                break;
            }
        }
        if (!idMatricula.equals("")) {
            TXT_MATRICULA_ESTABLECIMIENTO.resolveFor(actor).clear();
            matricula.sendKeys(idMatricula);
        }
        for (int f=0; f<selectOrganizacionJuridica.size(); f++){
            if (selectOrganizacionJuridica.get(f).getText().equals(idOrganizacionJuridica)){
                selectOrganizacionJuridica.get(f).click();
                break;
            }
        }
        if (!idDireccionComercial.equals("")) {
            direccionComercial.sendKeys(idDireccionComercial);
        }
        for (int f=0; f<selectMunicipioComercial.size(); f++){
            if (selectMunicipioComercial.get(f).getText().equals(idMunicipioComercial)){
                selectMunicipioComercial.get(f).click();
                break;
            }
        }
        if (!idDireccionNotificacion.equals("")) {
            direccionNotificacion.sendKeys(idDireccionNotificacion);
        }
        if (!idMunicipioNotificacion.equals("")) {
            selectMunicipioNotificacion.selectByVisibleText(idMunicipioNotificacion);
        }
        if (!idFijo.equals("")) {
            fijo.sendKeys(idFijo);
        }
        if (!idCelular.equals("")) {
            celular.sendKeys(idCelular);
        }
        BTN_GRABAR_ESTABLECIMIENTO.resolveFor(actor).click();
    }

    public static FormularioSoloEstablecimientoComercioDos enConfecamaraSII(Target campoNomenclatura, String idNomenclatura, Target campoNombreVias,
                                                                         String idNombreVias, Target campoNro, String idNro, Target campoLetras,
                                                                         String idLetras, Target campoMunicipio, String idMunicipio, Target campoBarrio,
                                                                         String idBarrio, Target campoTelefonoUno, String idTelefonoUno, Target campoTelefonoDos,
                                                                         String idTelefonoDos, Target campoZona, String idZona, Target campoCorreoElectronico,
                                                                         String idCorreoElectronico, Target campoUbicacion, String idUbicacion,
                                                                         Target campoPersonalOcupado, String idPersonalOcupado, Target campoTipoLocal, String idTipoLocal,
                                                                         Target campoActividadEconomica, String idActividadEconomica, Target campoConsulta,
                                                                         String idConsulta, Target campoCamaraComercio, String idCamaraComercio, Target campoMatricula,
                                                                         String idMatricula, Target campoOrganizacionJuridica, String idOrganizacionJuridica,
                                                                         Target campoDireccionComercial, String idDireccionComercial, Target campoMunicipioComercial,
                                                                         String idMunicipioComercial, Target campoDireccionNotificacion, String idDireccionNotificacion,
                                                                         Target campoMunicipioNotificacion, String idMunicipioNotificacion, Target campoFijo,
                                                                         String idFijo, Target campoCelular, String idCelular, Target campovalorDelEstablecimiento, String idcampovalorDelEstablecimiento){
        return new FormularioSoloEstablecimientoComercioDos(campoNomenclatura, idNomenclatura, campoNombreVias, idNombreVias, campoNro, idNro,
                campoLetras, idLetras, campoMunicipio, idMunicipio, campoBarrio, idBarrio, campoTelefonoUno, idTelefonoUno, campoTelefonoDos,
                idTelefonoDos, campoZona, idZona, campoCorreoElectronico, idCorreoElectronico, campoUbicacion, idUbicacion,
                campoPersonalOcupado, idPersonalOcupado, campoTipoLocal, idTipoLocal, campoActividadEconomica, idActividadEconomica,
                campoConsulta, idConsulta, campoCamaraComercio, idCamaraComercio, campoMatricula, idMatricula, campoOrganizacionJuridica,
                idOrganizacionJuridica, campoDireccionComercial, idDireccionComercial, campoMunicipioComercial, idMunicipioComercial,
                campoDireccionNotificacion, idDireccionNotificacion, campoMunicipioNotificacion, idMunicipioNotificacion, campoFijo,
                idFijo, campoCelular, idCelular, campovalorDelEstablecimiento, idcampovalorDelEstablecimiento);
    }
}
