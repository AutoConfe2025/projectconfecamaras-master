package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Validations;
import com.co.confecamaras.questions.devdos.*;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MantenimientoDosStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();


    WebDriver webDriver;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    // ---- Mantenimiento Tabla de Retencion Documental ---- //

    @Dado("^(.*) requiere realizar el mantenimiento tabla de retencion documental")
    public void confecamarasRequiereRealizarElMantenimientoTablaDeRetencionDocumental(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Parametrizacion ERP, Mantenimiento tablas basicas, Tabla de Retencion Documental")
    public void seleccioneParametrizacionERPMantenimientoTablasBasicasTablaDeRetencionDocumental() {}

    @Entonces("realizara el mantenimiento de tabla de retencion documental")
    public void realizaraElMantenimientoDeTablaDeRetencionDocumental() {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoTablaRetencion", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoMantenimientoTablaRetencion.mantenimientoTablaRetencion(datos.get("Tipo Formato"), datos.get("Descripcion"))
        );
        theActorInTheSpotlight().should(seeThat(MantenimientoTablaRetencionDocumentalQuestion.validacion()));
    }

    // ---- Mantenimiento Salarios Minimos Mensuales ---- //

    @Dado("^(.*) requiere realizar el mantenimiento salarios minimos mensuales")
    public void confecamarasRequiereRealizarElMantenimientoSalariosMinimosMensuales(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Parametrizacion ERP, Mantenimiento tablas basicas, Salarios Minimos Mensuales")
    public void seleccioneParametrizacionERPMantenimientoTablasBasicasSalariosMinimosMensuales() {}

    @Entonces("podra realizar el mantenimiento salarios minimos mensuales")
    public void podraRealizarElMantenimientoSalariosMinimosMensuales() {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoSalarios", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoMantenimientoSalariosMinimos.mantenimientoSalariosMinimos(datos.get("Fecha"), datos.get("Salario Minimo"),
                        datos.get("Transporte Legal"), datos.get("Valor UVT"))
        );
        theActorInTheSpotlight().should(seeThat(MantenimientoSalariosMinimosMensualesQuestion.validacion()));

    }

    // ---- Mantenimiento Tarifas ---- //

    @Dado("^(.*) requiere realizar el mantenimiento de tarifas")
    public void confecamarasRequiereRealizarElMantenimientoDeTarifas(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion, Tarifas")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionTarifas() {}

    @Entonces("podra realizar el mantenimiento de tarifas")
    public void podraRealizarElMantenimientoDeTarifas() {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoTarifas", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoMantenimientosTarifas.mantenimientoTarifas(datos.get("Servicio"), datos.get("Año"), datos.get("Gpr Uno Minimo"), datos.get("Maximo Uno"), datos.get("Tarifa Uno"),
                        datos.get("TarifaPnat Uno"), datos.get("TarifaPjur Uno"))
        );
        theActorInTheSpotlight().should(seeThat(MantenimientoTarifasQuestion.validacion()));
    }

    // ---- Mantenimiento Maestro de Tramites sin costo ---- //

    @Dado("^(.*) requiere realizar el mantenimiento maestro de tramites sin costo")
    public void confecamarasRequiereRealizarElMantenimientoMaestroDeTramitesSinCosto(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion, Maestro de tramites sin costo")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionMaestroDeTramitesSinCosto() {}

    @Entonces("podra realizar el mantenimiento de maestro de tramites sin costo")
    public void podraRealizarElMantenimientoDeMaestroDeTramitesSinCosto() {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoMaestro", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoMantenimientoMaestroTramites.mantenimientoMaestroTramites()
        );
        theActorInTheSpotlight().should(seeThat(MantenimientoMaestroTramitesSinCostoQuestion.validacion()));


    }


    // ---- Mantenimiento Kardex Proponentes ---- //

    @Dado("^(.*) requiere realizar el mantenimiento de kardex proponentes")
    public void confecamarasRequiereRealizarElMantenimientoDeKardexProponentes(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion, Mantenimiento Kardex Proponentes")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionMantenimientoKardexProponentes() {}

    @Entonces("podra realizar el mantenimiento kardex proponentes")
    public void podraRealizarElMantenimientoKardexProponentes() {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoKardexPro", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoMantenimientoKardexPro.mantenimientoKardexPro(datos.get("Fecha Inicial"), datos.get("Actualizar"))
        );
        System.out.println("****" + Validations.mantKardexPro().answeredBy(theActorInTheSpotlight()) + "****");
    }



}