package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
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

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MantenimientoCincoStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    // ---- Usuarios Ws  ---- //

    @Dado("^(.*) requiere realizar el mantenimiento usuarios ws")
    public void confecamarasRequiereRealizarElMantenimientoUsuariosWs(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "UsuariosWs", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione ASEGURAMIENTO DEL S.I.I Mantenimiento del sii")
    public void seleccioneASEGURAMIENTODELSIIMantenimientoDelSii() {}

    @Entonces("realizara el mantenimiento de usuarios ws")
    public void realizaraElMantenimientoDeUsuariosWs() {
        withCurrentActor(
                DoMantenimientoUsuariosWs.usuariosWs(datos.get("Clave"))
        );
        theActorInTheSpotlight().should(seeThat(UsuariosWsQuestion.validacion()));
    }

    // ---- Permisos Especiales ---- //

    @Dado("^(.*) requiere realizar permisos especiales")
    public void confecamarasRequiereRealizarPermisosEspeciales(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "PermisosEspeciales", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione PARAMETRIZACION ERP Mantenimiento tablas básicas")
    public void seleccionePARAMETRIZACIONERPMantenimientoTablasBásicas() {}

    @Entonces("realizara permisos especiales")
    public void realizaraPermisosEspeciales() {
        withCurrentActor(
                DoPermisosEspeciales.permisosEspeciales(datos.get("Descripcion"))
        );
        theActorInTheSpotlight().should(seeThat(PermisosEspecialesQuestion.validacion()));
    }

    // ---- Alertas Administrativas ---- //

    @Dado("^(.*) requiere realizar el mantenimiento de alertas administrativas")
    public void confecamarasRequiereRealizarElMantenimientoDeAlertasAdministrativas(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "AlertasAdministrativas", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Entonces("realizara el mantenimiento alertas administrativas")
    public void realizaraElMantenimientoAlertasAdministrativas() {
        withCurrentActor(
                DoMantenimientoAlertas.mantenimientoAlerta(datos.get("Detalle"))
        );
        theActorInTheSpotlight().should(seeThat(AlertaQuestion.validacion()));
    }
    // ---- Alertas Registro ---- //

    @Dado("^(.*) requiere realizar el mantenimiento de alertas registro")
    public void confecamarasRequiereRealizarElMantenimientoDeAlertasRegistro(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "AlertasRegistro", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Entonces("realizara el mantenimiento alertas registro")
    public void realizaraElMantenimientoAlertasRegistro() {
        withCurrentActor(
                DoMantenimientoAlertaRegistro.mantenimientoRegistro(datos.get("Detalle"))
        );
        theActorInTheSpotlight().should(seeThat(AlertaRegistroQuestion.validacion()));
    }

    // ---- Firmas Digitales ---- //

    @Dado("^(.*) requiere realizar firmas digitales")
    public void confecamarasRequiereRealizarFirmasDigitales(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "FirmasDigitales", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Entonces("realizara firmas digitales")
    public void realizaraFirmasDigitales() {
        withCurrentActor(
                DoFirmasDigitales.firmasDigitales()
        );
        theActorInTheSpotlight().should(seeThat(FirmasDigitalesQuestion.validacion()));
    }
}