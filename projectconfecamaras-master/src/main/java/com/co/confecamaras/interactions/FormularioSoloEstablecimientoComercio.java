package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static com.co.confecamaras.userinterfaces.GrabarFormularioEstablecimientoUI.*;

public class FormularioSoloEstablecimientoComercio implements Interaction {

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
    private final String valorDelEstablecimiento = "20000000";

    public FormularioSoloEstablecimientoComercio(Target campoNomenclatura, String idNomenclatura, Target campoNombreVias,
                                                 String idNombreVias, Target campoNro, String idNro, Target campoLetras, String idLetras,
                                                 Target campoMunicipio, String idMunicipio, Target campoBarrio, String idBarrio, Target campoTelefonoUno,
                                                 String idTelefonoUno, Target campoTelefonoDos, String idTelefonoDos, Target campoZona, String idZona,
                                                 Target campoCorreoElectronico, String idCorreoElectronico, Target campoUbicacion, String idUbicacion,
                                                 Target campoPersonalOcupado, String idPersonalOcupado, Target campoTipoLocal, String idTipoLocal,
                                                 Target campoActividadEconomica, String idActividadEconomica) {
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
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        formularioSoloEstablecimientoComercio(campoNomenclatura, idNomenclatura, campoNombreVias, idNombreVias, campoNro, idNro,
                campoLetras, idLetras, campoMunicipio, campoBarrio, idBarrio, campoTelefonoUno, idTelefonoUno, campoTelefonoDos, idTelefonoDos,
                campoZona, campoCorreoElectronico, idCorreoElectronico, campoUbicacion, campoPersonalOcupado, idPersonalOcupado,
                campoTipoLocal, campoActividadEconomica, idActividadEconomica, actor);
    }

    public void formularioSoloEstablecimientoComercio(Target campoNomenclatura, String idNomenclatura, Target campoNombreVias,
                                                      String idNombreVias, Target campoNro, String idNro, Target campoLetras,
                                                      String idLetras, Target campoMunicipio, Target campoBarrio, String idBarrio,
                                                      Target campoTelefonoUno, String idTelefonoUno, Target campoTelefonoDos,
                                                      String idTelefonoDos,Target campoZona, Target campoCorreoElectronico, String idCorreoElectronico,
                                                      Target campoUbicacion, Target campoPersonalOcupado, String idPersonalOcupado,
                                                      Target campoTipoLocal, Target campoActividadEconomica, String idActividadEconomica,
                                                      Actor actor){
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
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(TXT_VALOR_ESTABLECIMIENTO),
                Enter.theValue(valorDelEstablecimiento).into(TXT_VALOR_ESTABLECIMIENTO)
        );
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
        BTN_GRABAR_ESTABLECIMIENTO.resolveFor(actor).click();
    }

    public static FormularioSoloEstablecimientoComercio enConfecamaraSII(Target campoNomenclatura, String idNomenclatura, Target campoNombreVias,
                                                                         String idNombreVias, Target campoNro, String idNro, Target campoLetras, String idLetras,
                                                                         Target campoMunicipio, String idMunicipio, Target campoBarrio, String idBarrio, Target campoTelefonoUno,
                                                                         String idTelefonoUno, Target campoTelefonoDos, String idTelefonoDos, Target campoZona, String idZona,
                                                                         Target campoCorreoElectronico, String idCorreoElectronico, Target campoUbicacion, String idUbicacion,
                                                                         Target campoPersonalOcupado, String idPersonalOcupado, Target campoTipoLocal, String idTipoLocal,
                                                                         Target campoActividadEconomica, String idActividadEconomica){
        return new FormularioSoloEstablecimientoComercio(campoNomenclatura, idNomenclatura, campoNombreVias, idNombreVias, campoNro, idNro,
                campoLetras, idLetras, campoMunicipio, idMunicipio, campoBarrio, idBarrio, campoTelefonoUno, idTelefonoUno, campoTelefonoDos,
                idTelefonoDos, campoZona, idZona, campoCorreoElectronico, idCorreoElectronico, campoUbicacion, idUbicacion,
                campoPersonalOcupado, idPersonalOcupado, campoTipoLocal, idTipoLocal, campoActividadEconomica, idActividadEconomica);
    }
}